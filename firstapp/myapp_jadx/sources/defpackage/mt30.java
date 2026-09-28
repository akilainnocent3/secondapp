package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.bethistory.presentation.activity.RSportsBetTicketDetailsActivity;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class mt30 implements gv5<BaseResponse> {
    public final /* synthetic */ String a;
    public final /* synthetic */ RSportsBetTicketDetailsActivity b;

    public mt30(RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity, String str) {
        this.b = rSportsBetTicketDetailsActivity;
        this.a = str;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse> su5Var, Throwable th) {
        zyf0.c(1, this.b.getCMSString(R.string.common_feedback__failed_to_delete, new Object[0]));
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse> su5Var, bi50<BaseResponse> bi50Var) {
        BaseResponse baseResponse;
        RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity = this.b;
        if (rSportsBetTicketDetailsActivity.isFinishing() || su5Var.isCanceled() || !bi50Var.a.getIsSuccessful() || (baseResponse = bi50Var.b) == null) {
            return;
        }
        if (!baseResponse.isSuccessful()) {
            zyf0.c(1, rSportsBetTicketDetailsActivity.getCMSString(R.string.common_feedback__failed_to_delete, new Object[0]));
            return;
        }
        im2 im2Var = rSportsBetTicketDetailsActivity.c0;
        im2Var.getClass();
        String str = this.a;
        str.getClass();
        ej5.c(o8i0.d(im2Var), null, null, new fm2(im2Var, str, null), 3);
        zyf0.c(1, rSportsBetTicketDetailsActivity.getCMSString(R.string.common_feedback__successfully_deleted, new Object[0]));
        rSportsBetTicketDetailsActivity.setResult(2);
        rSportsBetTicketDetailsActivity.finish();
    }
}
