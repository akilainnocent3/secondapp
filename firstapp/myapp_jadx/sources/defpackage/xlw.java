package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class xlw implements ValueAnimator.AnimatorUpdateListener {
    public final a a;
    public final View[] b;

    public interface a {
        void a(View view, ValueAnimator valueAnimator);
    }

    public xlw(a aVar, View... viewArr) {
        this.a = aVar;
        this.b = viewArr;
    }

    public static xlw a(View... viewArr) {
        return new xlw(new vlw(), viewArr);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        for (View view : this.b) {
            this.a.a(view, valueAnimator);
        }
    }
}
