package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dlf0 implements Function0 {
    public final /* synthetic */ hlf0 a;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        tkf0 tkf0Var;
        hlf0 hlf0Var = this.a;
        nk0 nk0Var = hlf0Var.b;
        ukf0 ukf0Var = (ukf0) ((x5a0) hlf0Var.a).getValue();
        return Boolean.valueOf(Intrinsics.g(nk0Var, (ukf0Var == null || (tkf0Var = ukf0Var.a) == null) ? null : tkf0Var.a));
    }
}
