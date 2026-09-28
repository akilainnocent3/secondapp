package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ldi implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((String) obj).getClass();
                break;
            default:
                t3w t3wVar = (t3w) obj;
                t3wVar.getClass();
                for (Map.Entry<String, Function0<mz1>> entry : vij.a.entrySet()) {
                    String key = entry.getKey();
                    final Function0<mz1> value = entry.getValue();
                    eae0 eae0VarB = j1l.b(key);
                    Function2 function2 = new Function2() { // from class: zin
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            ((qn70) obj2).getClass();
                            ((wrz) obj3).getClass();
                            return (mz1) value.invoke();
                        }
                    };
                    t3wVar.a(new pu90(new yd2(zn70.e, jq40.a(mz1.class), eae0VarB, function2, kqp.a, m2g.a)));
                }
                eae0 eae0Var = new eae0("Sporty Hero");
                ejn ejnVar = new ejn();
                eae0 eae0Var2 = zn70.e;
                kqp kqpVar = kqp.a;
                m2g m2gVar = m2g.a;
                t3wVar.a(new pu90(new yd2(eae0Var2, jq40.a(mz1.class), eae0Var, ejnVar, kqpVar, m2gVar)));
                rn4.a(new yd2(eae0Var2, jq40.a(k6c0.class), null, new fj(), kqp.b, m2gVar), t3wVar);
                break;
        }
        return Unit.a;
    }
}
