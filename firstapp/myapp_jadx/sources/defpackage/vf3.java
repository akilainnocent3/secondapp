package defpackage;

import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;
import com.sportybet.plugin.realsports.betslip.widget.f;
import java.util.HashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class vf3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vf3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                BetslipActivity betslipActivity = (BetslipActivity) obj;
                Set<g08> set = BetslipActivity.X2;
                HashSet<f.a> hashSet = f.a;
                f.b(f.a.b);
                betslipActivity.S1().E.setRemoveAllBtnEnabled(!(betslipActivity.S1().U.a.getVisibility() == 0));
                betslipActivity.S1().K.setVisibility(8);
                betslipActivity.S1().V.a.setVisibility(0);
                return Unit.a;
            default:
                e400 e400Var = (e400) obj;
                return new e400.c(new n1i(new e400.b(e400Var.x1()), e400Var.b.needShow("PREF_KEY_NEW_FEATURE_TAB_LAYOUT_SCROLL_BTN"), new e400.a(3, null)));
        }
    }
}
