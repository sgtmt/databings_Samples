package com.sg_tmt.smoz;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.sg_tmt.smoz.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setActivity(this);

    }
    public void onClick(View view){
        Toast.makeText(this,"test",Toast.LENGTH_SHORT).show();
    }
    public boolean onLongClick(View view){
        Toast.makeText(this,"testament",Toast.LENGTH_SHORT).show();
        return false;
    }

}
