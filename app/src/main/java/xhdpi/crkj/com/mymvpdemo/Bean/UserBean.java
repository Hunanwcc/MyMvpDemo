package xhdpi.crkj.com.mymvpdemo.Bean;

/**
 * 版    权：深圳市承儒科技有限公司
 * 创建日期：2018/4/19
 * 作   者：Stefan Cheng
 * Q  Q：781723432
 * <p>
 * 描 述：实体类  保存用户登录信息
 */
public class UserBean {
    private String name ;
    private String password;
    public UserBean(String account ,String ps){
        this.name = account;
        this.password = ps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}