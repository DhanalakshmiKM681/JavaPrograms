public class String_Functions {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "String@Functions";
        System.out.println("LowerCase string: " + s1.toLowerCase());//hello
        System.out.println("UpperCase string: " + s1.toUpperCase());//HELLO
        System.out.println("string Length: " + s1.length());
        System.out.println("string concat: " + s1.concat(s2));//Hello string Functions
        System.out.println("Get character present in 0th position: " + s1.charAt(0));//H
        System.out.println("String equals: " + s1.equals("Welcome to string Functions"));//false
        System.out.println("Substring contains: " + s1.contains("to"));//false
        System.out.println("equals Ignore: " + s1.equalsIgnoreCase(s2));//false
        StringBuilder A1 = new StringBuilder("Hello");//string 1
        StringBuilder A2 = new StringBuilder("world");//string 2
        System.out.println("String append: " + A1.append(A2));//Hello world
        System.out.println("sub string: " + s1.substring(0, 5));
        System.out.println("String Join: " + s1.join(s1, s2));//Hello String Functions
        String[] a = s2.split("@");
        System.out.println(a[0]);//String
        System.out.println(a[1]);//Functions
        System.out.println("Index of: " + s2.indexOf("Functions"));//7
        System.out.println("String Replace: " + s2.replace("String", "Hi"));//Hi@Function
        System.out.println("string compareto method:" + s1.compareTo(s2));//false
    }
}


