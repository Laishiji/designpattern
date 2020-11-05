import factory.ExportFactory;
import factory.impl.ExportHtmlFactory;
import product.ExportFile;

public class Test {
    public static void main(String[] args) {
        String data = "";
        ExportFactory exportFactory = new ExportHtmlFactory();
        ExportFile exportFile = exportFactory.getExportFile("financial");
        exportFile.export(data);
    }
}
