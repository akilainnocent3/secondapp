package com.sportybet.plugin.realsports.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class DancingNumber2 extends AppCompatTextView {
    public float v;
    public ValueAnimator w;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            Locale locale = Locale.US;
            Float f = (Float) valueAnimator.getAnimatedValue();
            f.getClass();
            sb.append(String.format(locale, "%.2f", f));
            DancingNumber2.this.setText(sb.toString());
        }
    }

    public class b extends AnimatorListenerAdapter {
        public final /* synthetic */ float a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public b(float f, String str, String str2) {
            this.a = f;
            this.b = str;
            this.c = str2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            float f = this.a;
            DancingNumber2 dancingNumber2 = DancingNumber2.this;
            dancingNumber2.v = f;
            dancingNumber2.setText(this.b + this.c);
        }
    }

    public DancingNumber2(Context context) {
        super(context);
    }

    public void setNumber(String str, String str2, boolean z) {
        try {
            float f = Float.parseFloat(str2);
            if (!z) {
                setPlainText(str + str2);
                this.v = f;
                return;
            }
            setVisibility(0);
            ValueAnimator valueAnimator = this.w;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.w.cancel();
                this.w = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.v, Float.parseFloat(str2));
            this.w = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(800L);
            this.w.addUpdateListener(new a(str));
            this.w.addListener(new b(f, str, str2));
            this.w.start();
        } catch (Exception unused) {
        }
    }

    public void setPlainText(CharSequence charSequence) {
        ValueAnimator valueAnimator = this.w;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.w.cancel();
            this.w = null;
        }
        setText(charSequence);
        this.v = 0.0f;
        setVisibility(0);
    }

    public DancingNumber2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
