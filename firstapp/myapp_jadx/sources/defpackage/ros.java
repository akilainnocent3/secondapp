package defpackage;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ros {
    public static final void a(vts.b bVar, final ofb0 ofb0Var, final Function2 function2, a aVar, final int i) {
        boolean z;
        final vts.b bVar2 = bVar;
        b bVarI = aVar.i(916988425);
        int i2 = i | (bVarI.M(bVar2) ? 4 : 2) | (bVarI.d(ofb0Var == null ? -1 : ofb0Var.ordinal()) ? 32 : 16) | (bVarI.A(function2) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d.a aVar2 = d.a.b;
            d dVarH = h.h(aVar2, 0.0f, 8.0f, 1);
            long jA = c68.a(R.color.background_general_primary, bVarI);
            zk40.a aVar3 = zk40.a;
            d dVarB = androidx.compose.foundation.a.b(dVarH, jA, aVar3);
            n54.a aVar4 = ht.a.m;
            kw0.k kVar = kw0.c;
            i78 i78VarA = g78.a(kVar, aVar4, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar5 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            yka.a.b bVar3 = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar3);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarG = j.g(aVar2, 1.0f);
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 896) == 256);
            Object objY = bVarI.y();
            if (z2 || objY == a.C0041a.a) {
                objY = new Function0() { // from class: pos
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function2.invoke(bVar2.b, Boolean.TRUE);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            d dVarD = androidx.compose.foundation.d.d(dVarG, false, null, null, (Function0) objY, 15);
            d160 d160VarA = b160.a(kw0.e, ht.a.k, bVarI, 54);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarD);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar3);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            d dVarJ = h.j(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 12.0f, 0.0f, 4.0f, 0.0f, 10);
            imf0 imf0VarL = mla.l(R.style.B2_R, bVarI);
            String str = bVar2.c;
            long jA2 = c68.a(R.color.text_type1_primary, bVarI);
            t9i t9iVar = t9i.E;
            lkf0.d(str, dVarJ, jA2, null, 0L, null, t9iVar, null, 0L, null, new gdf0(6), 0L, 2, false, 3, 0, null, imf0VarL, bVarI, 1572864, 24960, 109496);
            b bVar4 = bVarI;
            String str2 = bVar2.d;
            d0b.a.e eVar = d0b.a.b;
            if (str2 != null) {
                bVar4.N(-1395922123);
                mw90.b(bVar2.d, null, j.r(aVar2, 20.0f), null, erz.a(pfb0.a(ofb0Var, e9f0.a), 0, bVar4), null, null, null, eVar, 0.0f, null, bVar4, 432, 6, 31720);
                bVar4 = bVar4;
                bVar4.X(false);
            } else {
                bVar4.N(-1395572102);
                h9n.a(erz.a(pfb0.a(ofb0Var, e9f0.a), 0, bVar4), null, j.r(aVar2, 20.0f), null, null, 0.0f, null, bVar4, 432, 120);
                bVar4.X(false);
            }
            d dVarH2 = h.h(aVar2, 8.0f, 0.0f, 2);
            n54.a aVar6 = ht.a.n;
            i78 i78VarA2 = g78.a(kVar, aVar6, bVar4, 48);
            int iHashCode3 = Long.hashCode(bVar4.T);
            ne00 ne00VarS3 = bVar4.S();
            d dVarC3 = c.c(bVar4, dVarH2);
            bVar4.D();
            if (bVar4.S) {
                bVar4.F(aVar5);
            } else {
                bVar4.p();
            }
            hlh0.a(bVar4, i78VarA2, bVar3);
            hlh0.a(bVar4, ne00VarS3, dVar);
            if (bVar4.S || !Intrinsics.g(bVar4.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVar4, iHashCode3, c1350a);
            }
            hlh0.a(bVar4, dVarC3, cVar);
            d dVarH3 = h.h(androidx.compose.foundation.a.b(aVar2, c68.a(R.color.brand_secondary_variable_type3, bVar4), aVar3), 4.0f, 0.0f, 2);
            String upperCase = cb40.a(R.string.common_functions__live, new Object[0], bVar4).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            b bVar5 = bVar4;
            lkf0.d(upperCase, dVarH3, c68.a(R.color.text_inverse_tertiary, bVar4), null, d2l.f(8), null, null, null, 0L, null, null, d2l.f(8), 0, false, 0, 0, null, null, bVar5, 24576, 48, 260072);
            bVar2 = bVar;
            lkf0.d(oxc.a(bVar.g, " : ", bVar.h), null, c68.a(R.color.text_type1_primary, bVar5), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_B, bVar5), bVar5, 0, 0, 131066);
            b bVar6 = bVar5;
            bVar6.X(true);
            if (bVar2.f != null) {
                bVar6.N(-1394386507);
                mw90.b(bVar2.f, null, j.r(aVar2, 20.0f), null, erz.a(pfb0.a(ofb0Var, e9f0.b), 0, bVar6), null, null, null, eVar, 0.0f, null, bVar6, 432, 6, 31720);
                bVar6 = bVar6;
                bVar6.X(false);
                z = true;
            } else {
                z = true;
                bVar6.N(-1394036486);
                h9n.a(erz.a(pfb0.a(ofb0Var, e9f0.b), 0, bVar6), null, j.r(aVar2, 20.0f), null, null, 0.0f, null, bVar6, 432, 120);
                bVar6.X(false);
            }
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            b bVar7 = bVar6;
            boolean z3 = z;
            lkf0.d(bVar2.e, h.j(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, z), 4.0f, 0.0f, 12.0f, 0.0f, 10), c68.a(R.color.text_type1_primary, bVar6), null, 0L, null, t9iVar, null, 0L, null, null, 0L, 2, false, 3, 0, null, mla.l(R.style.B2_R, bVar6), bVar7, 1572864, 24960, 110520);
            bVar7.X(z3);
            lkf0.d(cb40.a(R.string.common_functions__go_bet_on_live_action, new Object[0], bVar7), h.j(new HorizontalAlignElement(aVar6), 0.0f, 5.0f, 0.0f, 0.0f, 13), c68.a(R.color.text_type1_secondary, bVar7), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.C2_R, bVar7), bVar7, 0, 0, 131064);
            bVarI = bVar7;
            bVarI.X(z3);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(ofb0Var, function2, i) { // from class: qos
                public final /* synthetic */ ofb0 b;
                public final /* synthetic */ Function2 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    ros.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
