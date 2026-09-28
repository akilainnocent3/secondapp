package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public interface ekv {

    public interface c {
        void a(h32 h32Var, qxf0 qxf0Var);
    }

    void a(Handler handler, mkv mkvVar);

    void b(mkv mkvVar);

    zjv c(b bVar, tf tfVar, long j);

    void d(mef mefVar);

    njv e();

    void f(c cVar);

    void h(c cVar);

    void i(Handler handler, mef mefVar);

    void j(c cVar, mrg0 mrg0Var, sp10 sp10Var);

    void k(c cVar);

    void l();

    default boolean m() {
        return true;
    }

    default qxf0 n() {
        return null;
    }

    void o(zjv zjvVar);

    public static final class b {
        public final Object a;
        public final int b;
        public final int c;
        public final long d;
        public final int e;

        public b(Object obj, int i, int i2, long j, int i3) {
            this.a = obj;
            this.b = i;
            this.c = i2;
            this.d = j;
            this.e = i3;
        }

        public final b a(Object obj) {
            if (this.a.equals(obj)) {
                return this;
            }
            return new b(obj, this.b, this.c, this.d, this.e);
        }

        public final boolean b() {
            return this.b != -1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e;
        }

        public final int hashCode() {
            return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
        }

        public b(Object obj, long j) {
            this(obj, -1, -1, j, -1);
        }

        public b(Object obj, int i, long j) {
            this(obj, -1, -1, j, i);
        }

        public b(Object obj) {
            this(obj, -1L);
        }
    }

    public interface a {
        ekv b(njv njvVar);

        @Deprecated
        default void a() {
        }

        default void d() {
        }

        default void c(ugd ugdVar) {
        }
    }

    default void g(njv njvVar) {
    }
}
