public class Main
{
    public static void main(String[] args) {
        Temperature T = new Temperature(36, 'C');
        Temperature T2 = new Temperature(28);
        Temperature T3 = new Temperature('C');
        Temperature T4 = new Temperature('F');
        System.out.println(T.toString());
        System.out.println(T2.toString());
        System.out.println(T3.toString());
        System.out.println(T4.toString());
        System.out.println(T.degreeC());
        System.out.println(T.degreeF());

    }
}
