package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class pf4 extends qlr implements Function0<Unit> {
    public final /* synthetic */ qf4 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf4(qf4 qf4Var) {
        super(0);
        this.a = qf4Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        qf4 qf4Var = this.a;
        qf4Var.I.invoke(qf4Var);
        return Unit.a;
    }
}
