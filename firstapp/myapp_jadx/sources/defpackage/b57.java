package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class b57 implements gv5<BaseResponse<String>> {
    public final /* synthetic */ d57 a;

    public b57(d57 d57Var) {
        this.a = d57Var;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<String>> su5Var, Throwable th) {
        d57 d57Var = this.a;
        if (d57Var.getActivity() == null || d57Var.getActivity().isFinishing() || su5Var.isCanceled() || d57Var.isDetached()) {
            return;
        }
        d57Var.C.setLoading(false);
        zyf0.d("");
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<String>> su5Var, bi50<BaseResponse<String>> bi50Var) {
        d57 d57Var = this.a;
        if (d57Var.getActivity() == null || d57Var.getActivity().isFinishing() || su5Var.isCanceled() || d57Var.isDetached()) {
            return;
        }
        d57Var.C.setLoading(false);
        BaseResponse<String> baseResponse = bi50Var.b;
        if (!bi50Var.a.getIsSuccessful() || baseResponse == null) {
            zyf0.d("");
            d57Var.C.setLoading(false);
            return;
        }
        int i = baseResponse.bizCode;
        if (i == 10000) {
            d57Var.C.setLoading(false);
            zyf0.c(1, sn5.d(d57Var, R.string.common_feedback__succeeded, new Object[0]));
            d57Var.getActivity().finish();
        } else if (i == 11609 || i == 11612) {
            d57Var.C.setLoading(false);
            d57Var.D.setError(sn5.d(d57Var, R.string.my_account__the_new_password_must_be_different_from_the_previous_ones, new Object[0]));
        } else {
            d57Var.C.setLoading(false);
            zyf0.c(1, baseResponse.message);
        }
    }
}
