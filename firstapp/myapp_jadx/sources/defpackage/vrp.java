package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class vrp implements Function1<Throwable, Unit> {
    public final /* synthetic */ su5<Object> a;

    public vrp(su5<Object> su5Var) {
        this.a = su5Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        this.a.cancel();
        return Unit.a;
    }
}
