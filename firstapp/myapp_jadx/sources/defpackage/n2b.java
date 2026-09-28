package defpackage;

import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class n2b implements Function1<skd0, Unit> {
    public final /* synthetic */ Function1<rn30, Unit> a;

    /* JADX WARN: Multi-variable type inference failed */
    public n2b(Function1<? super rn30, Unit> function1) {
        this.a = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(skd0 skd0Var) {
        BigDecimal bigDecimal = skd0Var.a;
        bigDecimal.getClass();
        this.a.invoke(new rn30.r(bigDecimal));
        return Unit.a;
    }
}
