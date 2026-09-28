package defpackage;

import com.sporty.android.common_ui.uitext.ColoredUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$betPanelState$1", f = "LNPlaceBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class p2r extends tje0 implements kaj<f2r.b, t2q, tsd0, f2r.c, f2r.a, v1b<? super m2q>, Object> {
    public /* synthetic */ f2r.b a;
    public /* synthetic */ t2q b;
    public /* synthetic */ tsd0 c;
    public /* synthetic */ f2r.c d;
    public /* synthetic */ f2r.a e;
    public final /* synthetic */ f2r f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2r(v1b v1bVar, f2r f2rVar) {
        super(6, v1bVar);
        this.f = f2rVar;
    }

    @Override // defpackage.kaj
    public final Object f(f2r.b bVar, t2q t2qVar, tsd0 tsd0Var, f2r.c cVar, f2r.a aVar, v1b<? super m2q> v1bVar) {
        p2r p2rVar = new p2r(v1bVar, this.f);
        p2rVar.a = bVar;
        p2rVar.b = t2qVar;
        p2rVar.c = tsd0Var;
        p2rVar.d = cVar;
        p2rVar.e = aVar;
        return p2rVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String strA;
        ColoredUiText coloredUiText;
        String str;
        f2r.b bVar = this.a;
        t2q t2qVar = this.b;
        tsd0 tsd0Var = this.c;
        f2r.c cVar = this.d;
        f2r.a aVar = this.e;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        String str2 = aVar.a;
        BigDecimal bigDecimalY1 = f2r.y1(str2);
        dqh0 dqh0Var = cVar.c;
        yxq yxqVar = cVar.a;
        dqh0Var.getClass();
        dqh0.b bVar2 = dqh0Var instanceof dqh0.b ? (dqh0.b) dqh0Var : null;
        BigDecimal bigDecimal = bVar.b;
        qxp qxpVar = bVar.d;
        String strA2 = ukd0.a(2, bigDecimal, true, true);
        f2r f2rVar = this.f;
        z2q z2qVar = f2rVar.W;
        String strConcat = yxqVar != null ? ukd0.a(2, yxqVar.f, true, true).concat("x") : null;
        String str3 = "";
        String str4 = strConcat == null ? "" : strConcat;
        String str5 = bVar.c.i;
        String strA3 = ukd0.a(2, bigDecimalY1, true, true);
        String strB = f2rVar.B.B();
        if (yxqVar != null) {
            BigDecimal bigDecimal2 = yxqVar.f;
            BigDecimal bigDecimal3 = qxpVar.h;
            bigDecimal2.getClass();
            BigDecimal bigDecimalMultiply = bigDecimalY1.multiply(bigDecimal2);
            bigDecimalMultiply.getClass();
            rkd0.a aVar2 = rkd0.Companion;
            if (bigDecimal3 == null || bigDecimalMultiply.compareTo(bigDecimal3) <= 0) {
                bigDecimal3 = bigDecimalMultiply;
            }
            strA = ukd0.a(2, bigDecimal3, true, true);
        } else {
            strA = null;
        }
        if (strA == null) {
            strA = "";
        }
        ssq ssqVar = cVar.b;
        if (ssqVar != null && (str = ssqVar.b) != null) {
            str3 = str;
        }
        qrd0 qrd0Var = aVar.b;
        boolean z = qrd0Var == null && bVar.e;
        s2q s2qVar = aVar.e;
        s2q s2qVar2 = aVar.d;
        boolean z2 = bVar.a;
        g0q g0qVar = cVar.d;
        if (StringsKt.U(str2)) {
            ResourceUiText resourceUiText = new ResourceUiText(R.string.component_betslip__min_vstake, a.c(ukd0.a(2, qxpVar.g, false, false)));
            Integer numValueOf = Integer.valueOf(R.color.text_secondary);
            StringUiText stringUiText = vch0.a;
            coloredUiText = new ColoredUiText(resourceUiText, numValueOf, null);
        } else {
            StringUiText stringUiText2 = vch0.a;
            coloredUiText = new ColoredUiText(new StringUiText(str2), Integer.valueOf(R.color.text_primary), null);
        }
        return new m2q(dqh0Var, bVar2, z2qVar, strA3, strA, coloredUiText, str4, str5, str3, strA2, strB, z, tsd0Var, s2qVar, s2qVar2, qrd0Var, t2qVar, g0qVar, z2, ukd0.a(2, aVar.c, true, true), cVar.e);
    }
}
