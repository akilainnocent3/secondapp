package defpackage;

import java.math.BigDecimal;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.refscall.presentation.ui.mapper.BalanceMapper$toBalanceUIState$1", f = "BalanceMapper.kt", l = {}, m = "invokeSuspend", v = 1)
public final class ev1 extends tje0 implements gaj<av1.a, uq30, v1b<? super av1.a>, Object> {
    public /* synthetic */ av1.a a;
    public /* synthetic */ uq30 b;

    @Override // defpackage.gaj
    public final Object invoke(av1.a aVar, uq30 uq30Var, v1b<? super av1.a> v1bVar) {
        ev1 ev1Var = new ev1(3, v1bVar);
        ev1Var.a = aVar;
        ev1Var.b = uq30Var;
        return ev1Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        BigDecimal bigDecimalSubtract;
        av1.a aVar = this.a;
        uq30 uq30Var = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        BigDecimal bigDecimal = aVar.b;
        if (bigDecimal == null) {
            bigDecimalSubtract = null;
        } else {
            bigDecimalSubtract = uq30Var.a.subtract(bigDecimal);
            bigDecimalSubtract.getClass();
            BigDecimal bigDecimal2 = skd0.b;
        }
        return new av1.a(uq30Var.b, uq30Var.a, bigDecimalSubtract);
    }
}
