package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.common.WhTaxData;

/* JADX INFO: loaded from: classes5.dex */
public final class qgj0 extends fte<BaseResponse<Object>> {
    public final /* synthetic */ rgj0 a;

    public qgj0(rgj0 rgj0Var) {
        this.a = rgj0Var;
    }

    @Override // defpackage.zu90
    public final void onError(Throwable th) {
        th.getClass();
        this.a.i.m(new WhTaxData(false, 0, 0L, 0L, 15, null));
    }

    @Override // defpackage.zu90
    public final void onSuccess(Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        baseResponse.getClass();
        new pgj0(this.a).onSuccess(baseResponse.data);
    }
}
