package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballSessionDataHandlerImpl$init$10", f = "ScheduledFootballSessionDataHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class fj70 extends tje0 implements Function2<Map<String, ? extends v470>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ pj70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj70(v1b v1bVar, pj70 pj70Var) {
        super(2, v1bVar);
        this.b = pj70Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        fj70 fj70Var = new fj70(v1bVar, this.b);
        fj70Var.a = obj;
        return fj70Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Map<String, ? extends v470> map, v1b<? super Unit> v1bVar) {
        return ((fj70) create(map, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        ArrayList arrayList;
        Map map = (Map) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        knh knhVarD = ld80.d(CollectionsKt.K(map.values()), oj70.a);
        qi70 qi70Var = new qi70();
        jd80 jd80Var = jd80.a;
        ysg0 ysg0Var = new ysg0(ld80.d(new ruh(new ruh(knhVarD, qi70Var, jd80Var), new sjb(1), jd80Var), new x9g(1)), new ri70(0));
        wwd0 wwd0Var = this.b.m;
        do {
            value = wwd0Var.getValue();
            qcn qcnVar = (qcn) value;
            qcnVar.getClass();
            arrayList = new ArrayList(qcnVar.size() + 10);
            arrayList.addAll(qcnVar);
            Iterator it = ysg0Var.iterator();
            while (true) {
                ysg0.a aVar = (ysg0.a) it;
                if (!aVar.hasNext()) {
                    break;
                }
                arrayList.add(aVar.next());
            }
        } while (!wwd0Var.g(value, a4h.b(CollectionsKt.q0(CollectionsKt.A0(CollectionsKt.D0(arrayList))))));
        return Unit.a;
    }
}
