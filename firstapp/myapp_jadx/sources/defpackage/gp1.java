package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class gp1 {
    public static final void a(final d dVar, final hp1 hp1Var, a aVar, final int i) {
        int i2;
        b bVar;
        b bVarI = aVar.i(666355522);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(hp1Var) : bVarI.A(hp1Var) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            ip1 ip1Var = hp1Var.a;
            ip1 ip1Var2 = hp1Var.b;
            long jA = c68.a(ip1Var.d, bVarI);
            long jA2 = c68.a(ip1Var2.d, bVarI);
            long jA3 = c68.a(hp1Var.c, bVarI);
            List listK = kotlin.collections.b.k(new mpv(cb40.a(R.string.page_instant_virtual__overall, new Object[0], bVarI), ip1Var.a, ip1Var2.a), new mpv(cb40.a(R.string.page_instant_virtual__home, new Object[0], bVarI), ip1Var.b, ip1Var2.b), new mpv(cb40.a(R.string.page_instant_virtual__away, new Object[0], bVarI), ip1Var.c, ip1Var2.c));
            Iterator it = listK.iterator();
            if (!it.hasNext()) {
                lrh0.a();
                return;
            }
            mpv mpvVar = (mpv) it.next();
            float fMax = Math.max(mpvVar.b, mpvVar.c);
            while (it.hasNext()) {
                mpv mpvVar2 = (mpv) it.next();
                fMax = Math.max(fMax, Math.max(mpvVar2.b, mpvVar2.c));
            }
            Float fValueOf = Float.valueOf(fMax);
            if (fMax <= 0.0f) {
                fValueOf = null;
            }
            float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 1.0f;
            olf0 olf0VarA = plf0.a(bVarI);
            imf0 imf0Var = ((ijb0) bVarI.O(kjb0.a)).n;
            bVarI.N(417568186);
            Iterator it2 = listK.iterator();
            if (!it2.hasNext()) {
                lrh0.a();
                return;
            }
            mpv mpvVar3 = (mpv) it2.next();
            g7f g7fVar = (g7f) wl8.d(new g7f(kla.b(String.valueOf(mpvVar3.b), olf0VarA, imf0Var, bVarI)), new g7f(kla.b(String.valueOf(mpvVar3.c), olf0VarA, imf0Var, bVarI)));
            float f = g7fVar.a;
            while (it2.hasNext()) {
                mpv mpvVar4 = (mpv) it2.next();
                g7f g7fVar2 = (g7f) wl8.d(new g7f(kla.b(String.valueOf(mpvVar4.b), olf0VarA, imf0Var, bVarI)), new g7f(kla.b(String.valueOf(mpvVar4.c), olf0VarA, imf0Var, bVarI)));
                float f2 = g7fVar2.a;
                if (g7fVar.compareTo(g7fVar2) < 0) {
                    g7fVar = g7fVar2;
                }
            }
            float f3 = g7fVar.a;
            bVarI.X(false);
            bVarI.N(417576189);
            Iterator it3 = listK.iterator();
            if (!it3.hasNext()) {
                lrh0.a();
                return;
            }
            g7f g7fVar3 = new g7f(kla.b(((mpv) it3.next()).a, olf0VarA, imf0Var, bVarI));
            while (it3.hasNext()) {
                g7f g7fVar4 = new g7f(kla.b(((mpv) it3.next()).a, olf0VarA, imf0Var, bVarI));
                if (g7fVar3.compareTo(g7fVar4) < 0) {
                    g7fVar3 = g7fVar4;
                }
            }
            bVarI.X(false);
            d dVarG = j.g(dVar, 1.0f);
            i78 i78VarA = g78.a(new kw0.i(17.0f, true, new hw0()), ht.a.m, bVarI, 6);
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
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            Iterator itA = yt1.a(bVarI, dVarC, yka.a.d, 1242323506, listK);
            while (itA.hasNext()) {
                mpv mpvVar5 = (mpv) itA.next();
                float f4 = mpvVar5.b;
                float f5 = mpvVar5.c;
                imf0 imf0Var2 = imf0Var;
                long j = jA3;
                g7f g7fVar5 = g7fVar3;
                b bVar2 = bVarI;
                b(f4, f5, mpvVar5.a, j, f3, g7fVar5.a, f4 / fFloatValue, f5 / fFloatValue, jA, jA2, imf0Var2, bVar2, 0);
                g7fVar3 = g7fVar5;
                bVarI = bVar2;
                jA3 = j;
                imf0Var = imf0Var2;
            }
            bVar = bVarI;
            bVar.X(false);
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: fp1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    gp1.a(dVar, hp1Var, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final float f, final float f2, final String str, final long j, float f3, final float f4, final float f5, float f6, final long j2, long j3, final imf0 imf0Var, a aVar, final int i) {
        final long j4;
        b bVar;
        final float f7 = f3;
        final float f8 = f6;
        b bVarI = aVar.i(-545026292);
        int i2 = i | (bVarI.c(f) ? 4 : 2) | (bVarI.c(f2) ? 32 : 16) | (bVarI.M(str) ? 256 : 128) | (bVarI.e(j) ? 2048 : 1024) | (bVarI.c(f7) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.c(f4) ? 131072 : 65536) | (bVarI.c(f5) ? 1048576 : 524288) | (bVarI.c(f8) ? 8388608 : 4194304) | (bVarI.e(j2) ? 67108864 : 33554432) | (bVarI.e(j3) ? 536870912 : 268435456);
        int i3 = bVarI.M(imf0Var) ? 4 : 2;
        if (bVarI.q(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 3) == 2) ? false : true)) {
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            kw0.i iVar = new kw0.i(8.0f, true, new hw0());
            n54.b bVar2 = ht.a.k;
            d160 d160VarA = b160.a(iVar, bVar2, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            int i4 = i3;
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar3 = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar3);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            d160 d160VarA2 = b160.a(kw0.a, ht.a.j, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, layoutWeightElement);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar3);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            f7 = f3;
            q75.a(null, null, false, pp8.b(1004633514, new gaj() { // from class: dp1
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    r75 r75Var = (r75) obj;
                    a aVar4 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    r75Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar4.M(r75Var) ? 4 : 2;
                    }
                    if (aVar4.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        g75.a(androidx.compose.foundation.a.b(h.j(j.i(j.w(d.a.b, (r75Var.d() - f7) * f5), 16.0f), 0.0f, 0.0f, 4.0f, 0.0f, 11), j2, zk40.a), aVar4, 0);
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 3072, 7);
            int i5 = (i4 << 21) & 29360128;
            lkf0.d(String.valueOf(f), j.w(aVar2, f7), j2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, bVarI, (i2 >> 18) & 896, i5, 131064);
            bVarI.X(true);
            lkf0.d(str, j.w(aVar2, f4), j, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0Var, bVarI, ((i2 >> 6) & 14) | ((i2 >> 3) & 896), i5, 130040);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            d160 d160VarA3 = b160.a(new kw0.i(4.0f, true, new iw0(ht.a.o)), bVar2, bVarI, 54);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, layoutWeightElement2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA3, bVar3);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            j4 = j3;
            lkf0.d(String.valueOf(f2), j.w(aVar2, f7), j4, null, 0L, null, null, null, 0L, null, new gdf0(6), 0L, 0, false, 0, 0, null, imf0Var, bVarI, (i2 >> 21) & 896, i5, 130040);
            f8 = f6;
            bVar = bVarI;
            r9o.a(androidx.compose.foundation.a.b(j.i(j.g(aVar2, f8), 16.0f), j4, zk40.a), bVar, 0, true, true);
        } else {
            j4 = j3;
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(f, f2, str, j, f7, f4, f5, f8, j2, j4, imf0Var, i) { // from class: ep1
                public final /* synthetic */ float a;
                public final /* synthetic */ float b;
                public final /* synthetic */ String c;
                public final /* synthetic */ long d;
                public final /* synthetic */ float e;
                public final /* synthetic */ float f;
                public final /* synthetic */ float i;
                public final /* synthetic */ float v;
                public final /* synthetic */ long w;
                public final /* synthetic */ long y;
                public final /* synthetic */ imf0 z;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    gp1.b(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
