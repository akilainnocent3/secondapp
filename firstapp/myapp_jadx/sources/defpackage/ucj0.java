package defpackage;

import android.os.SystemClock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.time.b;
import kotlin.time.c;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.doubleornothing.handler.winningpopup.winningpopupdoubleornothing.WinningPopupDoubleOrNothingCountdownHandlerImpl$startCountdown$3", f = "WinningPopupDoubleOrNothingCountdownHandlerImpl.kt", l = {73}, m = "invokeSuspend", v = 2)
public final class ucj0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ vcj0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ucj0(long j, vcj0 vcj0Var, v1b<? super ucj0> v1bVar) {
        super(2, v1bVar);
        this.c = j;
        this.d = vcj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ucj0 ucj0Var = new ucj0(this.c, this.d, v1bVar);
        ucj0Var.b = obj;
        return ucj0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ucj0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        v5b v5bVar = (v5b) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0 && i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        while (w5b.e(v5bVar)) {
            long jElapsedRealtime = this.c - SystemClock.elapsedRealtime();
            if (jElapsedRealtime < 0) {
                jElapsedRealtime = 0;
            }
            wwd0 wwd0Var = this.d.a;
            do {
                value = wwd0Var.getValue();
                ((Number) value).intValue();
            } while (!wwd0Var.g(value, new Integer((int) ((999 + jElapsedRealtime) / 1000))));
            if (jElapsedRealtime <= 0) {
                break;
            }
            b.a aVar = b.b;
            long jH = c.h(500, rgf.MILLISECONDS);
            this.b = v5bVar;
            this.a = 1;
            if (hkd.c(jH, this) == y5bVar) {
                return y5bVar;
            }
        }
        return Unit.a;
    }
}
