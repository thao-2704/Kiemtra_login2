package com.example.kiemtra_login.custom_textview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

public class Black_chu extends AppCompatTextView {

    public Black_chu(@NonNull Context context) {
        super(context);
        setFont();
    }

    public Black_chu(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setFont();
    }

    public Black_chu(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFont();
    }
    private void setFont(){
        Typeface tf=thietke_chu.getBlackitalic(getContext());
        setTypeface(tf);
    }
}
