package defpackage;

import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public interface bxz {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final /* synthetic */ a[] b;

        static {
            a aVar = new a("CounterClockwise", 0);
            a = aVar;
            b = new a[]{aVar, new a("Clockwise", 1)};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) b.clone();
        }
    }

    static /* synthetic */ void o(bxz bxzVar, lk40 lk40Var) {
        a aVar = a.a;
        bxzVar.p(lk40Var);
    }

    static void r(j90 j90Var, bxz bxzVar) {
        Path path = j90Var.a;
        if (bxzVar instanceof j90) {
            path.addPath(((j90) bxzVar).a, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
        } else {
            zkh.a("Unable to obtain android.graphics.Path");
        }
    }

    static /* synthetic */ void s(bxz bxzVar, lz50 lz50Var) {
        a aVar = a.a;
        bxzVar.l(lz50Var);
    }

    void a(float f, float f2);

    void b(float f, float f2, float f3, float f4, float f5, float f6);

    void c(float f, float f2);

    void close();

    void d(float f, float f2);

    void e(float f, float f2, float f3, float f4, float f5, float f6);

    @fae
    void f(float f, float f2, float f3, float f4);

    @fae
    void g(float f, float f2, float f3, float f4);

    lk40 getBounds();

    void h(int i);

    default void i(float f, float f2, float f3, float f4) {
        f(f, f2, f3, f4);
    }

    default void j() {
        reset();
    }

    void k(long j);

    void l(lz50 lz50Var);

    default void m(float f, float f2, float f3, float f4) {
        g(f, f2, f3, f4);
    }

    void n(lk40 lk40Var, a aVar);

    void p(lk40 lk40Var);

    int q();

    void reset();

    void t(float f, float f2);
}
