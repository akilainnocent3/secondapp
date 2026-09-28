package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b7k0 extends saj implements Function2<String, Boolean, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Boolean bool) {
        String str2 = str;
        boolean zBooleanValue = bool.booleanValue();
        str2.getClass();
        f7k0 f7k0Var = (f7k0) this.receiver;
        f7k0Var.getClass();
        f7k0Var.i.f(wae.EVENT_DETAIL, b.k(new Pair(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, str2), new Pair("eventType", zBooleanValue ? "live" : "prematch")));
        v6k0 v6k0Var = f7k0Var.v;
        v6k0Var.getClass();
        v6k0Var.a.a(new rw2(str2), k00.d);
        return Unit.a;
    }
}
