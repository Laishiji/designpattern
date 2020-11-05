package factory.impl;

import factory.Factory;
import product.ExportFile;
import product.impl.ExportFinancialHtmlFile;
import product.impl.ExportStandardHtmlFile;
import product2.ImportFile;
import product2.impl.ImportHtmlFile;

public class HtmlFactory implements Factory {
    @Override
    public ExportFile getExportFile(String type) {
        if("standard".equals(type))
            return new ExportStandardHtmlFile();

        else if("financial".equals(type))
            return new ExportFinancialHtmlFile();

        else
            throw new RuntimeException("没有符合的格式");
    }

    @Override
    public ImportFile getImportFile() {
        return new ImportHtmlFile();
    }
}
