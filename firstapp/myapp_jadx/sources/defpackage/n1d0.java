package defpackage;

import com.sporty.android.core.model.account.AccountInfo;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.penalty.handler.SportyPenaltySessionDataHandlerImpl$init$1$2", f = "SportyPenaltySessionDataHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class n1d0 extends tje0 implements gaj<myh<? super AccountInfo>, Throwable, v1b<? super Unit>, Object> {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ p1d0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1d0(p1d0 p1d0Var, v1b<? super n1d0> v1bVar) {
        super(3, v1bVar);
        this.b = p1d0Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super AccountInfo> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        n1d0 n1d0Var = new n1d0(this.b, v1bVar);
        n1d0Var.a = th;
        return n1d0Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Throwable th = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.f;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, new q1d0.a(new j1d0.a(th))));
        return Unit.a;
    }
}
