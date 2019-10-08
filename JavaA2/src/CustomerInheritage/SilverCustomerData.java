package CustomerInheritage;

public class SilverCustomerData extends CustomerData{

    private String name = "Matt";
    String id = "Sxxxx123456";
    /*protected*/ String level = "銀級會員";

    @Override
    public void printName() {
        System.out.println(level + "銀級會員名稱: " + name);
    }

    //    @Override
    public void enterId() {
        System.out.println(level + "身分: " + id);
    }


    //    @Override
    public void countPoint() {
        originalPoint = originalPoint + 5;
        System.out.println(level + "點數: " + originalPoint);
    }
}
