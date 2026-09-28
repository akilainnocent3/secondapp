package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class hs90 implements Function0<Unit> {
    public final /* synthetic */ Function1<ss90, Unit> a;

    /* JADX WARN: Multi-variable type inference failed */
    public hs90(Function1<? super ss90, Unit> function1) {
        this.a = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.a.invoke(ss90.d.a.a);
        return Unit.a;
    }
}
