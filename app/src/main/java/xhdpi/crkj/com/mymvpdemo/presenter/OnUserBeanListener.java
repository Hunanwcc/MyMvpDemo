package xhdpi.crkj.com.mymvpdemo.presenter;

import xhdpi.crkj.com.mymvpdemo.Bean.UserBean;
/**
 * 版    权：深圳市承儒科技有限公司
 * 创建日期：2018/4/19
 * 作   者：Stefan Cheng
 * Q  Q：781723432
 * <p>
 * 描 述：在Presenter层实现，给Model层回调，更新View层状态。确保Model层不直接操作View层
 */
public interface OnUserBeanListener {
    /**
     * 访问成功时回调
     * @param userBean
     */
    void onSuccess(UserBean userBean);

    /**
     * 失败时返回失败信息
     * @param mssage
     */
    void onError(String mssage);
}
