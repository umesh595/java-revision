public class Main1{
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("hello");
        System.out.println(sb.toString());
        sb.append(" World");
        System.out.println(sb.toString());
        sb.insert(6,"Java ");
        System.out.println(sb.toString());
        sb.delete(6,11);
        System.out.println(sb.toString());
        sb.reverse();
        System.out.println(sb.toString());
    }
}