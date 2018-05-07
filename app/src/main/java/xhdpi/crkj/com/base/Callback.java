package xhdpi.crkj.com.base;

public interface Callback<T> {
    /**
     *数据请求成功
     * @param data  请求到的数据
     */
    void onSuccess(T data);

    /**
     *使用网络API接口请求方式时，虽然已经请求成功但是由
     *  于{@code msg}的原因无法正常返回数据。
     * @param message
     */
    void onFailure(String message);

    /**
     *请求数据失败，指请求网络api接口出现无法联网、缺少权限
     * 、内存泄漏等原因导致无法连接到请求数据源
     * @param errorMsg
     */
    void onError(String errorMsg);

    /**
     * 当数据请求结束时，无论请求是成功、失败、或抛出异常都执行此方法给用户
     * 通常当做网络请求时可以在此处隐藏“正在加载” 的等待控件
     */
    void onComplete();
}
