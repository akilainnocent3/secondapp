package defpackage;

import androidx.compose.animation.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class jaa {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final String str, final long j, final long j2, final boolean z, final Function0 function0, a aVar, final int i) {
        b bVarA = mzj.a(1442951002, aVar, str, function0);
        int i2 = i | (bVarA.M(str) ? 4 : 2) | (bVarA.e(j) ? 256 : 128) | (bVarA.b(z) ? 16384 : 8192) | (bVarA.A(function0) ? 1048576 : 524288);
        if (bVarA.q(i2 & 1, (599171 & i2) != 599170)) {
            Object objY = bVarA.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = nvc.a(z, bVarA);
            }
            ytw ytwVar = (ytw) objY;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean z2 = ((57344 & i2) == 16384) | ((i2 & 3670016) == 1048576);
            Object objY2 = bVarA.y();
            if (z2 || objY2 == c0042a) {
                objY2 = new iaa(null, ytwVar, function0, z);
                bVarA.r(objY2);
            }
            xvf.e(bVarA, boolValueOf, (Function2) objY2);
            hh0.e(((Boolean) ytwVar.getValue()).booleanValue(), null, null, f.g(null, 3), null, pp8.b(1063203202, new gaj() { // from class: gaa
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    ((Integer) obj3).getClass();
                    ((jh0) obj).getClass();
                    d.a aVar3 = d.a.b;
                    d dVarA = abk0.a(h.h(j.A(j.g(aVar3, 1.0f), null, 3), fw20.a(R.dimen._16dp, aVar2), 0.0f, 2), 1.0f);
                    aiv aivVarC = g75.c(ht.a.b, false);
                    int iHashCode = Long.hashCode(aVar2.m());
                    ne00 ne00VarO = aVar2.o();
                    d dVarC = c.c(aVar2, dVarA);
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
                    yka.a.b bVar = yka.a.f;
                    hlh0.a(aVar2, aivVarC, bVar);
                    yka.a.d dVar = yka.a.e;
                    hlh0.a(aVar2, ne00VarO, dVar);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                    }
                    yka.a.c cVar = yka.a.d;
                    hlh0.a(aVar2, dVarC, cVar);
                    d dVarB = androidx.compose.foundation.a.b(j.k(j.A(j.g(aVar3, 1.0f), null, 3), fw20.a(R.dimen._36sdp, aVar2), 0.0f, 2), j, j060.c(8.0f));
                    d160 d160VarA = b160.a(kw0.e, ht.a.k, aVar2, 54);
                    int iHashCode2 = Long.hashCode(aVar2.m());
                    ne00 ne00VarO2 = aVar2.o();
                    d dVarC2 = c.c(aVar2, dVarB);
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
                    hlh0.a(aVar2, d160VarA, bVar);
                    hlh0.a(aVar2, ne00VarO2, dVar);
                    if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                        j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                    }
                    hlh0.a(aVar2, dVarC2, cVar);
                    d dVarG = h.g(aVar3, 16.0f, 10.0f);
                    imf0 imf0VarB = imf0.b(ni60.g(((sfd0) aVar2.O(ni60.b)).d, R.dimen._11ssp, aVar2), 0L, 0L, null, null, null, 0L, null, new ix80(3.0f, j58.c(0.3f, j58.b), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(6.0f)) & 4294967295L)), null, 0, 0L, null, null, 16769023);
                    lkf0.b(str, dVarG, j2, 0L, null, null, null, 0L, new gdf0(3), 0L, 0, false, 2, 0, null, imf0VarB, aVar2, 48, 3072, 56824);
                    aVar2.s();
                    aVar2.s();
                    return Unit.a;
                }
            }, bVarA), bVarA, 199680, 22);
        } else {
            bVarA.G();
        }
        e eVarZ = bVarA.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, j, j2, z, function0, i) { // from class: haa
                public final /* synthetic */ String a;
                public final /* synthetic */ long b;
                public final /* synthetic */ long c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ Function0 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(199729);
                    jaa.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
