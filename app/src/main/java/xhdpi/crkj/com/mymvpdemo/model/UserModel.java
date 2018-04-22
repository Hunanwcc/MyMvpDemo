package xhdpi.crkj.com.mymvpdemo.model;

import android.util.Log;

import xhdpi.crkj.com.mymvpdemo.Bean.UserBean;
import xhdpi.crkj.com.mymvpdemo.presenter.OnUserBeanListener;

/**
 * 版    权：深圳市承儒科技有限公司
 * 创建日期：2018/4/19
 * 作   者：Stephen zora
 * Q  Q：781723432
 * <p>
 * 描 述：实际与后台交互
 */
public class UserModel implements IUserModel {
    private static final String TAG = "UserModel";

    @Override
    public void forgetPassWord(final String account, final OnUserBeanListener onUserBeanListener) {
        new android.os.Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                onUserBeanListener.onError("这次请求注定不会陈宫");
                Log.e(TAG, "UserModel:forgetpassword THIS account"+ account);
            }
        },1000);


    }

    @Override
    public void login(final String account,final String password,final OnUserBeanListener onUserBeanListener) {
        Log.e(TAG, "UserModel:login THIS account"+ account+"PassWord=" + password);
        Log.e(TAG, "UserModel:login 正在和后台交互.......");
        new android.os.Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                onUserBeanListener.onSuccess(new UserBean(password,account));
                Log.e(TAG, "UserModel:forgetpassword THIS account"+ account);
            }
        },3000);
    }
}
