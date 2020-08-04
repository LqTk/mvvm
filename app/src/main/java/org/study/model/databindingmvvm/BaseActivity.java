package org.study.model.databindingmvvm;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.ViewDataBinding;

import org.study.model.databinding.ActivityTestMainBinding;

public abstract class BaseActivity<T extends ViewDataBinding> extends AppCompatActivity {
    protected T binding;
    protected TestMVVMViewModel mvvmViewModel;
//    protected M model;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        onPrepare();
        binding = getBinding();
        setContentView(binding.getRoot());
        mvvmViewModel = new TestMVVMViewModel(getApplication(), (ActivityTestMainBinding) binding);
        ((ActivityTestMainBinding) binding).setUserModel(mvvmViewModel);
//        model = getModel();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        model.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
//        model.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
//        model.onResume();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
//        model.onActivityResult(requestCode,resultCode,data);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
//        model.onRestart();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
//        model.onRequestPermissionOnResult(requestCode,permissions,grantResults);
    }

    protected abstract void onPrepare();
    protected abstract T getBinding();
//    protected abstract M getModel();
}
