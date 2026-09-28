package defpackage;

import com.sporty.android.common.network.data.BaseResponse;

/* JADX INFO: loaded from: classes6.dex */
public final class vtj0 extends fte<BaseResponse<xdp>> {
    public final /* synthetic */ xtj0 a;

    public vtj0(xtj0 xtj0Var) {
        this.a = xtj0Var;
    }

    @Override // defpackage.zu90
    public final void onError(Throwable th) {
        th.getClass();
        this.a.w.m(null);
    }

    @Override // defpackage.zu90
    public final void onSuccess(Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        baseResponse.getClass();
        this.a.w.m(bi50.a(baseResponse));
    }
}
