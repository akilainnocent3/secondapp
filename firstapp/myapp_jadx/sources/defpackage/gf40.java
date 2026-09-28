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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class gf40 {
    public static final void a(final String str, final String str2, final int i, String str3, a aVar, final int i2) {
        final String str4;
        b bVarI = aVar.i(11237577);
        int i3 = i2 | (bVarI.M(str) ? 4 : 2) | (bVarI.M(str2) ? 32 : 16) | (bVarI.d(i) ? 256 : 128) | 3072;
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            d.a aVar2 = d.a.b;
            d dVarE = j.e(aVar2, 1.0f);
            aiv aivVarC = g75.c(ht.a.a, false);
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
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarE2 = j.e(aVar2, 1.0f);
            long jA = c68.a(R.color.bg_inverse_primary_d_base, bVarI);
            zk40.a aVar4 = zk40.a;
            mw90.a("https://s.sporty.net/cms/recap_bg_2_f10838fbf1.jpg", "Tickets recap background", androidx.compose.foundation.a.b(dVarE2, jA, aVar4), null, null, d0b.a.a, null, bVarI, 1572918, 1976);
            n54 n54Var = ht.a.b;
            androidx.compose.foundation.layout.d dVar2 = androidx.compose.foundation.layout.d.a;
            wd40.b(dVar2.b(aVar2, n54Var), 0.0f, 0.0f, bVarI, 0);
            n54 n54Var2 = ht.a.e;
            ty0.a(bVarI, androidx.compose.foundation.a.b(j.i(j.g(dVar2.b(aVar2, n54Var2), 1.0f), 48.0f), c68.a(R.color.brand_primary, bVarI), aVar4));
            d dVarH = h.h(dVar2.b(j.g(aVar2, 1.0f), n54Var2), 18.0f, 0.0f, 2);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarH);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            lkf0.d(str, null, c68.a(R.color.text_inverse_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, bVarI), bVarI, i3 & 14, 0, 131066);
            ty0.a(bVarI, j.i(aVar2, 12.0f));
            lkf0.d(String.valueOf(i), null, c68.a(R.color.text_inverse_primary, bVarI), null, mla.m(96.0f, bVarI), new n9i(1), t9i.E, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVarI, 1572864, 0, 262026);
            ty0.a(bVarI, j.i(aVar2, 12.0f));
            lkf0.d(str2, null, c68.a(R.color.text_inverse_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, bVarI), bVarI, (i3 >> 3) & 14, 0, 131066);
            bVarI = bVarI;
            bVarI.X(true);
            wd40.a(0.0f, 0, bVarI, dVar2.b(aVar2, ht.a.h));
            td40.a(h.j(dVar2.b(aVar2, ht.a.g), 16.0f, 0.0f, 0.0f, 16.0f, 6), bVarI, 0);
            bVarI.X(true);
            str4 = "https://s.sporty.net/cms/recap_bg_2_f10838fbf1.jpg";
        } else {
            bVarI.G();
            str4 = str3;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, i, i2, str2, str4) { // from class: ff40
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ int c;
                public final /* synthetic */ String d;

                {
                    this.b = str2;
                    this.d = str4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    gf40.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
