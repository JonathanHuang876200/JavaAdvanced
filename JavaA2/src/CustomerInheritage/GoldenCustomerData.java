package CustomerInheritage;

public class GoldenCustomerData extends SilverCustomerData{
    String name = "Vicha";
    String id = "Gxxxx123456";
    /*protected*/ String level = "金級會員";

    @Override
    public void printName() {
        System.out.println(level + "名稱: " + name);
    }

    @Override
    public void enterId() {
        System.out.println(level + "身分: " + id);
    }

    @Override
    public void countPoint() {
        originalPoint = originalPoint + 10;
        System.out.println(level + "點數: " + originalPoint);
    }
}
