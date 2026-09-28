package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class abs {
    public static final void a(final lyh lyhVar, ibs ibsVar, s9s.b bVar, final Function1 function1, a aVar, final int i) {
        int i2;
        final ibs ibsVar2;
        final s9s.b bVar2;
        int i3;
        s9s.b bVar3;
        boolean z;
        ibs ibsVar3;
        lyhVar.getClass();
        function1.getClass();
        b bVarI = aVar.i(1796159582);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(lyhVar) : bVarI.A(lyhVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            i4 |= bVarI.A(function1) ? 2048 : 1024;
        }
        if (bVarI.q(i4 & 1, (i4 & 1171) != 1170)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                ibsVar = (ibs) bVarI.O(ndt.a);
                i3 = i4 & (-113);
                bVar3 = s9s.b.d;
                z = true;
            } else {
                bVarI.G();
                i3 = i4 & (-113);
                z = true;
                bVar3 = bVar;
            }
            bVarI.Y();
            boolean zA = (((i3 & 14) == 4 || ((i3 & 8) != 0 && bVarI.A(lyhVar))) ? z : false) | bVarI.A(ibsVar) | ((i3 & 896) == 256 ? z : false) | ((i3 & 7168) == 2048 ? z : false);
            Object objY = bVarI.y();
            if (zA || objY == a.C0041a.a) {
                ibsVar3 = ibsVar;
                xas xasVar = new xas(ibsVar3, bVar3, lyhVar, function1, null);
                bVarI.r(xasVar);
                objY = xasVar;
            } else {
                ibsVar3 = ibsVar;
            }
            xvf.g(lyhVar, ibsVar3, (Function2) objY, bVarI);
            ibsVar2 = ibsVar3;
            bVar2 = bVar3;
        } else {
            bVarI.G();
            ibsVar2 = ibsVar;
            bVar2 = bVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: sas
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    abs.a(lyhVar, ibsVar2, bVar2, function1, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final lyh lyhVar, ibs ibsVar, s9s.b bVar, final gaj gajVar, a aVar, final int i) {
        final s9s.b bVar2;
        int i2;
        lyhVar.getClass();
        gajVar.getClass();
        b bVarI = aVar.i(171761125);
        int i3 = (bVarI.M(lyhVar) ? 4 : 2) | i | 400 | (bVarI.M(gajVar) ? 2048 : 1024);
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                ibsVar = (ibs) bVarI.O(ndt.a);
                i2 = i3 & (-113);
                bVar = s9s.b.d;
            } else {
                bVarI.G();
                i2 = i3 & (-113);
            }
            s9s.b bVar3 = bVar;
            bVarI.Y();
            boolean zA = bVarI.A(ibsVar) | ((i2 & 14) == 4) | ((i2 & 7168) == 2048);
            Object objY = bVarI.y();
            if (zA || objY == a.C0041a.a) {
                yas yasVar = new yas(ibsVar, bVar3, lyhVar, gajVar, null);
                bVarI.r(yasVar);
                objY = yasVar;
            }
            xvf.g(lyhVar, ibsVar, (Function2) objY, bVarI);
            bVar2 = bVar3;
        } else {
            bVarI.G();
            bVar2 = bVar;
        }
        final ibs ibsVar2 = ibsVar;
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(ibsVar2, bVar2, gajVar, i) { // from class: qas
                public final /* synthetic */ ibs b;
                public final /* synthetic */ s9s.b c;
                public final /* synthetic */ gaj d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    abs.b(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
