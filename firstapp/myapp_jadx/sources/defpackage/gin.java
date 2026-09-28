package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class gin implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        t3w t3wVar = (t3w) obj;
        t3wVar.getClass();
        sin sinVar = new sin();
        rn4.a(new yd2(zn70.e, jq40.a(xad0.class), null, sinVar, kqp.b, m2g.a), t3wVar);
        for (Map.Entry<String, Function0<mz1>> entry : vij.a.entrySet()) {
            String key = entry.getKey();
            Function0<mz1> value = entry.getValue();
            eae0 eae0VarB = j1l.b(key);
            gjn gjnVar = new gjn(value);
            t3wVar.a(new pu90(new yd2(zn70.e, jq40.a(mz1.class), eae0VarB, gjnVar, kqp.a, m2g.a)));
        }
        return Unit.a;
    }
}
