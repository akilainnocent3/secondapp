package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class oe10 implements Function1 {
    public final /* synthetic */ List a;
    public final /* synthetic */ qe10 b;

    public /* synthetic */ oe10(List list, qe10 qe10Var) {
        this.a = list;
        this.b = qe10Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        sb00 sb00Var = (sb00) obj;
        sb00Var.getClass();
        List list = this.a;
        if (list.isEmpty()) {
            return new sb00(0);
        }
        jb00 jb00Var = jb00.a;
        qe10 qe10Var = this.b;
        int i = qe10Var.i;
        ebk.a aVar = qe10Var.g;
        if (aVar == null) {
            Intrinsics.n("pendingDepositsResult");
            throw null;
        }
        if (i >= aVar.b) {
            jb00Var = null;
        }
        return new sb00(sb00Var.a, sb00Var.b, list, jb00Var);
    }
}
