package defpackage;

import androidx.fragment.app.e;
import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.Schedule;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class qz60 implements gv5<BaseResponse<List<Schedule>>> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ oz60 b;

    public qz60(oz60 oz60Var, boolean z) {
        this.b = oz60Var;
        this.a = z;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<List<Schedule>>> su5Var, Throwable th) {
        e activity;
        oz60 oz60Var = this.b;
        oz60Var.y = null;
        if (su5Var.isCanceled() || (activity = oz60Var.getActivity()) == null || activity.isFinishing()) {
            return;
        }
        if (this.a) {
            zyf0.b(R.string.common_feedback__no_internet_connection_try_again, 0);
        } else {
            oz60Var.a.I();
        }
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<List<Schedule>>> su5Var, bi50<BaseResponse<List<Schedule>>> bi50Var) {
        e activity;
        BaseResponse<List<Schedule>> baseResponse;
        List<Schedule> list;
        oz60 oz60Var = this.b;
        oz60Var.y = null;
        if (su5Var.isCanceled() || (activity = oz60Var.getActivity()) == null || activity.isFinishing()) {
            return;
        }
        boolean isSuccessful = bi50Var.a.getIsSuccessful();
        boolean z = this.a;
        if (!isSuccessful || (baseResponse = bi50Var.b) == null || (list = baseResponse.data) == null) {
            if (z) {
                zyf0.b(R.string.common_feedback__no_internet_connection_try_again, 0);
                return;
            } else {
                oz60Var.a.I();
                return;
            }
        }
        nz60 nz60Var = oz60Var.A;
        nz60Var.b = list;
        nz60Var.notifyDataSetChanged();
        if (z) {
            oz60Var.d.setRefreshing(false);
        } else {
            oz60Var.a.E();
        }
        if (baseResponse.data.isEmpty()) {
            oz60Var.a.G(R.string.common_functions__no_game);
        }
    }
}
