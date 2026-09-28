package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l4v {
    public static final void a(m4v m4vVar, dxu dxuVar, a aVar, int i) {
        b bVar;
        int i2;
        b bVarI = aVar.i(-1501428757);
        int i3 = (bVarI.M(m4vVar) ? 4 : 2) | i | (bVarI.A(dxuVar) ? 32 : 16);
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            Iterator<m4v.a> it = m4vVar.b.iterator();
            int i4 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i4 = -1;
                    break;
                } else if (it.next().a.equals(m4vVar.a)) {
                    break;
                } else {
                    i4++;
                }
            }
            final int i5 = i4 < 0 ? 0 : i4;
            d.a aVar2 = d.a.b;
            d dVarB = androidx.compose.foundation.a.b(j.i(j.g(aVar2, 1.0f), 48.0f), ((lib0) bVarI.O(oib0.a)).d1, zk40.a);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            d dVarC2 = j.c(aVar2, 1.0f);
            long j = j58.l;
            op8 op8VarB = pp8.b(1958345299, new gaj() { // from class: i4v
                /* JADX WARN: Code duplicated, block: B:23:0x006c  */
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    List list = (List) obj;
                    a aVar4 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    list.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= (iIntValue & 8) == 0 ? aVar4.M(list) : aVar4.A(list) ? 4 : 2;
                    }
                    if (!aVar4.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        aVar4.G();
                    } else if (list.isEmpty()) {
                        aVar4.N(-1770556497);
                        aVar4.H();
                    } else {
                        int size = list.size();
                        int i6 = i5;
                        if (i6 < size) {
                            aVar4.N(-1770833265);
                            h2f0.a.b(h2f0.c((y1f0) list.get(i6)), 4.0f, ((lib0) aVar4.O(oib0.a)).y0, aVar4, 3120, 0);
                            aVar4.H();
                        } else {
                            aVar4.N(-1770556497);
                            aVar4.H();
                        }
                    }
                    return Unit.a;
                }
            }, bVarI);
            op8 op8VarB2 = pp8.b(-94557101, new hrg(1, dxuVar, m4vVar), bVarI);
            i2 = 1;
            mfc.a(i5, dVarC2, j, j, 0.0f, 56.0f, true, op8VarB, null, op8VarB2, bVarI, 819686832, 256);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            i2 = 1;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new irg(m4vVar, dxuVar, i, i2);
        }
    }
}
