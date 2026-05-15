public class Saurabh {
    static void add(){
        int a=10;
        int b=17;
        int c=a+b;
        System.out.println(c);
    }
    static void sub(){
        int d=23;
        int e=13;
        int f=d-e;
        System.out.println(f);

    }
    static void product(){
        int g=12;
        int h=12;
        int i=g*h;
        System.out.println("product="+i  );
    }
    static void plus(int w,int o){
        int z=w+o;
        System.out.println(z);
    }
    static void  difference(int u,int v){
        int j=u-v;
        System.out.println("difference="+j);

    }
    static void show(String msg,int s,int t){
        int k=s*t;
        System.out.println(msg+k);
    }
    static void msg(String msg,int x,int y){
        int n=x+y;
        System.out.println(n+msg);
    }
  public static void main(String[] args){
        add();
        sub();
        product();
        plus(4,5);
        difference(20,13);
        show("khiladi no",14,12);
        msg("hero",1,1);
  }
}
