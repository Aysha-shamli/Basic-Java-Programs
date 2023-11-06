public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a before swap :"+a);
        System.out.println("b before swap :"+b);
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("a after swap :"+a);
        System.out.println("b after swap :"+b);
    }
}
