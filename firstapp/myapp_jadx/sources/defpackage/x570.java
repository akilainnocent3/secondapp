package defpackage;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class x570 {
    public static final void a(int i, a aVar) {
        n54.a aVar2;
        b bVarI = aVar.i(870071664);
        if (bVarI.q(i & 1, i != 0)) {
            qyd0 qyd0Var = oib0.a;
            long j = ((lib0) bVarI.O(qyd0Var)).i0;
            d.a aVar3 = d.a.b;
            zk40.a aVar4 = zk40.a;
            d dVarI = h.i(androidx.compose.foundation.a.b(aVar3, j, aVar4), 10.0f, 1.0f, 10.0f, 8.0f);
            kw0.i iVar = new kw0.i(8.0f, true, new hw0());
            n54.a aVar5 = ht.a.m;
            i78 i78VarA = g78.a(iVar, aVar5, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarI);
            yka.k.getClass();
            tsr.a aVar6 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar6);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            g75.a(androidx.compose.foundation.a.b(ls7.a(j.i(j.g(aVar3, 1.0f), 24.0f), j060.c(((zib0) bVarI.O(ajb0.a)).c)), ((lib0) bVarI.O(qyd0Var)).A, aVar4), bVarI, 0);
            d dVarG = j.g(aVar3, 1.0f);
            d160 d160VarA = b160.a(kw0.g, ht.a.j, bVarI, 6);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarG);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar6);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            bVarI.N(1756815143);
            int i2 = 0;
            while (i2 < 3) {
                i78 i78VarA2 = g78.a(new kw0.i(4.0f, true, new hw0()), aVar5, bVarI, 6);
                int iHashCode3 = Long.hashCode(bVarI.T);
                ne00 ne00VarS3 = bVarI.S();
                d dVarC3 = c.c(bVarI, aVar3);
                yka.k.getClass();
                tsr.a aVar7 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar7);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA2, yka.a.f);
                hlh0.a(bVarI, ne00VarS3, yka.a.e);
                yka.a.C1350a c1350a2 = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                    n30.a(iHashCode3, bVarI, iHashCode3, c1350a2);
                }
                hlh0.a(bVarI, dVarC3, yka.a.d);
                g75.a(androidx.compose.foundation.a.a(j.t(aVar3, 40.0f, 14.0f), m590.a(null, bVarI, 3), null, 0.0f, 6), bVarI, 0);
                if (i2 != 0) {
                    aVar2 = i2 != 1 ? ht.a.o : ht.a.n;
                } else {
                    aVar2 = aVar5;
                }
                g75.a(androidx.compose.foundation.a.a(j.t(aVar3, 32.0f, 14.0f), m590.a(null, bVarI, 3), null, 0.0f, 6).n(new HorizontalAlignElement(aVar2)), bVarI, 0);
                bVarI.X(true);
                i2++;
            }
            bVarI.X(false);
            bVarI.X(true);
            g75.a(androidx.compose.foundation.a.a(j.i(j.g(aVar3, 1.0f), 32.0f), m590.a(null, bVarI, 3), null, 0.0f, 6), bVarI, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new w570();
        }
    }
}
