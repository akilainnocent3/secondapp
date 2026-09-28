package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportygames.newcms.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class g7j0 {
    public static final void a(final d dVar, final mxs mxsVar, final double d, final String str, a aVar, final int i) {
        int i2;
        dVar.getClass();
        str.getClass();
        b bVarI = aVar.i(-545507592);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(mxsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.f(d) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.M(str) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            yu00.a(dVar, r58.d(4294960720L), r58.d(4293109253L), false, pp8.b(-1065263716, new Function2() { // from class: c7j0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        kw0.i iVar = new kw0.i(4.0f, true, new iw0(ht.a.n));
                        d dVarH = h.h(j.g(d.a.b, 1.0f), 0.0f, 8.0f, 1);
                        final mxs mxsVar2 = mxsVar;
                        final String str2 = str;
                        final double d2 = d;
                        y1i.b(dVarH, iVar, null, null, 0, 0, pp8.b(-350847401, new gaj() { // from class: e7j0
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                a aVar3 = (a) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((o2i) obj3).getClass();
                                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    String strC = c.c(lu00.b2.T0, new String[0], aVar3);
                                    long jB = i7f.b(16.0f, aVar3);
                                    t9i t9iVar = t9i.e;
                                    long j = j58.f;
                                    mxs mxsVar3 = mxsVar2;
                                    lkf0.b(strC, null, j, jB, null, t9iVar, mxsVar3, 0L, null, 0L, 0, false, 0, 0, null, null, aVar3, 196992, 0, 130962);
                                    lkf0.b(str2 + (char) 160 + d6f.a(d2), null, r58.d(4294960720L), i7f.b(16.0f, aVar3), null, t9iVar, mxsVar3, 0L, null, 0L, 0, false, 0, 0, null, null, aVar3, 196992, 0, 130962);
                                } else {
                                    aVar3.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), aVar2, 1572918, 60);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, (i2 & 14) | 25008, 8);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: d7j0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    g7j0.a(dVar, mxsVar, d, str, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final d dVar, final mxs mxsVar, final boolean z, final double d, final String str, a aVar, final int i) {
        dVar.getClass();
        str.getClass();
        b bVarI = aVar.i(-638599780);
        int i2 = i | (bVarI.M(mxsVar) ? 32 : 16) | (bVarI.b(z) ? 256 : 128) | (bVarI.f(d) ? 2048 : 1024) | (bVarI.M(str) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            com.sportygames.newcms.b bVar = (com.sportygames.newcms.b) bVarI.O(c.a);
            Unit unit = Unit.a;
            boolean zA = bVarI.A(bVar) | ((i2 & 896) == 256);
            Object objY = bVarI.y();
            if (zA || objY == a.C0041a.a) {
                objY = new f7j0(z, bVar, null);
                bVarI.r(objY);
            }
            xvf.e(bVarI, unit, (Function2) objY);
            yu00.a(dVar, r58.d(4294960720L), r58.d(4293109253L), true, pp8.b(172359744, new Function2() { // from class: a7j0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        kw0.i iVar = new kw0.i(2.0f, false, new jw0(ht.a.k));
                        d.a aVar3 = d.a.b;
                        d dVarH = h.h(j.c(j.g(aVar3, 1.0f), 1.0f), 0.0f, 7.0f, 1);
                        i78 i78VarA = g78.a(iVar, ht.a.n, aVar2, 54);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = androidx.compose.ui.c.c(aVar2, dVarH);
                        yka.k.getClass();
                        tsr.a aVar4 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, i78VarA, yka.a.f);
                        hlh0.a(aVar2, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC, yka.a.d);
                        String strC = c.c(lu00.b2.O0, new String[0], aVar2);
                        long jB = i7f.b(15.0f, aVar2);
                        long jB2 = i7f.b(15.0f, aVar2);
                        t9i t9iVar = t9i.e;
                        long j = j58.f;
                        d dVarG = j.g(aVar3, 1.0f);
                        gdf0 gdf0Var = new gdf0(3);
                        mxs mxsVar2 = mxsVar;
                        lkf0.b(strC, dVarG, j, jB, null, t9iVar, mxsVar2, 0L, gdf0Var, jB2, 0, false, 0, 0, null, null, aVar2, 197040, 0, 129424);
                        lkf0.b(str + ' ' + d6f.a(d), j.g(aVar3, 1.0f), r58.d(4294960720L), i7f.b(16.0f, aVar2), null, t9iVar, mxsVar2, 0L, new gdf0(3), i7f.b(16.0f, aVar2), 0, false, 0, 0, null, null, aVar2, 197040, 0, 129424);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 28086, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(mxsVar, z, d, str, i) { // from class: b7j0
                public final /* synthetic */ mxs b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ double d;
                public final /* synthetic */ String e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    g7j0.b(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
