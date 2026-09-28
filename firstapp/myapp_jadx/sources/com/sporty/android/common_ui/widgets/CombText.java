package com.sporty.android.common_ui.widgets;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import defpackage.gr0;

/* JADX INFO: loaded from: classes6.dex */
public class CombText extends FrameLayout implements View.OnFocusChangeListener {
    public TextView a;
    public final TextView b;
    public final ImageView c;
    public final ImageView d;
    public final ImageView e;

    public CombText(Context context) {
        super(context);
        LayoutInflater.from(getContext()).inflate(R.layout.comb_text, this);
        this.b = (TextView) findViewById(R.id.label);
        this.c = (ImageView) findViewById(R.id.image);
        this.d = (ImageView) findViewById(R.id.clear);
        this.e = (ImageView) findViewById(R.id.card_icon);
        setCardIconVisible(false);
        setClickable(true);
    }

    public ImageView getCardIconView() {
        return this.e;
    }

    public ImageView getCardView() {
        return this.e;
    }

    public String getText() {
        return this.b.getText().toString();
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        ImageView imageView = this.c;
        if (z) {
            imageView.setColorFilter(Color.parseColor("#0d9737"), PorterDuff.Mode.SRC_IN);
        } else {
            imageView.setColorFilter(Color.parseColor("#9ca0ab"), PorterDuff.Mode.SRC_IN);
        }
    }

    public void setCardIconVisible(boolean z) {
        this.e.setVisibility(z ? 0 : 8);
    }

    public void setClearIcon(Drawable drawable) {
        this.d.setImageDrawable(drawable);
    }

    public void setClearIconVisible(boolean z) {
        this.d.setVisibility(z ? 0 : 8);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.b.setTextColor(getContext().getColor(z ? R.color.text_type1_primary : R.color.text_type1_secondary));
        this.d.setVisibility(z ? 0 : 8);
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

    public void setLabelImage(int i) {
        this.c.setImageDrawable(gr0.a(getContext(), i));
    }

    public void setLabelText(String str) {
        this.b.setText(str);
        if (TextUtils.isEmpty(str)) {
            setCardIconVisible(false);
        }
    }

    public void setLabelTextColor(int i) {
        this.b.setTextColor(i);
    }

    public CombText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(getContext()).inflate(R.layout.comb_text, this);
        this.b = (TextView) findViewById(R.id.label);
        this.c = (ImageView) findViewById(R.id.image);
        this.d = (ImageView) findViewById(R.id.clear);
        this.e = (ImageView) findViewById(R.id.card_icon);
        setCardIconVisible(false);
        setClickable(true);
    }

    public CombText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(getContext()).inflate(R.layout.comb_text, this);
        this.b = (TextView) findViewById(R.id.label);
        this.c = (ImageView) findViewById(R.id.image);
        this.d = (ImageView) findViewById(R.id.clear);
        this.e = (ImageView) findViewById(R.id.card_icon);
        setCardIconVisible(false);
        setClickable(true);
    }
}
