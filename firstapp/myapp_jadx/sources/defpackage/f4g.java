package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public interface f4g {
    void C(int i);

    void E(String str);

    fma c(pd80 pd80Var);

    y3l d();

    void e(double d);

    void g(byte b);

    f4g h(pd80 pd80Var);

    void m(pd80 pd80Var, int i);

    void p(long j);

    default fma s(pd80 pd80Var, int i) {
        pd80Var.getClass();
        return c(pd80Var);
    }

    void t();

    void u(short s);

    void v(boolean z);

    void w(float f);

    /* JADX WARN: Multi-variable type inference failed */
    default <T> void x(he80<? super T> he80Var, T t) {
        he80Var.getClass();
        he80Var.serialize(this, t);
    }

    void y(char c);

    default void z() {
    }
}
