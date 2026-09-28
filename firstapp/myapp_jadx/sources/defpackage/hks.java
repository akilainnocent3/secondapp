package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.appsflyer.internal.u;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.core.injection.opentelemetry.PageMeta;
import com.sportybet.plugin.event.EventActivity;
import com.sportybet.plugin.event.e;
import com.sportybet.plugin.realsports.event.widget.LiveEventControlsHeaderView;
import com.sportybet.plugin.realsports.event.widget.LiveEventHeaderView;
import com.sportybet.plugin.realsports.results.ResultChangeLeaguePanel;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class hks implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hks(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        boolean z = false;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = LiveEventControlsHeaderView.f;
                EventActivity eventActivity = ((mkg) obj).a;
                if (eventActivity.l0) {
                    agd0 agd0Var = eventActivity.R;
                    if (agd0Var == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    agd0Var.d.setStreamingActivated(false);
                    eventActivity.I1();
                } else {
                    iym iymVarF1 = eventActivity.F1();
                    e eVar = eventActivity.E0;
                    if (eVar == null) {
                        Intrinsics.n("eventViewModel");
                        throw null;
                    }
                    Map<String, ? extends Object> mapA = u.a(AnalyticsParam.EVENT_PARAM_EVENT_ID, eVar.Q);
                    PageMeta.INSTANCE.getClass();
                    iymVarF1.c(AnalyticsEvent.EVENT_DETAIL_STV_CLICK, mapA, PageMeta.Companion.a());
                    e eVar2 = eventActivity.E0;
                    if (eVar2 == null) {
                        Intrinsics.n("eventViewModel");
                        throw null;
                    }
                    eVar2.N1();
                    z = true;
                }
                eventActivity.l0 = z;
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
                agd0 agd0Var2 = eventActivity.R;
                if (agd0Var2 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                LiveEventControlsHeaderView liveEventControlsHeaderView = agd0Var2.d;
                e eVar4 = eventActivity.E0;
                if (eVar4 != null) {
                    liveEventControlsHeaderView.a(eVar4.F1());
                    return;
                } else {
                    Intrinsics.n("eventViewModel");
                    throw null;
                }
            default:
                ResultChangeLeaguePanel resultChangeLeaguePanel = (ResultChangeLeaguePanel) obj;
                wj50 wj50Var = resultChangeLeaguePanel.z;
                if (wj50Var == null) {
                    Intrinsics.n("recyclerAdapter");
                    throw null;
                }
                Context context = wj50Var.d;
                wj50Var.j(true);
                z680 z680Var = wj50Var.c;
                if (z680Var != null) {
                    z680Var.a = "sr:sport:1";
                    z680Var.b = wj50Var.e;
                    z680Var.c = null;
                    z680Var.d = sn5.b(context, R.string.live_result__all_countries, new Object[0]);
                    z680 z680Var2 = wj50Var.c;
                    z680Var2.e = null;
                    z680Var2.f = sn5.b(context, R.string.live_result__all_leagues, new Object[0]);
                    ej50 ej50Var = wj50Var.b;
                    if (ej50Var != null) {
                        z680 z680Var3 = wj50Var.c;
                        ResultChangeLeaguePanel resultChangeLeaguePanel2 = ej50Var.a;
                        int i3 = ResultChangeLeaguePanel.E;
                        z680Var3.getClass();
                        resultChangeLeaguePanel2.post(new gj50(resultChangeLeaguePanel2, z680Var3));
                        resultChangeLeaguePanel2.C = (z680) z680Var3.clone();
                    }
                }
                TextView textView = resultChangeLeaguePanel.y;
                if (textView != null) {
                    textView.setEnabled(true);
                    return;
                } else {
                    Intrinsics.n("resetBtn");
                    throw null;
                }
        }
    }
}
