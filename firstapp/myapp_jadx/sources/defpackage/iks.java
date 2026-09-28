package defpackage;

import android.view.View;
import com.sportybet.plugin.event.EventActivity;
import com.sportybet.plugin.event.e;
import com.sportybet.plugin.realsports.event.widget.LiveEventControlsHeaderView;
import com.sportybet.plugin.realsports.event.widget.LiveEventHeaderView;
import com.sportybet.plugin.realsports.results.ResultChangeLeaguePanel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class iks implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iks(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = LiveEventControlsHeaderView.f;
                EventActivity eventActivity = ((mkg) obj).a;
                boolean z = !eventActivity.o0;
                eventActivity.o0 = z;
                agd0 agd0Var = eventActivity.R;
                if (agd0Var == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                agd0Var.d.setGamesActivated(z);
                if (eventActivity.o0) {
                    eventActivity.l0 = false;
                    eventActivity.I1();
                    svj svjVar = eventActivity.Q;
                    if (svjVar == null) {
                        Intrinsics.n("gamesLobbyManager");
                        throw null;
                    }
                    String strB = svjVar.b(true);
                    eventActivity.c2(null, false);
                    eventActivity.d2(null, false);
                    eventActivity.Z1(strB, true);
                    e eVar = eventActivity.E0;
                    if (eVar == null) {
                        Intrinsics.n("eventViewModel");
                        throw null;
                    }
                    String str = eVar.F1().matchStatus;
                    eVar.O1(new nqv.a(str != null ? str : "", oqv.LIVE));
                    agd0 agd0Var2 = eventActivity.R;
                    if (agd0Var2 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    agd0Var2.d.setStreamingActivated(false);
                    eventActivity.n0 = false;
                    agd0 agd0Var3 = eventActivity.R;
                    if (agd0Var3 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    agd0Var3.d.setMatchTrackerActivated(false);
                    eventActivity.m0 = false;
                    agd0 agd0Var4 = eventActivity.R;
                    if (agd0Var4 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    agd0Var4.d.setStatsActivated(false);
                    eventActivity.S1();
                } else {
                    eventActivity.Z1(null, false);
                    e eVar2 = eventActivity.E0;
                    if (eVar2 == null) {
                        Intrinsics.n("eventViewModel");
                        throw null;
                    }
                    String str2 = eVar2.F1().matchStatus;
                    eVar2.O1(new nqv.b(str2 != null ? str2 : "", oqv.LIVE));
                }
                LiveEventHeaderView liveEventHeaderView = eventActivity.v0;
                if (liveEventHeaderView == null) {
                    Intrinsics.n("liveEventHeaderView");
                    throw null;
                }
                e eVar3 = eventActivity.E0;
                if (eVar3 == null) {
                    Intrinsics.n("eventViewModel");
                    throw null;
                }
                liveEventHeaderView.b(eVar3.F1(), eventActivity.W);
                agd0 agd0Var5 = eventActivity.R;
                if (agd0Var5 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                LiveEventControlsHeaderView liveEventControlsHeaderView = agd0Var5.d;
                e eVar4 = eventActivity.E0;
                if (eVar4 != null) {
                    liveEventControlsHeaderView.a(eVar4.F1());
                    return;
                } else {
                    Intrinsics.n("eventViewModel");
                    throw null;
                }
            default:
                ((ResultChangeLeaguePanel) obj).c.z1();
                return;
        }
    }
}
