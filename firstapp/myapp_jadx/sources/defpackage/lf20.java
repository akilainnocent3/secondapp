package defpackage;

import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.VoteResponse;

/* JADX INFO: loaded from: classes7.dex */
public final class lf20 extends fte<bi50<VoteResponse>> {
    public final /* synthetic */ of20 a;

    public lf20(of20 of20Var) {
        this.a = of20Var;
    }

    @Override // defpackage.zu90
    public final void onError(Throwable th) {
        th.getClass();
        this.a.S.j(null);
    }

    @Override // defpackage.zu90
    public final void onSuccess(Object obj) {
        bi50<VoteResponse> bi50Var = (bi50) obj;
        bi50Var.getClass();
        this.a.S.j(bi50Var);
    }
}
