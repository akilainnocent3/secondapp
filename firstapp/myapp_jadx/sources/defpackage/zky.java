package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.activities.OfflineRequestListActivity;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.ConnectException;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final class zky implements gv5<BaseResponse<xdp>> {
    public final /* synthetic */ int a;
    public final /* synthetic */ OfflineRequestListActivity b;

    public zky(OfflineRequestListActivity offlineRequestListActivity, int i) {
        this.b = offlineRequestListActivity;
        this.a = i;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<xdp>> su5Var, Throwable th) {
        OfflineRequestListActivity offlineRequestListActivity = this.b;
        if (offlineRequestListActivity.isFinishing()) {
            return;
        }
        offlineRequestListActivity.w = null;
        if (th instanceof ConnectException) {
            zyf0.a(R.string.common_feedback__please_check_your_internet_connection_and_try_again);
        } else {
            zyf0.b(R.string.wap_search__failed, 0);
        }
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<xdp>> su5Var, bi50<BaseResponse<xdp>> bi50Var) {
        OfflineRequestListActivity offlineRequestListActivity = this.b;
        if (offlineRequestListActivity.isFinishing()) {
            return;
        }
        BaseResponse<xdp> baseResponse = bi50Var.b;
        if (!bi50Var.a.getIsSuccessful() || baseResponse == null) {
            return;
        }
        int i = baseResponse.bizCode;
        if (i != 10000) {
            if (i != 19002) {
                onFailure(su5Var, null);
                return;
            } else {
                offlineRequestListActivity.z1(offlineRequestListActivity.getCMSString(R.string.page_withdraw__cancellation_failed_your_request_status_is_changed_tip__NG, new Object[0]));
                return;
            }
        }
        if (baseResponse.data != null) {
            offlineRequestListActivity.c.setRefreshing(false);
            if (this.a != 12) {
                offlineRequestListActivity.z1(offlineRequestListActivity.getCMSString(R.string.page_withdraw__your_withdrawal_request_has_been_cancelled_a_full_refund_has_been_returned_to_your_balance, new Object[0]));
            } else {
                offlineRequestListActivity.z1(offlineRequestListActivity.getCMSString(R.string.common_payment_providers__cancel_fee_request_success_hint, String.format(Locale.US, "%,.2f", new BigDecimal(offlineRequestListActivity.z).divide(BigDecimal.valueOf(10000L), 2, RoundingMode.HALF_UP))));
            }
        }
    }
}
