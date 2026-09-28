package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.Event;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class j5v implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Event event = (Event) obj;
        event.getClass();
        Iterable iterable = event.markets;
        if (iterable == null) {
            iterable = m2g.a;
        }
        return ld80.f(CollectionsKt.K(iterable), new qe8(event, 1));
    }
}
