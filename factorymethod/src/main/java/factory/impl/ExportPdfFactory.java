package factory.impl;

import factory.ExportFactory;
import product.ExportFile;
import product.impl.ExportFinancialPdfFile;
import product.impl.ExportStandardPdfFile;

public class ExportPdfFactory implements ExportFactory {
    @Override
    public ExportFile getExportFile(String type) {
        if("standard".equals(type))
            return new ExportStandardPdfFile();

        else if("financial".equals(type))
            return new ExportFinancialPdfFile();

        else
            throw new RuntimeException("没有符合的格式");
    }
}
