package defpackage;

import android.os.Bundle;
import com.appsflyer.internal.m;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.event.EventActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class lkg {
    public final /* synthetic */ EventActivity a;

    public lkg(EventActivity eventActivity) {
        this.a = eventActivity;
    }

    public final void a() {
        EventActivity eventActivity = this.a;
        b1z b1zVar = eventActivity.P;
        if (b1zVar == null) {
            Intrinsics.n("openBetsEventTrackingManager");
            throw null;
        }
        b1zVar.n(b1z.b.LiveEventPage);
        b1z b1zVar2 = eventActivity.P;
        if (b1zVar2 == null) {
            Intrinsics.n("openBetsEventTrackingManager");
            throw null;
        }
        b1zVar2.k();
        Bundle bundle = new Bundle();
        bundle.putString("open_bets_entry_point", AnalyticsParam.DATA_LIVE_EVENT_PAGE);
        sh8.c().c(o7d.a(wae.OPEN_BETS), bundle);
    }

    public final void b(String str, String str2, String str3) {
        m.a(str, str2, str3);
        EventActivity eventActivity = this.a;
        b6d b6dVar = eventActivity.b;
        if (b6dVar != null) {
            b6dVar.a(eventActivity, str, str2, str3, AnalyticsParam.EVENT_SOURCE_EVENT_DETAILS);
        } else {
            Intrinsics.n("dedicatedTeamPageLauncher");
            throw null;
        }
    }
}
