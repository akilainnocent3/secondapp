package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import defpackage.m52;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public abstract class m52<T extends m52<T>> implements Cloneable {
    public boolean B;
    public boolean G;
    public Resources.Theme H;
    public boolean I;
    public boolean K;
    public int a;
    public Drawable e;
    public int f;
    public Drawable i;
    public int v;
    public float b = 1.0f;
    public hre c = hre.d;
    public lw20 d = lw20.c;
    public boolean w = true;
    public int y = -1;
    public int z = -1;
    public nlp A = u3g.b;
    public boolean C = true;
    public s2z D = new s2z();
    public fs5 E = new fs5();
    public Class<?> F = Object.class;
    public boolean J = true;

    public static boolean l(int i, int i2) {
        return (i & i2) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T A(nsg0<Bitmap> nsg0Var, boolean z) {
        if (this.I) {
            return (T) clone().A(nsg0Var, z);
        }
        ndf ndfVar = new ndf(nsg0Var, z);
        B(Bitmap.class, nsg0Var, z);
        B(Drawable.class, ndfVar, z);
        B(BitmapDrawable.class, ndfVar, z);
        B(thk.class, new vhk(nsg0Var), z);
        t();
        return this;
    }

    public final <Y> T B(Class<Y> cls, nsg0<Y> nsg0Var, boolean z) {
        if (this.I) {
            return (T) clone().B(cls, nsg0Var, z);
        }
        gm20.b(nsg0Var);
        this.E.put(cls, nsg0Var);
        int i = this.a;
        this.C = true;
        this.a = 67584 | i;
        this.J = false;
        if (z) {
            this.a = i | 198656;
            this.B = true;
        }
        t();
        return this;
    }

    @Deprecated
    public final T C(nsg0<Bitmap>... nsg0VarArr) {
        return (T) A(new slw(nsg0VarArr), true);
    }

    public final m52 D() {
        if (this.I) {
            return clone().D();
        }
        this.K = true;
        this.a |= 1048576;
        t();
        return this;
    }

    public T a(m52<?> m52Var) {
        if (this.I) {
            return (T) clone().a(m52Var);
        }
        if (l(m52Var.a, 2)) {
            this.b = m52Var.b;
        }
        if (l(m52Var.a, 1048576)) {
            this.K = m52Var.K;
        }
        if (l(m52Var.a, 4)) {
            this.c = m52Var.c;
        }
        if (l(m52Var.a, 8)) {
            this.d = m52Var.d;
        }
        if (l(m52Var.a, 16)) {
            this.e = m52Var.e;
            this.f = 0;
            this.a &= -33;
        }
        if (l(m52Var.a, 32)) {
            this.f = m52Var.f;
            this.e = null;
            this.a &= -17;
        }
        if (l(m52Var.a, 64)) {
            this.i = m52Var.i;
            this.v = 0;
            this.a &= -129;
        }
        if (l(m52Var.a, 128)) {
            this.v = m52Var.v;
            this.i = null;
            this.a &= -65;
        }
        if (l(m52Var.a, 256)) {
            this.w = m52Var.w;
        }
        if (l(m52Var.a, 512)) {
            this.z = m52Var.z;
            this.y = m52Var.y;
        }
        if (l(m52Var.a, 1024)) {
            this.A = m52Var.A;
        }
        if (l(m52Var.a, 4096)) {
            this.F = m52Var.F;
        }
        if (l(m52Var.a, 8192)) {
            this.a &= -16385;
        }
        if (l(m52Var.a, Http2.INITIAL_MAX_FRAME_SIZE)) {
            this.a &= -8193;
        }
        if (l(m52Var.a, 32768)) {
            this.H = m52Var.H;
        }
        if (l(m52Var.a, 65536)) {
            this.C = m52Var.C;
        }
        if (l(m52Var.a, 131072)) {
            this.B = m52Var.B;
        }
        if (l(m52Var.a, 2048)) {
            this.E.putAll(m52Var.E);
            this.J = m52Var.J;
        }
        if (!this.C) {
            this.E.clear();
            int i = this.a;
            this.B = false;
            this.a = i & (-133121);
            this.J = true;
        }
        this.a |= m52Var.a;
        this.D.b.h(m52Var.D.b);
        t();
        return this;
    }

    public final void b() {
        if (this.G && !this.I) {
            ib5.a("You cannot auto lock an already locked options object, try clone() first");
        } else {
            this.I = true;
            this.G = true;
        }
    }

    @Override // 
    /* JADX INFO: renamed from: c */
    public T clone() {
        try {
            T t = (T) super.clone();
            s2z s2zVar = new s2z();
            t.D = s2zVar;
            s2zVar.b.h(this.D.b);
            fs5 fs5Var = new fs5();
            t.E = fs5Var;
            fs5Var.putAll(this.E);
            t.G = false;
            t.I = false;
            return t;
        } catch (CloneNotSupportedException e) {
            gqm.a(e);
            return null;
        }
    }

    public final T d(Class<?> cls) {
        if (this.I) {
            return (T) clone().d(cls);
        }
        this.F = cls;
        this.a |= 4096;
        t();
        return this;
    }

    public final T e(hre hreVar) {
        if (this.I) {
            return (T) clone().e(hreVar);
        }
        gm20.c(hreVar, "Argument must not be null");
        this.c = hreVar;
        this.a |= 4;
        t();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof m52) {
            return k((m52) obj);
        }
        return false;
    }

    public final T f() {
        return (T) u(cik.b, Boolean.TRUE);
    }

    public final T g() {
        if (this.I) {
            return (T) clone().g();
        }
        this.E.clear();
        int i = this.a;
        this.B = false;
        this.C = false;
        this.a = (i & (-133121)) | 65536;
        this.J = true;
        t();
        return this;
    }

    public final T h(int i) {
        if (this.I) {
            return (T) clone().h(i);
        }
        this.f = i;
        int i2 = this.a | 32;
        this.e = null;
        this.a = i2 & (-17);
        t();
        return this;
    }

    public int hashCode() {
        return erh0.h(erh0.h(erh0.h(erh0.h(erh0.h(erh0.h(erh0.h(erh0.g(0, erh0.g(0, erh0.g(this.C ? 1 : 0, erh0.g(this.B ? 1 : 0, erh0.g(this.z, erh0.g(this.y, erh0.g(this.w ? 1 : 0, erh0.h(erh0.g(0, erh0.h(erh0.g(this.v, erh0.h(erh0.g(this.f, erh0.g(Float.floatToIntBits(this.b), 17)), this.e)), this.i)), null)))))))), this.c), this.d), this.D), this.E), this.F), this.A), this.H);
    }

    public final T i(Drawable drawable) {
        if (this.I) {
            return (T) clone().i(drawable);
        }
        this.e = drawable;
        int i = this.a | 16;
        this.f = 0;
        this.a = i & (-33);
        t();
        return this;
    }

    public final T j() {
        return (T) s(x6f.a, new nth(), true);
    }

    public final boolean k(m52<?> m52Var) {
        return Float.compare(m52Var.b, this.b) == 0 && this.f == m52Var.f && erh0.b(this.e, m52Var.e) && this.v == m52Var.v && erh0.b(this.i, m52Var.i) && this.w == m52Var.w && this.y == m52Var.y && this.z == m52Var.z && this.B == m52Var.B && this.C == m52Var.C && this.c.equals(m52Var.c) && this.d == m52Var.d && this.D.equals(m52Var.D) && this.E.equals(m52Var.E) && this.F.equals(m52Var.F) && erh0.b(this.A, m52Var.A) && erh0.b(this.H, m52Var.H);
    }

    public final m52 m(x6f x6fVar, xe4 xe4Var) {
        if (this.I) {
            return clone().m(x6fVar, xe4Var);
        }
        h2z h2zVar = x6f.f;
        gm20.c(x6fVar, "Argument must not be null");
        u(h2zVar, x6fVar);
        return A(xe4Var, false);
    }

    public final T n(int i, int i2) {
        if (this.I) {
            return (T) clone().n(i, i2);
        }
        this.z = i;
        this.y = i2;
        this.a |= 512;
        t();
        return this;
    }

    public final T o(int i) {
        if (this.I) {
            return (T) clone().o(i);
        }
        this.v = i;
        int i2 = this.a | 128;
        this.i = null;
        this.a = i2 & (-65);
        t();
        return this;
    }

    public final T p(Drawable drawable) {
        if (this.I) {
            return (T) clone().p(drawable);
        }
        this.i = drawable;
        int i = this.a | 64;
        this.v = 0;
        this.a = i & (-129);
        t();
        return this;
    }

    public final T q(lw20 lw20Var) {
        if (this.I) {
            return (T) clone().q(lw20Var);
        }
        this.d = lw20Var;
        this.a |= 8;
        t();
        return this;
    }

    public final T r(h2z<?> h2zVar) {
        if (this.I) {
            return (T) clone().r(h2zVar);
        }
        this.D.b.remove(h2zVar);
        t();
        return this;
    }

    public final m52 s(x6f x6fVar, xe4 xe4Var, boolean z) {
        m52 m52VarZ = z ? z(x6fVar, xe4Var) : m(x6fVar, xe4Var);
        m52VarZ.J = true;
        return m52VarZ;
    }

    public final void t() {
        if (this.G) {
            ib5.a("You cannot modify locked T, consider clone()");
        }
    }

    public final <Y> T u(h2z<Y> h2zVar, Y y) {
        if (this.I) {
            return (T) clone().u(h2zVar, y);
        }
        gm20.b(h2zVar);
        this.D.b.put(h2zVar, y);
        t();
        return this;
    }

    public final T v(nlp nlpVar) {
        if (this.I) {
            return (T) clone().v(nlpVar);
        }
        this.A = nlpVar;
        this.a |= 1024;
        t();
        return this;
    }

    public final T w(float f) {
        if (this.I) {
            return (T) clone().w(f);
        }
        if (f < 0.0f || f > 1.0f) {
            hb5.a("sizeMultiplier must be between 0 and 1");
            return null;
        }
        this.b = f;
        this.a |= 2;
        t();
        return this;
    }

    public final T x(boolean z) {
        if (this.I) {
            return (T) clone().x(true);
        }
        this.w = !z;
        this.a |= 256;
        t();
        return this;
    }

    public final T y(Resources.Theme theme) {
        if (this.I) {
            return (T) clone().y(theme);
        }
        this.H = theme;
        int i = this.a;
        if (theme != null) {
            this.a = i | 32768;
            return (T) u(yg50.b, theme);
        }
        this.a = (-32769) & i;
        return (T) r(yg50.b);
    }

    public final m52 z(x6f x6fVar, xe4 xe4Var) {
        if (this.I) {
            return clone().z(x6fVar, xe4Var);
        }
        h2z h2zVar = x6f.f;
        gm20.c(x6fVar, "Argument must not be null");
        u(h2zVar, x6fVar);
        return A(xe4Var, true);
    }
}
