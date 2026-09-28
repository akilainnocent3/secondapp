package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class qk7 implements gaj<jh0, a, Integer, Unit> {
    @Override // defpackage.gaj
    public final Unit invoke(jh0 jh0Var, a aVar, Integer num) {
        a aVar2 = aVar;
        num.intValue();
        umz umzVar = uk7.a;
        aVar2.N(1575618259);
        aVar2.H();
        Object objY = aVar2.y();
        if (objY == a.C0041a.a) {
            objY = m.b(null);
            aVar2.r(objY);
        }
        ytw ytwVar = (ytw) objY;
        aiv aivVarC = g75.c(ht.a.e, false);
        int I = aVar2.I();
        ne00 ne00VarO = aVar2.o();
        d dVarC = c.c(aVar2, d.a.b);
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
        Function2 function2 = (Function2) ytwVar.getValue();
        if (function2 == null) {
            aVar2.N(-1538103400);
        } else {
            aVar2.N(-326710903);
            function2.invoke(aVar2, 0);
        }
        aVar2.H();
        aVar2.s();
        return Unit.a;
    }
}
