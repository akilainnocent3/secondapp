package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.graphics.layer.ViewLayer;
import androidx.compose.ui.graphics.layer.view.DrawChildContainer;

/* JADX INFO: loaded from: classes.dex */
public final class e7l implements androidx.compose.ui.graphics.layer.a {
    public static final a C = new a();
    public float A;
    public m750 B;
    public final DrawChildContainer b;
    public final sc6 c;
    public final ViewLayer d;
    public final Resources e;
    public final Rect f;
    public Paint g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public float p;
    public boolean q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public long w;
    public long x;
    public float y;
    public float z;

    public static final class a extends Canvas {
        @Override // android.graphics.Canvas
        public final boolean isHardwareAccelerated() {
            return true;
        }
    }

    public e7l(DrawChildContainer drawChildContainer) {
        sc6 sc6Var = new sc6();
        qc6 qc6Var = new qc6();
        this.b = drawChildContainer;
        this.c = sc6Var;
        ViewLayer viewLayer = new ViewLayer(drawChildContainer, sc6Var, qc6Var);
        this.d = viewLayer;
        this.e = drawChildContainer.getResources();
        this.f = new Rect();
        drawChildContainer.addView(viewLayer);
        viewLayer.setClipBounds(null);
        this.j = 0L;
        View.generateViewId();
        this.n = 3;
        this.o = 0;
        this.p = 1.0f;
        this.r = 1.0f;
        this.s = 1.0f;
        long j = j58.b;
        this.w = j;
        this.x = j;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final long A() {
        return this.w;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void B(float f) {
        this.t = f;
        this.d.setTranslationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final long C() {
        return this.x;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float D() {
        return this.d.getCameraDistance() / this.e.getDisplayMetrics().densityDpi;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final Matrix E() {
        return this.d.getMatrix();
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final int F() {
        return this.n;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float G() {
        return this.r;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void H(Outline outline, long j) {
        ViewLayer viewLayer = this.d;
        viewLayer.e = outline;
        viewLayer.invalidateOutline();
        if ((this.m || viewLayer.getClipToOutline()) && outline != null) {
            viewLayer.setClipToOutline(true);
            if (this.m) {
                this.m = false;
                this.k = true;
            }
        }
        this.l = outline != null;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void I(lc6 lc6Var) {
        Rect rect;
        boolean z = this.k;
        ViewLayer viewLayer = this.d;
        if (z) {
            if ((this.m || viewLayer.getClipToOutline()) && !this.l) {
                rect = this.f;
                rect.left = 0;
                rect.top = 0;
                rect.right = viewLayer.getWidth();
                rect.bottom = viewLayer.getHeight();
            } else {
                rect = null;
            }
            viewLayer.setClipBounds(rect);
        }
        if (i40.c(lc6Var).isHardwareAccelerated()) {
            this.b.a(lc6Var, viewLayer, viewLayer.getDrawingTime());
        }
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void J(long j) {
        long j2 = 9223372034707292159L & j;
        ViewLayer viewLayer = this.d;
        if (j2 != 9205357640488583168L) {
            this.q = false;
            viewLayer.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            viewLayer.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                h8i0.a(viewLayer);
                return;
            }
            this.q = true;
            viewLayer.setPivotX(((int) (this.j >> 32)) / 2.0f);
            viewLayer.setPivotY(((int) (this.j & 4294967295L)) / 2.0f);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.compose.ui.graphics.layer.a
    public final void K(mmd mmdVar, asr asrVar, v6l v6lVar, v6l.a aVar) {
        ViewLayer viewLayer = this.d;
        ViewParent parent = viewLayer.getParent();
        DrawChildContainer drawChildContainer = this.b;
        if (parent == null) {
            drawChildContainer.addView(viewLayer);
        }
        viewLayer.setDrawParams(mmdVar, asrVar, v6lVar, aVar);
        if (viewLayer.isAttachedToWindow()) {
            viewLayer.setVisibility(4);
            viewLayer.setVisibility(0);
            try {
                h40 h40Var = this.c.a;
                a aVar2 = C;
                Canvas canvas = h40Var.a;
                h40Var.a = aVar2;
                drawChildContainer.a(h40Var, viewLayer, viewLayer.getDrawingTime());
                h40Var.a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float L() {
        return this.y;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void M(int i) {
        this.o = i;
        Q();
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float N() {
        return this.v;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float O() {
        return this.s;
    }

    public final void P(int i) {
        Paint paint = this.g;
        ViewLayer viewLayer = this.d;
        boolean z = true;
        if (i == 1) {
            viewLayer.setLayerType(2, paint);
        } else if (i == 2) {
            viewLayer.setLayerType(0, paint);
            z = false;
        } else {
            viewLayer.setLayerType(0, paint);
        }
        viewLayer.setCanUseCompositingLayer$ui_graphics_release(z);
    }

    public final void Q() {
        int i = this.o;
        if (i != 1 && this.n == 3) {
            P(i);
        } else {
            P(1);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float a() {
        return this.p;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void b(float f) {
        this.p = f;
        this.d.setAlpha(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void c(int i) {
        this.n = i;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(g40.b(i)));
        Q();
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final m750 d() {
        return this.B;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void e(m750 m750Var) {
        this.B = m750Var;
        if (Build.VERSION.SDK_INT >= 31) {
            i8i0.a(this.d, m750Var);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void f(float f) {
        this.u = f;
        this.d.setTranslationY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void g() {
        this.b.removeViewInLayout(this.d);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void h(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.w = j;
            h8i0.b(r58.l(j), this.d);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void i(int i, long j, int i2) {
        boolean zB = jxo.b(this.j, j);
        ViewLayer viewLayer = this.d;
        if (zB) {
            int i3 = this.h;
            if (i3 != i) {
                viewLayer.offsetLeftAndRight(i - i3);
            }
            int i4 = this.i;
            if (i4 != i2) {
                viewLayer.offsetTopAndBottom(i2 - i4);
            }
        } else {
            if (this.m || viewLayer.getClipToOutline()) {
                this.k = true;
            }
            int i5 = (int) (j >> 32);
            int i6 = (int) (4294967295L & j);
            viewLayer.layout(i, i2, i + i5, i2 + i6);
            this.j = j;
            if (this.q) {
                viewLayer.setPivotX(i5 / 2.0f);
                viewLayer.setPivotY(i6 / 2.0f);
            }
        }
        this.h = i;
        this.i = i2;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void j() {
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setColorFilter(null);
        Q();
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void k(float f) {
        this.r = f;
        this.d.setScaleX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void l(boolean z) {
        boolean z2 = false;
        this.m = z && !this.l;
        this.k = true;
        if (z && this.l) {
            z2 = true;
        }
        this.d.setClipToOutline(z2);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final int m() {
        return this.o;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void n(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.x = j;
            h8i0.c(r58.l(j), this.d);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final l58 o() {
        return null;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void p(float f) {
        this.d.setCameraDistance(f * this.e.getDisplayMetrics().densityDpi);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void q(float f) {
        this.y = f;
        this.d.setRotationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void r(float f) {
        this.z = f;
        this.d.setRotationY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float s() {
        return this.z;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void t(float f) {
        this.v = f;
        this.d.setElevation(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void u(float f) {
        this.A = f;
        this.d.setRotation(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void v(float f) {
        this.s = f;
        this.d.setScaleY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float x() {
        return this.A;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float y() {
        return this.u;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float z() {
        return this.t;
    }
}
