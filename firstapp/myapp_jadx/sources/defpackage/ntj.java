package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ntj implements Function1 {
    public final /* synthetic */ fuj a;
    public final /* synthetic */ long b;

    public /* synthetic */ ntj(fuj fujVar, long j) {
        this.a = fujVar;
        this.b = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        fuj fujVar = this.a;
        LinkedHashMap linkedHashMap = fujVar.y;
        linkedHashMap.put(Long.valueOf(this.b), AnalyticsEvent.BI_TRACKING_KIND_ERROR);
        fujVar.z.j(new HashMap<>(linkedHashMap));
        return Unit.a;
    }
}
