package yinlei.com.mvpdemo.pro.base.model;

import android.content.Context;

import yinlei.com.mvpdemo.mvp.model.MvpModel;

/**
 * Created by Dream on 16/5/28.
 */
public abstract class BaseModel implements MvpModel{

    private Context context;

    public BaseModel(Context context){
        this.context = context;
    }

    public String getServerUrl(){
        return "http://api.budejie.com";
    }

}
