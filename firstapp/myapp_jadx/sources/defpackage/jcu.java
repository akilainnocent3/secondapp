package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.patron.Send2FACodeResponse;

/* JADX INFO: loaded from: classes5.dex */
public final class jcu extends fte<BaseResponse<Send2FACodeResponse>> {
    public final /* synthetic */ mcu a;

    public jcu(mcu mcuVar) {
        this.a = mcuVar;
    }

    @Override // defpackage.zu90
    public final void onError(Throwable th) {
        th.getClass();
        this.a.invoke(new jox.c(th));
    }

    @Override // defpackage.zu90
    public final void onSuccess(Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        baseResponse.getClass();
        this.a.invoke(new jox.a(baseResponse));
    }
}
