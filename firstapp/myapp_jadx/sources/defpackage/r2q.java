package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import com.google.protobuf.Reader;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r2q {
    public static final void a(final float f, final int i, a aVar, final String str, final String str2) {
        int i2;
        str.getClass();
        str2.getClass();
        b bVarI = aVar.i(1532434377);
        if ((i & 6) == 0) {
            i2 = (bVarI.c(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(str2) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            boolean z = (i2 & 14) == 4;
            Object objY = bVarI.y();
            if (z || objY == a.C0041a.a) {
                objY = new gaj() { // from class: n2q
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        t tVar = (t) obj;
                        vhv vhvVar = (vhv) obj2;
                        tVar.getClass();
                        vhvVar.getClass();
                        y yVarD0 = vhvVar.d0(kxa.b(0, 0, 0, Reader.READ_DONE, 3, ((kxa) obj3).a));
                        int i3 = yVarD0.b;
                        int i4 = yVarD0.a;
                        int i5 = (int) (i3 * f);
                        if (i5 < 0) {
                            i5 = 0;
                        }
                        return t.z1(tVar, i4, i5, new k3g(yVarD0, 2));
                    }
                };
                bVarI.r(objY);
            }
            d dVarA = androidx.compose.ui.layout.j.a(dVarG, (gaj) objY);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarA);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            c(str2, bVarI, (i2 >> 6) & 14);
            b(str, bVarI, (i2 >> 3) & 14);
            iib0.a(aVar2, 16.0f, bVarI, true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: o2q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    r2q.a(f, iA, (a) obj, str, str2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(String str, a aVar, final int i) {
        int i2;
        b bVar;
        final String str2 = str;
        b bVarI = aVar.i(1029522894);
        if ((i & 6) == 0) {
            i2 = i | (bVarI.M(str2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d dVarG = j.g(h.h(d.a.b, 12.0f, 0.0f, 2), 1.0f);
            qyd0 qyd0Var = oib0.a;
            d dVarG2 = h.g(androidx.compose.foundation.a.b(dVarG, ((lib0) bVarI.O(qyd0Var)).A0, zk40.a), 4.0f, 8.0f);
            d160 d160VarA = b160.a(kw0.g, ht.a.k, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG2);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            String strA = cb40.a(R.string.component_betslip__potential_win, new Object[0], bVarI);
            qyd0 qyd0Var2 = kjb0.a;
            lkf0.d(strA, null, ((lib0) bVarI.O(qyd0Var)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).i, bVarI, 0, 0, 131066);
            str2 = str;
            lkf0.d(str2, null, ((lib0) bVarI.O(qyd0Var)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).i, bVarI, i2 & 14, 0, 131066);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: p2q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    r2q.b(str2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(String str, a aVar, final int i) {
        int i2;
        b bVar;
        final String str2 = str;
        b bVarI = aVar.i(-1456116412);
        if ((i & 6) == 0) {
            i2 = i | (bVarI.M(str2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            qyd0 qyd0Var = ejb0.a;
            d dVarG = j.g(h.g(d.a.b, ((cjb0) bVarI.O(qyd0Var)).e, ((cjb0) bVarI.O(qyd0Var)).d), 1.0f);
            d160 d160VarA = b160.a(kw0.g, ht.a.k, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            String strA = cb40.a(R.string.common_functions__total_stake, new Object[0], bVarI);
            qyd0 qyd0Var2 = kjb0.a;
            imf0 imf0Var = ((ijb0) bVarI.O(qyd0Var2)).i;
            qyd0 qyd0Var3 = oib0.a;
            lkf0.d(strA, null, ((lib0) bVarI.O(qyd0Var3)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, bVarI, 0, 0, 131066);
            str2 = str;
            lkf0.d(str2, null, ((lib0) bVarI.O(qyd0Var3)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).i, bVarI, i2 & 14, 0, 131066);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: q2q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    r2q.c(str2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
