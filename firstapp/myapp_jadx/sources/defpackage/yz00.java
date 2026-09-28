package defpackage;

import com.sporty.android.common.network.data.BaseResponse;

/* JADX INFO: loaded from: classes.dex */
public final class yz00 implements gv5<BaseResponse<xdp>> {
    public final /* synthetic */ tz00 a;

    public yz00(tz00 tz00Var) {
        this.a = tz00Var;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<xdp>> su5Var, Throwable th) {
        this.a.v.m(null);
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<xdp>> su5Var, bi50<BaseResponse<xdp>> bi50Var) {
        BaseResponse<xdp> baseResponse = bi50Var.b;
        tz00 tz00Var = this.a;
        if (baseResponse != null) {
            tz00Var.v.m(baseResponse);
        } else {
            tz00Var.v.m(null);
        }
    }
}
