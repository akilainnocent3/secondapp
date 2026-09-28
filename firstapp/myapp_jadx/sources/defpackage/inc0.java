package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class inc0 {
    public static final void a(final d dVar, final enc0 enc0Var, final long j, a aVar, final int i) {
        enc0Var.getClass();
        b bVarI = aVar.i(-1788851141);
        int i2 = (bVarI.M(dVar) ? 4 : 2) | i | (bVarI.A(enc0Var) ? 32 : 16) | (bVarI.e(j) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            i060 i060VarD = j060.d(40.0f, 8.0f, 8.0f, 40.0f);
            l35 l35VarA = m35.a(2.0f, j);
            fg6 fg6VarB = gg6.b(c68.a(R.color.black, bVarI), 0L, bVarI, 24576, 14);
            d dVarI = j.i(dVar, 59.0f);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new r0n(1);
                bVarI.r(objY);
            }
            rg6.a(g3w.h(xa80.b(dVarI, false, (Function1) objY), "sporty_legends_team_" + enc0Var.a + "_card"), i060VarD, fg6VarB, null, l35VarA, pp8.b(83440137, new gaj() { // from class: gnc0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        d.a aVar3 = d.a.b;
                        d dVarJ = h.j(aVar3, 8.0f, 0.0f, 0.0f, 0.0f, 14);
                        kw0.j jVar = kw0.a;
                        n54.b bVar = ht.a.k;
                        d160 d160VarA = b160.a(jVar, bVar, aVar2, 48);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarJ);
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
                        yka.a.b bVar2 = yka.a.f;
                        hlh0.a(aVar2, d160VarA, bVar2);
                        yka.a.d dVar2 = yka.a.e;
                        hlh0.a(aVar2, ne00VarO, dVar2);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar2, dVarC, cVar);
                        enc0 enc0Var2 = enc0Var;
                        String str = enc0Var2.d;
                        boolean z = enc0Var2.e;
                        String str2 = enc0Var2.a;
                        mw90.b(str, "team logo", g3w.h(j.r(aVar3, 32.0f), "sporty_legends_team_" + str2 + "_logo_icon"), erz.a(R.drawable.sporty_game_default_place_holder, 0, aVar2), null, null, null, null, null, 0.0f, null, aVar2, 48, 0, 32752);
                        ty0.a(aVar2, j.w(aVar3, 6.0f));
                        i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
                        int iHashCode2 = Long.hashCode(aVar2.m());
                        ne00 ne00VarO2 = aVar2.o();
                        d dVarC2 = c.c(aVar2, aVar3);
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
                        hlh0.a(aVar2, i78VarA, bVar2);
                        hlh0.a(aVar2, ne00VarO2, dVar2);
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                        }
                        hlh0.a(aVar2, dVarC2, cVar);
                        String str3 = enc0Var2.b;
                        long jA = c68.a(z ? R.color.bg_inverse_primary_d_base : R.color.text_inverse_primary, aVar2);
                        imf0 imf0VarL = mla.l(R.style.B2_B, aVar2);
                        aVar2.N(-672028823);
                        d dVarG = j.g(j.i(aVar3, 22.0f), 1.0f);
                        float f = 0.0f;
                        if (z) {
                            aVar2.N(-1595566212);
                            List listK = kotlin.collections.b.k(new j58(c68.a(R.color.accent_yellow_400, aVar2)), new j58(c68.a(R.color.white, aVar2)), new j58(c68.a(R.color.accent_yellow_500, aVar2)));
                            float f2 = (14 & 4) != 0 ? Float.POSITIVE_INFINITY : 0.0f;
                            f = 0.0f;
                            dVarG = androidx.compose.foundation.a.a(dVarG, new hfs(listK, null, (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), (14 & 8) != 0 ? 0 : 2), null, 0.0f, 6);
                            aVar2.H();
                        } else {
                            aVar2.N(-1595551169);
                            aVar2.H();
                        }
                        aVar2.H();
                        lkf0.d(str3, g3w.h(j.A(h.j(h.h(dVarG, 8.0f, f, 2), 0.0f, 2.0f, 0.0f, 0.0f, 13), bVar, 2), "sporty_legends_team_" + str2 + "_name_text"), jA, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0VarL, aVar2, 0, 0, 131064);
                        aoc0.a(null, enc0Var2.f, 0.0f, 0L, tug.a("sporty_legends_team_", str2, "_star"), aVar2, 0);
                        aVar2.s();
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 196608, 8);
            bVarI = bVarI;
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(enc0Var, j, i) { // from class: hnc0
                public final /* synthetic */ enc0 b;
                public final /* synthetic */ long c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(65);
                    inc0.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
