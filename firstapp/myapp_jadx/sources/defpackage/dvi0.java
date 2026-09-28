package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.wheelanddeal.WDViewModel$bet$5", f = "WDViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
public final class dvi0 extends tje0 implements gaj<pd3, Boolean, v1b<? super pd3>, Object> {
    public /* synthetic */ pd3 a;

    @Override // defpackage.gaj
    public final Object invoke(pd3 pd3Var, Boolean bool, v1b<? super pd3> v1bVar) {
        bool.getClass();
        dvi0 dvi0Var = new dvi0(3, v1bVar);
        dvi0Var.a = pd3Var;
        return dvi0Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        pd3 pd3Var = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return pd3Var;
    }
}
