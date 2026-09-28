package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewPropertyAnimator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rtt implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rtt(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((isw) obj2).A(((Float) obj).floatValue());
                return Unit.a;
            case 1:
                final b8b0 b8b0Var = (b8b0) obj2;
                ((View) obj).getClass();
                b8b0Var.M = 1;
                b8b0Var.I0(false);
                dcb0 dcb0Var = (dcb0) b8b0Var.b;
                if (dcb0Var != null && (viewPropertyAnimatorAnimate = dcb0Var.v.animate()) != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(0.0f)) != null) {
                    viewPropertyAnimatorAlpha.setDuration(300L);
                }
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: k6b0
                    @Override // java.lang.Runnable
                    public final void run() {
                        b8b0 b8b0Var2 = b8b0Var;
                        dcb0 dcb0Var2 = (dcb0) b8b0Var2.b;
                        if (dcb0Var2 != null) {
                            dcb0Var2.v.setRotation(-((float) b8b0Var2.T));
                        }
                    }
                }, 400L);
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: l6b0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewPropertyAnimator viewPropertyAnimatorAnimate2;
                        ViewPropertyAnimator viewPropertyAnimatorAlpha2;
                        b8b0 b8b0Var2 = b8b0Var;
                        dcb0 dcb0Var2 = (dcb0) b8b0Var2.b;
                        if (dcb0Var2 != null && (viewPropertyAnimatorAnimate2 = dcb0Var2.v.animate()) != null && (viewPropertyAnimatorAlpha2 = viewPropertyAnimatorAnimate2.alpha(1.0f)) != null) {
                            viewPropertyAnimatorAlpha2.setDuration(300L);
                        }
                        b8b0Var2.p0(b8b0Var2.V);
                    }
                }, 500L);
                return Unit.a;
            default:
                return Double.valueOf(((Double) obj).doubleValue() - ((mse0) obj2).d);
        }
    }
}
