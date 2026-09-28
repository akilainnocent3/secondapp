package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class jwc implements iaj<gwr, Integer, a, Integer, Unit> {
    public final /* synthetic */ du5 a;
    public final /* synthetic */ iu5 b;
    public final /* synthetic */ Function1<Long, Unit> c;
    public final /* synthetic */ xt5 d;
    public final /* synthetic */ Long e;
    public final /* synthetic */ guc f;
    public final /* synthetic */ h780 i;
    public final /* synthetic */ gtc v;

    /* JADX WARN: Multi-variable type inference failed */
    public jwc(du5 du5Var, iu5 iu5Var, Function1<? super Long, Unit> function1, xt5 xt5Var, Long l, guc gucVar, h780 h780Var, gtc gtcVar) {
        this.a = du5Var;
        this.b = iu5Var;
        this.c = function1;
        this.d = xt5Var;
        this.e = l;
        this.f = gucVar;
        this.i = h780Var;
        this.v = gtcVar;
    }

    @Override // defpackage.iaj
    public final Unit d(gwr gwrVar, Integer num, a aVar, Integer num2) {
        int i;
        gwr gwrVar2 = gwrVar;
        int iIntValue = num.intValue();
        a aVar2 = aVar;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (aVar2.M(gwrVar2) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= aVar2.d(iIntValue) ? 32 : 16;
        }
        if (aVar2.q(i & 1, (i & 147) != 146)) {
            iu5 iu5Var = this.b;
            du5 du5Var = this.a;
            iu5 iu5VarK = du5Var.k(iu5Var, iIntValue);
            d dVarA = gwrVar2.a(1.0f);
            aiv aivVarC = g75.c(ht.a.a, false);
            int I = aVar2.I();
            ne00 ne00VarO = aVar2.o();
            d dVarC = c.c(aVar2, dVarA);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            if (aVar2.k() == null) {
                l2a.b();
                throw null;
            }
            aVar2.D();
            if (aVar2.g()) {
                aVar2.F(aVar3);
            } else {
                aVar2.p();
            }
            hlh0.a(aVar2, aivVarC, yka.a.f);
            hlh0.a(aVar2, ne00VarO, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(I))) {
                j3c.a(I, aVar2, I, c1350a);
            }
            hlh0.a(aVar2, dVarC, yka.a.d);
            xvc.i(iu5VarK, this.c, this.d.d, this.e, null, null, this.f, this.i, this.v, du5Var.a, aVar2, 221184);
            aVar2.s();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
