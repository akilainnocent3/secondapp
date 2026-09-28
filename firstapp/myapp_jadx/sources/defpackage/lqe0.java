package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface lqe0 {
    kqe0 a(int i, String str);

    default void b(ivj0 ivj0Var) {
        ivj0Var.getClass();
        f(ivj0Var.b, ivj0Var.a);
    }

    ArrayList c();

    default kqe0 d(ivj0 ivj0Var) {
        ivj0Var.getClass();
        return a(ivj0Var.b, ivj0Var.a);
    }

    void e(kqe0 kqe0Var);

    void f(int i, String str);

    void g(String str);
}
