package xhdpi.crkj.com.mymvpdemo.View;

import xhdpi.crkj.com.mymvpdemo.Bean.UserBean;

/**
 * 版    权：深圳市承儒科技有限公司
 * 创建日期：2018/4/19
 * 作   者：Stefan Cheng
 * Q  Q：781723432
 * <p>
 * 描 述：负责给Presenter提供用户交互的数据源
 * View 层 代表Activity或Fragment
 */
public interface IUserView {
    String getUserName();
    String getUserPassword();

    void setSuccessIngo(UserBean userBean);
    void showError(String message);
    void showProgressDialog();
    void hideProgressDialog();
}
