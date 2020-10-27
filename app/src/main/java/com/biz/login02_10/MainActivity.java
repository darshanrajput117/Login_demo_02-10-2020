package com.biz.login02_10;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    String password = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{4,}$";

    @BindView(R.id.tv_cname)
    AppCompatTextView tv_cname;
    @BindView(R.id.tv_pagename)
    AppCompatTextView tv_pname;
    @BindView(R.id.tv_emailid)
    AppCompatTextView tv_eid;
    @BindView(R.id.tv_password)
    AppCompatTextView tv_pwd;
    @BindView(R.id.tv_fp)
    AppCompatTextView tv_forgetpwd;
    @BindView(R.id.tv_orlogin)
    AppCompatTextView tv_orlog;

    @BindView(R.id.et_emailid)
    AppCompatEditText et_eid;
    @BindView(R.id.et_password)
    AppCompatEditText et_pwd;

    @BindView(R.id.iv_logo)
    AppCompatImageView iv_clogo;
    @BindView(R.id.iv_fb)
    AppCompatImageView iv_fb;
    @BindView(R.id.iv_google)
    AppCompatImageView iv_glogo;

    @BindView(R.id.btn_login)
    AppCompatButton btn_log;
    @BindView(R.id.btn_register)
    AppCompatButton btn_regi;

    @OnClick(R.id.btn_login)
    public void login() {
        if (et_eid.getText().toString().isEmpty() || et_pwd.getText().toString().isEmpty()) {
            Toast.makeText(getApplicationContext(), "enter email address", Toast.LENGTH_LONG).show();
        } else {
            if (et_eid.getText().toString().trim().matches(emailPattern) || et_pwd.getText().toString().trim().matches(password)) {
                Toast.makeText(getApplicationContext(), "Valid email address", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(getApplicationContext(), "Invalid email address", Toast.LENGTH_LONG).show();
            }
        }
    }

    @OnClick(R.id.btn_register)
    public void register() {
        Toast.makeText(getApplicationContext(), "Register Button Click Event Genreted", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}