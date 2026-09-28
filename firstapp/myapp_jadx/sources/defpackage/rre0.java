package defpackage;

import androidx.compose.animation.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class rre0 {
    public static final void a(final d dVar, final float f, final int i, final boolean z, final Function0 function0, final Function0 function1, a aVar, final int i2) {
        b bVarI = aVar.i(-1279181286);
        int i3 = i2 | (bVarI.M(dVar) ? 4 : 2) | (bVarI.c(f) ? 32 : 16) | (bVarI.d(i) ? 256 : 128) | (bVarI.b(z) ? 2048 : 1024) | (bVarI.A(function0) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function1) ? 131072 : 65536);
        if (bVarI.q(i3 & 1, (74899 & i3) != 74898)) {
            boolean z2 = (i3 & 7168) == 2048;
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z2 || objY == c0042a) {
                objY = Float.valueOf(z ? 1.0f : 0.5f);
                bVarI.r(objY);
            }
            final float fFloatValue = ((Number) objY).floatValue();
            d dVarI = j.i(j.g(dVar, 1.0f), 25.91f * f);
            List listK = kotlin.collections.b.k(new j58(j58.l), new j58(j58.b));
            float f2 = (14 & 4) != 0 ? Float.POSITIVE_INFINITY : 0.0f;
            int i4 = (14 & 8) != 0 ? 0 : 2;
            d dVarA = androidx.compose.foundation.a.a(dVarI, new hfs(listK, null, (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), i4), null, 0.0f, 6);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarA);
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
            n54 n54Var = ht.a.f;
            androidx.compose.foundation.layout.d dVar2 = androidx.compose.foundation.layout.d.a;
            d.a aVar3 = d.a.b;
            d dVarB = dVar2.b(aVar3, n54Var);
            boolean z3 = i == 0;
            t9g t9gVarF = f.f(null, 3);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new mre0();
                bVarI.r(objY2);
            }
            t9g t9gVarB = t9gVarF.b(f.o(null, (Function1) objY2, 1));
            owg owgVarG = f.g(null, 3);
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = new nre0();
                bVarI.r(objY3);
            }
            hh0.e(z3, dVarB, t9gVarB, owgVarG.b(f.s(null, (Function1) objY3, 1)), null, pp8.b(1158842876, new gaj() { // from class: ore0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar4 = (a) obj2;
                    ((Integer) obj3).getClass();
                    ((jh0) obj).getClass();
                    d.a aVar5 = d.a.b;
                    d dVarA2 = dw.a(aVar5, fFloatValue);
                    Object objY4 = aVar4.y();
                    if (objY4 == a.C0041a.a) {
                        objY4 = pr7.a(aVar4);
                    }
                    d dVarA3 = oka.a(48, aVar4, androidx.compose.foundation.d.b(dVarA2, (psw) objY4, null, z, null, function0, 24), "next_map_button");
                    d160 d160VarA = b160.a(kw0.a, ht.a.k, aVar4, 48);
                    int iHashCode2 = Long.hashCode(aVar4.m());
                    ne00 ne00VarO = aVar4.o();
                    d dVarC2 = c.c(aVar4, dVarA3);
                    yka.k.getClass();
                    tsr.a aVar6 = yka.a.b;
                    String strC = null;
                    if (aVar4.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar4.D();
                    if (aVar4.g()) {
                        aVar4.F(aVar6);
                    } else {
                        aVar4.p();
                    }
                    hlh0.a(aVar4, d160VarA, yka.a.f);
                    hlh0.a(aVar4, ne00VarO, yka.a.e);
                    yka.a.C1350a c1350a2 = yka.a.g;
                    if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode2))) {
                        j3c.a(iHashCode2, aVar4, iHashCode2, c1350a2);
                    }
                    hlh0.a(aVar4, dVarC2, yka.a.d);
                    d dVarJ = h.j(aVar5, 0.0f, 0.0f, 4.0f, 0.0f, 11);
                    yue0 yue0Var = (yue0) CollectionsKt.V(1, yue0.c);
                    if (yue0Var == null) {
                        aVar4.N(-1325700083);
                    } else {
                        aVar4.N(-1325700082);
                        strC = com.sportygames.newcms.c.c(yue0Var.a, new String[0], aVar4);
                    }
                    aVar4.H();
                    if (strC == null) {
                        strC = "";
                    }
                    lkf0.b(strC, dVarJ, j58.f, i7f.b(12.0f, aVar4), null, new t9i(700), null, 0L, null, i7f.b(12.0f, aVar4), 0, false, 0, 0, null, null, aVar4, 197040, 0, 130000);
                    h9n.a(erz.a(2131231010, 0, aVar4), "next", p1a.a(j.r(h.j(aVar5, 0.0f, 0.0f, 8.0f, 0.0f, 11), 12.0f), 180.0f), null, null, 0.0f, null, aVar4, 432, 120);
                    aVar4.s();
                    return Unit.a;
                }
            }, bVarI), bVarI, 200064, 16);
            d dVarB2 = dVar2.b(aVar3, ht.a.d);
            boolean z4 = i == 1;
            t9g t9gVarF2 = f.f(null, 3);
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = new qoz();
                bVarI.r(objY4);
            }
            t9g t9gVarB2 = t9gVarF2.b(f.o(null, (Function1) objY4, 1));
            owg owgVarG2 = f.g(null, 3);
            Object objY5 = bVarI.y();
            if (objY5 == c0042a) {
                objY5 = new qoz();
                bVarI.r(objY5);
            }
            hh0.e(z4, dVarB2, t9gVarB2, owgVarG2.b(f.s(null, (Function1) objY5, 1)), null, pp8.b(2045804133, new gaj() { // from class: pre0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar4 = (a) obj2;
                    ((Integer) obj3).getClass();
                    ((jh0) obj).getClass();
                    d.a aVar5 = d.a.b;
                    d dVarA2 = dw.a(aVar5, fFloatValue);
                    Object objY6 = aVar4.y();
                    if (objY6 == a.C0041a.a) {
                        objY6 = pr7.a(aVar4);
                    }
                    String strC = null;
                    d dVarA3 = oka.a(48, aVar4, androidx.compose.foundation.d.b(dVarA2, (psw) objY6, null, z, null, function1, 24), "previous_map_button");
                    d160 d160VarA = b160.a(kw0.a, ht.a.k, aVar4, 48);
                    int iHashCode2 = Long.hashCode(aVar4.m());
                    ne00 ne00VarO = aVar4.o();
                    d dVarC2 = c.c(aVar4, dVarA3);
                    yka.k.getClass();
                    tsr.a aVar6 = yka.a.b;
                    if (aVar4.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar4.D();
                    if (aVar4.g()) {
                        aVar4.F(aVar6);
                    } else {
                        aVar4.p();
                    }
                    hlh0.a(aVar4, d160VarA, yka.a.f);
                    hlh0.a(aVar4, ne00VarO, yka.a.e);
                    yka.a.C1350a c1350a2 = yka.a.g;
                    if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode2))) {
                        j3c.a(iHashCode2, aVar4, iHashCode2, c1350a2);
                    }
                    hlh0.a(aVar4, dVarC2, yka.a.d);
                    h9n.a(erz.a(2131231010, 0, aVar4), "next", j.r(h.j(aVar5, 8.0f, 0.0f, 0.0f, 0.0f, 14), 12.0f), null, null, 0.0f, null, aVar4, 432, 120);
                    d dVarJ = h.j(aVar5, 4.0f, 0.0f, 0.0f, 0.0f, 14);
                    yue0 yue0Var = (yue0) CollectionsKt.V(0, yue0.c);
                    if (yue0Var == null) {
                        aVar4.N(59131396);
                    } else {
                        aVar4.N(59131397);
                        strC = com.sportygames.newcms.c.c(yue0Var.a, new String[0], aVar4);
                    }
                    aVar4.H();
                    if (strC == null) {
                        strC = "";
                    }
                    lkf0.b(strC, dVarJ, j58.f, i7f.b(12.0f, aVar4), null, new t9i(700), null, 0L, null, i7f.b(12.0f, aVar4), 0, false, 0, 0, null, null, aVar4, 197040, 0, 130000);
                    aVar4.s();
                    return Unit.a;
                }
            }, bVarI), bVarI, 200064, 16);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(f, i, z, function0, function1, i2) { // from class: qre0
                public final /* synthetic */ float b;
                public final /* synthetic */ int c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ Function0 e;
                public final /* synthetic */ Function0 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    rre0.a(this.a, this.b, this.c, this.d, this.e, this.f, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
