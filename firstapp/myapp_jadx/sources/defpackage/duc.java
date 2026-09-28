package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class duc implements Function2<a, Integer, Unit> {
    public final /* synthetic */ op8 a;
    public final /* synthetic */ Function2<a, Integer, Unit> b;
    public final /* synthetic */ op8 c;

    public duc(op8 op8Var, Function2 function2, op8 op8Var2) {
        this.a = op8Var;
        this.b = function2;
        this.c = op8Var2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            i78 i78VarA = g78.a(kw0.g, ht.a.m, aVar2, 6);
            int I = aVar2.I();
            ne00 ne00VarO = aVar2.o();
            d.a aVar3 = d.a.b;
            d dVarC = c.c(aVar2, aVar3);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            if (aVar2.k() == null) {
                l2a.b();
                throw null;
            }
            aVar2.D();
            if (aVar2.g()) {
                aVar2.F(aVar4);
            } else {
                aVar2.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(aVar2, i78VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(aVar2, ne00VarO, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(I))) {
                j3c.a(I, aVar2, I, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(aVar2, dVarC, cVar);
            l78 l78Var = l78.a;
            d dVarA = l78Var.a(1.0f, aVar3, false);
            n54 n54Var = ht.a.a;
            aiv aivVarC = g75.c(n54Var, false);
            int I2 = aVar2.I();
            ne00 ne00VarO2 = aVar2.o();
            d dVarC2 = c.c(aVar2, dVarA);
            if (aVar2.k() == null) {
                l2a.b();
                throw null;
            }
            aVar2.D();
            if (aVar2.g()) {
                aVar2.F(aVar4);
            } else {
                aVar2.p();
            }
            hlh0.a(aVar2, aivVarC, bVar);
            hlh0.a(aVar2, ne00VarO2, dVar);
            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(I2))) {
                j3c.a(I2, aVar2, I2, c1350a);
            }
            hlh0.a(aVar2, dVarC2, cVar);
            this.a.invoke(l78Var, aVar2, 6);
            aVar2.s();
            d dVarE = h.e(l78Var.c(ht.a.o, aVar3), fuc.a);
            aiv aivVarC2 = g75.c(n54Var, false);
            int I3 = aVar2.I();
            ne00 ne00VarO3 = aVar2.o();
            d dVarC3 = c.c(aVar2, dVarE);
            if (aVar2.k() == null) {
                l2a.b();
                throw null;
            }
            aVar2.D();
            if (aVar2.g()) {
                aVar2.F(aVar4);
            } else {
                aVar2.p();
            }
            hlh0.a(aVar2, aivVarC2, bVar);
            hlh0.a(aVar2, ne00VarO3, dVar);
            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(I3))) {
                j3c.a(I3, aVar2, I3, c1350a);
            }
            hlh0.a(aVar2, dVarC3, cVar);
            i730.a(g68.d(cme.a, aVar2), gah0.a(cme.b, aVar2), pp8.b(-1103927529, new cuc(this.b, this.c), aVar2), aVar2, 384);
            aVar2.s();
            aVar2.s();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
