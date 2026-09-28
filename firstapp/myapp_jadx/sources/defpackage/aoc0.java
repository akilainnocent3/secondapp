package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class aoc0 {
    public static final void a(d dVar, final int i, float f, long j, final String str, a aVar, final int i2) {
        final d dVar2;
        final float f2;
        final long j2;
        long jA;
        float f3;
        int i3;
        d dVar3;
        b bVarI = aVar.i(1864304991);
        int i4 = i2 | 6 | (bVarI.d(i) ? 32 : 16) | 1408;
        if ((i2 & 24576) == 0) {
            i4 |= bVarI.M(str) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (bVarI.q(i4 & 1, (i4 & 9363) != 9362)) {
            bVarI.A0();
            int i5 = i2 & 1;
            d.a aVar2 = d.a.b;
            if (i5 == 0 || bVarI.h0()) {
                jA = c68.a(R.color.bg_inverse_primary_d_base, bVarI);
                f3 = 16.0f;
                i3 = i4 & (-7169);
                dVar3 = aVar2;
            } else {
                bVarI.G();
                f3 = f;
                jA = j;
                i3 = i4 & (-7169);
                dVar3 = dVar;
            }
            bVarI.Y();
            crz crzVarA = erz.a(R.drawable.ic_star_off, 0, bVarI);
            crz crzVarA2 = erz.a(R.drawable.ic_star_on, 0, bVarI);
            d dVarG = h.g(androidx.compose.foundation.a.b(j.e(j.i(dVar3, 33.0f), 1.0f), jA, zk40.a), 8.0f, 6.0f);
            boolean z = (i3 & 112) == 32;
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z || objY == c0042a) {
                objY = new Function1() { // from class: ync0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        pb80 pb80Var = (pb80) obj;
                        pb80Var.getClass();
                        lb80.c(pb80Var, "Rating " + i + " of 5");
                        mb80.a(pb80Var);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            d dVarH = g3w.h(xa80.b(dVarG, false, (Function1) objY), str.concat("_content"));
            d160 d160VarA = b160.a(kw0.f, ht.a.k, bVarI, 54);
            long j3 = jA;
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
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            bVarI.N(-1033838213);
            int i6 = 0;
            while (i6 < 5) {
                crz crzVar = i6 < i ? crzVarA2 : crzVarA;
                d dVarR = j.r(aVar2, f3);
                Object objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = new l1n(2);
                    bVarI.r(objY2);
                }
                h9n.a(crzVar, null, g3w.h(xa80.b(dVarR, false, (Function1) objY2), str + "_" + i6 + "_icon"), null, null, 0.0f, null, bVarI, 48, 120);
                i6++;
                j3 = j3;
                c0042a = c0042a;
            }
            bVarI.X(false);
            bVarI.X(true);
            f2 = f3;
            j2 = j3;
            dVar2 = dVar3;
        } else {
            bVarI.G();
            dVar2 = dVar;
            f2 = f;
            j2 = j;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: znc0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    aoc0.a(dVar2, i, f2, j2, str, (a) obj, qj40.a(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }
}
