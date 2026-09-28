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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g1x {
    public static final void a(final int i, a aVar, d dVar, final String str, final Function0 function0, final boolean z) {
        final d dVar2;
        b bVarI = aVar.i(-1809644440);
        int i2 = i | 6 | (bVarI.M(str) ? 32 : 16) | (bVarI.b(z) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
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
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar3 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar3);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarG2 = h.g(j.i(j.g(aVar2, 1.0f), 50.0f), 16.0f, 12.0f);
            d160 d160VarA = b160.a(kw0.g, ht.a.k, bVarI, 54);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarG2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar3);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            lkf0.d(cb40.a(R.string.personal_page__page_title, new Object[0], bVarI), null, c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 0, 0, 131066);
            bVarI = bVarI;
            if (z) {
                bVarI.N(-810547375);
                xya.b(androidx.compose.ui.platform.d.a(j.D(aVar2, null, 3), "MySocialVerifiedButton"), false, sya.b(bVarI), alb0.a(sya.e, null, new umz(8.0f, 4.0f, 8.0f, 4.0f), 0L, 0.0f, 27), j060.c(20.0f), Float.NaN, null, function0, pp8.b(-1991608343, new gaj() { // from class: e1x
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        a aVar4 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((e160) obj).getClass();
                        if (aVar4.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            String str2 = str;
                            if (str2 == null) {
                                str2 = "";
                            }
                            lkf0.d(str2, null, 0L, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, aVar4), aVar4, 0, 0, 130046);
                            h6n.b(erz.a(R.drawable.icon_arrow1_right, 0, aVar4), "NINVerifiedIcon", h.j(d.a.b, 4.0f, 0.0f, 0.0f, 0.0f, 14), c68.a(R.color.brand_secondary, aVar4), aVar4, 432, 0);
                        } else {
                            aVar4.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, 100859910 | ((i2 << 12) & 29360128), 66);
                bVarI.X(false);
            } else {
                bVarI.N(-809203246);
                xya.b(androidx.compose.ui.platform.d.a(j.D(aVar2, null, 3), "MySocialVerifyButton"), false, null, alb0.a(sya.e, null, new umz(12.0f, 4.0f, 12.0f, 4.0f), 0L, 0.0f, 27), null, Float.NaN, null, function0, mf9.a, bVarI, 100859910 | ((i2 << 12) & 29360128), 86);
                bVarI.X(false);
            }
            bVarI.X(true);
            ute.b(null, 0.0f, c68.a(R.color.line_type1_primary, bVarI), bVarI, 0, 3);
            bVarI.X(true);
            dVar2 = aVar2;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, dVar2, str, function0, z) { // from class: f1x
                public final /* synthetic */ d a;
                public final /* synthetic */ String b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ Function0 d;

                {
                    this.a = dVar2;
                    this.b = str;
                    this.c = z;
                    this.d = function0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    g1x.a(qj40.a(1), (a) obj, this.a, this.b, this.d, this.c);
                    return Unit.a;
                }
            };
        }
    }
}
