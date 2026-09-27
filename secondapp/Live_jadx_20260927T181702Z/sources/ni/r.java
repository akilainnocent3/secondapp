package ni;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class r {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float f116829j = 270.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float f116830k = 180.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public float f116831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public float f116832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public float f116833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public float f116834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public float f116835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public float f116836f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<h> f116837g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<j> f116838h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f116839i;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends j {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f116840c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Matrix f116841d;

        public a(List list, Matrix matrix) {
            this.f116840c = list;
            this.f116841d = matrix;
        }

        @Override // ni.r.j
        public void a(Matrix matrix, mi.b bVar, int i10, Canvas canvas) {
            Iterator it = this.f116840c.iterator();
            while (it.hasNext()) {
                ((j) it.next()).a(this.f116841d, bVar, i10, canvas);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b extends j {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e f116843c;

        public b(e eVar) {
            this.f116843c = eVar;
        }

        @Override // ni.r.j
        public void a(Matrix matrix, @NonNull mi.b bVar, int i10, @NonNull Canvas canvas) {
            bVar.a(canvas, matrix, new RectF(this.f116843c.k(), this.f116843c.o(), this.f116843c.l(), this.f116843c.j()), i10, this.f116843c.m(), this.f116843c.n());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c extends j {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final g f116844c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final g f116845d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f116846e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f116847f;

        public c(g gVar, g gVar2, float f10, float f11) {
            this.f116844c = gVar;
            this.f116845d = gVar2;
            this.f116846e = f10;
            this.f116847f = f11;
        }

        @Override // ni.r.j
        public void a(Matrix matrix, mi.b bVar, int i10, Canvas canvas) {
            int i11;
            float fE = e();
            if (fE > 0.0f) {
                return;
            }
            double dHypot = Math.hypot(this.f116844c.f116864b - this.f116846e, this.f116844c.f116865c - this.f116847f);
            double dHypot2 = Math.hypot(this.f116845d.f116864b - this.f116844c.f116864b, this.f116845d.f116865c - this.f116844c.f116865c);
            float fMin = (float) Math.min(i10, Math.min(dHypot, dHypot2));
            double d10 = fMin;
            double dTan = Math.tan(Math.toRadians((-fE) / 2.0f)) * d10;
            if (dHypot > dTan) {
                RectF rectF = new RectF(0.0f, 0.0f, (float) (dHypot - dTan), 0.0f);
                this.f116872a.set(matrix);
                this.f116872a.preTranslate(this.f116846e, this.f116847f);
                this.f116872a.preRotate(d());
                i11 = i10;
                bVar.b(canvas, this.f116872a, rectF, i11);
            } else {
                i11 = i10;
            }
            float f10 = fMin * 2.0f;
            RectF rectF2 = new RectF(0.0f, 0.0f, f10, f10);
            this.f116872a.set(matrix);
            this.f116872a.preTranslate(this.f116844c.f116864b, this.f116844c.f116865c);
            this.f116872a.preRotate(d());
            this.f116872a.preTranslate((float) ((-dTan) - d10), (-2.0f) * fMin);
            bVar.c(canvas, this.f116872a, rectF2, (int) fMin, 450.0f, fE, new float[]{(float) (d10 + dTan), f10});
            if (dHypot2 > dTan) {
                RectF rectF3 = new RectF(0.0f, 0.0f, (float) (dHypot2 - dTan), 0.0f);
                this.f116872a.set(matrix);
                this.f116872a.preTranslate(this.f116844c.f116864b, this.f116844c.f116865c);
                this.f116872a.preRotate(c());
                this.f116872a.preTranslate((float) dTan, 0.0f);
                bVar.b(canvas, this.f116872a, rectF3, i11);
            }
        }

        public float c() {
            return (float) Math.toDegrees(Math.atan((this.f116845d.f116865c - this.f116844c.f116865c) / (this.f116845d.f116864b - this.f116844c.f116864b)));
        }

        public float d() {
            return (float) Math.toDegrees(Math.atan((this.f116844c.f116865c - this.f116847f) / (this.f116844c.f116864b - this.f116846e)));
        }

        public float e() {
            float fC = ((c() - d()) + 360.0f) % 360.0f;
            return fC <= 180.0f ? fC : fC - 360.0f;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d extends j {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final g f116848c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f116849d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f116850e;

        public d(g gVar, float f10, float f11) {
            this.f116848c = gVar;
            this.f116849d = f10;
            this.f116850e = f11;
        }

        @Override // ni.r.j
        public void a(Matrix matrix, @NonNull mi.b bVar, int i10, @NonNull Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f116848c.f116865c - this.f116850e, this.f116848c.f116864b - this.f116849d), 0.0f);
            this.f116872a.set(matrix);
            this.f116872a.preTranslate(this.f116849d, this.f116850e);
            this.f116872a.preRotate(c());
            bVar.b(canvas, this.f116872a, rectF, i10);
        }

        public float c() {
            return (float) Math.toDegrees(Math.atan((this.f116848c.f116865c - this.f116850e) / (this.f116848c.f116864b - this.f116849d)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class e extends h {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final RectF f116851h = new RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Deprecated
        public float f116852b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Deprecated
        public float f116853c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Deprecated
        public float f116854d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Deprecated
        public float f116855e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Deprecated
        public float f116856f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Deprecated
        public float f116857g;

        public e(float f10, float f11, float f12, float f13) {
            q(f10);
            u(f11);
            r(f12);
            p(f13);
        }

        @Override // ni.r.h
        public void a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f116866a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f116851h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }

        public final float j() {
            return this.f116855e;
        }

        public final float k() {
            return this.f116852b;
        }

        public final float l() {
            return this.f116854d;
        }

        public final float m() {
            return this.f116856f;
        }

        public final float n() {
            return this.f116857g;
        }

        public final float o() {
            return this.f116853c;
        }

        public final void p(float f10) {
            this.f116855e = f10;
        }

        public final void q(float f10) {
            this.f116852b = f10;
        }

        public final void r(float f10) {
            this.f116854d = f10;
        }

        public final void s(float f10) {
            this.f116856f = f10;
        }

        public final void t(float f10) {
            this.f116857g = f10;
        }

        public final void u(float f10) {
            this.f116853c = f10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class f extends h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f116858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f116859c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f116860d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f116861e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f116862f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f116863g;

        public f(float f10, float f11, float f12, float f13, float f14, float f15) {
            h(f10);
            j(f11);
            i(f12);
            k(f13);
            l(f14);
            m(f15);
        }

        @Override // ni.r.h
        public void a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f116866a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.cubicTo(this.f116858b, this.f116859c, this.f116860d, this.f116861e, this.f116862f, this.f116863g);
            path.transform(matrix);
        }

        public final float b() {
            return this.f116858b;
        }

        public final float c() {
            return this.f116860d;
        }

        public final float d() {
            return this.f116859c;
        }

        public final float e() {
            return this.f116859c;
        }

        public final float f() {
            return this.f116862f;
        }

        public final float g() {
            return this.f116863g;
        }

        public final void h(float f10) {
            this.f116858b = f10;
        }

        public final void i(float f10) {
            this.f116860d = f10;
        }

        public final void j(float f10) {
            this.f116859c = f10;
        }

        public final void k(float f10) {
            this.f116861e = f10;
        }

        public final void l(float f10) {
            this.f116862f = f10;
        }

        public final void m(float f10) {
            this.f116863g = f10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class g extends h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f116864b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f116865c;

        @Override // ni.r.h
        public void a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f116866a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f116864b, this.f116865c);
            path.transform(matrix);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Matrix f116866a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class i extends h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Deprecated
        public float f116867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Deprecated
        public float f116868c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Deprecated
        public float f116869d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Deprecated
        public float f116870e;

        private float h() {
            return this.f116869d;
        }

        private float i() {
            return this.f116870e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l(float f10) {
            this.f116869d = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m(float f10) {
            this.f116870e = f10;
        }

        @Override // ni.r.h
        public void a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f116866a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.quadTo(f(), g(), h(), i());
            path.transform(matrix);
        }

        public final float f() {
            return this.f116867b;
        }

        public final float g() {
            return this.f116868c;
        }

        public final void j(float f10) {
            this.f116867b = f10;
        }

        public final void k(float f10) {
            this.f116868c = f10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Matrix f116871b = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Matrix f116872a = new Matrix();

        public abstract void a(Matrix matrix, mi.b bVar, int i10, Canvas canvas);

        public final void b(mi.b bVar, int i10, Canvas canvas) {
            a(f116871b, bVar, i10, canvas);
        }
    }

    public r() {
        q(0.0f, 0.0f);
    }

    public void a(float f10, float f11, float f12, float f13, float f14, float f15) {
        e eVar = new e(f10, f11, f12, f13);
        eVar.s(f14);
        eVar.t(f15);
        this.f116837g.add(eVar);
        b bVar = new b(eVar);
        float f16 = f14 + f15;
        boolean z10 = f15 < 0.0f;
        if (z10) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        c(bVar, f14, z10 ? (180.0f + f16) % 360.0f : f16);
        double d10 = f16;
        u(((f10 + f12) * 0.5f) + (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))));
        v(((f11 + f13) * 0.5f) + (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))));
    }

    public final void b(float f10) {
        if (h() == f10) {
            return;
        }
        float fH = ((f10 - h()) + 360.0f) % 360.0f;
        if (fH > 180.0f) {
            return;
        }
        e eVar = new e(j(), k(), j(), k());
        eVar.s(h());
        eVar.t(fH);
        this.f116838h.add(new b(eVar));
        s(f10);
    }

    public final void c(j jVar, float f10, float f11) {
        b(f10);
        this.f116838h.add(jVar);
        s(f11);
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f116837g.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f116837g.get(i10).a(matrix, path);
        }
    }

    public boolean e() {
        return this.f116839i;
    }

    @NonNull
    public j f(Matrix matrix) {
        b(i());
        return new a(new ArrayList(this.f116838h), new Matrix(matrix));
    }

    @t0(21)
    public void g(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f116837g.add(new f(f10, f11, f12, f13, f14, f15));
        this.f116839i = true;
        u(f14);
        v(f15);
    }

    public final float h() {
        return this.f116835e;
    }

    public final float i() {
        return this.f116836f;
    }

    public float j() {
        return this.f116833c;
    }

    public float k() {
        return this.f116834d;
    }

    public float l() {
        return this.f116831a;
    }

    public float m() {
        return this.f116832b;
    }

    public void n(float f10, float f11) {
        g gVar = new g();
        gVar.f116864b = f10;
        gVar.f116865c = f11;
        this.f116837g.add(gVar);
        d dVar = new d(gVar, j(), k());
        c(dVar, dVar.c() + 270.0f, dVar.c() + 270.0f);
        u(f10);
        v(f11);
    }

    public void o(float f10, float f11, float f12, float f13) {
        if ((Math.abs(f10 - j()) < 0.001f && Math.abs(f11 - k()) < 0.001f) || (Math.abs(f10 - f12) < 0.001f && Math.abs(f11 - f13) < 0.001f)) {
            n(f12, f13);
            return;
        }
        g gVar = new g();
        gVar.f116864b = f10;
        gVar.f116865c = f11;
        this.f116837g.add(gVar);
        g gVar2 = new g();
        gVar2.f116864b = f12;
        gVar2.f116865c = f13;
        this.f116837g.add(gVar2);
        c cVar = new c(gVar, gVar2, j(), k());
        if (cVar.e() > 0.0f) {
            n(f10, f11);
            n(f12, f13);
        } else {
            c(cVar, cVar.d() + 270.0f, cVar.c() + 270.0f);
            u(f12);
            v(f13);
        }
    }

    @t0(21)
    public void p(float f10, float f11, float f12, float f13) {
        i iVar = new i();
        iVar.j(f10);
        iVar.k(f11);
        iVar.l(f12);
        iVar.m(f13);
        this.f116837g.add(iVar);
        this.f116839i = true;
        u(f12);
        v(f13);
    }

    public void q(float f10, float f11) {
        r(f10, f11, 270.0f, 0.0f);
    }

    public void r(float f10, float f11, float f12, float f13) {
        w(f10);
        x(f11);
        u(f10);
        v(f11);
        s(f12);
        t((f12 + f13) % 360.0f);
        this.f116837g.clear();
        this.f116838h.clear();
        this.f116839i = false;
    }

    public final void s(float f10) {
        this.f116835e = f10;
    }

    public final void t(float f10) {
        this.f116836f = f10;
    }

    public final void u(float f10) {
        this.f116833c = f10;
    }

    public final void v(float f10) {
        this.f116834d = f10;
    }

    public final void w(float f10) {
        this.f116831a = f10;
    }

    public final void x(float f10) {
        this.f116832b = f10;
    }

    public r(float f10, float f11) {
        q(f10, f11);
    }
}
