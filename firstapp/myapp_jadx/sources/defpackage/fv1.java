package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.nightnday.presentation.mapper.BalanceMapper$toBalanceUIState$1", f = "BalanceMapper.kt", l = {}, m = "invokeSuspend", v = 1)
public final class fv1 extends tje0 implements gaj<bv1, gbx, v1b<? super bv1>, Object> {
    public /* synthetic */ bv1 a;
    public /* synthetic */ gbx b;

    @Override // defpackage.gaj
    public final Object invoke(bv1 bv1Var, gbx gbxVar, v1b<? super bv1> v1bVar) {
        fv1 fv1Var = new fv1(3, v1bVar);
        fv1Var.a = bv1Var;
        fv1Var.b = gbxVar;
        return fv1Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        bv1 bv1Var = this.a;
        gbx gbxVar = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        Double d = bv1Var.b;
        return new bv1(gbxVar.b, new Double(gbxVar.a), d == null ? null : new Double(gbxVar.a - d.doubleValue()));
    }
}
