package ru.zhmyd.yandex;

import ru.zhmyd.yandex.adapter.ReverseStringAdapter;
import ru.zhmyd.yandex.adapter.StringAdaper;
import ru.zhmyd.yandex.adapter.StringFranceAdamer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       String string =  "Hello World! ";

        StringAdaper adaper = new StringFranceAdamer(string);

        StringAdaper adaper1 = new ReverseStringAdapter(adaper);

        System.out.println(adaper1.getString());


    }
}
