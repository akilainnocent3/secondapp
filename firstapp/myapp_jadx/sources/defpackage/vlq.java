package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.Event;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vlq implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ vlq(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Integer.valueOf(-((Integer) obj).intValue());
            default:
                Event event = (Event) obj;
                Iterable iterable = event.markets;
                if (iterable == null) {
                    iterable = m2g.a;
                }
                return ld80.f(CollectionsKt.K(iterable), new n63(event, 1));
        }
    }
}
