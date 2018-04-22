package xhdpi.crkj.com.mymvpdemo.presenter;

import android.util.Log;

import xhdpi.crkj.com.mymvpdemo.Bean.UserBean;
import xhdpi.crkj.com.mymvpdemo.View.IUserView;
import xhdpi.crkj.com.mymvpdemo.model.IUserModel;
import xhdpi.crkj.com.mymvpdemo.model.UserModel;

/**
 * 版    权：深圳市承儒科技有限公司
 * 创建日期：2018/4/19
 * 作   者：Stefan Cheng
 * Q  Q：781723432
 * <p>
 * 描 述：从View层获取用户交互数据 给Model层。
 * Model层负责获取数据 并解析返回给Presenter，presenter根据返回的数据分别刷新View
 */
public class UserPresenter implements IUserPresenter, OnUserBeanListener {
    private IUserView iUserView;
    private IUserModel iUserModel;
    private static final String TAG= "UserPresenter";

    public UserPresenter (IUserView iView){
        this.iUserView = iView;
        iUserModel = new UserModel();
    }
    @Override
    public void forgetPassword() {
        iUserView.showProgressDialog();
        if ("".equals(iUserView.getUserName())){
            Log.e(TAG, "forgetPassword : Account is empty! ");
            iUserView.hideProgressDialog();
        }else {
            iUserModel.forgetPassWord(iUserView.getUserName(),this);
        }
    }

    @Override
    public void login() {
        iUserView.showProgressDialog();
        if ("".equals(iUserView.getUserName()) ||"".equals(iUserView.getUserPassword())){
            Log.e(TAG, "login: Account or Password is empty! ");
            iUserView.hideProgressDialog();
        }else {
            iUserModel.login(iUserView.getUserName(),iUserView.getUserPassword(),this);
        }
    }

    @Override
    public void onSuccess(UserBean userBean) {
        iUserView.hideProgressDialog();
        iUserView.setSuccessIngo(userBean);
    }

    @Override
    public void onError(String mssage) {
        iUserView.hideProgressDialog();
        iUserView.showError(mssage);
        Log.e(TAG, "UserPresenter.onError: message= "+mssage );
    }


    //    @Override
//    public void onSuccess(Weather weather) {
//        weatherView.hideLoading();
//        weatherView.setWeatherInfo(weather);
//    }
//
//    @Override
//    public void onError() {
//        weatherView.hideLoading();
//        weatherView.showError();
//    }
}
