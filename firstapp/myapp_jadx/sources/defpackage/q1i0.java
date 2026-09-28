package defpackage;

import com.sporty.android.common.network.data.BaseResponse;

/* JADX INFO: loaded from: classes6.dex */
public final class q1i0 extends fte<BaseResponse<xdp>> {
    public final /* synthetic */ r1i0 a;

    public q1i0(r1i0 r1i0Var) {
        this.a = r1i0Var;
    }

    @Override // defpackage.zu90
    public final void onError(Throwable th) {
        th.getClass();
        this.a.f.m(null);
    }

    @Override // defpackage.zu90
    public final void onSuccess(Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        baseResponse.getClass();
        this.a.f.m(bi50.a(baseResponse));
    }
}
