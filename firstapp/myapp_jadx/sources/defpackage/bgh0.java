package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class bgh0<T, B> {
    public abstract void a(B b, int i, int i2);

    public abstract void b(B b, int i, long j);

    public abstract void c(B b, int i, T t);

    public abstract void d(B b, int i, pl5 pl5Var);

    public abstract void e(B b, int i, long j);

    public abstract dgh0 f(Object obj);

    public abstract dgh0 g(Object obj);

    public abstract int h(T t);

    public abstract int i(T t);

    public abstract void j(Object obj);

    public abstract dgh0 k(Object obj, Object obj2);

    public final boolean l(int i, p08 p08Var, Object obj) throws e0p {
        k08 k08Var = p08Var.a;
        int i2 = p08Var.b;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            p08Var.w(0);
            e(obj, i3, k08Var.n());
            return true;
        }
        if (i4 == 1) {
            p08Var.w(1);
            b(obj, i3, k08Var.k());
            return true;
        }
        if (i4 == 2) {
            d(obj, i3, p08Var.e());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw e0p.b();
            }
            p08Var.w(5);
            a(obj, i3, k08Var.j());
            return true;
        }
        dgh0 dgh0VarM = m();
        int i5 = (i3 << 3) | 4;
        int i6 = i + 1;
        if (i6 >= 100) {
            throw new e0p("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (p08Var.a() != Integer.MAX_VALUE && l(i6, p08Var, dgh0VarM)) {
        }
        if (i5 != p08Var.b) {
            throw new e0p("Protocol message end-group tag did not match expected tag.");
        }
        c(obj, i3, p(dgh0VarM));
        return true;
    }

    public abstract dgh0 m();

    public abstract void n(Object obj, B b);

    public abstract void o(Object obj, T t);

    public abstract dgh0 p(Object obj);

    public abstract void q(T t, z7k0 z7k0Var);

    public abstract void r(T t, z7k0 z7k0Var);
}
