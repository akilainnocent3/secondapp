package defpackage;

import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.PostCommentResponse;

/* JADX INFO: loaded from: classes7.dex */
public final class ye20 extends fte<bi50<PostCommentResponse>> {
    public final /* synthetic */ of20 a;

    public ye20(of20 of20Var) {
        this.a = of20Var;
    }

    @Override // defpackage.zu90
    public final void onError(Throwable th) {
        th.getClass();
        this.a.G.j(null);
    }

    @Override // defpackage.zu90
    public final void onSuccess(Object obj) {
        bi50<PostCommentResponse> bi50Var = (bi50) obj;
        bi50Var.getClass();
        boolean isSuccessful = bi50Var.a.getIsSuccessful();
        of20 of20Var = this.a;
        if (!isSuccessful || bi50Var.b == null) {
            of20Var.G.j(null);
        } else {
            of20Var.G.j(bi50Var);
        }
    }
}
