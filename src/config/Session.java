package config;

public class Session {
    public static Session instance;
    private int uid;
    private String fname;
    private String lname;
    private String email;
    private String pnumber;
    private String username;
    private String type;
    private String status;
    private String image;
    
    private Session(){
    //Private cons. prevents instance
    }

    public static synchronized Session getInstance() {
       if(instance == null){
       instance = new Session();
       }
       return instance;
    }

    public static boolean isInstanceEmpty() {
          return instance == null;
    }
    
     public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPnumber() {
        return pnumber;
    }

    public void setPnumber(String pnumber) {
        this.pnumber = pnumber;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status){
    this.status = status;
    }

   
    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    
}
