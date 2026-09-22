class pen{
    String color;
    String type;

    public void Write(){
        System.out.println("pen is writing");
        System.out.println("the type is "+this.type);
        System.out.println("the colro is "+this.color);
    }
}
public class oops {
    public static void main(String[] args) {
        pen pen1=new pen();
        pen1.color="blue";
        pen1.type="gel";

        pen1.Write();
        pen pen2=new pen();
        pen2.color="black";
        pen2.type="ballpoint";
        pen2.Write();
    }
}

