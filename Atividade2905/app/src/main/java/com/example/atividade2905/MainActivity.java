package com.example.atividade2905;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

    private LinearLayout layout;

    public void onCreate(Bundle b) {
        super.onCreate(b);
        LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layout = new LinearLayout(this.getBaseContext());
        layout.setLayoutParams(p);
        layout.setBackgroundColor(Color.BLUE);
        setContentView(layout);

        ImageView iv = new ImageView(this);
        iv.setImageResource(R.drawable.goku);
        layout.addView(iv);
    }
}
