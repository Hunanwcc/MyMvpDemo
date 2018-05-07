package xhdpi.crkj.com.base;

public class BasePresenter <V extends BaseView>{
    private V mvpView;//VIew接口
    /**
     * 绑定View，一般在初始化中调用该方法
     * @param baseView
     */
    public void attachView(V baseView){
        this.mvpView = baseView;
    }

    /**
     * 断开View，在View层销毁的时候。一般在onDestroy中调用
     */
    public void detachView(){
        this.mvpView = null;
    }

    /**
     * 是否与View建立连接
     * 每次调用业务请求的时候
     * 都要先调用方法检查是否与View建立连接
     * @return
     */
    public boolean isViewAttached(){
        return mvpView != null;
    }

    /**
     * 获取连接的View
     * @return
     */
    public V getView(){
        return mvpView;
    }

}
