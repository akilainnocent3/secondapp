package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.event.EventActivity;
import com.sportybet.plugin.event.e;
import com.sportybet.plugin.realsports.data.Sport;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xkg extends saj implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EventActivity eventActivity = (EventActivity) this.receiver;
        int i = EventActivity.U0;
        e eVar = eventActivity.E0;
        if (eVar == null) {
            Intrinsics.n("eventViewModel");
            throw null;
        }
        if (eVar.J1()) {
            rdd0 rdd0Var = eVar.F;
            Pair pair = new Pair(AnalyticsParam.EVENT_PARAM_EVENT_ID, eVar.Q);
            Sport sport = eVar.F1().sport;
            String str = sport != null ? sport.name : null;
            if (str == null) {
                str = "";
            }
            rdd0Var.a(new wjg0(AnalyticsEvent.EVENT_DETAIL_STV_LIVESTREAM_FTD_BLOCK_CLICK, kpu.d(pair, new Pair(AnalyticsParam.SPORT_TYPE, str))), k00.d);
        }
        azm azmVar = eventActivity.d;
        if (azmVar != null) {
            azmVar.d(wae.DEPOSIT);
            return Unit.a;
        }
        Intrinsics.n("router");
        throw null;
    }
}
