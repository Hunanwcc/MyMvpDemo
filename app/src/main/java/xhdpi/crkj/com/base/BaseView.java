package xhdpi.crkj.com.base;

import android.content.Context;

public interface BaseView {
    void showLoading();
    void hideLoading();
    void showTaost(String msg);
    void showError(String errprMsg);

    /**
     * 获取上下文
     * @return  上下文
     */
    Context getcontext();
}
