package factory;

import product.ExportFile;

public interface ExportFactory {
    public ExportFile getExportFile(String type);
}
