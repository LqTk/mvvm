package org.study.model.databindingmvvm;

public class MvvmModel {

    public void setNameAndInfo(String name, String info, MCallback callback){
        InfoEntity entity=new InfoEntity();
        entity.setUserInfo(info);
        entity.setUserName(name);
        callback.onSuccess(entity);
    }
}
