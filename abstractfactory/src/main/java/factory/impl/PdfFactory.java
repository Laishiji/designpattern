package factory.impl;

import factory.Factory;
import product.ExportFile;
import product.impl.ExportFinancialPdfFile;
import product.impl.ExportStandardPdfFile;
import product2.ImportFile;
import product2.impl.ImportPdfFile;

public class PdfFactory implements Factory {
    @Override
    public ExportFile getExportFile(String type) {
        if("standard".equals(type))
            return new ExportStandardPdfFile();

        else if("financial".equals(type))
            return new ExportFinancialPdfFile();

        else
            throw new RuntimeException("没有符合的格式");
    }

    @Override
    public ImportFile getImportFile() {
        return new ImportPdfFile();
    }
}
