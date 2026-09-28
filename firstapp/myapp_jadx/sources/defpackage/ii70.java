package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballSelectionHandlerImpl$init$5", f = "ScheduledFootballSelectionHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ii70 extends tje0 implements gaj<List<? extends bi70>, Long, v1b<? super Boolean>, Object> {
    public /* synthetic */ List a;
    public /* synthetic */ long b;

    @Override // defpackage.gaj
    public final Object invoke(List<? extends bi70> list, Long l, v1b<? super Boolean> v1bVar) {
        long jLongValue = l.longValue();
        ii70 ii70Var = new ii70(3, v1bVar);
        ii70Var.a = list;
        ii70Var.b = jLongValue;
        return ii70Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        List list = this.a;
        long j = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = false;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((bi70) it.next()).c.a(j)) {
                    z = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
