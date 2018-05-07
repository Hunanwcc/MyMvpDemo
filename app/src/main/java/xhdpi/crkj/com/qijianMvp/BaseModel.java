package xhdpi.crkj.com.qijianMvp;

import org.json.JSONObject;

import java.util.Map;

import xhdpi.crkj.com.base.Callback;

/**
 * 版    权：深圳市承儒科技有限公司
 * 创建日期：2018/4/26
 * 作   者：Stephen zora
 * Q  Q：781723432
 * <p>
 * 描 述：定义对外的请求规则。包括设置参数的方法，设置CallBack的方法
 * 还可以定义一些通用的数据请求。比如 get post方法
 */
public abstract class BaseModel<T> {
    protected String[] mParams;//数据请求参数

    /**
     * 设置数据请求参数
     * @param args 参数数组
     */
    public BaseModel params(String... args){
        mParams = args;
        return this;
    }

    /**
     * 添加CallBack并执行数据请求
     * 具体的数据请求由子类实现
     * @param callBack
     */
    public abstract void execute(Callback<T> callBack);

    /**
     * 执行Get网络请求，此类看需求由自己选择
     * @param url
     * @param callBack
     */
    protected void requestGetAPI(String url ,Callback<T> callBack){
        //这里写具体的网络请求
    }

    /**
     * 执行POST请求，此类看需求有自己定义如何写
     * @param url
     * @param callBack
     * @param jsonObject  上传的是Json
     */
    protected void requestPostAPI(String url, Callback<T> callBack , JSONObject jsonObject){
        //这里写具体的网络请求
    }
    /**
     * 执行POST请求，此类看需求有自己定义如何写
     * @param url
     * @param callBack
     * @param params   map里面的参数
     */
    protected void requestPostAPI(String url, Callback<T> callBack , Map params){
        //这里写具体的网络请求
    }
}
