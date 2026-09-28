package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class iac0 implements Function1<Throwable, Unit> {
    public final /* synthetic */ su5<Object> a;

    public iac0(su5<Object> su5Var) {
        this.a = su5Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        this.a.cancel();
        return Unit.a;
    }
}
