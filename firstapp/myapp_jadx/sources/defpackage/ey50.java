package defpackage;

import android.view.Window;
import androidx.compose.foundation.layout.h;
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

/* JADX INFO: loaded from: classes7.dex */
public final class ey50 {
    public static final void a(final int i, final long j, a aVar, final d dVar, final String str, final Function0 function0) {
        String str2;
        int i2;
        b bVar;
        b bVarI = aVar.i(1360245060);
        if ((i & 48) == 0) {
            str2 = str;
            i2 = i | (bVarI.M(str2) ? 32 : 16);
        } else {
            str2 = str;
            i2 = i;
        }
        int i3 = i2 | (bVarI.A(function0) ? 2048 : 1024);
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            d dVarB = androidx.compose.foundation.a.b(j.c(dVar, 1.0f), j, zk40.a);
            long j2 = j58.f;
            xt50 xt50VarB = ut50.b(0.0f, 3, j2, false);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = rzk.a(bVarI);
            }
            d dVarB2 = androidx.compose.foundation.d.b(dVarB, (psw) objY, xt50VarB, false, null, function0, 28);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB2);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
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
            mxs mxsVarA = d1a.a(d9i.a(lu00.b2.h, bVarI));
            lkf0.b(str2, null, j2, i7f.b(18.0f, bVarI), null, t9i.E, mxsVarA, 0L, new gdf0(3), i7f.b(18.0f, bVarI), 0, false, 0, 0, null, null, bVarI, ((i3 >> 3) & 14) | 196992, 0, 129426);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ay50
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ey50.a(qj40.a(i | 1), j, (a) obj, dVar, str, function0);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final String str, final String str2, final String str3, final Function0<Unit> function0, a aVar, final int i) {
        b bVarI = aVar.i(1434246845);
        int i2 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.M(str2) ? 32 : 16) | (bVarI.M(str3) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            mxs mxsVarA = d1a.a(d9i.a(lu00.b2.h, bVarI));
            d.a aVar2 = d.a.b;
            d dVarB = androidx.compose.foundation.a.b(j.g(aVar2, 1.0f), j58.f, zk40.a);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
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
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            d dVarJ = h.j(aVar2, 18.0f, 20.0f, 18.0f, 0.0f, 8);
            t9i t9iVar = t9i.E;
            long jB = i7f.b(20.0f, bVarI);
            long jB2 = i7f.b(20.0f, bVarI);
            long j = j58.b;
            lkf0.b(str, dVarJ, j, jB, null, t9iVar, mxsVarA, 0L, new gdf0(3), jB2, 0, false, 0, 0, null, null, bVarI, (i2 & 14) | 196992, 0, 129424);
            int i3 = i2 >> 3;
            lkf0.b(str2, h.g(aVar2, 20.0f, 20.0f), j, i7f.b(16.0f, bVarI), null, t9iVar, mxsVarA, 0L, new gdf0(3), i7f.b(16.0f, bVarI), 0, false, 0, 0, null, null, bVarI, (i3 & 14) | 197040, 0, 129424);
            bVarI = bVarI;
            a((i2 & 7168) | (i3 & 112) | 390, r58.d(4278884151L), bVarI, j.g(j.i(aVar2, 54.0f), 1.0f), str3, function0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, str2, str3, function0, i) { // from class: dy50
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ Function0 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    ey50.b(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final String str, final String str2, final String str3, final Function0<Unit> function0, a aVar, final int i) {
        final Function0<Unit> function1;
        function0.getClass();
        b bVarI = aVar.i(-27731097);
        int i2 = (bVarI.M(str) ? 4 : 2) | i | (bVarI.M(str2) ? 32 : 16) | (bVarI.M(str3) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            u60.a(function0, new yle(false, false, 3), pp8.b(-2143866242, new Function2() { // from class: by50
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        Window windowA = tke.a(aVar2);
                        boolean zA = aVar2.A(windowA);
                        Object objY = aVar2.y();
                        if (zA || objY == a.C0041a.a) {
                            objY = new a5j(windowA, 1);
                            aVar2.r(objY);
                        }
                        use useVar = xvf.a;
                        aVar2.t((Function0) objY);
                        ey50.b(str, str2, str3, function0, aVar2, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i2 >> 9) & 14) | 432, 0);
            function1 = function0;
        } else {
            function1 = function0;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, str2, str3, function1, i) { // from class: cy50
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ Function0 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    ey50.c(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
