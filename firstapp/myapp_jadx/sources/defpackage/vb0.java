package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vb0 implements Function0 {
    public final /* synthetic */ dq40 a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ vb0(dq40 dq40Var, Function0 function0) {
        this.a = dq40Var;
        this.b = function0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.a = this.b.invoke();
        return Unit.a;
    }
}
