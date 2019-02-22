package com.hjq.demo.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hjq.demo.R;
import com.hjq.demo.common.CommonActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Administrator on 2019\2\22 0022.
 */

public class LoginActivity extends CommonActivity {

    @BindView(R.id.fastLoginText)
    TextView fastLoginText;
    @BindView(R.id.weiChatLayout)
    RelativeLayout weiChatLayout;
    @BindView(R.id.qqLayout)
    RelativeLayout qqLayout;
    @BindView(R.id.sinaLayout)
    RelativeLayout sinaLayout;
    @BindView(R.id.phoneLogin)
    TextView phoneLogin;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected int getTitleBarId() {
        return 0;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick({R.id.weiChatLayout, R.id.qqLayout, R.id.sinaLayout, R.id.phoneLogin})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.weiChatLayout:
                break;
            case R.id.qqLayout:
                break;
            case R.id.sinaLayout:
                break;
            case R.id.phoneLogin:
                startActivity(new Intent(LoginActivity.this,PhoneLoginActivity.class));
                break;
        }
    }
}
