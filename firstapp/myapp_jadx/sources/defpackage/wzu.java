package defpackage;

import android.content.DialogInterface;
import com.sportybet.android.virtual.presentation.activity.MatchEventDetailActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class wzu implements com.sportybet.android.instantwin.presentation.instantwin.view.a.InterfaceC0272a {
    public final /* synthetic */ MatchEventDetailActivity a;

    public static final class a implements yfo {
        public final /* synthetic */ MatchEventDetailActivity a;

        public a(MatchEventDetailActivity matchEventDetailActivity) {
            this.a = matchEventDetailActivity;
        }

        @Override // defpackage.yfo
        public final void a() {
            int i = MatchEventDetailActivity.U;
            this.a.K1();
        }

        @Override // defpackage.yfo
        public final void b(final boolean z) {
            int i = MatchEventDetailActivity.U;
            final MatchEventDetailActivity matchEventDetailActivity = this.a;
            if (matchEventDetailActivity.L1()) {
                matchEventDetailActivity.Z1(new DialogInterface.OnClickListener() { // from class: vzu
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        dialogInterface.getClass();
                        dialogInterface.dismiss();
                        int i3 = MatchEventDetailActivity.U;
                        MatchEventDetailActivity matchEventDetailActivity2 = matchEventDetailActivity;
                        matchEventDetailActivity2.I1().A1();
                        matchEventDetailActivity2.Q1(z);
                    }
                });
            } else {
                matchEventDetailActivity.Q1(z);
            }
        }
    }

    public wzu(MatchEventDetailActivity matchEventDetailActivity) {
        this.a = matchEventDetailActivity;
    }

    @Override // com.sportybet.android.instantwin.presentation.instantwin.view.a.InterfaceC0272a
    public final void a() {
        MatchEventDetailActivity matchEventDetailActivity = this.a;
        matchEventDetailActivity.B1();
        i5s.b(matchEventDetailActivity.getAccountHelper(), matchEventDetailActivity, new a(matchEventDetailActivity));
        matchEventDetailActivity.V1("bet_history_event_page");
    }

    @Override // com.sportybet.android.instantwin.presentation.instantwin.view.a.InterfaceC0272a
    public final void b() {
        int i = MatchEventDetailActivity.U;
        MatchEventDetailActivity matchEventDetailActivity = this.a;
        if (matchEventDetailActivity.L1()) {
            matchEventDetailActivity.Z1(new bzu(matchEventDetailActivity));
        } else {
            matchEventDetailActivity.G1(2);
        }
    }

    @Override // com.sportybet.android.instantwin.presentation.instantwin.view.a.InterfaceC0272a
    public final void c(boolean z) {
        final MatchEventDetailActivity matchEventDetailActivity = this.a;
        matchEventDetailActivity.B1();
        i5s.c(matchEventDetailActivity.getAccountHelper(), matchEventDetailActivity, new yfo() { // from class: uzu
            @Override // defpackage.yfo
            public final void b(boolean z2) {
                if (z2) {
                    return;
                }
                int i = MatchEventDetailActivity.U;
                matchEventDetailActivity.G1(0);
            }
        }, z);
    }
}
