package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.limits.manager.TimeLimitsManagerImpl$currentState$1", f = "TimeLimitsManagerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class jwf0 extends tje0 implements gaj<fwf0, mwf0, v1b<? super mwf0>, Object> {
    public /* synthetic */ fwf0 a;
    public /* synthetic */ mwf0 b;

    @Override // defpackage.gaj
    public final Object invoke(fwf0 fwf0Var, mwf0 mwf0Var, v1b<? super mwf0> v1bVar) {
        jwf0 jwf0Var = new jwf0(3, v1bVar);
        jwf0Var.a = fwf0Var;
        jwf0Var.b = mwf0Var;
        return jwf0Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        fwf0 fwf0Var = this.a;
        mwf0 mwf0Var = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return mwf0.a(mwf0Var, fwf0Var, false, false, 6);
    }
}
