public class GetExcelData {
    public static void main(String[] args) {
       Object [] data;
        data = LoadExcelData.getEnabledExcelTests("src/main/resources/ExcelData.xlsx","Functional");
        System.out.println(data.length);
    }
}
