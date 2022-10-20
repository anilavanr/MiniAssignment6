public class ReverseString {
    public static void main(String[] args){
        String Name = "hashedinbydeloitte";
        String reversedString = "";

        for(int i = Name.length()-1; i>=0; i--){
            reversedString = reversedString + Name.charAt(i);
        }

        System.out.print("the reversed string of the "+Name+" is: ");
        System.out.println(reversedString);
    }
}
