package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ne10 implements Function1 {
    public final /* synthetic */ qe10 a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ ne10(qe10 qe10Var, boolean z) {
        this.a = qe10Var;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((sb00) obj).getClass();
        qe10 qe10Var = this.a;
        ebk.a aVar = qe10Var.g;
        if (aVar == null) {
            Intrinsics.n("pendingDepositsResult");
            throw null;
        }
        Integer numValueOf = Integer.valueOf(aVar.b);
        List<ib00> list = qe10Var.h;
        jb00 jb00Var = this.b ? jb00.a : null;
        list.getClass();
        return new sb00(true, numValueOf, list, jb00Var);
    }
}
