import Utils.ManageProperties;

public class GetExcelData {
    public static void main(String[] args) {
        try {
            ManageProperties.loadProperties("data.properties");
            Object [] data;
            System.out.println(System.getProperty("filePath") + System.getProperty("fileName"));
            data = LoadExcelData.getEnabledExcelTests(System.getProperty("filePath") + System.getProperty("fileName"),"Functional");
            System.out.println(System.getProperty("user.dir"));
            System.out.println(data.length);
        }catch (Exception e){
            System.out.println(e.getStackTrace().toString());
        }

    }
}
