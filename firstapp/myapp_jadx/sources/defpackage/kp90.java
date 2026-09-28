package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class kp90 implements Function0<Unit> {
    public final /* synthetic */ Function1<String, Unit> a;
    public final /* synthetic */ mp90 b;

    public kp90(mp90 mp90Var, Function1 function1) {
        this.a = function1;
        this.b = mp90Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Function1<String, Unit> function1 = this.a;
        if (function1 != null) {
            function1.invoke(this.b.a);
        }
        return Unit.a;
    }
}
