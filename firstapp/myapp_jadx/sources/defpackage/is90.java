package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class is90 implements Function1<ns90, Unit> {
    public final /* synthetic */ Function1<ss90, Unit> a;

    /* JADX WARN: Multi-variable type inference failed */
    public is90(Function1<? super ss90, Unit> function1) {
        this.a = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ns90 ns90Var) {
        ns90 ns90Var2 = ns90Var;
        ns90Var2.getClass();
        this.a.invoke(new ss90.c.b(ns90Var2));
        return Unit.a;
    }
}
