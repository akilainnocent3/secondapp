package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e27 implements Function1 {
    public final /* synthetic */ i27 a;

    public /* synthetic */ e27(i27 i27Var) {
        this.a = i27Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.a.b.setValue((f1s) obj);
        return Unit.a;
    }
}
