package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class k9l implements Function0<Unit> {
    public final /* synthetic */ Function1<String, Unit> a;
    public final /* synthetic */ i8l b;

    /* JADX WARN: Multi-variable type inference failed */
    public k9l(Function1<? super String, Unit> function1, i8l i8lVar) {
        this.a = function1;
        this.b = i8lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.a.invoke(this.b.a);
        return Unit.a;
    }
}
