package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class kfh0 implements Function0<Unit> {
    public final /* synthetic */ Function1<String, Unit> a;
    public final /* synthetic */ gfh0 b;

    /* JADX WARN: Multi-variable type inference failed */
    public kfh0(Function1<? super String, Unit> function1, gfh0 gfh0Var) {
        this.a = function1;
        this.b = gfh0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.a.invoke(this.b.a);
        return Unit.a;
    }
}
