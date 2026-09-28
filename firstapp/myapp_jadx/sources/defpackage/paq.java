package defpackage;

import com.sporty.android.common_ui.uitext.ColoredUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.luckynumber.featurematch.domain.data.LNLastMinuteCard;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.featurematch.presentation.quickbet.LNFeatureMatchQuickBetViewModel$contentState$1", f = "LNFeatureMatchQuickBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class paq extends tje0 implements kaj<String, qrd0, s2q, tsd0, Boolean, v1b<? super kaq>, Object> {
    public /* synthetic */ String a;
    public /* synthetic */ qrd0 b;
    public /* synthetic */ s2q c;
    public /* synthetic */ tsd0 d;
    public /* synthetic */ boolean e;
    public final /* synthetic */ uaq f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public paq(uaq uaqVar, v1b<? super paq> v1bVar) {
        super(6, v1bVar);
        this.f = uaqVar;
    }

    @Override // defpackage.kaj
    public final Object f(String str, qrd0 qrd0Var, s2q s2qVar, tsd0 tsd0Var, Boolean bool, v1b<? super kaq> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        paq paqVar = new paq(this.f, v1bVar);
        paqVar.a = str;
        paqVar.b = qrd0Var;
        paqVar.c = s2qVar;
        paqVar.d = tsd0Var;
        paqVar.e = zBooleanValue;
        return paqVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00d6  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ColoredUiText coloredUiText;
        boolean z;
        String str = this.a;
        qrd0 qrd0Var = this.b;
        s2q s2qVar = this.c;
        tsd0 tsd0Var = this.d;
        boolean z2 = this.e;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        uaq uaqVar = this.f;
        BigDecimal bigDecimal = uaqVar.C;
        BigDecimal bigDecimalX1 = uaq.x1(str);
        String strA = ukd0.a(2, bigDecimalX1, true, true);
        uf00 uf00Var = uaqVar.w;
        LNLastMinuteCard lNLastMinuteCard = uaqVar.v;
        String str2 = lNLastMinuteCard.b;
        String str3 = lNLastMinuteCard.w;
        if (str3 == null) {
            str3 = "";
        }
        String strConcat = ukd0.a(2, bigDecimal, true, true).concat("x");
        if (StringsKt.U(str)) {
            Object[] objArr = {ukd0.a(2, uaqVar.y, false, false)};
            StringUiText stringUiText = vch0.a;
            coloredUiText = new ColoredUiText(new ResourceUiText(R.string.component_betslip__min_vstake, ay0.S(objArr)), new Integer(R.color.text_secondary), null);
        } else {
            StringUiText stringUiText2 = vch0.a;
            coloredUiText = new ColoredUiText(new StringUiText(str), new Integer(R.color.text_primary), null);
        }
        BigDecimal bigDecimal2 = uaqVar.A;
        bigDecimal.getClass();
        BigDecimal bigDecimalMultiply = bigDecimalX1.multiply(bigDecimal);
        bigDecimalMultiply.getClass();
        rkd0.a aVar = rkd0.Companion;
        if (bigDecimal2 == null || bigDecimalMultiply.compareTo(bigDecimal2) <= 0) {
            bigDecimal2 = bigDecimalMultiply;
        }
        String strA2 = ukd0.a(2, bigDecimal2, true, true);
        String str4 = str3;
        String str5 = uaqVar.B;
        if (qrd0Var != null || StringsKt.U(lNLastMinuteCard.d) || StringsKt.U(lNLastMinuteCard.v) || StringsKt.U(lNLastMinuteCard.z)) {
            z = false;
        } else {
            rkd0.Companion.getClass();
            if (bigDecimal.compareTo(rkd0.b) <= 0 || uaqVar.w.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
        }
        return new kaq(uf00Var, str2, str4, strConcat, coloredUiText, strA, strA2, strA, str5, qrd0Var, s2qVar, tsd0Var, z2, z, 114688);
    }
}
