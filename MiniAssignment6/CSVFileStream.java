package com.techrecipes.file.csv;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CSVFileStream {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("src","main","resources","students.csv");

        Map<String, Long> studentsMap = Files.lines(path)
                .skip(1)
                .map(CSVFileStream::getStudents)
                .collect(Collectors.groupingBy(Students::getMake, Collectors.counting()));
        System.out.println(StudentsMap);
    }

    private static Students getStudents(String line) {
        String[] fields = line.split(",");
        if(fields.length!=4)
            throw new RuntimeException("Invalid CSV line - " + line);
        return new Students(Integer.parseInt(fields[0]), fields[1], fields[2], fields[3]);
    }
}