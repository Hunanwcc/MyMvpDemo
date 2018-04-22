package xhdpi.crkj.com.mymvpdemo.View;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import xhdpi.crkj.com.mymvpdemo.Bean.UserBean;
import xhdpi.crkj.com.mymvpdemo.R;
import xhdpi.crkj.com.mymvpdemo.presenter.IUserPresenter;
import xhdpi.crkj.com.mymvpdemo.presenter.UserPresenter;

public class MainActivity extends AppCompatActivity implements IUserView {
    @BindView(R.id.ev_account_main)
    EditText evAccountMain;
    @BindView(R.id.ev_password_main)
    EditText evPasswordMain;
    @BindView(R.id.bt_login_main)
    Button btLoginMain;
    @BindView(R.id.bt_forgetpassword_main)
    Button btForgetpasswordMain;
    @BindView(R.id.tv_showMessage_main)
    TextView tvShowMessageMain;

    private IUserPresenter iUserPresenter;
    private Dialog loadingDialog;

    @Override
    public String getUserName() {
        return evAccountMain.getText().toString();
    }

    @Override
    public String getUserPassword() {
        return evPasswordMain.getText().toString();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();//无状态栏
        ButterKnife.bind(this);


        iUserPresenter = new UserPresenter(this);
        loadingDialog = new ProgressDialog(this);
        loadingDialog.setTitle("加载中...");

        btForgetpasswordMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iUserPresenter.forgetPassword();
            }
        });
        btLoginMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iUserPresenter.login();
            }
        });
    }

    @Override
    public void setSuccessIngo(UserBean userBean) {
        tvShowMessageMain.setText("account = "+ userBean.getName()+ "password = "+ userBean.getPassword());
    }

    @Override
    public void showError(String  message) {
        tvShowMessageMain.setText(message);
    }

    @Override
    public void showProgressDialog() {
        loadingDialog.show();
    }

    @Override
    public void hideProgressDialog() {
        loadingDialog.dismiss();
    }
}
