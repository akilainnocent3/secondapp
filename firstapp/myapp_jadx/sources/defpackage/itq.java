package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class itq implements Function0<Unit> {
    public final /* synthetic */ Function1<buq, Unit> a;

    /* JADX WARN: Multi-variable type inference failed */
    public itq(Function1<? super buq, Unit> function1) {
        this.a = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.a.invoke(buq.d.a);
        return Unit.a;
    }
}
