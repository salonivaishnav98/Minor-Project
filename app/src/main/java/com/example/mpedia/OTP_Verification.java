package com.example.mpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethod;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class OTP_Verification extends AppCompatActivity {
    private final TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {

            if(s.length() > 0){

                if(selectETPosition == 0){
                    selectETPosition = 1;
                    showKeyboard(otp2);

                } else if (selectETPosition == 1) {
                    selectETPosition = 2;
                    showKeyboard(otp3);
                }
                else if(selectETPosition == 2){
                    selectETPosition = 3;
                    showKeyboard(otp1);
                }
            }

        }
    };

    private EditText otp1,otp2,otp3,otp4;
    private TextView resend_otp,otp_mobile,otp_email;
    Button get_otp_btn;

    //true after 60 sec
    private boolean resendEnabled = false;
    //resend time in seconds
    private int resendTime = 60;

    private int selectETPosition = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.otp_verification);
        getSupportActionBar().setTitle("OTP Verification");

        otp1 = findViewById(R.id.otp1);
        otp2 = findViewById(R.id.otp2);
        otp3 = findViewById(R.id.otp3);
        otp4 = findViewById(R.id.otp4);
        resend_otp = findViewById(R.id.resend_otp);
        otp_mobile = findViewById(R.id.otp_mobile);
        otp_email = findViewById(R.id.otp_email);
        get_otp_btn = findViewById(R.id.get_otp_btn);

        final String getEmail = getIntent().getStringExtra("email");
        final String getMobile = getIntent().getStringExtra("mobile");

        otp_email.setText(getEmail);
        otp_mobile.setText(getMobile);

        otp1.addTextChangedListener(textWatcher);
        otp2.addTextChangedListener(textWatcher);
        otp3.addTextChangedListener(textWatcher);
        otp4.addTextChangedListener(textWatcher);

        //by default open keyboard at otp1
        showKeyboard(otp1);

        //start resend count down timer
        startCountTimer();

        resend_otp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resendEnabled){
                    //handle resend code
                    startCountTimer();
                }
            }
        });

        get_otp_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String generatOTP = otp1.getText().toString()+otp2.getText().toString()+otp3.getText().toString()+otp4.getText().toString();
                if(generatOTP.length() == 4){
//handle your otp verification here
                }
            }
        });

    }
    private void showKeyboard(EditText otp){
        otp.requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.showSoftInput(otp, InputMethodManager.SHOW_IMPLICIT);


    }
    private  void startCountTimer(){
        resendEnabled = false;
        resend_otp.setTextColor(Color.parseColor("#099000000"));

        new CountDownTimer(resendTime * 60, 100){

            @Override
            public void onTick(long millisUntilFinished) {
                resend_otp.setText("Resend Code ("+(millisUntilFinished/60)+")");
            }

            @Override
            public void onFinish() {

                resendEnabled = true;
                resend_otp.setText("Resend Code");
               // resend_otp.setTextColor(getResources().getColor(R.color.purple));
            }
        }.start();

    }


    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {

        if(keyCode == KeyEvent.KEYCODE_DEL){
            if(selectETPosition == 3){
                selectETPosition = 2;
                showKeyboard(otp3);
            } else if (selectETPosition == 2) {
                selectETPosition = 1;
                showKeyboard(otp2);
            }
            else if(selectETPosition == 1){
                selectETPosition = 0;
                showKeyboard(otp1);
            }
            return true;
        }
        else {
            return super.onKeyUp(keyCode, event);
        }
    }
}