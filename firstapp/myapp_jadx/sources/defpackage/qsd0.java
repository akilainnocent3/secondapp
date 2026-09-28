package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class qsd0 implements Function1<rkd0, Unit> {
    public final /* synthetic */ Function1<rkd0, Unit> a;
    public final /* synthetic */ ytw<Boolean> b;

    public qsd0(ytw ytwVar, Function1 function1) {
        this.a = function1;
        this.b = ytwVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(rkd0 rkd0Var) {
        rkd0 rkd0Var2 = rkd0Var;
        rkd0Var2.a.getClass();
        this.b.setValue(Boolean.TRUE);
        this.a.invoke(rkd0Var2);
        return Unit.a;
    }
}
