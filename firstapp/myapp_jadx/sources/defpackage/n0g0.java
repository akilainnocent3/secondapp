package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class n0g0 implements Function2<a, Integer, Unit> {
    public final /* synthetic */ float a;
    public final /* synthetic */ long b;
    public final /* synthetic */ op8 c;

    public n0g0(float f, long j, op8 op8Var) {
        this.a = f;
        this.b = j;
        this.c = op8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            umz umzVar = r0g0.a;
            d dVarE = h.e(j.v(d.a.b, 40.0f, 24.0f, this.a, 8), r0g0.a);
            aiv aivVarC = g75.c(ht.a.a, false);
            int I = aVar2.I();
            ne00 ne00VarO = aVar2.o();
            d dVarC = c.c(aVar2, dVarE);
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
            hna.b(new j730[]{tp0.a(this.b, iza.a), lkf0.a.a(gah0.a(pi10.d, aVar2))}, this.c, aVar2, 8);
            aVar2.s();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
