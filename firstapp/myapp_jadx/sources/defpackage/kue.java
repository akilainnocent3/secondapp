package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class kue implements Function0<Unit> {
    public final /* synthetic */ Function1<wae, Unit> a;
    public final /* synthetic */ zte b;

    /* JADX WARN: Multi-variable type inference failed */
    public kue(Function1<? super wae, Unit> function1, zte zteVar) {
        this.a = function1;
        this.b = zteVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.a.invoke(this.b.b);
        return Unit.a;
    }
}
