package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class pme implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pme(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                jxo jxoVar = (jxo) obj;
                long j = jxoVar.a;
                ((ytw) obj2).setValue(jxoVar);
                break;
            default:
                ((foa0) obj2).c.j(AnalyticsEvent.BI_TRACKING_KIND_ERROR);
                break;
        }
        return Unit.a;
    }
}
