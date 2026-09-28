package defpackage;

import android.content.DialogInterface;
import com.sportybet.android.virtual.presentation.activity.MatchEventActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class nxu implements yfo {
    public final /* synthetic */ MatchEventActivity a;

    public nxu(MatchEventActivity matchEventActivity) {
        this.a = matchEventActivity;
    }

    @Override // defpackage.yfo
    public final void a() {
        int i = MatchEventActivity.a0;
        final MatchEventActivity matchEventActivity = this.a;
        if (matchEventActivity.getAccountHelper().getAccount() != null) {
            matchEventActivity.L1("nextRound");
            matchEventActivity.getAccountHelper().logout();
        }
        sqo.j(matchEventActivity, new DialogInterface.OnClickListener() { // from class: mxu
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                matchEventActivity.finish();
            }
        });
    }

    @Override // defpackage.yfo
    public final void b(boolean z) {
        MatchEventActivity matchEventActivity = this.a;
        if (z) {
            ((n4p) matchEventActivity.C1()).h = true;
        }
        int i = MatchEventActivity.a0;
        matchEventActivity.N1();
    }
}
