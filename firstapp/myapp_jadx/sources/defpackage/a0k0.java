package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.realsports.data.Event;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a0k0 extends saj implements Function1<Event, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Event event) {
        Event event2 = event;
        event2.getClass();
        t0k0 t0k0Var = (t0k0) this.receiver;
        t0k0Var.getClass();
        t0k0Var.i.j(wae.EVENT_DETAIL, b.k(new Pair("sportId", event2.sport.id), new Pair(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, event2.eventId), new Pair("eventType", event2.status == 0 ? "prematch" : "live")), vj5.a(new Pair("EXTRA_EVENT", apg.f(event2))));
        return Unit.a;
    }
}
