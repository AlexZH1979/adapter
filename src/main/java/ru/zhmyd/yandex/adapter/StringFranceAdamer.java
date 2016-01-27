package ru.zhmyd.yandex.adapter;

import com.sun.deploy.util.ArrayUtil;

/**
 * Created by USER on 27.01.2016.
 */
public class StringFranceAdamer implements StringAdaper {

    private String string=null;
    public StringAdaper adaper =null;

    //*************************************************
    public StringFranceAdamer(StringAdaper stringAdaper){
        adaper = stringAdaper;
    }

    public StringFranceAdamer(String s){
        string = s;
    }
    //*************************************************



    public String getString() {
        if(adaper!=null){
            string = adaper.getString();
        }

        return string.replaceAll(" ", " bonjor ");
    }
}
