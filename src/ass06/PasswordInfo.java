package ass06;

public class PasswordInfo {
    private String url;
    private String id;
    private String password;

    PasswordInfo(String url, String id, String pw) {
        this.url = url;
        this.id = id;
        this.password = pw;
    }

    public String toString() {
        return "" + url + ", " + id + ", " + password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String pw) {
        this.password = pw;
    }
}