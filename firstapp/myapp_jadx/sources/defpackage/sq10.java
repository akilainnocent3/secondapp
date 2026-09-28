package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class sq10 {
    public static final i060 a = j060.b(50);
    public static final long b = r58.b(1110315270);
    public static final long c = r58.b(908988678);
    public static final long d = r58.d(4294956800L);

    public static final void a(final int i, final int i2, final float f, final float f2, d dVar, a aVar, final int i3) {
        final d dVar2;
        b bVarI = aVar.i(1904720355);
        int i4 = i3 | (bVarI.d(i) ? 4 : 2) | (bVarI.d(i2) ? 32 : 16) | (bVarI.c(f) ? 256 : 128) | (bVarI.c(f2) ? 2048 : 1024) | 24576;
        if (bVarI.q(i4 & 1, (i4 & 9363) != 9362)) {
            lu00 lu00Var = lu00.b2;
            mxs mxsVarA = d1a.a(d9i.a(lu00Var.h, bVarI));
            d.a aVar2 = d.a.b;
            i060 i060Var = a;
            d dVarG = h.g(d35.a(androidx.compose.foundation.a.b(ls7.a(aVar2, i060Var), b, zk40.a), 1.0f, c, i060Var), 0.033f * f, 0.0075f * f2);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
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
            lkf0.b(com.sportygames.newcms.c.c(lu00Var.f0, new String[0], bVarI), null, j58.f, i7f.b(16.0f, bVarI), null, t9i.e, mxsVarA, 0L, null, 0L, 0, false, 0, 0, null, null, bVarI, 196992, 0, 130962);
            ty0.a(bVarI, j.w(aVar2, 0.017f * f));
            mw90.a(com.sportygames.newcms.c.c(lu00Var.g0, new String[0], bVarI), null, j.r(aVar2, 0.05f * f), null, null, d0b.a.b, null, bVarI, 1572912, 1976);
            ty0.a(bVarI, j.w(aVar2, 0.011f * f));
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append('/');
            sb.append(i2);
            lkf0.b(sb.toString(), null, d, i7f.b(16.0f, bVarI), null, t9i.E, mxsVarA, 0L, null, 0L, 0, false, 0, 0, null, null, bVarI, 196992, 0, 130962);
            bVarI = bVarI;
            bVarI.X(true);
            dVar2 = aVar2;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, i2, f, f2, dVar2, i3) { // from class: rq10
                public final /* synthetic */ int a;
                public final /* synthetic */ int b;
                public final /* synthetic */ float c;
                public final /* synthetic */ float d;
                public final /* synthetic */ d e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    sq10.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
