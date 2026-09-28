package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class oqj0 implements Function0 {
    public final /* synthetic */ xqj0 a;
    public final /* synthetic */ xoj0 b;

    public /* synthetic */ oqj0(xqj0 xqj0Var, xoj0 xoj0Var) {
        this.a = xqj0Var;
        this.b = xoj0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        vtw<kqj0> vtwVar = this.a.p;
        if (vtwVar != null) {
            vtwVar.a(new kqj0.c(((xoj0.d.p) this.b).b));
            return Unit.a;
        }
        Intrinsics.n("withdrawUiEventFlow");
        throw null;
    }
}
