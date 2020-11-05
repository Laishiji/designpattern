package factory;

import product.ExportFile;
import product2.ImportFile;

public interface Factory {
    public ExportFile getExportFile(String type);

    public ImportFile getImportFile();
}
