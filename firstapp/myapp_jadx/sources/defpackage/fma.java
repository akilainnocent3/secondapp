package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public interface fma {
    void A(int i, int i2, pd80 pd80Var);

    void B(wv20 wv20Var, int i, char c);

    <T> void D(pd80 pd80Var, int i, he80<? super T> he80Var, T t);

    default boolean a(pd80 pd80Var) {
        pd80Var.getClass();
        return true;
    }

    void b(pd80 pd80Var);

    void f(pd80 pd80Var, int i, long j);

    void i(pd80 pd80Var, int i, boolean z);

    void j(pd80 pd80Var, int i, double d);

    void k(wv20 wv20Var, int i, byte b);

    void l(wv20 wv20Var, int i, float f);

    void n(wv20 wv20Var, int i, short s);

    void o(pd80 pd80Var, int i, String str);

    <T> void q(pd80 pd80Var, int i, he80<? super T> he80Var, T t);

    f4g r(wv20 wv20Var, int i);
}
