package defpackage;

import androidx.fragment.app.e;
import com.sporty.android.common.network.data.BaseResponse;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class u6p implements gv5<BaseResponse<List<String>>> {
    public final /* synthetic */ r6p a;

    public u6p(r6p r6pVar) {
        this.a = r6pVar;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<List<String>>> su5Var, Throwable th) {
        if (su5Var.isCanceled()) {
            return;
        }
        r6p r6pVar = this.a;
        e activity = r6pVar.getActivity();
        if (activity == null || activity.isFinishing() || r6pVar.isDetached()) {
            r6pVar.a.E();
            r6pVar.j0(false);
        } else {
            r6pVar.a.I();
            r6pVar.j0(true);
        }
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<List<String>>> su5Var, bi50<BaseResponse<List<String>>> bi50Var) {
        List<String> list;
        if (su5Var.isCanceled()) {
            return;
        }
        r6p r6pVar = this.a;
        e activity = r6pVar.getActivity();
        if (activity == null || activity.isFinishing() || r6pVar.isDetached()) {
            r6pVar.a.E();
            r6pVar.j0(false);
            return;
        }
        if (!bi50Var.a.getIsSuccessful()) {
            r6pVar.a.I();
            r6pVar.j0(true);
            return;
        }
        BaseResponse<List<String>> baseResponse = bi50Var.b;
        if (baseResponse != null && (list = baseResponse.data) != null) {
            r6pVar.G = list;
        }
        r6pVar.n0();
        r6pVar.a.E();
        r6pVar.j0(false);
    }
}
