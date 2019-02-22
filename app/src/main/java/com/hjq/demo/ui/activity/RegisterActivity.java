package com.hjq.demo.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.hjq.baselibrary.utils.EditTextInputHelper;
import com.hjq.baselibrary.widget.CountdownView;
import com.hjq.demo.R;
import com.hjq.demo.common.CommonActivity;
import com.hjq.toast.ToastUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * author : HJQ
 * github : https://github.com/getActivity/AndroidProject
 * time   : 2018/10/18
 * desc   : 注册界面
 */
public class RegisterActivity extends CommonActivity {

    @BindView(R.id.et_register_phone)
    EditText mPhoneView;
    @BindView(R.id.cv_register_countdown)
    CountdownView mCountdownView;

    @BindView(R.id.et_register_code)
    EditText mCodeView;

    @BindView(R.id.et_register_password1)
    EditText mPasswordView1;

    @BindView(R.id.btn_register)
    Button mCommitView;

    private EditTextInputHelper mEditTextInputHelper;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_register;
    }

    @Override
    protected int getTitleBarId() {
        return R.id.tb_register_title;
    }

    @Override
    protected void initView() {

//        mEditTextInputHelper = new EditTextInputHelper(mCommitView, false);
//        mEditTextInputHelper.addViews(mPhoneView, mCodeView, mPasswordView1);
    }

    @Override
    protected void initData() {

    }

    @Override
    public void onRightClick(View v) {
        super.onRightClick(v);
        finish();
    }

    @Override
    protected void onDestroy() {
//        mEditTextInputHelper.removeViews();
        super.onDestroy();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick({R.id.cv_register_countdown, R.id.btn_register})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.cv_register_countdown:
                if (mPhoneView.getText().toString().length() != 11) {
                    // 重置验证码倒计时控件
                    mCountdownView.resetState();
                    ToastUtils.show(getResources().getString(R.string.phone_input_error));
                    return;
                }

                ToastUtils.show(getResources().getString(R.string.countdown_code_send_succeed));
                break;
            case R.id.btn_register:
//                if (mPhoneView.getText().toString().length() != 11) {
//                    ToastUtils.show(getResources().getString(R.string.phone_input_error));
//                    return;
//                }
                startActivity(new Intent(this, ChangeWordActivity.class));
                break;
        }
    }
}