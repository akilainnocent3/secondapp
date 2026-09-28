package com.sportygames.roulette.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.b3;
import defpackage.y4s;

/* JADX INFO: loaded from: classes6.dex */
public class NumberView extends AppCompatTextView {
    public long v;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ String a;
        public final /* synthetic */ long b;

        public a(String str, long j) {
            this.a = str;
            this.b = j;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            long jFloatValue = (long) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.b);
            NumberView numberView = NumberView.this;
            sb.append(b3.V(jFloatValue + numberView.v));
            numberView.setText(sb.toString());
        }
    }

    public class b extends AnimatorListenerAdapter {
        public final /* synthetic */ long a;

        public b(long j) {
            this.a = j;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            NumberView.this.v = this.a;
        }
    }

    public NumberView(Context context) {
        super(context);
        this.v = -18493478L;
    }

    public void setNumber(String str, long j) {
        long j2 = this.v;
        if (j2 == -18493478) {
            StringBuilder sbA = y4s.a(str);
            sbA.append(b3.V(j));
            setText(sbA.toString());
            this.v = j;
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(1500L);
        valueAnimatorOfFloat.addUpdateListener(new a(str, j - j2));
        valueAnimatorOfFloat.addListener(new b(j));
        valueAnimatorOfFloat.start();
    }

    public NumberView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.v = -18493478L;
    }
}
