public class Company {

    String brandName;
    Company() {
        brandName = "Apple";
    }

    public static void main(String[] args) {
        Company a = new Company();
        System.out.println(a.brandName);
    }
}
