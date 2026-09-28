package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.e;
import com.sportybet.android.instantwin.presentation.bethistory2.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class s4j implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s4j(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float f;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                u6j u6jVar = (u6j) obj;
                int i2 = 0;
                u6jVar.t0 = false;
                u6jVar.q1();
                String str = u6jVar.q0;
                String str2 = u6jVar.r0;
                c9i0 c9i0Var = u6jVar.i;
                djh djhVar = u6jVar.b;
                if (djhVar != null) {
                    AppCompatImageView appCompatImageView = djhVar.w.d;
                    f = 0.0f;
                    u6jVar.Q0.playTogether(ObjectAnimator.ofFloat(appCompatImageView, str2, appCompatImageView.getX(), appCompatImageView.getX() - (c9i0Var.a * 0.11f)), ObjectAnimator.ofFloat(appCompatImageView, str, appCompatImageView.getY(), c9i0Var.b * 1.25f));
                    u6jVar.N0 = ObjectAnimator.ofFloat(appCompatImageView, (Property<AppCompatImageView, Float>) View.ROTATION, 0.0f, f.k(new IntRange(320, 640, 1), lx30.INSTANCE) * (-1.0f));
                } else {
                    f = 0.0f;
                }
                djh djhVar2 = u6jVar.b;
                if (djhVar2 != null) {
                    AppCompatImageView appCompatImageView2 = djhVar2.w.e;
                    u6jVar.R0.playTogether(ObjectAnimator.ofFloat(appCompatImageView2, str2, appCompatImageView2.getX(), (c9i0Var.a * 0.11f) + appCompatImageView2.getX()), ObjectAnimator.ofFloat(appCompatImageView2, str, appCompatImageView2.getY(), c9i0Var.b * 1.0f));
                    u6jVar.O0 = ObjectAnimator.ofFloat(appCompatImageView2, (Property<AppCompatImageView, Float>) View.ROTATION, f, f.k(new IntRange(320, 640, 1), lx30.INSTANCE) * 1.0f);
                }
                r750.d(u6jVar.t0(), new l5j(u6jVar, i2));
                return Unit.a;
            case 1:
                ((Function1) obj).invoke(a.g.a);
                return Unit.a;
            default:
                xea0 xea0Var = (xea0) obj;
                azm azmVar = xea0Var.i;
                if (azmVar == null) {
                    Intrinsics.n("router");
                    throw null;
                }
                azmVar.d(wae.HOME);
                e activity = xea0Var.getActivity();
                if (activity != null) {
                    wc.a(activity);
                }
                return Unit.a;
        }
    }
}
