package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.ImageReader;
import android.util.Size;
import androidx.camera.core.e;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class x7n extends pnh0 {
    public static final c r = new c();

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public static final class b implements x9n.a<b>, snh0.b<x7n, y7n, b> {
        public final ftw a;

        public b(ftw ftwVar) {
            this.a = ftwVar;
            wg1 wg1Var = h5f0.w;
            Class cls = (Class) ftwVar.b(wg1Var, null);
            if (cls != null && !cls.equals(x7n.class)) {
                nrh0.a(this, "Invalid target class configuration for ", ": ", cls);
                throw null;
            }
            ftwVar.Y(snh0.I, tnh0.b.c);
            ftwVar.Y(wg1Var, x7n.class);
            wg1 wg1Var2 = h5f0.v;
            if (ftwVar.b(wg1Var2, null) == null) {
                ftwVar.Y(wg1Var2, x7n.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
        }

        @Override // defpackage.v1h
        public final csw a() {
            return this.a;
        }

        @Override // x9n.a
        public final b b(int i) {
            this.a.Y(x9n.l, Integer.valueOf(i));
            return this;
        }

        @Override // x9n.a
        @Deprecated
        public final b c(Size size) {
            this.a.Y(x9n.o, size);
            return this;
        }

        @Override // snh0.b
        public final snh0 d() {
            return new y7n(w2z.U(this.a));
        }
    }

    public static final class c {
        public static final y7n a;

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
        static {
            Size size = new Size(640, 480);
            Size size2 = kx90.b;
            yf50 yf50Var = new yf50();
            yf50Var.a = size2;
            yf50Var.b = 1;
            xf50 xf50Var = new xf50(jy0.a, yf50Var);
            ftw ftwVarV = ftw.V();
            new b(ftwVarV);
            ftwVarV.Y(x9n.p, size);
            ftwVarV.Y(snh0.C, 1);
            ftwVarV.Y(x9n.k, 0);
            ftwVarV.Y(x9n.s, xf50Var);
            dhf dhfVar = dhf.d;
            if (!dhfVar.equals(dhfVar)) {
                zkh.a("ImageAnalysis currently only supports SDR");
            } else {
                ftwVarV.Y(d9n.j, dhfVar);
                a = new y7n(w2z.U(ftwVarV));
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    @Override // defpackage.pnh0
    public final void A() {
        kpf0.a();
        throw null;
    }

    @Override // defpackage.pnh0
    public final void B(Matrix matrix) {
        super.B(matrix);
        throw null;
    }

    @Override // defpackage.pnh0
    public final void C(Rect rect) {
        this.k = rect;
        throw null;
    }

    @Override // defpackage.pnh0
    public final snh0<?> f(boolean z, tnh0 tnh0Var) {
        r.getClass();
        y7n y7nVar = c.a;
        hoa hoaVarA = tnh0Var.a(y7nVar.P(), 1);
        if (z) {
            hoaVarA = hoa.N(hoaVarA, y7nVar);
        }
        if (hoaVarA == null) {
            return null;
        }
        return new y7n(w2z.U(((b) m(hoaVarA)).a));
    }

    @Override // defpackage.pnh0
    public final snh0.b<?, ?, ?> m(hoa hoaVar) {
        return new b(ftw.W(hoaVar));
    }

    public final String toString() {
        return "ImageAnalysis:".concat(g());
    }

    @Override // defpackage.pnh0
    public final snh0<?> v(m26 m26Var, snh0.b<?, ?, ?> bVar) {
        throw null;
    }

    @Override // defpackage.pnh0
    public final xk1 y(hoa hoaVar) {
        throw null;
    }

    @Override // defpackage.pnh0
    public final k8e0 z(k8e0 k8e0Var, k8e0 k8e0Var2) {
        nkl nklVar;
        pgt.a("ImageAnalysis", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + k8e0Var + ", secondaryStreamSpec " + k8e0Var2);
        y7n y7nVar = (y7n) this.h;
        e();
        kpf0.a();
        Size sizeF = k8e0Var.f();
        if (nkl.b != null) {
            nklVar = nkl.b;
        } else {
            synchronized (nkl.class) {
                try {
                    if (nkl.b == null) {
                        nkl.b = new nkl();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            nklVar = nkl.b;
        }
        ((Executor) y7nVar.b(pof0.x, nklVar)).getClass();
        int iIntValue = ((Integer) ((y7n) this.h).b(y7n.O, 0)).intValue() == 1 ? ((Integer) ((y7n) this.h).b(y7n.P, 6)).intValue() : 4;
        wg1 wg1Var = y7n.Q;
        if (((kan) y7nVar.b(wg1Var, null)) == null) {
            new e(new z70(ImageReader.newInstance(sizeF.getWidth(), sizeF.getHeight(), this.h.m(), iIntValue)));
            throw null;
        }
        kan kanVar = (kan) y7nVar.b(wg1Var, null);
        sizeF.getWidth();
        sizeF.getHeight();
        this.h.m();
        new e(kanVar.newInstance());
        throw null;
    }
}
