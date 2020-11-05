package product2.impl;

import product2.ImportFile;

public class ImportHtmlFile implements ImportFile {
    @Override
    public Object importFile(String path) {
        /**
         * 业务逻辑
         */
        System.out.println("通过" + path + "导入HTML文件");
        return null;
    }
}
