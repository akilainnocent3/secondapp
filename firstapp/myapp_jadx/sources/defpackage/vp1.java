package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public interface vp1 extends mmd {
    default Object E0(long j, Function2 function2, pz1 pz1Var) {
        return function2.invoke(this, pz1Var);
    }

    default Object G1(long j, v4f0 v4f0Var, v1b v1bVar) {
        return v4f0Var.invoke(this, v1bVar);
    }

    b020 U0();

    long a();

    z6i0 getViewConfiguration();

    Object l1(c020 c020Var, v1b<? super b020> v1bVar);

    default long s0() {
        return 0L;
    }
}
