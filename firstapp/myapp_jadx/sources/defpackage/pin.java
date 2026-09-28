package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class pin implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        t3w t3wVar = (t3w) obj;
        t3wVar.getClass();
        xh9 xh9Var = new xh9(1);
        rn4.a(new yd2(zn70.e, jq40.a(cwb.class), null, xh9Var, kqp.b, m2g.a), t3wVar);
        for (Map.Entry<String, Function0<mz1>> entry : vij.a.entrySet()) {
            String key = entry.getKey();
            final Function0<mz1> value = entry.getValue();
            eae0 eae0VarB = j1l.b(key);
            Function2 function2 = new Function2() { // from class: hjn
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((qn70) obj2).getClass();
                    ((wrz) obj3).getClass();
                    return (mz1) value.invoke();
                }
            };
            t3wVar.a(new pu90(new yd2(zn70.e, jq40.a(mz1.class), eae0VarB, function2, kqp.a, m2g.a)));
        }
        return Unit.a;
    }
}
