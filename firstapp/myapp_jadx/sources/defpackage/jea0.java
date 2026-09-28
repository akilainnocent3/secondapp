package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jea0 extends saj implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((rea0) this.receiver).i.d(AnalyticsEvent.SOCIAL_SEARCH_FRIENDS_CLICKED);
        return Unit.a;
    }
}
