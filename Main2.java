public class Main2{
    public static void main(String[] args) {
        String str="  Hello World  ";
         System.out.println("first:"+str.length());
         System.out.println("second:"+str.charAt(2));
         System.out.println("third:"+str.substring(2,7));
         System.out.println("fourth:"+str.toLowerCase());
         System.out.println("fifth:"+str.toUpperCase());
         System.out.println("sixth:"+str.trim());
         System.out.println("seventh:"+str.replace('l','x'));
         System.out.println("eight:"+str.startsWith("  He"));
         System.out.println("ninth:"+str.endsWith("ld  "));
         System.out.println("tenth:"+str.startsWith("he"));
    }
}