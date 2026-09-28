package defpackage;

import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class q2b implements Function1<skd0, Unit> {
    public final /* synthetic */ Function1<z8x, Unit> a;

    /* JADX WARN: Multi-variable type inference failed */
    public q2b(Function1<? super z8x, Unit> function1) {
        this.a = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(skd0 skd0Var) {
        BigDecimal bigDecimal = skd0Var.a;
        bigDecimal.getClass();
        this.a.invoke(new z8x.a(bigDecimal));
        return Unit.a;
    }
}
