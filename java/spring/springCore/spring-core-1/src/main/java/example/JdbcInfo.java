package example;

public class JdbcInfo {
  private String driverName;
  private String url;
  private String userName;
  private String password;

  public void setDriverName(String driverName) {
    this.driverName = driverName;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public void run() {
    System.out.println(String.format("Driver Name: %s \nUrl: %s\nUser Name: %s\n", 
        this.driverName, this.url, this.userName));
  }
}
