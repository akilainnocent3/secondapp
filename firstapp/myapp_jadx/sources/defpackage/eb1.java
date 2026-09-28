package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.autobet.AutoBetViewModel$isPageLoading$1", f = "AutoBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class eb1 extends tje0 implements gaj<twb, t91, v1b<? super Boolean>, Object> {
    public /* synthetic */ twb a;
    public /* synthetic */ t91 b;

    @Override // defpackage.gaj
    public final Object invoke(twb twbVar, t91 t91Var, v1b<? super Boolean> v1bVar) {
        eb1 eb1Var = new eb1(3, v1bVar);
        eb1Var.a = twbVar;
        eb1Var.b = t91Var;
        return eb1Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z;
        List<i91> list;
        twb twbVar = this.a;
        t91 t91Var = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z2 = (twbVar instanceof twb.a) && ((twb.a) twbVar).p == uxs.LOADING;
        boolean z3 = (twbVar instanceof twb.f) && ((twb.f) twbVar).i == uxs.LOADING;
        if ((t91Var instanceof t91.e) && ((list = ((t91.e) t91Var).e) == null || !list.isEmpty())) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (((i91) it.next()).o) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        return Boolean.valueOf(z2 || z3 || z);
    }
}
