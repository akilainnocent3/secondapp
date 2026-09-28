package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class xi4 {
    public static final void a(final String str, final String str2, final String str3, final String str4, final Function0 function0, final fk4 fk4Var, a aVar, final int i) {
        int i2;
        b bVar;
        yka.a.C1350a c1350a;
        boolean z;
        function0.getClass();
        b bVarI = aVar.i(436421043);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.M(str4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function0) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.A(fk4Var) ? 131072 : 65536;
        }
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            d.a aVar2 = d.a.b;
            d dVarE = j.e(aVar2, 1.0f);
            aiv aivVarC = g75.c(ht.a.h, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarE);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a2 = yka.a.g;
            int i3 = i2;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a2);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarA = j.A(j.g(aVar2, 1.0f), null, 3);
            n54.a aVar4 = ht.a.m;
            kw0.k kVar = kw0.c;
            i78 i78VarA = g78.a(kVar, aVar4, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarA);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            long j = j58.f;
            zk40.a aVar5 = zk40.a;
            d dVarG = j.g(androidx.compose.foundation.a.b(aVar2, j, aVar5), 1.0f);
            i78 i78VarA2 = g78.a(kVar, ht.a.n, bVarI, 48);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarG);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA2, bVar2);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a2);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            ty0.a(bVarI, j.i(aVar2, 16.0f));
            long j2 = j58.b;
            t9i t9iVar = t9i.v;
            lkf0.b(str, null, j2, i7f.b(22.0f, bVarI), null, t9iVar, null, 0L, new gdf0(3), 0L, 0, false, 0, 0, null, null, bVarI, (i3 & 14) | 196992, 0, 130514);
            ty0.a(bVarI, j.i(aVar2, 12.0f));
            lkf0.b(str2, j.g(aVar2, 0.9f), j2, i7f.b(16.0f, bVarI), null, t9iVar, null, 0L, new gdf0(3), 0L, 0, false, 0, 0, null, null, bVarI, ((i3 >> 3) & 14) | 197040, 0, 130512);
            iib0.a(aVar2, 16.0f, bVarI, true);
            d dVarI = j.i(j.g(aVar2, 1.0f), 50.0f);
            d160 d160VarA = b160.a(kw0.a, ht.a.j, bVarI, 0);
            int iHashCode4 = Long.hashCode(bVarI.T);
            ne00 ne00VarS4 = bVarI.S();
            d dVarC4 = c.c(bVarI, dVarI);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar2);
            hlh0.a(bVarI, ne00VarS4, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                c1350a = c1350a2;
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
            } else {
                c1350a = c1350a2;
            }
            hlh0.a(bVarI, dVarC4, cVar);
            d dVarC5 = j.c(aVar2, 1.0f);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            yka.a.C1350a c1350a3 = c1350a;
            d dVarD = androidx.compose.foundation.d.d(androidx.compose.foundation.a.b(dVarC5.n(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), r58.d(4281678405L), aVar5), false, null, null, fk4Var, 15);
            n54 n54Var = ht.a.e;
            aiv aivVarC2 = g75.c(n54Var, false);
            int iHashCode5 = Long.hashCode(bVarI.T);
            ne00 ne00VarS5 = bVarI.S();
            d dVarC6 = c.c(bVarI, dVarD);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, bVar2);
            hlh0.a(bVarI, ne00VarS5, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode5))) {
                n30.a(iHashCode5, bVarI, iHashCode5, c1350a3);
            }
            hlh0.a(bVarI, dVarC6, cVar);
            lkf0.b(str3, null, j, i7f.b(18.0f, bVarI), null, t9iVar, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVarI, ((i3 >> 6) & 14) | 196992, 0, 131026);
            bVarI.X(true);
            d dVarC7 = j.c(aVar2, 1.0f);
            if (2.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            d dVarB = androidx.compose.foundation.a.b(dVarC7.n(new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true)), r58.d(4278884151L), aVar5);
            boolean z2 = (i3 & 57344) == 16384;
            Object objY = bVarI.y();
            if (z2 || objY == a.C0041a.a) {
                z = false;
                objY = new vi4(function0, 0);
                bVarI.r(objY);
            } else {
                z = false;
            }
            d dVarD2 = androidx.compose.foundation.d.d(dVarB, false, null, null, (Function0) objY, 15);
            aiv aivVarC3 = g75.c(n54Var, z);
            int iHashCode6 = Long.hashCode(bVarI.T);
            ne00 ne00VarS6 = bVarI.S();
            d dVarC8 = c.c(bVarI, dVarD2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC3, bVar2);
            hlh0.a(bVarI, ne00VarS6, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode6))) {
                n30.a(iHashCode6, bVarI, iHashCode6, c1350a3);
            }
            hlh0.a(bVarI, dVarC8, cVar);
            lkf0.b(str4, null, j, i7f.b(18.0f, bVarI), null, t9iVar, null, 0L, new gdf0(3), 0L, 0, false, 0, 0, null, null, bVarI, ((i3 >> 9) & 14) | 196992, 0, 130514);
            bVar = bVarI;
            mx4.a(bVar, true, true, true, true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: wi4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xi4.a(str, str2, str3, str4, function0, fk4Var, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
