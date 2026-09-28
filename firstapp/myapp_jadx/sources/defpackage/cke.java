package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class cke implements Function0<Unit> {
    public final /* synthetic */ Function1<fp20, Unit> a;
    public final /* synthetic */ fp20 b;

    /* JADX WARN: Multi-variable type inference failed */
    public cke(Function1<? super fp20, Unit> function1, fp20 fp20Var) {
        this.a = function1;
        this.b = fp20Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.a.invoke(this.b);
        return Unit.a;
    }
}
