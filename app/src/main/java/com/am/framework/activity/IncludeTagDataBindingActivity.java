package com.am.framework.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.am.framework.R;
import com.am.framework.databinding.ActivityIncludeTagDataBindingBinding;
import com.am.framework.model.Item;

public class IncludeTagDataBindingActivity extends AppCompatActivity {
    ActivityIncludeTagDataBindingBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_include_tag_data_binding);
        Item item = new Item(101, "<include> Binding", "Binding Message");
        mBinding.setItem(item);
        setSupportActionBar(mBinding.toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public class MyClickHandlers {
        public void onFabClicked(View view, Item item) {
            Toast.makeText(getApplicationContext(), "FAB Clicked ! , " + item.getTitle(), Toast.LENGTH_SHORT).show();
        }

        // You can also pass params while binding.
        // public void onButtonClickWithParam(View view, User user)
        // receives the user object bind from UI layout. In the layout,
        // the parameter can be passed using
        public boolean onFabLongPressed(View view) {
            Toast.makeText(getApplicationContext(), "FAB Long Clicked !", Toast.LENGTH_SHORT).show();
            return true;
        }
    }

}
