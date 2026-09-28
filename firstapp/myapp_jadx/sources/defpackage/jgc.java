package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class jgc implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        f1e0 f1e0Var = (f1e0) obj;
        f1e0Var.getClass();
        return Boolean.valueOf(Intrinsics.g(f1e0Var.a, "CONNECTED"));
    }
}
