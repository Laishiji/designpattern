package factory.impl;

import factory.ExportFactory;
import product.ExportFile;
import product.impl.ExportFinancialHtmlFile;
import product.impl.ExportStandardHtmlFile;

public class ExportHtmlFactory implements ExportFactory {
    @Override
    public ExportFile getExportFile(String type) {
        if("standard".equals(type))
            return new ExportStandardHtmlFile();

        else if("financial".equals(type))
            return new ExportFinancialHtmlFile();

        else
            throw new RuntimeException("没有符合的格式");
    }
}
