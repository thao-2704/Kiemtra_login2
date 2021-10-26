package com.example.kiemtra_login.custom_textview;

import android.content.Context;
import android.graphics.Typeface;

public class thietke_chu {
    private static Typeface Black;
    private static Typeface Blackitalic;

    public static Typeface getBlack(Context context) {
        if(Black==null){
            Black=Typeface.createFromAsset(context.getAssets(), "fonts/BlackItalic.otf");
        }
        return Black;
    }

    public static Typeface getBlackitalic(Context context) {
        if(Blackitalic==null){
            Blackitalic=Typeface.createFromAsset(context.getAssets(), "fonts/BlackItalic.otf");
        }
        return Blackitalic;
    }
}
