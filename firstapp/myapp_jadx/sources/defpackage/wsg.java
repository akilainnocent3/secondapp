package defpackage;

import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.event.c;
import com.sportybet.plugin.realsports.data.Event;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wsg implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Iterable iterable;
        c cVar = (c) obj;
        m1g0 m1g0Var = (m1g0) obj2;
        cVar.getClass();
        m1g0Var.getClass();
        l1g0 l1g0Var = m1g0Var.a;
        if (l1g0Var == null || (iterable = l1g0Var.d) == null) {
            iterable = m2g.a;
        }
        List listR0 = m1g0Var.c == epa0.a ? CollectionsKt.r0(iterable, new xsg()) : CollectionsKt.r0(iterable, new ysg());
        Event event = cVar.e.a;
        return (event == null || listR0.isEmpty()) ? new ba20.b(R.string.live__empty3) : new ba20.a(event, listR0);
    }
}
