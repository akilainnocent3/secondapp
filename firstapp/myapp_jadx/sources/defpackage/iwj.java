package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.sporty.android.platform.features.loyalty.downgrade.LoyaltyDowngradeDialogActivity;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportybet.plugin.realsports.widget.FloatLoadingView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class iwj implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iwj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ytw) obj).setValue(Boolean.TRUE);
                return Unit.a;
            case 1:
                LoyaltyDowngradeDialogActivity loyaltyDowngradeDialogActivity = (LoyaltyDowngradeDialogActivity) obj;
                bnh0 bnh0Var = loyaltyDowngradeDialogActivity.d;
                if (bnh0Var == null) {
                    Intrinsics.n("urlCreator");
                    throw null;
                }
                Uri uri = Uri.parse(bnh0Var.h("m/me/loyalty/intro"));
                Bundle bundleA = x6.a("data_enable_default_action_bar", false);
                azm azmVar = loyaltyDowngradeDialogActivity.c;
                if (azmVar == null) {
                    Intrinsics.n("iRouter");
                    throw null;
                }
                azmVar.l(uri, bundleA);
                loyaltyDowngradeDialogActivity.finish();
                return Unit.a;
            default:
                FloatLoadingView floatLoadingView = ((PreMatchEventActivity) obj).P0;
                if (floatLoadingView != null) {
                    floatLoadingView.setVisibility(8);
                }
                return Unit.a;
        }
    }
}
