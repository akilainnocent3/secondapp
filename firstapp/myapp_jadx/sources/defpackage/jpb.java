package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class jpb implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws wjd {
        qn70 qn70Var = (qn70) obj;
        wrz wrzVar = (wrz) obj2;
        qn70Var.getClass();
        wrzVar.getClass();
        Object objA = wrzVar.a(jq40.a(List.class));
        if (objA == null) {
            throw new wjd("No value found for type '" + zgp.a(jq40.a(List.class)) + '\'');
        }
        List list = (List) objA;
        Object objA2 = wrzVar.a(jq40.a(t530.class));
        if (objA2 == null) {
            throw new wjd("No value found for type '" + zgp.a(jq40.a(t530.class)) + '\'');
        }
        t530 t530Var = (t530) objA2;
        Object objA3 = wrzVar.a(jq40.a(loa0.class));
        if (objA3 != null) {
            return new goj(list, t530Var, (loa0) objA3, (ts6) qn70Var.a(jq40.a(ts6.class), null, null), (qd3) qn70Var.a(jq40.a(qd3.class), null, null), (ly50) qn70Var.a(jq40.a(ly50.class), null, null), (os6) qn70Var.a(jq40.a(os6.class), null, null));
        }
        throw new wjd("No value found for type '" + zgp.a(jq40.a(loa0.class)) + '\'');
    }
}
