package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class dke implements Function0<Unit> {
    public final /* synthetic */ Function1<zo20, Unit> a;
    public final /* synthetic */ zo20 b;

    /* JADX WARN: Multi-variable type inference failed */
    public dke(Function1<? super zo20, Unit> function1, zo20 zo20Var) {
        this.a = function1;
        this.b = zo20Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.a.invoke(this.b);
        return Unit.a;
    }
}
