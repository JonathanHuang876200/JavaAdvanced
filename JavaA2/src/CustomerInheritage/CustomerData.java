package CustomerInheritage;

public class CustomerData extends Tester implements informations {

    protected int originalPoint = 30; /*一般會員起始點數為10點*/
    String name = "Jonathan";
    String id = "Cxxxx123456";
    /*protected*/ String level = "一般會員";

    private void greet() {
        System.out.println("Hi! " + level + "你好");
    }

    @Override
    public void printName() {
        System.out.println(level + "名稱: " + name);
    }

    //        @Override
    public void enterId() {
        System.out.println(level + "身分: " + id);
    }

    //        @Override
    public void countPoint() {
        System.out.println(level + "點數: " + originalPoint);
    }



}
