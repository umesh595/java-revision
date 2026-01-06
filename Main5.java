class outerclass {
    static class staticnested{
              void hello(){
                System.out.println("static nested");
              }
    }
    class nested{
             void hello(){
                System.out.println("nested");
             }
    }
}
public class Main5 {
  public static void main(){
       outerclass.staticnested sn=new outerclass.staticnested();
       sn.hello();
       outerclass o=new outerclass();
       outerclass.nested n=o.new nested();
       n.hello();
  }
}