package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportygames.newcms.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class gcl {
    public static final void a(final long j, final d dVar, int i, int i2, a aVar, final int i3) {
        lu00 lu00Var;
        String strC;
        final int i4 = i;
        final int i5 = i2;
        dVar.getClass();
        b bVarI = aVar.i(-1712634649);
        int i6 = i3 | (bVarI.e(j) ? 4 : 2) | (bVarI.M(dVar) ? 32 : 16) | (bVarI.d(i4) ? 256 : 128) | (bVarI.d(i5) ? 2048 : 1024);
        if (bVarI.q(i6 & 1, (i6 & 1171) != 1170)) {
            float fA = c4o.a(Float.valueOf(((int) (4294967295L & j)) * 0.06f), bVarI);
            float fA2 = c4o.a(Float.valueOf(((int) (j >> 32)) * 0.2f), bVarI);
            if (i4 == 1) {
                bVarI.N(-1182005422);
                lu00Var = lu00.b2;
                strC = c.c(lu00Var.o0, new String[0], bVarI);
                bVarI.X(false);
            } else {
                bVarI.N(-1181927209);
                lu00Var = lu00.b2;
                strC = c.c(lu00Var.n0, new String[0], bVarI);
                bVarI.X(false);
            }
            long jD = i4 == 1 ? j58.f : r58.d(4281875273L);
            d dVarT = j.t(dVar, fA2, fA);
            boolean z = (i6 & 896) == 256;
            Object objY = bVarI.y();
            if (z || objY == a.C0041a.a) {
                objY = new Function1() { // from class: ecl
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        a7l a7lVar = (a7l) obj;
                        a7lVar.getClass();
                        a7lVar.b(i4 == 0 ? 0.5f : 1.0f);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            d dVarA = androidx.compose.ui.graphics.a.a(dVarT, (Function1) objY);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = androidx.compose.ui.c.c(bVarI, dVarA);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            androidx.compose.foundation.layout.d dVar3 = androidx.compose.foundation.layout.d.a;
            d.a aVar3 = d.a.b;
            d dVarF = dVar3.f(aVar3);
            lu00 lu00Var2 = lu00Var;
            d0b.a.e eVar = d0b.a.b;
            mw90.a(strC, "Hammer Count Background", dVarF, null, null, eVar, null, bVarI, 1572912, 1976);
            d dVarF2 = dVar3.f(aVar3);
            d160 d160VarA = b160.a(kw0.e, ht.a.k, bVarI, 54);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarF2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            mw90.a(c.c(lu00Var2.m0, new String[0], bVarI), "Hammer Icon", p1a.a(j.c(aVar3, 0.9f), -8.0f), null, null, eVar, null, bVarI, 1572912, 1976);
            ty0.a(bVarI, j.w(aVar3, 4.0f));
            StringBuilder sb = new StringBuilder();
            i4 = i;
            sb.append(i4);
            sb.append('/');
            i5 = i2;
            sb.append(i5);
            lkf0.b(sb.toString(), h.j(aVar3, 0.0f, 4.0f, 0.0f, 0.0f, 13), jD, i7f.b(fA / 2.0f, bVarI), new n9i(0), t9i.e, d1a.a(d9i.a(lu00Var2.h, bVarI)), 0L, null, 0L, 0, false, 1, 0, null, null, bVarI, 196656, 3072, 122752);
            bVarI = bVarI;
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(j, dVar, i4, i5, i3) { // from class: fcl
                public final /* synthetic */ long a;
                public final /* synthetic */ d b;
                public final /* synthetic */ int c;
                public final /* synthetic */ int d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    gcl.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
