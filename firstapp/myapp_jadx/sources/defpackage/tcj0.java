package defpackage;

import android.os.SystemClock;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.doubleornothing.handler.winningpopup.winningpopupdoubleornothing.WinningPopupDoubleOrNothingCountdownHandlerImpl$init$2", f = "WinningPopupDoubleOrNothingCountdownHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class tcj0 extends tje0 implements Function2<Pair<? extends Boolean, ? extends j4f>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ vcj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tcj0(vcj0 vcj0Var, v1b<? super tcj0> v1bVar) {
        super(2, v1bVar);
        this.b = vcj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        tcj0 tcj0Var = new tcj0(this.b, v1bVar);
        tcj0Var.a = obj;
        return tcj0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Pair<? extends Boolean, ? extends j4f> pair, v1b<? super Unit> v1bVar) {
        return ((tcj0) create(pair, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        int i;
        Object value2;
        Object value3;
        Pair pair = (Pair) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean zBooleanValue = ((Boolean) pair.a).booleanValue();
        j4f j4fVar = (j4f) pair.b;
        vcj0 vcj0Var = this.b;
        wwd0 wwd0Var = vcj0Var.a;
        jvd0 jvd0Var = vcj0Var.c;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        vcj0Var.c = null;
        do {
            value = wwd0Var.getValue();
            ((Number) value).intValue();
            i = j4fVar.h;
            if (i < 0) {
                i = 0;
            }
        } while (!wwd0Var.g(value, new Integer(i)));
        if (zBooleanValue) {
            int iIntValue = ((Number) wwd0Var.getValue()).intValue();
            if (iIntValue < 0) {
                iIntValue = 0;
            }
            if (iIntValue <= 0) {
                do {
                    value3 = wwd0Var.getValue();
                    ((Number) value3).intValue();
                } while (!wwd0Var.g(value3, 0));
            } else {
                jvd0 jvd0Var2 = vcj0Var.c;
                if (jvd0Var2 != null) {
                    jvd0Var2.cancel((CancellationException) null);
                }
                vcj0Var.c = null;
                do {
                    value2 = wwd0Var.getValue();
                    ((Number) value2).intValue();
                } while (!wwd0Var.g(value2, Integer.valueOf(iIntValue)));
                long jElapsedRealtime = (((long) iIntValue) * 1000) + SystemClock.elapsedRealtime();
                et7 et7Var = vcj0Var.b;
                vcj0Var.c = et7Var != null ? ej5.c(et7Var, null, null, new ucj0(jElapsedRealtime, vcj0Var, null), 3) : null;
            }
        }
        return Unit.a;
    }
}
