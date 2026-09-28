package defpackage;

import com.sporty.android.common.network.data.BaseResponse;

/* JADX INFO: loaded from: classes6.dex */
public final class gg4 implements gv5 {
    public final Object a;

    public /* synthetic */ gg4(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.gv5
    public void onFailure(su5 su5Var, Throwable th) {
        ((tz00) this.a).a.m(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gv5
    public void onResponse(su5 su5Var, bi50 bi50Var) {
        T t = bi50Var.b;
        ssw<BaseResponse<xdp>> sswVar = ((tz00) this.a).a;
        if (t != 0) {
            sswVar.m((BaseResponse) t);
        } else {
            sswVar.m(null);
        }
    }
}
