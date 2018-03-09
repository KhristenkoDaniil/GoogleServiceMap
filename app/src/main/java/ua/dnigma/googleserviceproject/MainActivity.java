package ua.dnigma.googleserviceproject;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements MapContract.View{

    MapContract.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPresenter = new MapPresenter(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mPresenter.initMap();
    }


    @Override
    public Activity getContext() {
        return this;
    }
}
