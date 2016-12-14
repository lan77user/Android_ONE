package com.sqsf.one_finished;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

public class MainActivity extends Activity {

    ScrollView scrollView;
    RadioGroup radioGroup;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn = (Button) findViewById(R.id.home);
//        这一句把底部框和顶部框都加载出来


        //默认加载首页内容
//        根据ID找到滚动视图scrollview
        final ScrollView scrollView = (ScrollView) findViewById(R.id.main_scorllview);
        RelativeLayout homelayout = (RelativeLayout) LayoutInflater.from(MainActivity.this).inflate(R.layout.home, null, false);
        scrollView.addView(homelayout);


        radioGroup = (RadioGroup) findViewById(R.id.radio);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.home) {
//                    //添加内容
//                    移除之前的
                    scrollView.removeAllViews();

//                    找到要进行显示的布局文件
                    RelativeLayout contentlayout = (RelativeLayout) LayoutInflater.from(MainActivity.this).inflate(R.layout.home, null, false);

//                    添加内容
                    scrollView.addView(contentlayout);

                } else if (checkedId == R.id.page) {
                    scrollView.removeAllViews();
                    RelativeLayout contentlayout = (RelativeLayout) LayoutInflater.from(MainActivity.this).inflate(R.layout.page, null, false);
                    scrollView.addView(contentlayout);

                } else if (checkedId == R.id.question) {
                    scrollView.removeAllViews();
                    RelativeLayout contentlayout = (RelativeLayout) LayoutInflater.from(MainActivity.this).inflate(R.layout.questions, null, false);
                    scrollView.addView(contentlayout);
                } else if (checkedId == R.id.stow) {
                    scrollView.removeAllViews();
                    RelativeLayout contentlayout = (RelativeLayout) LayoutInflater.from(MainActivity.this).inflate(R.layout.stow, null, false);
                    scrollView.addView(contentlayout);
                } else if (checkedId == R.id.details) {
                    scrollView.removeAllViews();
                    RelativeLayout contentlayout = (RelativeLayout) LayoutInflater.from(MainActivity.this).inflate(R.layout.detail, null, false);
                    scrollView.addView(contentlayout);
                }

            }

        });




    }

}

