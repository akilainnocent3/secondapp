package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class yka0 implements Function1 {
    public final /* synthetic */ goa0 a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.a.c.j(AnalyticsEvent.BI_TRACKING_KIND_ERROR);
        return Unit.a;
    }
}
