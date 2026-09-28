package defpackage;

import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.UploadImageResponse;

/* JADX INFO: loaded from: classes7.dex */
public final class nf20 extends fte<bi50<UploadImageResponse>> {
    public final /* synthetic */ of20 a;

    public nf20(of20 of20Var) {
        this.a = of20Var;
    }

    @Override // defpackage.zu90
    public final void onError(Throwable th) {
        th.getClass();
        this.a.Q.j(null);
    }

    @Override // defpackage.zu90
    public final void onSuccess(Object obj) {
        bi50<UploadImageResponse> bi50Var = (bi50) obj;
        bi50Var.getClass();
        this.a.Q.j(bi50Var);
    }
}
