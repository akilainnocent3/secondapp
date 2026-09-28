package defpackage;

import com.sportybet.android.social.presentation.custom.CustomCodeActivity;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class xe3 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ xe3(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Selection selection = (Selection) obj;
                Set<g08> set = BetslipActivity.X2;
                selection.getClass();
                return qvy.e(selection);
            default:
                String str = (String) obj;
                int i = CustomCodeActivity.f;
                str.getClass();
                yrh0.e(str);
                return Unit.a;
        }
    }
}
