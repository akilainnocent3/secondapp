package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class o60 implements Function2<a, Integer, Unit> {
    public final /* synthetic */ long a;
    public final /* synthetic */ d b;

    public o60(long j, d dVar) {
        this.a = j;
        this.b = dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            long j = this.a;
            if (j != 9205357640488583168L) {
                aVar2.N(-1244013944);
                d dVarP = j.p(this.b, k7f.c(j), k7f.b(j), 0.0f, 0.0f, 12);
                aiv aivVarC = g75.c(ht.a.b, false);
                int iHashCode = Long.hashCode(aVar2.m());
                ne00 ne00VarO = aVar2.o();
                d dVarC = c.c(aVar2, dVarP);
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
                if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                    j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                }
                hlh0.a(aVar2, dVarC, yka.a.d);
                s60.b(0, 1, aVar2, null);
                aVar2.s();
                aVar2.H();
            } else {
                aVar2.N(-1243644858);
                s60.b(0, 0, aVar2, this.b);
                aVar2.H();
            }
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
