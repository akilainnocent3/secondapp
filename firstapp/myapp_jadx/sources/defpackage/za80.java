package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class za80 extends qlr implements Function1<pb80, Unit> {
    public final /* synthetic */ su50 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za80(su50 su50Var) {
        super(1);
        this.a = su50Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(pb80 pb80Var) {
        lb80.h(pb80Var, this.a.a);
        return Unit.a;
    }
}
