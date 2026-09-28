package defpackage;

import android.os.Looper;
import android.util.SparseBooleanArray;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public interface so10 {

    public static final class a {
        public final iuh a;

        static {
            new SparseBooleanArray();
            ly0.f(!false);
            jrh0.J(0);
        }

        public a(iuh iuhVar) {
            this.a = iuhVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return this.a.equals(((a) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.a.hashCode();
        }
    }

    public static final class b {
        public final iuh a;

        public b(iuh iuhVar) {
            this.a = iuhVar;
        }

        public final boolean a(int... iArr) {
            for (int i : iArr) {
                if (this.a.a.get(i)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.a.equals(((b) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.a.hashCode();
        }
    }

    public static final class d {
        public final Object a;
        public final int b;
        public final njv c;
        public final Object d;
        public final int e;
        public final long f;
        public final long g;
        public final int h;
        public final int i;

        static {
            jf.a(0, 1, 2, 3, 4);
            jrh0.J(5);
            jrh0.J(6);
        }

        public d(Object obj, int i, njv njvVar, Object obj2, int i2, long j, long j2, int i3, int i4) {
            this.a = obj;
            this.b = i;
            this.c = njvVar;
            this.d = obj2;
            this.e = i2;
            this.f = j;
            this.g = j2;
            this.h = i3;
            this.i = i4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.b == dVar.b && this.e == dVar.e && this.f == dVar.f && this.g == dVar.g && this.h == dVar.h && this.i == dVar.i && Objects.equals(this.c, dVar.c) && Objects.equals(this.a, dVar.a) && Objects.equals(this.d, dVar.d)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(this.a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i));
        }

        public final String toString() {
            String str = "mediaItem=" + this.b + ", period=" + this.e + ", pos=" + this.f;
            int i = this.h;
            if (i == -1) {
                return str;
            }
            StringBuilder sbB = mq0.b(str, ", contentPos=");
            to10.a(sbB, this.g, ", adGroup=", i);
            sbB.append(", ad=");
            sbB.append(this.i);
            return sbB.toString();
        }
    }

    void A(int i, long j);

    boolean B();

    void C(boolean z);

    void D(c cVar);

    long E();

    int F();

    void G(TextureView textureView);

    v5i0 H();

    int I();

    void K(long j);

    void L(float f);

    long N();

    long O();

    int P();

    boolean Q();

    void S(njv njvVar);

    void T();

    int U();

    void V(int i);

    void W(c cVar);

    void X(SurfaceView surfaceView);

    int Y();

    boolean Z();

    void a();

    long a0();

    rwg b();

    void b0();

    eo10 c();

    void c0();

    void d();

    qjv d0();

    void e(eo10 eo10Var);

    long e0();

    void f(float f);

    long f0();

    boolean g();

    long h();

    void i();

    void j();

    void k(SurfaceView surfaceView);

    void l(rjg0 rjg0Var);

    void m();

    void n(boolean z);

    void o();

    bkg0 p();

    boolean q();

    o4c r();

    int s();

    boolean t(int i);

    int u();

    qxf0 v();

    Looper w();

    rjg0 x();

    void y();

    void z(TextureView textureView);

    public interface c {
        default void C() {
        }

        default void A(int i) {
        }

        default void D(boolean z) {
        }

        @Deprecated
        default void F(List<j4c> list) {
        }

        default void H(uov uovVar) {
        }

        default void N(r21 r21Var) {
        }

        default void O(rjg0 rjg0Var) {
        }

        default void P(boolean z) {
        }

        default void R(float f) {
        }

        default void V(o4c o4cVar) {
        }

        default void X(bkg0 bkg0Var) {
        }

        default void Y(bo10 bo10Var) {
        }

        default void a(v5i0 v5i0Var) {
        }

        default void a0(qjv qjvVar) {
        }

        default void c0(int i) {
        }

        default void f0(eo10 eo10Var) {
        }

        default void g0(a aVar) {
        }

        default void i(bo10 bo10Var) {
        }

        default void j0(boolean z) {
        }

        default void l(int i) {
        }

        default void p(int i) {
        }

        default void q(int i) {
        }

        default void u(boolean z) {
        }

        default void I(androidx.media3.exoplayer.d dVar, b bVar) {
        }

        default void J(njv njvVar, int i) {
        }

        default void K(int i, int i2) {
        }

        default void Q(int i, boolean z) {
        }

        @Deprecated
        default void d0(int i, boolean z) {
        }

        default void z(int i, d dVar, d dVar2) {
        }
    }
}
