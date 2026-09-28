package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class fni0 implements Function0<Unit> {
    public final /* synthetic */ Function1<Integer, Unit> a;
    public final /* synthetic */ kwv b;

    /* JADX WARN: Multi-variable type inference failed */
    public fni0(Function1<? super Integer, Unit> function1, kwv kwvVar) {
        this.a = function1;
        this.b = kwvVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.a.invoke(Integer.valueOf(this.b.a));
        return Unit.a;
    }
}
