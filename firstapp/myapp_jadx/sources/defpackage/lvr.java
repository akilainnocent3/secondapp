package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public interface lvr {
    static /* synthetic */ void g(lvr lvrVar, int i, Function1 function1, op8 op8Var, int i2) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        lvrVar.c(i, function1, kvr.a, op8Var);
    }

    void a(cdj cdjVar, op8 op8Var);

    void c(int i, Function1 function1, Function1 function2, op8 op8Var);
}
