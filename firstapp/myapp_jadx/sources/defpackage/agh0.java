package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class agh0<T, B> {
    public abstract void a(B b, int i, int i2);

    public abstract void b(B b, int i, long j);

    public abstract void c(B b, int i, T t);

    public abstract void d(B b, int i, ql5 ql5Var);

    public abstract void e(B b, int i, long j);

    public abstract cgh0 f(Object obj);

    public abstract cgh0 g(Object obj);

    public abstract int h(T t);

    public abstract int i(T t);

    public abstract void j(Object obj);

    public abstract cgh0 k(Object obj, Object obj2);

    public final boolean l(Object obj, o08 o08Var) throws f0p {
        m08 m08Var = o08Var.a;
        int i = o08Var.b;
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            o08Var.v(0);
            e(obj, i2, m08Var.p());
            return true;
        }
        if (i3 == 1) {
            o08Var.v(1);
            b(obj, i2, m08Var.m());
            return true;
        }
        if (i3 == 2) {
            d(obj, i2, o08Var.e());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw f0p.c();
            }
            o08Var.v(5);
            a(obj, i2, m08Var.l());
            return true;
        }
        cgh0 cgh0VarM = m();
        int i4 = (i2 << 3) | 4;
        while (o08Var.a() != Integer.MAX_VALUE && l(cgh0VarM, o08Var)) {
        }
        if (i4 != o08Var.b) {
            throw new f0p("Protocol message end-group tag did not match expected tag.");
        }
        c(obj, i2, p(cgh0VarM));
        return true;
    }

    public abstract cgh0 m();

    public abstract void n(Object obj, B b);

    public abstract void o(Object obj, T t);

    public abstract cgh0 p(Object obj);

    public abstract void q(T t, y7k0 y7k0Var);

    public abstract void r(T t, y7k0 y7k0Var);
}
