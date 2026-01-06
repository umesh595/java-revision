class formatspecifiers{
    private int secret=10;
    public int visible=42;
    void access(){
        System.out.println(secret+ " "+visible);
    }
}
public class Main {
    public static void main(){
        formatspecifiers f=new formatspecifiers();
        System.out.println(f.visible);
        f.access();
    }
}