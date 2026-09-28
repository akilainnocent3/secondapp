package com.sporty.android.common_ui.widgets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import defpackage.gr0;

/* JADX INFO: loaded from: classes6.dex */
public class CombText2 extends FrameLayout {
    public TextView a;
    public final TextView b;
    public final ImageView c;
    public final ImageView d;
    public final TextView e;

    public CombText2(Context context) {
        super(context);
        LayoutInflater.from(getContext()).inflate(R.layout.comb_text2, this);
        this.b = (TextView) findViewById(R.id.label);
        this.c = (ImageView) findViewById(R.id.image);
        this.d = (ImageView) findViewById(R.id.clear);
        this.e = (TextView) findViewById(R.id.hint);
        setHintVisible(false);
        setClickable(true);
    }

    public TextView getHintView() {
        return this.e;
    }

    public ImageView getLabelImage() {
        return this.c;
    }

    public String getText() {
        return this.b.getText().toString();
    }

    public void setClearIcon(Drawable drawable) {
        this.d.setImageDrawable(drawable);
    }

    public void setError(String str) {
        if (str == null) {
            setActivated(false);
            this.a.setVisibility(8);
        } else {
            setActivated(true);
            this.a.setText(str);
            this.a.setVisibility(0);
        }
    }

    public void setErrorView(TextView textView) {
        this.a = textView;
    }

    public void setHintVisible(boolean z) {
        this.e.setVisibility(z ? 0 : 8);
    }

    public void setLabelImage(int i) {
        this.c.setImageDrawable(gr0.a(getContext(), i));
    }

    public void setLabelText(String str) {
        this.b.setText(str);
        if (TextUtils.isEmpty(str)) {
            setHintVisible(false);
        }
    }

    public void setLabelTextColor(int i) {
        this.b.setTextColor(i);
    }

    public CombText2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(getContext()).inflate(R.layout.comb_text2, this);
        this.b = (TextView) findViewById(R.id.label);
        this.c = (ImageView) findViewById(R.id.image);
        this.d = (ImageView) findViewById(R.id.clear);
        this.e = (TextView) findViewById(R.id.hint);
        setHintVisible(false);
        setClickable(true);
    }

    public CombText2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(getContext()).inflate(R.layout.comb_text2, this);
        this.b = (TextView) findViewById(R.id.label);
        this.c = (ImageView) findViewById(R.id.image);
        this.d = (ImageView) findViewById(R.id.clear);
        this.e = (TextView) findViewById(R.id.hint);
        setHintVisible(false);
        setClickable(true);
    }
}
