package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class c78 extends qlr implements Function1<j58, lj0> {
    public static final c78 a = new c78(1);

    @Override // kotlin.jvm.functions.Function1
    public final lj0 invoke(j58 j58Var) {
        long jB = j58.b(j58Var.a, x68.x);
        return new lj0(j58.d(jB), j58.h(jB), j58.g(jB), j58.e(jB));
    }
}
