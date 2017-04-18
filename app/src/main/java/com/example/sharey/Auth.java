package com.example.sharey;

/**
 * Created by 张文博 on 2017/4/11.
 */

public class Auth {
    private String name;
    private int imageId;

    public Auth(String name,int imageId){
        this.name=name;
        this.imageId=imageId;
    }

    public String getName(){
        return name;

    }

    public int getImageId(){
        return imageId;
    }
}
