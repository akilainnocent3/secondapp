package defpackage;

import androidx.fragment.app.e;
import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.plugin.jackpot.data.PeriodNumber;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class t6p implements gv5<BaseResponse<List<PeriodNumber>>> {
    public final /* synthetic */ s6p a;

    public t6p(s6p s6pVar) {
        this.a = s6pVar;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<List<PeriodNumber>>> su5Var, Throwable th) {
        if (su5Var.isCanceled()) {
            return;
        }
        s6p s6pVar = this.a;
        e activity = s6pVar.getActivity();
        if (activity == null || activity.isFinishing() || s6pVar.isDetached()) {
            s6pVar.b.a();
            s6pVar.j0(false);
        } else {
            s6pVar.b.c();
            s6pVar.j0(true);
        }
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<List<PeriodNumber>>> su5Var, bi50<BaseResponse<List<PeriodNumber>>> bi50Var) {
        List<PeriodNumber> list;
        if (su5Var.isCanceled()) {
            return;
        }
        s6p s6pVar = this.a;
        e activity = s6pVar.getActivity();
        if (activity == null || activity.isFinishing() || s6pVar.isDetached()) {
            s6pVar.b.a();
            s6pVar.j0(false);
            return;
        }
        if (!bi50Var.a.getIsSuccessful()) {
            s6pVar.b.c();
            s6pVar.j0(true);
            return;
        }
        BaseResponse<List<PeriodNumber>> baseResponse = bi50Var.b;
        if (baseResponse != null && (list = baseResponse.data) != null) {
            s6pVar.I = list;
        }
        s6pVar.o0();
        s6pVar.b.a();
        s6pVar.j0(false);
    }
}
