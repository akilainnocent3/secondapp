package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class ngz implements Function0<Unit> {
    public final /* synthetic */ Function1<String, Unit> a;
    public final /* synthetic */ ahh b;

    /* JADX WARN: Multi-variable type inference failed */
    public ngz(Function1<? super String, Unit> function1, ahh ahhVar) {
        this.a = function1;
        this.b = ahhVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.a.invoke(this.b.a);
        return Unit.a;
    }
}
