package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rwq implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        qcn<rvq> qcnVar;
        wwq wwqVar = (wwq) obj;
        wwqVar.getClass();
        String name = wwqVar.getClass().getName();
        Boolean boolValueOf = null;
        if (!(wwqVar instanceof wwq.c)) {
            wwqVar = null;
        }
        wwq.c cVar = (wwq.c) wwqVar;
        if (cVar != null && (qcnVar = cVar.d) != null) {
            boolValueOf = Boolean.valueOf(qcnVar.isEmpty());
        }
        return name + "_" + boolValueOf;
    }
}
