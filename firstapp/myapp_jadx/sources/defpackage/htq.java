package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class htq implements Function1<wae, Unit> {
    public final /* synthetic */ Function1<buq, Unit> a;
    public final /* synthetic */ kwv b;

    /* JADX WARN: Multi-variable type inference failed */
    public htq(Function1<? super buq, Unit> function1, kwv kwvVar) {
        this.a = function1;
        this.b = kwvVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(wae waeVar) {
        waeVar.getClass();
        this.a.invoke(new buq.a(this.b.a));
        return Unit.a;
    }
}
