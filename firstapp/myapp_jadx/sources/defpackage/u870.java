package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballMarketHandlerImpl$init$9", f = "ScheduledFootballMarketHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class u870 extends tje0 implements Function2<Pair<? extends List<? extends e970>, ? extends Long>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ i870 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u870(i870 i870Var, v1b<? super u870> v1bVar) {
        super(2, v1bVar);
        this.b = i870Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        u870 u870Var = new u870(this.b, v1bVar);
        u870Var.a = obj;
        return u870Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Pair<? extends List<? extends e970>, ? extends Long> pair, v1b<? super Unit> v1bVar) {
        return ((u870) create(pair, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        List<e970> list = (List) pair.a;
        long jLongValue = ((Number) pair.b).longValue();
        i870 i870Var = this.b;
        al70 al70Var = (al70) e1i.b(i870Var.e).a.getValue();
        if (al70Var != null) {
            if (list != null && list.isEmpty()) {
                i870Var.d();
                break;
            }
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i870Var.d();
                    break;
                }
                e970 e970Var = (e970) it.next();
                if (e970Var.a.equals(al70Var.a) && !e970Var.b(jLongValue)) {
                    break;
                }
            }
        }
        ck70 ck70Var = (ck70) e1i.b(i870Var.g).a.getValue();
        if (ck70Var != null) {
            if (list == null || !list.isEmpty()) {
                for (e970 e970Var2 : list) {
                    if (!e970Var2.a.equals(ck70Var.a) || e970Var2.b(jLongValue)) {
                    }
                }
                i870Var.c();
            } else {
                i870Var.c();
            }
        }
        return Unit.a;
    }
}
