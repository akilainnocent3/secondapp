package defpackage;

import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.VoteResponse;

/* JADX INFO: loaded from: classes7.dex */
public final class hf20 extends fte<bi50<VoteResponse>> {
    public final /* synthetic */ of20 a;

    public hf20(of20 of20Var) {
        this.a = of20Var;
    }

    @Override // defpackage.zu90
    public final void onError(Throwable th) {
        th.getClass();
        this.a.K.j(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zu90
    public final void onSuccess(Object obj) {
        Object bVar;
        bi50 bi50Var = (bi50) obj;
        bi50Var.getClass();
        boolean isSuccessful = bi50Var.a.getIsSuccessful();
        of20 of20Var = this.a;
        if (!isSuccessful) {
            of20Var.K.j(null);
            return;
        }
        try {
            zi50.a aVar = zi50.b;
            VoteResponse voteResponse = (VoteResponse) bi50Var.b;
            bVar = voteResponse != null ? new soi0(voteResponse.getVoteSources(), voteResponse.getEndDate(), voteResponse.getEventId(), voteResponse.getStatus(), voteResponse.getVoteCount()) : null;
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        of20Var.K.j((soi0) (bVar instanceof zi50.b ? null : bVar));
    }
}
