package defpackage;

import com.sporty.android.common.network.data.BaseResponse;

/* JADX INFO: loaded from: classes5.dex */
public final class kcu extends fte<BaseResponse<Void>> {
    public final /* synthetic */ pd7 a;

    public kcu(pd7 pd7Var) {
        this.a = pd7Var;
    }

    @Override // defpackage.zu90
    public final void onError(Throwable th) {
        th.getClass();
        this.a.invoke(null);
    }

    @Override // defpackage.zu90
    public final void onSuccess(Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        baseResponse.getClass();
        this.a.invoke(baseResponse);
    }
}
