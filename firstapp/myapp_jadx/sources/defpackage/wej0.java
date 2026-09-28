package defpackage;

import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.doubleornothing.handler.winningpopup.WinningPopupHandlerImpl$initWinningPopupHandler$4", f = "WinningPopupHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class wej0 extends tje0 implements jaj<vbj0, mfj0, rcj0, Boolean, v1b<? super yfj0>, Object> {
    public /* synthetic */ vbj0 a;
    public /* synthetic */ mfj0 b;
    public /* synthetic */ rcj0 c;
    public /* synthetic */ boolean d;
    public final /* synthetic */ afj0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wej0(v1b v1bVar, afj0 afj0Var) {
        super(5, v1bVar);
        this.e = afj0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        vbj0 vbj0Var = this.a;
        mfj0 mfj0Var = this.b;
        rcj0 rcj0Var = this.c;
        boolean z = this.d;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (!z) {
            return null;
        }
        boolean zG = Intrinsics.g(vbj0Var, vbj0.b.a);
        afj0 afj0Var = this.e;
        if (zG) {
            BigDecimal bigDecimal = BigDecimal.ZERO;
            bigDecimal.getClass();
            return new yfj0.b(mfj0Var, afj0Var.a(bigDecimal));
        }
        if (Intrinsics.g(vbj0Var, vbj0.a.a)) {
            return new yfj0.a(rcj0Var);
        }
        if (vbj0Var instanceof vbj0.c) {
            return new yfj0.c(mfj0Var, afj0Var.a(((vbj0.c) vbj0Var).a));
        }
        uhc.a();
        return null;
    }

    @Override // defpackage.jaj
    public final Object l(vbj0 vbj0Var, mfj0 mfj0Var, rcj0 rcj0Var, Boolean bool, v1b<? super yfj0> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        wej0 wej0Var = new wej0(v1bVar, this.e);
        wej0Var.a = vbj0Var;
        wej0Var.b = mfj0Var;
        wej0Var.c = rcj0Var;
        wej0Var.d = zBooleanValue;
        return wej0Var.invokeSuspend(Unit.a);
    }
}
