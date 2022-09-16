package com.iot.sbus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class ForgotPassActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_pass);

        TextView phonenumber =(TextView) findViewById(R.id.et_phonerg);
        TextView newpassword =(TextView) findViewById(R.id.et_newpass);
        TextView renewpassword =(TextView) findViewById(R.id.et_rewrite_newpass);

        MaterialButton changepass_btn = (MaterialButton) findViewById(R.id.changepass);
        ImageView register_btn = (ImageView) findViewById(R.id.img_register);
        ImageView login_btn =findViewById(R.id.img_login);

        // Đăng ký
        register_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ForgotPassActivity.this,RegisterActivity.class));

            }


        });

//        0982345678 - 12345678 - 12345678
        changepass_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(phonenumber.getText().toString().equals("0982345678") && newpassword.getText().toString().equals(renewpassword.getText().toString())){
                    //correct
                    Toast.makeText(ForgotPassActivity.this,"Đổi mật khẩu thành công",Toast.LENGTH_SHORT).show();
                }else
                    //incorrect
                    Toast.makeText(ForgotPassActivity.this,"Đổi mật khẩu thất bại !!!",Toast.LENGTH_SHORT).show();
            }
        });

        // Quay lại trang Login
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ForgotPassActivity.this,LoginActivity.class));

            }


        });
    }
}
