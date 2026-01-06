public class Main3{
    public static void main(String[] args) {
        int x=18;
        if(x<10){
            System.out.println("less than 10");
        }
        else if(x==10){
            System.out.println("equal to 10");
        }
        else{
            System.out.println("greater than 10");
        }
        main1();
        main2();
    }
    public static void main1(){
        int day=1;
        switch(day){
            case 1: System.out.println("monday");break;
            case 2: System.out.println("tuesday");break;
            case 3: System.out.println("wednesday");break;
            default: System.out.println("saturday");break;
        }
    }
    public static void main2(){
         int a=10;
         String result=(a%4==0) ? "even":"odd";
         System.out.println(result);
    }
}