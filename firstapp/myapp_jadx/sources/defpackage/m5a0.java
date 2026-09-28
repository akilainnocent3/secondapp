package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m5a0 implements Function1 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ m5a0(Function1 function1) {
        this.a = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        c5a0 c5a0Var = (c5a0) this.a.invoke((i5a0) obj);
        synchronized (n5a0.c) {
            n5a0.d = n5a0.d.f(c5a0Var.g());
            Unit unit = Unit.a;
        }
        return c5a0Var;
    }
}
