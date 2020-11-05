import factory.Factory;
import factory.impl.HtmlFactory;
import factory.impl.PdfFactory;
import product.ExportFile;
import product2.ImportFile;

public class Test {
    public static void main(String[] args) {
        String data = "";
        Factory factory = new HtmlFactory();
        ExportFile exportFile = factory.getExportFile("financial");
        exportFile.export(data);

        System.out.println("-----分割线-----");

        String path = "C://user//xxx.pdf";
        Factory factory2 = new PdfFactory();
        ImportFile importFile = factory2.getImportFile();
        importFile.importFile(path);
    }
}
