package org.study.model.databindingmvvm;

import android.app.Application;
import android.util.Log;
import android.view.View;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import org.study.model.BR;
import org.study.model.databinding.ActivityTestMainBinding;

public class TestMVVMViewModel extends BaseObservable {
    private ActivityTestMainBinding binding;
    private MvvmModel mvvmModel;

    private String userName,userInfo;

    public TestMVVMViewModel(Application application, ActivityTestMainBinding binding) {
        this.binding = binding;
        this.mvvmModel = new MvvmModel();
    }

    public void getData(View view){
        Log.d("onclick","点击了，，，，，，");
        mvvmModel.setNameAndInfo("我是测试者", "这是一个测试MVVM的信息", new MCallback() {
            @Override
            public void onSuccess(InfoEntity infoEntity) {
                setEntity(infoEntity);
            }

            @Override
            public void onFailed() {

            }
        });
    }

    public void setEntity(InfoEntity entity) {
        setUserInfo(entity.getUserInfo());
        setUserName(entity.getUserName());
    }


    @Bindable
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        notifyPropertyChanged(BR.userName);
    }

    @Bindable
    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
        notifyPropertyChanged(BR.userInfo);
    }
}
