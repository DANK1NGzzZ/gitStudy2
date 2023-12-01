package ywh.entity;

//import lombok.Data;

/**
 * 用户实体类
 */
//@Data
public class UserInfo {
    private int uaccount;          //用户名id
    private String uname;        //用户姓名
    private String upwd;         //用户账号
    private String usex;        //用户密码

    public int getUaccount() {
        return uaccount;
    }
    public void setUaccount(int uaccount) {
        this.uaccount = uaccount;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "uaccount=" + uaccount +
                ", uname='" + uname + '\'' +
                ", upwd='" + upwd + '\'' +
                ", usex='" + usex + '\'' +
                '}';
    }
}

