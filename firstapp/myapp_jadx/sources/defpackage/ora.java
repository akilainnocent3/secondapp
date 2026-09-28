package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.sportybet.android.loyalty.LoyaltyWebActivity;
import com.sportybet.feature.loyal.LoyalJoinDialogActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ora implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ora(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ytw) obj).setValue("");
                break;
            case 1:
                LoyalJoinDialogActivity loyalJoinDialogActivity = (LoyalJoinDialogActivity) obj;
                int i2 = LoyalJoinDialogActivity.b;
                String strS = bjb0.S("/m/me/loyalty");
                Intent intent = new Intent(loyalJoinDialogActivity, (Class<?>) LoyaltyWebActivity.class);
                Bundle bundle = new Bundle();
                syi0.b(strS, bundle);
                intent.putExtras(bundle);
                intent.putExtra("data_enable_default_action_bar", false);
                yrh0.s(loyalJoinDialogActivity, intent, true);
                loyalJoinDialogActivity.finish();
                break;
            default:
                h2j0 h2j0Var = (h2j0) obj;
                ej5.c(o8i0.d(h2j0Var), null, null, new k2j0(h2j0Var, null), 3);
                break;
        }
        return Unit.a;
    }
}
