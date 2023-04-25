package shz.soya.singletonModle;


public class User {

    private String username;
    private String password;
    private long registrationTime;

    {
        System.out.println("新用户注册");
        registrationTime  = System.currentTimeMillis();
    }

    public User(){
        this.username =String.valueOf(registrationTime) ;
        this.password = "123456";
    }
    public User(String username,String password){
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getRegistrationTime() {
        return registrationTime;
    }
    public String getInfo(){
       String info = "用户名："+username+",密码："+password+",注册时间"+registrationTime;
       return info;
    }
}
