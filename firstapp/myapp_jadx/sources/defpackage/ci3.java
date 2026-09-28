package defpackage;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;
import com.sportygames.sportyherocompose.components.SHOverBetComponent;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ci3 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ci3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                BetslipActivity betslipActivity = (BetslipActivity) obj2;
                cz3 cz3Var = (cz3) obj;
                Set<g08> set = BetslipActivity.X2;
                cz3Var.getClass();
                if (cz3Var == cz3.SIMPLE) {
                    betslipActivity.Q1().P1(q43.c);
                    y8j fullStoryCommonManager = betslipActivity.getFullStoryCommonManager();
                    ConstraintLayout constraintLayout = betslipActivity.S1().a;
                    constraintLayout.getClass();
                    fullStoryCommonManager.c(constraintLayout, AnalyticsParam.BETSLIP_SIMPLE);
                } else if (cz3Var == cz3.STANDARD) {
                    betslipActivity.Q1().P1(q43.b);
                    y8j fullStoryCommonManager2 = betslipActivity.getFullStoryCommonManager();
                    ConstraintLayout constraintLayout2 = betslipActivity.S1().a;
                    constraintLayout2.getClass();
                    fullStoryCommonManager2.c(constraintLayout2, AnalyticsParam.BETSLIP_STANDARD);
                }
                return Unit.a;
            case 1:
                bdc bdcVar = (bdc) obj2;
                String str = (String) obj;
                str.getClass();
                bdcVar.getClass();
                ej5.c(o8i0.d(bdcVar), null, null, new ddc(bdcVar, str, null), 3);
                return Unit.a;
            default:
                a6c0 a6c0Var = (a6c0) obj2;
                Context context = (Context) obj;
                context.getClass();
                SHOverBetComponent sHOverBetComponent = new SHOverBetComponent(context, null);
                a6c0Var.k = sHOverBetComponent;
                a6c0Var.d();
                return sHOverBetComponent;
        }
    }
}
