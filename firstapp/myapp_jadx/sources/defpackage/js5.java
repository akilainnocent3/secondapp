package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class js5 extends qlr implements Function1<Throwable, Unit> {
    public final /* synthetic */ ls5<Object> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public js5(ls5<Object> ls5Var) {
        super(1);
        this.a = ls5Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        this.a.b.a(null);
        return Unit.a;
    }
}
