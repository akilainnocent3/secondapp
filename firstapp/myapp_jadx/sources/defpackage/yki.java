package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes5.dex */
public final class yki {
    public static final void a(final d dVar, final int i, final int i2, final float f, a aVar, final int i3) {
        int i4;
        boolean z;
        b bVarI = aVar.i(-1289601820);
        if ((i3 & 6) == 0) {
            i4 = (bVarI.M(dVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= bVarI.d(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= bVarI.d(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= bVarI.c(f) ? 2048 : 1024;
        }
        if (bVarI.q(i4 & 1, (i4 & 1171) != 1170)) {
            d dVarI = j.i(dVar, 4.0f);
            qyd0 qyd0Var = oib0.a;
            long j = ((lib0) bVarI.O(qyd0Var)).s0;
            zk40.a aVar2 = zk40.a;
            d dVarB = androidx.compose.foundation.a.b(dVarI, j, aVar2);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new wki();
                bVarI.r(objY);
            }
            d dVarH = g3w.h(xa80.b(dVarB, false, (Function1) objY), "simulation_settlement_progress_bar");
            d160 d160VarA = b160.a(kw0.a, ht.a.j, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d.a aVar4 = d.a.b;
            f160 f160Var = f160.a;
            if (i2 > 1) {
                bVarI.N(-6984871);
                z = false;
                g75.a(androidx.compose.foundation.a.b(j.c(f160Var.a(i2 - 1, aVar4, true), 1.0f), ((lib0) bVarI.O(qyd0Var)).P0, aVar2), bVarI, 0);
                bVarI.X(false);
            } else {
                z = false;
                bVarI.N(-6768646);
                bVarI.X(false);
            }
            d dVarA = f160Var.a(1.0f, aVar4, true);
            aiv aivVarC = g75.c(ht.a.a, z);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarA);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            g75.a(androidx.compose.foundation.a.b(j.c(j.g(aVar4, f.d(f, 0.0f, 1.0f)), 1.0f), ((lib0) bVarI.O(qyd0Var)).P0, aVar2), bVarI, 0);
            bVarI.X(true);
            int i5 = i - i2;
            if (i5 < 0) {
                i5 = 0;
            }
            if (i5 > 0) {
                bVarI.N(-6397359);
                ty0.a(bVarI, f160Var.a(i5, aVar4, true));
                bVarI.X(false);
            } else {
                bVarI.N(-6327206);
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: xki
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    yki.a(dVar, i, i2, f, (a) obj, qj40.a(i3 | 1));
                    return Unit.a;
                }
            };
        }
    }
}
