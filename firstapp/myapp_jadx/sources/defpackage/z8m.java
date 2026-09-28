package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class z8m extends qlr implements Function2<x8m.a, x8m.a, Unit> {
    public final /* synthetic */ qai0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8m(qai0 qai0Var) {
        super(2);
        this.a = qai0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(x8m.a aVar, x8m.a aVar2) {
        x8m.a aVar3 = aVar;
        x8m.a aVar4 = aVar2;
        aVar3.getClass();
        aVar4.getClass();
        qai0 qai0Var = aVar3.a;
        kxs kxsVar = kxs.b;
        qai0 qai0Var2 = this.a;
        if (k2h.d(qai0Var2, qai0Var, kxsVar)) {
            aVar3.a = qai0Var2;
            aVar3.b.a(qai0Var2);
        }
        if (k2h.d(qai0Var2, aVar4.a, kxs.c)) {
            aVar4.a = qai0Var2;
            aVar4.b.a(qai0Var2);
        }
        return Unit.a;
    }
}
