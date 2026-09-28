package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ga1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ga1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Boolean) obj).getClass();
                ((Function1) obj3).invoke(new vc60.b(!((r760) obj2).b.b));
                break;
            default:
                fuj fujVar = (fuj) obj3;
                fujVar.v.put(Long.valueOf(((Long) obj2).longValue()), AnalyticsEvent.BI_TRACKING_KIND_ERROR);
                fujVar.w.j(new HashMap<>(fujVar.v));
                break;
        }
        return Unit.a;
    }
}
