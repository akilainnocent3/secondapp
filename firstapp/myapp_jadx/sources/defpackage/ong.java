package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import kotlin.Pair;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes6.dex */
public final class ong {
    public final azm a;

    public ong(azm azmVar) {
        azmVar.getClass();
        this.a = azmVar;
    }

    public final void a(prg prgVar) {
        this.a.f(wae.EVENT_DETAIL, b.k(new Pair(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, prgVar.a), new Pair("eventType", prgVar.l ? "live" : "prematch")));
    }
}
