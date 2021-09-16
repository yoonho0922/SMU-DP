package ass02;

import java.util.Date;

public class FileInfo {
    private String name;
    private String type;
    private int size;
    private Date modifiedDate;

    public FileInfo(String name, String type, int size, Date modifiedDate) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.modifiedDate = modifiedDate;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }


}
