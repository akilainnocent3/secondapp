package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.core.model.OrderBetType;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class sbg {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[OrderBetType.values().length];
            try {
                iArr[OrderBetType.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderBetType.MULTIPLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public static final void a(OrderBetType orderBetType, int i, String str, androidx.compose.runtime.a aVar, int i2) {
        String strA;
        String str2 = str;
        str2.getClass();
        b bVarI = aVar.i(-1815580384);
        int i3 = i2 | (bVarI.d(orderBetType == null ? -1 : orderBetType.ordinal()) ? 4 : 2) | (bVarI.d(i) ? 32 : 16) | (bVarI.M(str2) ? 256 : 128);
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            d.a aVar2 = d.a.b;
            d dVarH = g3w.h(j.g(aVar2, 1.0f), "auto_bet_error_count_content");
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
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
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarG = h.g(j.g(aVar2, 1.0f), 24.0f, 8.0f);
            kw0.g gVar = kw0.g;
            n54.b bVar2 = ht.a.k;
            d160 d160VarA = b160.a(gVar, bVar2, bVarI, 54);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarG);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            lkf0.d(cb40.a(R.string.component_betslip__bet_type, new Object[0], bVarI), g3w.h(aVar2, "auto_bet_error_count_bet_type_label"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 48, 0, 131064);
            int i4 = a.a[orderBetType.ordinal()];
            if (i4 == 1) {
                bVarI.N(-330370400);
                strA = cb40.a(R.string.component_betslip__single, new Object[0], bVarI);
                bVarI.X(false);
            } else if (i4 != 2) {
                bVarI.N(-1651358088);
                bVarI.X(false);
                strA = "";
            } else {
                bVarI.N(-330367070);
                strA = cb40.a(R.string.component_betslip__multiple, new Object[0], bVarI);
                bVarI.X(false);
            }
            String str3 = strA;
            lkf0.d(str3, g3w.h(aVar2, "auto_bet_error_count_bet_type_value"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, bVarI), bVarI, 48, 0, 131064);
            bVarI.X(true);
            ute.b(null, 1.0f, c68.a(R.color.border_primary, bVarI), bVarI, 48, 1);
            d dVarG2 = h.g(j.g(aVar2, 1.0f), 24.0f, 8.0f);
            d160 d160VarA2 = b160.a(gVar, bVar2, bVarI, 54);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarG2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            lkf0.d(cb40.a(R.string.component_betslip__betslip_selections, new Object[0], bVarI), g3w.h(aVar2, "auto_bet_error_count_selections_label"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 48, 0, 131064);
            lkf0.d(String.valueOf(i), g3w.h(aVar2, "auto_bet_error_count_selections_value"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, bVarI), bVarI, 48, 0, 131064);
            bVarI.X(true);
            ute.b(null, 1.0f, c68.a(R.color.border_primary, bVarI), bVarI, 48, 1);
            d dVarG3 = h.g(j.g(aVar2, 1.0f), 24.0f, 16.0f);
            d160 d160VarA3 = b160.a(kw0.a, bVar2, bVarI, 48);
            int iHashCode4 = Long.hashCode(bVarI.T);
            ne00 ne00VarS4 = bVarI.S();
            d dVarC4 = c.c(bVarI, dVarG3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA3, bVar);
            hlh0.a(bVarI, ne00VarS4, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
            }
            hlh0.a(bVarI, dVarC4, cVar);
            uxs uxsVar = uxs.DISABLE;
            alb0 alb0VarA = alb0.a(sya.a, new g7f(44.0f), null, 0L, 0.0f, 29);
            d dVarH2 = g3w.h(j.g(aVar2, 1.0f), "auto_bet_error_count_button");
            Object objY = bVarI.y();
            if (objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new qbg();
                bVarI.r(objY);
            }
            str2 = str;
            aza.a(dVarH2, str2, uxsVar, null, alb0VarA, null, null, null, (Function0) objY, null, bVarI, ((i3 >> 3) & 112) | 100663686, 744);
            bVarI = bVarI;
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new rbg(orderBetType, i, str2, i2);
        }
    }
}
