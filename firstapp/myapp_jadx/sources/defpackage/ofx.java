package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ofx implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ ofx(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return new bs1(dv60.a((cyb) obj));
            case 1:
                pb80 pb80Var = (pb80) obj;
                pb80Var.getClass();
                mb80.a(pb80Var);
                return Unit.a;
            default:
                t3w t3wVar = (t3w) obj;
                t3wVar.getClass();
                aci0 aci0Var = new aci0();
                eae0 eae0Var = zn70.e;
                kqp kqpVar = kqp.b;
                m2g m2gVar = m2g.a;
                t3wVar.a(new u7h(new yd2(eae0Var, jq40.a(zbi0.class), null, aci0Var, kqpVar, m2gVar)));
                t3wVar.a(new pu90(new yd2(eae0Var, jq40.a(k52.class), null, new bci0(), kqp.a, m2gVar)));
                t3wVar.a(new u7h(new yd2(eae0Var, jq40.a(f0n.class), null, new cci0(), kqpVar, m2gVar)));
                t3wVar.a(new u7h(new yd2(eae0Var, jq40.a(zai0.class), null, new dci0(), kqpVar, m2gVar)));
                rn4.a(new yd2(eae0Var, jq40.a(lei0.class), null, new eci0(), kqpVar, m2gVar), t3wVar);
                return Unit.a;
        }
    }
}
