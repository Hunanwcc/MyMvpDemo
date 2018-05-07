package xhdpi.crkj.com.qijianMvp;

import android.os.Handler;

import xhdpi.crkj.com.base.Callback;

/**
 * 版    权：深圳市承儒科技有限公司
 * 创建日期：2018/4/26
 * 作   者：Stephen zora
 * Q  Q：781723432
 * <p>
 * 描 述：baseModel的具体实现方法  必须重写的方式execute方法
 */
public class UserDataModel extends BaseModel<String> {
    @Override
    public void execute(final Callback<String> callBack) {
        // 模拟网络请求耗时操作
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // mParams 是从父类得到的请求参数
                switch (mParams[0]){
                    case "normal":
                        callBack.onSuccess("根据参数"+mParams[0]+"的请求网络数据成功");
                        break;

                    case "failure":
                        callBack.onFailure("请求失败：参数有误");
                        break;

                    case "error":
                        callBack.onError("请求失败：error");
                        break;
                }
                callBack.onComplete();
            }
        },2000);
    }
}
