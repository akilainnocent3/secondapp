package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class gtq implements Function0<Unit> {
    public final /* synthetic */ Function1<buq, Unit> a;
    public final /* synthetic */ kwv b;

    /* JADX WARN: Multi-variable type inference failed */
    public gtq(Function1<? super buq, Unit> function1, kwv kwvVar) {
        this.a = function1;
        this.b = kwvVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.a.invoke(new buq.g(this.b.a));
        return Unit.a;
    }
}
