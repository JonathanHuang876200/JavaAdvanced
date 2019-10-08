package CustomerInheritage;

import CustomerInheritage.CustomerData;
import CustomerInheritage.SilverCustomerData;

public class Tester {

    public static void main(String[] args) {
        CustomerData c = new CustomerData();
        c.name = "ChangeName";
        c.printName();
        c.enterId();
        c.countPoint();

        SilverCustomerData sc = new SilverCustomerData();
//        sc.name = "Amy";   /*因為name 設為private所以無法在其他類別改寫*/
        sc.printName();
        sc.enterId();
        sc.countPoint();



    }
}
