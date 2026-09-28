package defpackage;

import android.animation.ValueAnimator;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class uub0 implements PointerInputEventHandler {
    public final /* synthetic */ qub0 a;

    public uub0(qub0 qub0Var) {
        this.a = qub0Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(u020 u020Var, v1b<? super Unit> v1bVar) {
        final qub0 qub0Var = this.a;
        if (qub0Var.h3 != b6c0.a) {
            return Unit.a;
        }
        final cq40 cq40Var = new cq40();
        cq40Var.a = 0L;
        final yp40 yp40Var = new yp40();
        Object objE = y8f.e(u020Var, new a08(1, cq40Var), new Function0() { // from class: sub0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ValueAnimator valueAnimator;
                yp40 yp40Var2 = yp40Var;
                if (yp40Var2.a) {
                    qub0 qub0Var2 = qub0Var;
                    if (qub0Var2.h3 == b6c0.a && (!Intrinsics.g(qub0Var2.m3, Boolean.FALSE) || (valueAnimator = qub0Var2.l3) == null || !valueAnimator.isRunning())) {
                        ((u5a0) qub0Var2.g3).k(0);
                        qub0.o3(qub0Var2, 0.092f, 0.38f, false);
                        ((t5a0) wag0.j).A(0.1f);
                        ((x5a0) wag0.k).setValue(Integer.valueOf(R.dimen._35ssp));
                    }
                }
                yp40Var2.a = false;
                return Unit.a;
            }
        }, new vy2(yp40Var, 2), new Function2() { // from class: tub0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                m020 m020Var = (m020) obj;
                m020Var.getClass();
                long j = m020Var.c;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
                cq40 cq40Var2 = cq40Var;
                float fIntBitsToFloat2 = fIntBitsToFloat - Float.intBitsToFloat((int) (4294967295L & cq40Var2.a));
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (cq40Var2.a >> 32));
                if (Math.abs(fIntBitsToFloat2) > 50.0f && Math.abs(fIntBitsToFloat2) > Math.abs(fIntBitsToFloat3) * 10.0f) {
                    yp40 yp40Var2 = yp40Var;
                    if (fIntBitsToFloat2 > 0.0f) {
                        qub0Var.k4();
                        yp40Var2.a = false;
                    } else {
                        yp40Var2.a = true;
                    }
                }
                return Unit.a;
            }
        }, v1bVar);
        return objE == y5b.a ? objE : Unit.a;
    }
}
