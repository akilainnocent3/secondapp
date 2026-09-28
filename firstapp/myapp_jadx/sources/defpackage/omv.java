package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class omv implements Function2<a, Integer, Unit> {
    public final /* synthetic */ d a;
    public final /* synthetic */ zp70 b;
    public final /* synthetic */ op8 c;

    public omv(d dVar, zp70 zp70Var, op8 op8Var) {
        this.a = dVar;
        this.b = zp70Var;
        this.c = op8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            d dVarC = op70.c(f.c(h.h(this.a, 0.0f, 8.0f, 1), pzo.b), this.b, 14);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
            int I = aVar2.I();
            ne00 ne00VarO = aVar2.o();
            d dVarC2 = c.c(aVar2, dVarC);
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
            hlh0.a(aVar2, i78VarA, yka.a.f);
            hlh0.a(aVar2, ne00VarO, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(I))) {
                j3c.a(I, aVar2, I, c1350a);
            }
            hlh0.a(aVar2, dVarC2, yka.a.d);
            this.c.invoke(l78.a, aVar2, 6);
            aVar2.s();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
