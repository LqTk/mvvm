package org.study.model.databindingmvvm;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class InfoEntity{
    private String userName;
    private String userInfo;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }
}
