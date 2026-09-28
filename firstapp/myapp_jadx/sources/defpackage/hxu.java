package defpackage;

import android.content.DialogInterface;
import com.sportybet.android.instantwin.router.bethistory2.InstantWinBetHistoryInput;
import com.sportybet.android.virtual.presentation.activity.MatchEventActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hxu implements com.sportybet.android.instantwin.presentation.instantwin.view.a.InterfaceC0272a {
    public final /* synthetic */ MatchEventActivity a;

    public static final class a implements yfo {
        public final /* synthetic */ MatchEventActivity a;

        public a(MatchEventActivity matchEventActivity) {
            this.a = matchEventActivity;
        }

        @Override // defpackage.yfo
        public final void b(boolean z) {
            if (z) {
                return;
            }
            int i = MatchEventActivity.a0;
            this.a.N1();
        }
    }

    public hxu(MatchEventActivity matchEventActivity) {
        this.a = matchEventActivity;
    }

    @Override // com.sportybet.android.instantwin.presentation.instantwin.view.a.InterfaceC0272a
    public final void a() {
        int i = MatchEventActivity.a0;
        final MatchEventActivity matchEventActivity = this.a;
        ctg ctgVar = (ctg) matchEventActivity.I1().T.a.getValue();
        if (ctgVar instanceof ctg.a) {
            matchEventActivity.S1("bet_history_event_page");
            if (((ctg.a) ctgVar).a.roundId.length() == 0) {
                sqo.j(matchEventActivity, new DialogInterface.OnClickListener() { // from class: gxu
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        matchEventActivity.finish();
                    }
                });
            } else {
                matchEventActivity.startActivity(matchEventActivity.A1().t(matchEventActivity, new InstantWinBetHistoryInput(((n4p) matchEventActivity.C1()).c())));
            }
        }
    }

    @Override // com.sportybet.android.instantwin.presentation.instantwin.view.a.InterfaceC0272a
    public final void b() {
        MatchEventActivity matchEventActivity = this.a;
        j8o j8oVar = matchEventActivity.Y;
        if (j8oVar == null) {
            Intrinsics.n("instantWinActivityTrackManager");
            throw null;
        }
        if (j8oVar.c()) {
            matchEventActivity.finish();
            return;
        }
        ((x5a0) matchEventActivity.J).setValue(Boolean.TRUE);
    }

    @Override // com.sportybet.android.instantwin.presentation.instantwin.view.a.InterfaceC0272a
    public final void c(boolean z) {
        MatchEventActivity matchEventActivity = this.a;
        matchEventActivity.B1();
        i5s.c(matchEventActivity.getAccountHelper(), matchEventActivity, new a(matchEventActivity), z);
    }
}
