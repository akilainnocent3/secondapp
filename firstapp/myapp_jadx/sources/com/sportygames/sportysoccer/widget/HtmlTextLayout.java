package com.sportygames.sportysoccer.widget;

import android.content.Context;
import android.graphics.Color;
import android.text.Html;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public class HtmlTextLayout extends RelativeLayout {
    public TextView a;
    public TextView b;

    public HtmlTextLayout(Context context) {
        super(context);
    }

    public static void b(int i, View view) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).setMargins(i, 0, 0, 0);
            view.requestLayout();
        }
    }

    public final void a(int i, int i2, String str, String str2) {
        this.a.setText(Html.fromHtml(str2));
        if (str.length() == 0 || str.isEmpty()) {
            this.b.setVisibility(8);
        } else {
            this.b.setVisibility(0);
        }
        if (i2 != -1) {
            this.b.setCompoundDrawablesWithIntrinsicBounds(i2, 0, 0, 0);
            this.b.setVisibility(0);
        }
        this.b.setText(str);
        if (i == 1) {
            b(getResources().getDimensionPixelSize(R.dimen.sg_index_margin_left_no_indentation), this.b);
        } else if (i == 2) {
            b(getResources().getDimensionPixelSize(R.dimen.sg_index_margin_left_indentation), this.b);
        } else if (i == 3) {
            b(getResources().getDimensionPixelSize(R.dimen.sg_index_margin_left_indentation_second), this.b);
        }
        this.a.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.sg_html_text_size_normal));
        this.a.setTextColor(Color.parseColor("#8b000000"));
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.text);
        this.b = (TextView) findViewById(R.id.index);
    }

    public void setText(String str) {
        this.a.setText(str);
    }

    public HtmlTextLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HtmlTextLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
