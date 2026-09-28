package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public interface fv0<N> {
    default void a(Object obj, Function2 function2) {
        function2.invoke(b(), obj);
    }

    N b();

    void c(int i, int i2, int i3);

    void clear();

    void d(int i, int i2);

    void e(int i, N n);

    void g(int i, N n);

    void h(N n);

    default void i() {
        N nB = b();
        uga ugaVar = nB instanceof uga ? (uga) nB : null;
        if (ugaVar != null) {
            ugaVar.l();
        }
    }

    void j();

    default void f() {
    }
}
