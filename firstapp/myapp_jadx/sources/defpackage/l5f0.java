package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public interface l5f0 extends svh {
    @Override // defpackage.svh
    default Object a(tp70 tp70Var, float f, v1b<? super Float> v1bVar) {
        return b(tp70Var, f, m5f0.a, (x1b) v1bVar);
    }

    Object b(tp70 tp70Var, float f, Function1 function1, x1b x1bVar);
}
