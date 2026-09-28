package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class db0 implements Function2<a, Integer, Unit> {
    public final /* synthetic */ long a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ d c;
    public final /* synthetic */ ply d;

    public db0(long j, boolean z, d dVar, ply plyVar) {
        this.a = j;
        this.b = z;
        this.c = dVar;
        this.d = plyVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            long j = this.a;
            a.C0041a.C0042a c0042a = a.C0041a.a;
            final ply plyVar = this.d;
            boolean z = this.b;
            if (j != 9205357640488583168L) {
                aVar2.N(3458246);
                kw0.e eVar = z ? kw0.a.b : kw0.a.a;
                d dVarP = j.p(this.c, k7f.c(j), k7f.b(j), 0.0f, 0.0f, 12);
                d160 d160VarA = b160.a(eVar, ht.a.j, aVar2, 0);
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
                hlh0.a(aVar2, d160VarA, yka.a.f);
                hlh0.a(aVar2, ne00VarO, yka.a.e);
                yka.a.C1350a c1350a = yka.a.g;
                if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                    j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                }
                hlh0.a(aVar2, dVarC, yka.a.d);
                boolean zA = aVar2.A(plyVar);
                Object objY = aVar2.y();
                if (zA || objY == c0042a) {
                    objY = new Function0() { // from class: bb0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf((plyVar.a() & 9223372034707292159L) != 9205357640488583168L);
                        }
                    };
                    aVar2.r(objY);
                }
                tz9.c(6, aVar2, d.a.b, (Function0) objY, z);
                aVar2.s();
                aVar2.H();
            } else {
                aVar2.N(4389176);
                boolean zA2 = aVar2.A(plyVar);
                Object objY2 = aVar2.y();
                if (zA2 || objY2 == c0042a) {
                    objY2 = new cb0(plyVar, 0);
                    aVar2.r(objY2);
                }
                tz9.c(0, aVar2, this.c, (Function0) objY2, z);
                aVar2.H();
            }
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
