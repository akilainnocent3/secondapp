package defpackage;

import com.sportybet.android.virtual.presentation.activity.MatchEventDetailActivity;

/* JADX INFO: loaded from: classes.dex */
public final class txb implements yfo {
    public final Object a;

    public /* synthetic */ txb(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.yfo
    public void a() {
        MatchEventDetailActivity matchEventDetailActivity = (MatchEventDetailActivity) this.a;
        int i = MatchEventDetailActivity.U;
        matchEventDetailActivity.K1();
    }

    @Override // defpackage.yfo
    public void b(boolean z) {
        MatchEventDetailActivity matchEventDetailActivity = (MatchEventDetailActivity) this.a;
        if (!z) {
            int i = MatchEventDetailActivity.U;
            matchEventDetailActivity.G1(0);
        } else if (((n4p) matchEventDetailActivity.C1()).d.size() > 0) {
            matchEventDetailActivity.startActivity(matchEventDetailActivity.A1().i(matchEventDetailActivity, matchEventDetailActivity.H));
        } else {
            sqo.n(matchEventDetailActivity);
        }
    }
}
