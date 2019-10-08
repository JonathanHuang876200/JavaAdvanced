package AnotherPackage;
import fourKindData.FourData;

public class anotherTester extends FourData {

    public String proText = this.textPro;



    public static void main(String[] args) {
        FourData test = new FourData();
        anotherTester anotherTester = new anotherTester();
        System.out.println(test.textPub);
        System.out.println(anotherTester.proText);
    }
}
