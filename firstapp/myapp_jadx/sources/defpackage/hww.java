package defpackage;

import com.sporty.android.common.network.data.BaseResponse;

/* JADX INFO: loaded from: classes6.dex */
public final class hww implements gv5<BaseResponse> {
    public final /* synthetic */ iww a;

    public hww(iww iwwVar) {
        this.a = iwwVar;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse> su5Var, Throwable th) {
        this.a.b.m(new kqc());
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse> su5Var, bi50<BaseResponse> bi50Var) {
        if (!bi50Var.a.getIsSuccessful()) {
            onFailure(su5Var, null);
            return;
        }
        iww iwwVar = this.a;
        iwwVar.b.m(new iqc());
        iwwVar.e.a();
    }
}
