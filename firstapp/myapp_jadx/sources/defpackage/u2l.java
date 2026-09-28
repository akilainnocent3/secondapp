package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class u2l extends qlr implements Function1<Object, Unit> {
    public final /* synthetic */ tb5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2l(tb5 tb5Var) {
        super(1);
        this.a = tb5Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        if (v2l.b.compareAndSet(false, true)) {
            this.a.c(Unit.a);
        }
        return Unit.a;
    }
}
