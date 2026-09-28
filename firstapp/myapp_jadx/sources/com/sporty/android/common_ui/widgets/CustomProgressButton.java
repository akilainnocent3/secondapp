package com.sporty.android.common_ui.widgets;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import defpackage.sn5;

/* JADX INFO: loaded from: classes.dex */
public class CustomProgressButton extends RelativeLayout {
    public TextView a;
    public ProgressBar b;
    public boolean c;
    public CharSequence d;
    public String e;
    public View.OnClickListener f;
    public TextView i;
    public boolean v;

    public CustomProgressButton(Context context) {
        super(context);
        a();
    }

    public final void a() {
        View.inflate(getContext(), R.layout.custom_progress_button, this);
        setClickable(true);
        this.a = (TextView) findViewById(R.id.text);
        this.b = (ProgressBar) findViewById(R.id.progress);
        this.e = sn5.c(this, R.string.common_functions__loading_with_dot, new Object[0]);
        this.i = (TextView) findViewById(R.id.p_desc);
    }

    public void setDescTextVisible(boolean z) {
        this.v = z;
        this.i.setVisibility(z ? 0 : 8);
    }

    public void setDescView(CharSequence charSequence) {
        this.i.setText(charSequence);
    }

    public void setLoading(boolean z) {
        if (this.c == z) {
            return;
        }
        this.c = z;
        if (!z) {
            setActivated(false);
            this.b.setVisibility(8);
            this.i.setVisibility(this.v ? 0 : 8);
            this.a.setText(this.d);
            super.setOnClickListener(this.f);
            return;
        }
        this.b.setVisibility(0);
        this.a.setText(this.e);
        this.i.setVisibility(8);
        super.setOnClickListener(null);
        setClickable(false);
        setActivated(true);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f = onClickListener;
    }

    public void setText(CharSequence charSequence) {
        this.d = charSequence;
        if (this.c) {
            return;
        }
        this.a.setText(charSequence);
    }

    public void setTextColor(boolean z) {
        TextView textView = this.a;
        if (z) {
            textView.setTextColor(Color.parseColor("#ffffff"));
        } else {
            textView.setTextColor(Color.parseColor("#9ca0ab"));
        }
    }

    public CustomProgressButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public void setText(int i) {
        setText(sn5.c(this, i, new Object[0]));
    }
}
