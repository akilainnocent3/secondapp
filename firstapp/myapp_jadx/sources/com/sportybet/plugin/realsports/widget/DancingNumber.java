package com.sportybet.plugin.realsports.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes7.dex */
public class DancingNumber extends AppCompatTextView {
    public float v;
    public String w;

    public DancingNumber(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void g(float f) {
        if (TextUtils.isEmpty("%1$01.2f")) {
            this.w = "%1$01.0f";
        } else {
            this.w = "%1$01.2f";
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "number", 0.0f, f);
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.start();
    }

    public float getNumber() {
        return this.v;
    }

    public void setNumber(float f) {
        this.v = f;
        setText(String.format(this.w, Float.valueOf(f)));
    }
}
