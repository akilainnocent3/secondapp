package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.timeAlert.manager.TimeAlertManagerImpl$currentStateTimeAlert$1", f = "TimeAlertManagerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class xtf0 extends tje0 implements gaj<ltf0, ztf0, v1b<? super ztf0>, Object> {
    public /* synthetic */ ltf0 a;
    public /* synthetic */ ztf0 b;

    @Override // defpackage.gaj
    public final Object invoke(ltf0 ltf0Var, ztf0 ztf0Var, v1b<? super ztf0> v1bVar) {
        xtf0 xtf0Var = new xtf0(3, v1bVar);
        xtf0Var.a = ltf0Var;
        xtf0Var.b = ztf0Var;
        return xtf0Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ltf0 ltf0Var = this.a;
        ztf0 ztf0Var = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return ztf0.a(ztf0Var, ltf0Var.a, ltf0Var.b, false, false, 12);
    }
}
