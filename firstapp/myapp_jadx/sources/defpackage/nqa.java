package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.feature.kyc.confirmAccountInfo.ConfirmAccountInfoActivity;
import com.sportybet.feature.loyalty.impl.welcomereward.WelcomeRewardBottomSheetActivity;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nqa implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ py1 b;

    public /* synthetic */ nqa(py1 py1Var, int i) {
        this.a = i;
        this.b = py1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        py1 py1Var = this.b;
        switch (i) {
            case 0:
                ConfirmAccountInfoActivity confirmAccountInfoActivity = (ConfirmAccountInfoActivity) py1Var;
                ConfirmAccountInfoActivity.a aVar = ConfirmAccountInfoActivity.d;
                confirmAccountInfoActivity.setResult(5001);
                confirmAccountInfoActivity.finish();
                return Unit.a;
            case 1:
                RecyclerView recyclerView = ((PreMatchEventActivity) py1Var).U;
                RecyclerView.o layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
                layoutManager.getClass();
                return (LinearLayoutManager) layoutManager;
            default:
                int i2 = WelcomeRewardBottomSheetActivity.d;
                ((u1j0) ((WelcomeRewardBottomSheetActivity) py1Var).b.getValue()).x1(new x0j0.m(0));
                return Unit.a;
        }
    }
}
