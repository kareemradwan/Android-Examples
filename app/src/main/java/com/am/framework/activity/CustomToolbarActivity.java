package com.am.framework.activity;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.am.framework.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

public class CustomToolbarActivity extends BaseActivity {

    @BindView(R.id.main_toolbar_avatar)
    CircleImageView mainToolbarAvatar;


    @BindView(R.id.main_toolbar_name)
    TextView mainToolbarName;


    @BindView(R.id.main_toolbar)
    Toolbar toolbar;


    View.OnClickListener onClickListener = (View v) -> Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_toolbar);

        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        hideToolbarTitle();
        mainToolbarAvatar.setOnClickListener(onClickListener);
        mainToolbarName.setOnClickListener(onClickListener);

    }

}