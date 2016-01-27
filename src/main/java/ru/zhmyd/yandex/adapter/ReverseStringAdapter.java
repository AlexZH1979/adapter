package ru.zhmyd.yandex.adapter;

/**
 * Created by USER on 27.01.2016.
 */
public class ReverseStringAdapter implements StringAdaper {

    private String string =null;

    public StringAdaper adaper =null;

    public ReverseStringAdapter(StringAdaper stringAdaper){
        adaper = stringAdaper;
    }

    public ReverseStringAdapter(String s){
        string = s;
    }

    public String getString() {
        if(adaper!=null){
            string = adaper.getString();
        }
        StringBuilder sb = new StringBuilder();
        String[] strings = string.split(" ");
        for (String s:strings) {
            sb.append(s+" ");
        }
        return sb.reverse().toString();
    }
}
