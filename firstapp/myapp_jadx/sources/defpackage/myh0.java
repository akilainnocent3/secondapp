package defpackage;

import android.content.Intent;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.bethistory.presentation.activity.RSportsBetTicketDetailsActivity;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.verifybet.VerifyBetActivity;
import com.sportybet.android.verifybet.apidata.VerifyBetData;
import com.sportybet.android.widget.ProgressButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class myh0 implements Function1 {
    public final /* synthetic */ df a;
    public final /* synthetic */ VerifyBetActivity b;

    public /* synthetic */ myh0(df dfVar, VerifyBetActivity verifyBetActivity) {
        this.a = dfVar;
        this.b = verifyBetActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ryh0 ryh0Var = (ryh0) obj;
        int i = VerifyBetActivity.f;
        df dfVar = this.a;
        ProgressButton progressButton = dfVar.d;
        ClearEditText clearEditText = dfVar.B;
        progressButton.setLoading(false);
        if (ryh0Var instanceof ryh0.e) {
            progressButton.setLoading(true);
        } else if (ryh0Var instanceof ryh0.b) {
            lop.b(clearEditText, Boolean.FALSE);
            dfVar.A.setVisibility(0);
            clearEditText.setEnabled(false);
        } else {
            boolean z = ryh0Var instanceof ryh0.g;
            VerifyBetActivity verifyBetActivity = this.b;
            if (z) {
                Intent intent = new Intent(verifyBetActivity, (Class<?>) RSportsBetTicketDetailsActivity.class);
                VerifyBetData verifyBetData = ((ryh0.g) ryh0Var).a;
                intent.putExtra(AnalyticsParam.SOCIAL_ORDER_ID, verifyBetData.getOrderInfoVO().orderId);
                intent.putExtra("from_verify_bet", true);
                intent.putExtra("verify_bet_data", verifyBetData);
                ee<Intent> eeVar = verifyBetActivity.e;
                if (eeVar == null) {
                    Intrinsics.n("resultLauncher");
                    throw null;
                }
                eeVar.b(intent);
            } else if (ryh0Var instanceof ryh0.a) {
                clearEditText.setActivated(true);
                progressButton.setEnabled(false);
                clearEditText.setError(((ryh0.a) ryh0Var).a);
            } else if (ryh0Var instanceof ryh0.c) {
                b.a title = new b.a(verifyBetActivity).setTitle(verifyBetActivity.getCMSString(R.string.common_feedback__rate_limit_exceeded_title, new Object[0]));
                String cMSString = ((ryh0.c) ryh0Var).a;
                if (cMSString.length() == 0) {
                    cMSString = verifyBetActivity.getCMSString(R.string.common_feedback__something_went_wrong_please_try_again_later, new Object[0]);
                }
                AlertController.b bVar = title.a;
                bVar.f = cMSString;
                bVar.k = true;
                title.c(verifyBetActivity.getCMSString(R.string.common_functions__ok, new Object[0]), null);
                title.f();
            } else if (ryh0Var instanceof ryh0.d) {
                b.a title2 = new b.a(verifyBetActivity).setTitle(verifyBetActivity.getCMSString(R.string.common_feedback__something_went_wrong, new Object[0]));
                String cMSString2 = ((ryh0.d) ryh0Var).a;
                if (cMSString2.length() == 0) {
                    cMSString2 = verifyBetActivity.getCMSString(R.string.common_feedback__something_went_wrong_please_try_again_later, new Object[0]);
                }
                AlertController.b bVar2 = title2.a;
                bVar2.f = cMSString2;
                bVar2.k = true;
                title2.c(verifyBetActivity.getCMSString(R.string.common_functions__ok, new Object[0]), null);
                title2.f();
            } else {
                b.a title3 = new b.a(verifyBetActivity).setTitle(verifyBetActivity.getCMSString(R.string.common_feedback__something_went_wrong, new Object[0]));
                String cMSString3 = verifyBetActivity.getCMSString(R.string.common_feedback__something_went_wrong_please_try_again_later, new Object[0]);
                AlertController.b bVar3 = title3.a;
                bVar3.f = cMSString3;
                bVar3.k = true;
                title3.c(verifyBetActivity.getCMSString(R.string.common_functions__ok, new Object[0]), null);
                title3.f();
            }
        }
        return Unit.a;
    }
}
