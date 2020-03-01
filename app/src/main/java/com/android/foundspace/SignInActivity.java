package com.android.foundspace;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SignInActivity extends AppCompatActivity {


    @BindView(R.id.signIn_Email_EditText)
    EditText signInEmailEditText;
    @BindView(R.id.signIn_Pass_EditText)
    EditText signInPassEditText;
    @BindView(R.id.signIn_Forget_Button)
    Button signInForgetButton;
    @BindView(R.id.signIn_Login_Button)
    Button signInLoginButton;
    @BindView(R.id.signIn_google_Button)
    Button signInGoogleButton;
    @BindView(R.id.signIn_Face_Button)
    Button signInFaceButton;
    @BindView(R.id.signIn_SignUp_Button)
    Button signInSignUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        ButterKnife.bind(this);
    }
}
