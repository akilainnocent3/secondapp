package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class uis extends qlr implements Function1<Throwable, Unit> {
    public final /* synthetic */ qis a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uis(qis qisVar) {
        super(1);
        this.a = qisVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        this.a.cancel(false);
        return Unit.a;
    }
}
