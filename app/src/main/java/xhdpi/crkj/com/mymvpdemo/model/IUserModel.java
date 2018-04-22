package xhdpi.crkj.com.mymvpdemo.model;

import xhdpi.crkj.com.mymvpdemo.presenter.OnUserBeanListener;

public interface IUserModel {
    void login(String account, String password, OnUserBeanListener listener);
    void forgetPassWord(String account, OnUserBeanListener listener);
}
