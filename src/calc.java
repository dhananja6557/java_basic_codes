public class calc {
    static void myMethod(int x, int y) {
        int c = x * y;

        if (c >= 35 && c <= 49){
            System.out.println("Marks: " + c);
            System.out.println("Simple Pass (S)");
        } else if (c >= 50 && c <= 59){
            System.out.println("Marks: " + c);
            System.out.println("Credit Pass (C)");
        } else if (c >= 60 && c <= 74){
            System.out.println("Marks: " + c);
            System.out.println("Very Good Pass (B)");
        } else if (c >= 75 && c <= 100){
            System.out.println("Marks: " + c);
            System.out.println("Distinction (A)");
        } else {
            System.out.println("Marks: " + c);
            System.out.println("Failed (F)");
        }

    }

    public static void main(String[] args) {
        myMethod(7, 9);
    }
}