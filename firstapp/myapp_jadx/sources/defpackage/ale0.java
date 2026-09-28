package defpackage;

import com.sporty.android.common.network.data.BaseResponse;

/* JADX INFO: loaded from: classes7.dex */
public final class ale0 implements gv5<BaseResponse> {
    public final /* synthetic */ String a;
    public final /* synthetic */ ble0 b;

    public ale0(ble0 ble0Var, String str) {
        this.b = ble0Var;
        this.a = str;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse> su5Var, Throwable th) {
        this.b.c.m(new kqc());
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse> su5Var, bi50<BaseResponse> bi50Var) {
        if (!su5Var.isCanceled() && bi50Var.a.getIsSuccessful() && bi50Var.b.bizCode == 10000) {
            ble0 ble0Var = this.b;
            hle0 hle0Var = ble0Var.v;
            hle0 hle0Var2 = ble0Var.v;
            hle0Var.b();
            hle0Var2.a();
            hle0Var2.d(this.a);
            ble0Var.c.m(new nqc(new Object()));
        }
    }
}
