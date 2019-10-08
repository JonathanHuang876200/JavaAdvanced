package fourKindData;

public class FourData {
    public String textPub = "This is public";     /*大家都可以使用*/
    protected String textPro = "This is protected";   /*同一個Package的所有變數+其他package的繼承子類別*/
    String textDef = "This is default";   /*同一個Package的所有class*/
    private String textPri = "This is private";   /*同一個Class*/
}
