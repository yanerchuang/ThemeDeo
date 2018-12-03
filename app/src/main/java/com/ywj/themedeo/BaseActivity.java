package com.ywj.themedeo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * author: ywj
 * created on: 2018/12/3 14:54
 * description:
 */
public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (AppConfig.theme == 1) {
            setTheme(R.style.AppTheme);
        }else {
            setTheme(R.style.AppTheme2);
        }



    }
}
