package defpackage;

import android.graphics.drawable.Drawable;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.withdraw.offlinewithdraw.OfflineRequestData;
import com.sporty.android.core.model.pocket.withdraw.offlinewithdraw.OfflineWithdraw;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.plugin.realsports.activities.OfflineRequestListActivity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class x7k implements gv5 {
    public final Object a;

    public x7k(des desVar) {
        desVar.getClass();
        this.a = desVar;
    }

    @Override // defpackage.gv5
    public void onFailure(su5 su5Var, Throwable th) {
        boolean zIsCanceled = su5Var.isCanceled();
        OfflineRequestListActivity offlineRequestListActivity = (OfflineRequestListActivity) this.a;
        if (zIsCanceled) {
            offlineRequestListActivity.c.n();
            return;
        }
        if (offlineRequestListActivity.isFinishing()) {
            return;
        }
        offlineRequestListActivity.i = null;
        offlineRequestListActivity.b.E();
        offlineRequestListActivity.c.n();
        ArrayList arrayList = offlineRequestListActivity.f;
        if (arrayList == null || arrayList.size() == 0) {
            offlineRequestListActivity.b.I();
        } else {
            zyf0.b(R.string.common_feedback__no_internet_connection_try_again, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gv5
    public void onResponse(su5 su5Var, bi50 bi50Var) {
        T t;
        List<OfflineWithdraw> list;
        boolean zIsCanceled = su5Var.isCanceled();
        OfflineRequestListActivity offlineRequestListActivity = (OfflineRequestListActivity) this.a;
        if (zIsCanceled) {
            offlineRequestListActivity.c.n();
            return;
        }
        if (offlineRequestListActivity.isFinishing()) {
            return;
        }
        offlineRequestListActivity.i = null;
        offlineRequestListActivity.b.E();
        BaseResponse baseResponse = (BaseResponse) bi50Var.b;
        boolean z = false;
        if (!bi50Var.a.getIsSuccessful() || baseResponse == null || (t = baseResponse.data) == 0 || (list = ((OfflineRequestData) t).entityList) == null) {
            if (offlineRequestListActivity.B) {
                offlineRequestListActivity.c.n();
            }
            ArrayList arrayList = offlineRequestListActivity.f;
            if (arrayList == null || arrayList.size() == 0) {
                offlineRequestListActivity.b.I();
                return;
            } else {
                zyf0.b(R.string.common_feedback__no_internet_connection_try_again, 0);
                return;
            }
        }
        if (offlineRequestListActivity.d == null) {
            ely elyVar = new ely(offlineRequestListActivity, offlineRequestListActivity.f, offlineRequestListActivity.z);
            offlineRequestListActivity.d = elyVar;
            elyVar.e = offlineRequestListActivity.getCMSString(R.string.common_feedback__no_more_records, new Object[0]);
            offlineRequestListActivity.c.setAdapter(offlineRequestListActivity.d);
        }
        if (offlineRequestListActivity.B) {
            offlineRequestListActivity.f.clear();
            offlineRequestListActivity.B = false;
        }
        int i = 1;
        if (list != null && list.size() > 0) {
            offlineRequestListActivity.v = ((OfflineWithdraw) uts.a(1, list)).tradeId;
            offlineRequestListActivity.f.addAll(list);
            ely elyVar2 = offlineRequestListActivity.d;
            if (list.size() < 10 && offlineRequestListActivity.f.size() > 10) {
                z = true;
            }
            elyVar2.d = z;
        } else {
            if (offlineRequestListActivity.f.size() <= 0) {
                offlineRequestListActivity.c.n();
                offlineRequestListActivity.b.G(R.string.common_feedback__no_records_found);
                LoadingView loadingView = offlineRequestListActivity.b;
                loadingView.H.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, gr0.a(loadingView.getContext(), R.drawable.spr_results_no_result), (Drawable) null, (Drawable) null);
                offlineRequestListActivity.b.L(new qop(offlineRequestListActivity, i));
                return;
            }
            offlineRequestListActivity.d.d = offlineRequestListActivity.f.size() > 10;
        }
        offlineRequestListActivity.d.notifyDataSetChanged();
        offlineRequestListActivity.c.n();
    }

    public x7k(OfflineRequestListActivity offlineRequestListActivity) {
        this.a = offlineRequestListActivity;
    }
}
