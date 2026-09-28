package com.sporty.android.common_ui.widgets;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes4.dex */
public class GridItemPanel extends LinearLayout {
    public final TextView a;
    public final TextView b;
    public boolean c;

    public GridItemPanel(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.grid_item, this);
        this.a = (TextView) findViewById(R.id.pay_amount);
        this.b = (TextView) findViewById(R.id.pay_desc);
        setBackgroundResource(this.c ? R.drawable.green_btn_bg : R.drawable.comb_edit_focus_bg);
        this.a.setTextColor(Color.parseColor(this.c ? "#ffffff" : "#0d9737"));
    }

    public void setChecked(boolean z) {
        this.c = z;
        setBackgroundResource(z ? R.drawable.green_btn_bg : R.drawable.comb_edit_focus_bg);
        this.a.setTextColor(Color.parseColor(this.c ? "#ffffff" : "#0d9737"));
    }

    public void setPayAmount(String str, String str2) {
        this.a.setText(str);
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        TextView textView = this.b;
        if (zIsEmpty) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            this.b.setText(str2);
        }
    }
}
