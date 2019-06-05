package br.com.ifpb.atividade050619;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.LinearLayout;

public class MyActivity1 extends Activity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout root = new LinearLayout(this);
        root.setLayoutParams(new LinearLayout.LayoutParams
                (LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT));
        setContentView(root);
        Box1 box1 = new Box1(this,"Label1");
        root.addView(box1);
        Box1 box2 = new Box1(this,"Label2");
        root.addView(box2);

    }
}
