package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class p6r {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(y6r y6rVar, a aVar, int i) {
        Pair pair;
        b bVarI = aVar.i(-250665576);
        int i2 = (bVarI.M(y6rVar) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            boolean z = y6rVar instanceof y6r.a;
            d.a aVar2 = d.a.b;
            if (z) {
                bVarI.N(1370092227);
                pair = new Pair(h.f(androidx.compose.foundation.a.b(j.r(aVar2, 20.0f), fjb0.b(bVarI).H0, j060.a), 3.0f), new j58(fjb0.b(bVarI).o));
                bVarI.X(false);
            } else {
                if (!(y6rVar instanceof y6r.b)) {
                    throw igf0.a(bVarI, -371446849, false);
                }
                bVarI.N(1370397267);
                d dVarR = j.r(aVar2, 20.0f);
                long j = fjb0.b(bVarI).A;
                i060 i060Var = j060.a;
                pair = new Pair(h.f(androidx.compose.foundation.a.b(d35.a(dVarR, 1.0f, j, i060Var), fjb0.b(bVarI).q0, i060Var), 3.0f), new j58(fjb0.b(bVarI).a));
                bVarI.X(false);
            }
            lkf0.d(String.valueOf(y6rVar.getNumber()), (d) pair.a, ((j58) pair.b).a, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, fjb0.e(bVarI).o, bVarI, 0, 0, 130040);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new tq3(y6rVar, i);
        }
    }

    public static final void b(final l6r l6rVar, final d dVar, a aVar, final int i) {
        int i2;
        l6rVar.getClass();
        b bVarI = aVar.i(1345579501);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(l6rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            boolean z = l6rVar instanceof l6r.a;
            d.a aVar2 = d.a.b;
            if (z) {
                bVarI.N(316749318);
                c(((l6r.a) l6rVar).a, bVarI, (i3 >> 3) & 14);
                bVarI.X(false);
            } else {
                if (!l6rVar.equals(l6r.b.a)) {
                    throw igf0.a(bVarI, 316747535, false);
                }
                bVarI.N(316752396);
                c7q.a((i3 >> 3) & 14, 0, bVarI, aVar2);
                bVarI.X(false);
            }
            dVar = aVar2;
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: m6r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    p6r.b(l6rVar, dVar, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final qcn qcnVar, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(-1965618881);
        int i3 = i & 6;
        d.a aVar2 = d.a.b;
        if (i3 == 0) {
            i2 = (bVarI.M(aVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(qcnVar) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            y1i.b(j.g(aVar2, 1.0f), new kw0.i(4.0f, true, new hw0()), new kw0.i(4.0f, true, new hw0()), null, 0, 0, pp8.b(1502683066, new n6r(qcnVar, 0), bVarI), bVarI, 1573296, 56);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: o6r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    p6r.c(qcnVar, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
