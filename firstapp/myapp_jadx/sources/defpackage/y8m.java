package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class y8m extends qlr implements Function2<x8m.a, x8m.a, Unit> {
    public final /* synthetic */ kxs a;
    public final /* synthetic */ qai0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8m(kxs kxsVar, qai0 qai0Var) {
        super(2);
        this.a = kxsVar;
        this.b = qai0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(x8m.a aVar, x8m.a aVar2) {
        x8m.a aVar3 = aVar;
        x8m.a aVar4 = aVar2;
        aVar3.getClass();
        aVar4.getClass();
        kxs kxsVar = this.a;
        kxs kxsVar2 = kxs.b;
        qai0 qai0Var = this.b;
        if (kxsVar == kxsVar2) {
            aVar3.a = qai0Var;
            if (qai0Var != null) {
                aVar3.b.a(qai0Var);
            }
        } else {
            aVar4.a = qai0Var;
            if (qai0Var != null) {
                aVar4.b.a(qai0Var);
            }
        }
        return Unit.a;
    }
}
