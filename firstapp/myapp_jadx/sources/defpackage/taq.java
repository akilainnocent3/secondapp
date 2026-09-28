package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.featurematch.presentation.quickbet.LNFeatureMatchQuickBetViewModel$topWarningHint$1", f = "LNFeatureMatchQuickBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class taq extends tje0 implements gaj<String, qrd0, v1b<? super s2q>, Object> {
    public /* synthetic */ String a;
    public /* synthetic */ qrd0 b;
    public final /* synthetic */ uaq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public taq(uaq uaqVar, v1b<? super taq> v1bVar) {
        super(3, v1bVar);
        this.c = uaqVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(String str, qrd0 qrd0Var, v1b<? super s2q> v1bVar) {
        taq taqVar = new taq(this.c, v1bVar);
        taqVar.a = str;
        taqVar.b = qrd0Var;
        return taqVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str = this.a;
        qrd0 qrd0Var = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (qrd0Var instanceof qrd0.c) {
            return s2q.a.a;
        }
        BigDecimal bigDecimalX1 = uaq.x1(str);
        uaq uaqVar = this.c;
        BigDecimal bigDecimal = uaqVar.A;
        if (bigDecimal != null) {
            BigDecimal bigDecimalMultiply = uaqVar.C.multiply(bigDecimalX1);
            bigDecimalMultiply.getClass();
            rkd0.a aVar = rkd0.Companion;
            if (bigDecimal.compareTo(bigDecimalMultiply) < 0) {
                StringUiText stringUiText = vch0.a;
                return new s2q.b(new ResourceUiText(R.string.page_lucky_numbers__max_payout_reached_warning));
            }
        }
        return s2q.a.a;
    }
}
