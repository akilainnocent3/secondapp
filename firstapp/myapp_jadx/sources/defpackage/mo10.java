package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class mo10 implements y4i0.b {
    public static final xid s = new xid();
    public final Context a;
    public final f b;
    public final SparseArray<c> c;
    public final boolean d;
    public final djd e;
    public final vs7 f;
    public final CopyOnWriteArraySet<d> g;
    public pxf0<g> h = new pxf0<>();
    public final androidx.media3.common.a i;
    public cdl j;
    public s4i0 k;
    public Pair<Surface, vw90> l;
    public int m;
    public int n;
    public long o;
    public boolean p;
    public int q;
    public int r;

    public static final class a {
        public final Context a;
        public final u4i0 b;
        public f c;
        public boolean d;
        public vs7 e = vs7.a;
        public boolean f;

        public a(Context context, u4i0 u4i0Var) {
            this.a = context.getApplicationContext();
            this.b = u4i0Var;
        }
    }

    public final class b implements u5i0.a {
        public b() {
        }

        @Override // u5i0.a
        public final void a(v5i0 v5i0Var) {
            Iterator<d> it = mo10.this.g.iterator();
            while (it.hasNext()) {
                it.next().a(v5i0Var);
            }
        }

        @Override // u5i0.a
        public final void c() {
            Iterator<d> it = mo10.this.g.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
        }

        @Override // u5i0.a
        public final void g() {
            Iterator<d> it = mo10.this.g.iterator();
            while (it.hasNext()) {
                it.next().g();
            }
        }
    }

    public final class c implements u5i0, d {
        public final int a;
        public pcn<Object> b;
        public androidx.media3.common.a c;
        public long d;
        public long e;
        public u5i0.a f;
        public Executor g;
        public boolean h;

        public c(Context context) {
            this.a = jrh0.L(context) ? 1 : 5;
            pcn.b bVar = pcn.b;
            this.b = c150.e;
            this.e = -9223372036854775807L;
            this.f = u5i0.a.a;
            this.g = mo10.s;
        }

        @Override // mo10.d
        public final void a(final v5i0 v5i0Var) {
            final u5i0.a aVar = this.f;
            this.g.execute(new Runnable() { // from class: po10
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.a(v5i0Var);
                }
            });
        }

        @Override // defpackage.u5i0
        public final boolean b() {
            if (!this.h) {
                return false;
            }
            mo10 mo10Var = mo10.this;
            return mo10Var.m == 0 && mo10Var.p && mo10Var.e.b();
        }

        @Override // mo10.d
        public final void c() {
            final u5i0.a aVar = this.f;
            this.g.execute(new Runnable() { // from class: oo10
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.c();
                }
            });
        }

        @Override // defpackage.u5i0
        public final void d() {
            if (this.h) {
                mo10.this.a(false);
                throw null;
            }
        }

        @Override // defpackage.u5i0
        public final Surface e() {
            ly0.f(this.h);
            throw null;
        }

        @Override // defpackage.u5i0
        public final void f(float f) {
            mo10.this.e.f(f);
        }

        @Override // mo10.d
        public final void g() {
            final u5i0.a aVar = this.f;
            this.g.execute(new Runnable() { // from class: no10
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.g();
                }
            });
        }

        @Override // defpackage.u5i0
        public final void h(long j, long j2) throws u5i0.c {
            mo10.this.e.h(j + this.d, j2);
        }

        @Override // defpackage.u5i0
        public final void i(long j) {
            this.d = j;
        }

        @Override // defpackage.u5i0
        public final boolean isInitialized() {
            return this.h;
        }

        @Override // defpackage.u5i0
        public final void j() {
            long j = this.e;
            mo10 mo10Var = mo10.this;
            if (mo10Var.o >= j) {
                mo10Var.e.j();
                mo10Var.p = true;
            }
        }

        @Override // defpackage.u5i0
        public final void k(kjv kjvVar) {
            this.f = kjvVar;
            this.g = lqe.a;
        }

        @Override // defpackage.u5i0
        public final void l(androidx.media3.common.a aVar, long j, int i, List list) {
            ly0.f(this.h);
            this.b = pcn.j(list);
            this.c = aVar;
            mo10 mo10Var = mo10.this;
            mo10Var.p = false;
            z(aVar);
            long j2 = this.e;
            boolean z = j2 == -9223372036854775807L;
            if (mo10Var.d || z) {
                long j3 = z ? -4611686018427387904L : j2 + 1;
                mo10Var.h.a(new g(i, j + this.d, j3), j3);
            }
        }

        @Override // defpackage.u5i0
        public final void m(List<Object> list) {
            if (this.b.equals(list)) {
                return;
            }
            this.b = pcn.j(list);
            androidx.media3.common.a aVar = this.c;
            if (aVar != null) {
                z(aVar);
            }
        }

        @Override // defpackage.u5i0
        public final boolean n(boolean z) {
            boolean z2 = false;
            boolean z3 = z && this.h;
            mo10 mo10Var = mo10.this;
            djd djdVar = mo10Var.e;
            if (z3 && mo10Var.m == 0) {
                z2 = true;
            }
            return djdVar.a.b(z2);
        }

        @Override // defpackage.u5i0
        public final void o(Surface surface, vw90 vw90Var) {
            mo10 mo10Var = mo10.this;
            Pair<Surface, vw90> pair = mo10Var.l;
            if (pair != null && ((Surface) pair.first).equals(surface) && ((vw90) mo10Var.l.second).equals(vw90Var)) {
                return;
            }
            mo10Var.l = Pair.create(surface, vw90Var);
            mo10Var.b(surface, vw90Var.a, vw90Var.b);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x005c  */
        /* JADX WARN: Code duplicated, block: B:28:0x005f A[Catch: a -> 0x0040, TryCatch #0 {a -> 0x0040, blocks: (B:14:0x0030, B:17:0x0038, B:25:0x0046, B:28:0x005f, B:30:0x0063, B:37:0x0076, B:39:0x007c, B:35:0x006e), top: B:45:0x0030 }] */
        /* JADX WARN: Code duplicated, block: B:30:0x0063 A[Catch: a -> 0x0040, TryCatch #0 {a -> 0x0040, blocks: (B:14:0x0030, B:17:0x0038, B:25:0x0046, B:28:0x005f, B:30:0x0063, B:37:0x0076, B:39:0x007c, B:35:0x006e), top: B:45:0x0030 }] */
        /* JADX WARN: Code duplicated, block: B:33:0x006a  */
        /* JADX WARN: Code duplicated, block: B:34:0x006c A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:35:0x006e A[Catch: a -> 0x0040, TryCatch #0 {a -> 0x0040, blocks: (B:14:0x0030, B:17:0x0038, B:25:0x0046, B:28:0x005f, B:30:0x0063, B:37:0x0076, B:39:0x007c, B:35:0x006e), top: B:45:0x0030 }] */
        /* JADX WARN: Code duplicated, block: B:37:0x0076 A[Catch: a -> 0x0040, TryCatch #0 {a -> 0x0040, blocks: (B:14:0x0030, B:17:0x0038, B:25:0x0046, B:28:0x005f, B:30:0x0063, B:37:0x0076, B:39:0x007c, B:35:0x006e), top: B:45:0x0030 }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v1, types: [ko10] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // defpackage.u5i0
        public final boolean p(androidx.media3.common.a aVar) throws u5i0.c {
            boolean zE = true;
            ly0.f(!this.h);
            mo10 mo10Var = mo10.this;
            ly0.f(mo10Var.n == 0);
            n58 n58Var = aVar.D;
            if (n58Var == null || !n58Var.d()) {
                n58Var = n58.h;
            }
            int i = n58Var.c;
            if (i == 7) {
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 34) {
                        if (i == 6) {
                            if (Build.VERSION.SDK_INT >= 33 || !qzk.e("EGL_EXT_gl_colorspace_bt2020_pq")) {
                                zE = false;
                            }
                        } else if (i == 7) {
                            zE = qzk.e("EGL_EXT_gl_colorspace_bt2020_hlg");
                        }
                        if (!zE && Build.VERSION.SDK_INT >= 29) {
                            Locale locale = Locale.US;
                            cft.g("PlaybackVidGraphWrapper", "Color transfer " + i + " is not supported. Falling back to OpenGl tone mapping.");
                            n58Var = n58.h;
                        }
                    } else {
                        if (i2 >= 33 && qzk.e("EGL_EXT_gl_colorspace_bt2020_pq")) {
                            n58Var = new n58(n58Var.a, n58Var.b, 6, n58Var.e, n58Var.f, n58Var.d);
                        } else {
                            if (i == 6) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    zE = false;
                                } else {
                                    zE = false;
                                }
                            } else if (i == 7) {
                                zE = qzk.e("EGL_EXT_gl_colorspace_bt2020_hlg");
                            }
                            if (!zE) {
                                Locale locale2 = Locale.US;
                                cft.g("PlaybackVidGraphWrapper", "Color transfer " + i + " is not supported. Falling back to OpenGl tone mapping.");
                                n58Var = n58.h;
                            }
                        }
                    }
                } catch (qzk.a e) {
                    throw new u5i0.c(e, aVar);
                }
            } else {
                if (i == 6) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        zE = false;
                    } else {
                        zE = false;
                    }
                } else if (i == 7) {
                    zE = qzk.e("EGL_EXT_gl_colorspace_bt2020_hlg");
                }
                if (!zE) {
                    Locale locale3 = Locale.US;
                    cft.g("PlaybackVidGraphWrapper", "Color transfer " + i + " is not supported. Falling back to OpenGl tone mapping.");
                    n58Var = n58.h;
                }
            }
            vs7 vs7Var = mo10Var.f;
            Looper looperMyLooper = Looper.myLooper();
            ly0.g(looperMyLooper);
            y4i0 y4i0Var = null;
            final jqe0 jqe0VarC = vs7Var.c(looperMyLooper, null);
            mo10Var.j = jqe0VarC;
            mo10Var.b.a(mo10Var.a, n58Var, mo10Var, new Executor() { // from class: ko10
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    jqe0VarC.i(runnable);
                }
            });
            y4i0Var.h();
            throw null;
        }

        @Override // defpackage.u5i0
        public final void q() {
            mo10 mo10Var = mo10.this;
            djd djdVar = mo10Var.e;
            if (mo10Var.h.h() == 0) {
                djdVar.q();
                return;
            }
            pxf0<g> pxf0Var = new pxf0<>();
            boolean z = true;
            while (mo10Var.h.h() > 0) {
                g gVarE = mo10Var.h.e();
                gVarE.getClass();
                if (z) {
                    int i = gVarE.b;
                    if (i == 0 || i == 1) {
                        gVarE = new g(0, gVarE.a, gVarE.c);
                    } else {
                        djdVar.q();
                    }
                    z = false;
                }
                pxf0Var.a(gVarE, gVarE.c);
            }
            mo10Var.h = pxf0Var;
        }

        @Override // defpackage.u5i0
        public final void r() {
            mo10 mo10Var = mo10.this;
            if (mo10Var.d) {
                mo10Var.e.r();
            }
        }

        @Override // defpackage.u5i0
        public final void release() {
            mo10 mo10Var = mo10.this;
            if (mo10Var.n == 2) {
                return;
            }
            cdl cdlVar = mo10Var.j;
            if (cdlVar != null) {
                cdlVar.d();
            }
            mo10Var.l = null;
            mo10Var.n = 2;
        }

        @Override // defpackage.u5i0
        public final void s() {
            mo10 mo10Var = mo10.this;
            if (mo10Var.d) {
                mo10Var.e.s();
            }
        }

        @Override // defpackage.u5i0
        public final void t(int i) {
            mo10.this.e.t(i);
        }

        @Override // defpackage.u5i0
        public final void u() {
            vw90 vw90Var = vw90.c;
            int i = vw90Var.a;
            int i2 = vw90Var.b;
            mo10 mo10Var = mo10.this;
            mo10Var.b(null, i, i2);
            mo10Var.l = null;
        }

        @Override // defpackage.u5i0
        public final boolean v(long j, ljv.a aVar) {
            ly0.f(this.h);
            mo10 mo10Var = mo10.this;
            int i = mo10Var.q;
            if (i == -1 || i != mo10Var.r) {
                return false;
            }
            throw null;
        }

        @Override // defpackage.u5i0
        public final void w(boolean z) {
            if (this.h) {
                throw null;
            }
            this.e = -9223372036854775807L;
            mo10.this.a(z);
        }

        @Override // defpackage.u5i0
        public final void x(boolean z) {
            mo10 mo10Var = mo10.this;
            if (mo10Var.d) {
                mo10Var.e.x(z);
            }
        }

        @Override // defpackage.u5i0
        public final void y(s4i0 s4i0Var) {
            mo10 mo10Var = mo10.this;
            mo10Var.k = s4i0Var;
            mo10Var.e.i = s4i0Var;
        }

        public final void z(androidx.media3.common.a aVar) {
            androidx.media3.common.a.C0062a c0062aA = aVar.a();
            n58 n58Var = aVar.D;
            if (n58Var == null || !n58Var.d()) {
                n58Var = n58.h;
            }
            c0062aA.C = n58Var;
            new androidx.media3.common.a(c0062aA);
            throw null;
        }
    }

    public static final class e implements t4i0.b {
        public static final mfe0<Class<?>> a = nfe0.a(new qo10());
    }

    public static final class f implements y4i0.a {
        public final e a = new e();

        @Override // y4i0.a
        public final y4i0 a(Context context, n58 n58Var, y4i0.b bVar, ko10 ko10Var) {
            try {
                return ((y4i0.a) Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(t4i0.b.class).newInstance(this.a)).a(context, n58Var, bVar, ko10Var);
            } catch (Exception e) {
                dad.a(e);
                return null;
            }
        }
    }

    public static final class g {
        public final long a;
        public final int b;
        public final long c;

        public g(int i, long j, long j2) {
            this.a = j;
            this.b = i;
            this.c = j2;
        }
    }

    public mo10(a aVar) {
        this.a = aVar.a;
        f fVar = aVar.c;
        ly0.g(fVar);
        this.b = fVar;
        this.c = new SparseArray<>();
        pcn.b bVar = pcn.b;
        c150 c150Var = c150.e;
        this.d = aVar.d;
        vs7 vs7Var = aVar.e;
        this.f = vs7Var;
        this.e = new djd(aVar.b, vs7Var);
        this.g = new CopyOnWriteArraySet<>();
        this.i = new androidx.media3.common.a(new androidx.media3.common.a.C0062a());
        this.o = -9223372036854775807L;
        this.q = -1;
        this.n = 0;
    }

    public final void a(boolean z) {
        pxf0<g> pxf0Var;
        if (this.n == 1) {
            this.m++;
            djd djdVar = this.e;
            djdVar.w(z);
            while (true) {
                int iH = this.h.h();
                pxf0Var = this.h;
                if (iH <= 1) {
                    break;
                } else {
                    pxf0Var.e();
                }
            }
            if (pxf0Var.h() == 1) {
                g gVarE = this.h.e();
                gVarE.getClass();
                long j = gVarE.a;
                int i = gVarE.b;
                pcn.b bVar = pcn.b;
                djdVar.l(this.i, j, i, c150.e);
            }
            this.o = -9223372036854775807L;
            this.p = false;
            cdl cdlVar = this.j;
            ly0.g(cdlVar);
            cdlVar.i(new Runnable() { // from class: jo10
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.m--;
                }
            });
        }
    }

    public interface d {
        default void c() {
        }

        default void g() {
        }

        default void a(v5i0 v5i0Var) {
        }
    }

    public final void b(Surface surface, int i, int i2) {
    }
}
