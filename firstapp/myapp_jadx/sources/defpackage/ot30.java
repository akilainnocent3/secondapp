package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.jackpot.activities.RSportsBetTicketDetailsActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class ot30 implements gv5<BaseResponse> {
    public final /* synthetic */ RSportsBetTicketDetailsActivity a;

    public ot30(RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity) {
        this.a = rSportsBetTicketDetailsActivity;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse> su5Var, Throwable th) {
        zyf0.c(1, this.a.getCMSString(R.string.common_feedback__failed_to_delete, new Object[0]));
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse> su5Var, bi50<BaseResponse> bi50Var) {
        BaseResponse baseResponse;
        RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity = this.a;
        if (rSportsBetTicketDetailsActivity.isFinishing() || su5Var.isCanceled() || !bi50Var.a.getIsSuccessful() || (baseResponse = bi50Var.b) == null) {
            return;
        }
        if (!baseResponse.isSuccessful()) {
            zyf0.c(1, rSportsBetTicketDetailsActivity.getCMSString(R.string.common_feedback__failed_to_delete, new Object[0]));
        } else {
            zyf0.c(1, rSportsBetTicketDetailsActivity.getCMSString(R.string.common_feedback__successfully_deleted, new Object[0]));
            rSportsBetTicketDetailsActivity.finish();
        }
    }
}
