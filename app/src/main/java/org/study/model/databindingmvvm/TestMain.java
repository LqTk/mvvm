package org.study.model.databindingmvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import org.study.model.R;
import org.study.model.databinding.ActivityTestMainBinding;

public class TestMain extends BaseActivity<ActivityTestMainBinding> {

    @Override
    protected void onPrepare() {

    }

    @Override
    protected ActivityTestMainBinding getBinding() {
        return DataBindingUtil.setContentView(this,R.layout.activity_test_main);
    }
}
