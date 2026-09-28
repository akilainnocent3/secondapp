package defpackage;

import com.sportybet.android.gp.tz.R;
import com.sportybet.android.limits.edit.EditLimitsActivity;
import com.sportygames.crash.models.bet.BetContainerState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d9b implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d9b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                fgb fgbVar = (fgb) obj;
                return Boolean.valueOf(((BetContainerState) fgbVar.R0().a.getValue()).getBetPlaced() || ((BetContainerState) fgbVar.S0().a.getValue()).getBetPlaced());
            case 1:
                int i2 = EditLimitsActivity.i;
                ((EditLimitsActivity) obj).finish();
                return Unit.a;
            default:
                return Integer.valueOf(((ucb0) obj).getContext().getColor(R.color.brand_secondary_variable_type2));
        }
    }
}
