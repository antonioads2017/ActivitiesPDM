package br.com.ifpb.atividade050619;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Box1 extends LinearLayout {

    private final String name;

    private void init(){
        LayoutParams lp = new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT);
        setLayoutParams(lp);
        setBackgroundColor(Color.BLUE);
        setOrientation(LinearLayout.VERTICAL);
        //LABEL
        TextView tv = new TextView(getContext());
        tv.setText(name);
        addView(tv);
        //INPUT
        EditText et = new EditText(getContext());
        addView(et);


    }

    public Box1(Context context, String name){
        super(context);
        this.name=name;
        init();
    }
}
