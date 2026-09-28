package defpackage;

import com.sporty.android.common.network.data.BaseResponse;

/* JADX INFO: loaded from: classes4.dex */
public final class xrg0 extends fte<BaseResponse<xdp>> {
    public final /* synthetic */ yrg0 a;

    public xrg0(yrg0 yrg0Var) {
        this.a = yrg0Var;
    }

    @Override // defpackage.zu90
    public final void onError(Throwable th) {
        th.getClass();
        this.a.i.m(new jox.c(th));
    }

    @Override // defpackage.zu90
    public final void onSuccess(Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        baseResponse.getClass();
        this.a.i.m(new jox.a(baseResponse));
    }
}
