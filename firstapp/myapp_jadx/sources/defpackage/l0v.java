package defpackage;

import com.sportybet.android.virtual.presentation.activity.MatchEventDetailActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class l0v extends cny {
    public final /* synthetic */ MatchEventDetailActivity d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0v(MatchEventDetailActivity matchEventDetailActivity) {
        super(true);
        this.d = matchEventDetailActivity;
    }

    @Override // defpackage.cny
    public final void b() {
        int i = MatchEventDetailActivity.U;
        MatchEventDetailActivity matchEventDetailActivity = this.d;
        if (matchEventDetailActivity.L1()) {
            matchEventDetailActivity.Z1(new bzu(matchEventDetailActivity));
        } else {
            matchEventDetailActivity.G1(2);
        }
    }
}
