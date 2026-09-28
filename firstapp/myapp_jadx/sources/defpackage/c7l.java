package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.graphics.layer.a;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class c7l implements a {
    public static final AtomicBoolean C = new AtomicBoolean(true);
    public boolean A;
    public m750 B;
    public final sc6 b;
    public final qc6 c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public float l;
    public boolean m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public long s;
    public long t;
    public float u;
    public float v;
    public float w;
    public float x;
    public boolean y;
    public boolean z;

    public c7l(AndroidComposeView androidComposeView, sc6 sc6Var, qc6 qc6Var) {
        this.b = sc6Var;
        this.c = qc6Var;
        RenderNode renderNodeCreate = RenderNode.create("Compose", androidComposeView);
        this.d = renderNodeCreate;
        this.e = 0L;
        this.i = 0L;
        if (C.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                x750.c(renderNodeCreate, x750.a(renderNodeCreate));
                x750.d(renderNodeCreate, x750.b(renderNodeCreate));
            }
            w750.a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        Q(0);
        this.j = 0;
        this.k = 3;
        this.l = 1.0f;
        this.n = 1.0f;
        this.o = 1.0f;
        long j = j58.b;
        this.s = j;
        this.t = j;
        this.x = 8.0f;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final long A() {
        return this.s;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void B(float f) {
        this.p = f;
        this.d.setTranslationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final long C() {
        return this.t;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float D() {
        return this.x;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final Matrix E() {
        Matrix matrix = this.g;
        if (matrix == null) {
            matrix = new Matrix();
            this.g = matrix;
        }
        this.d.getMatrix(matrix);
        return matrix;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final int F() {
        return this.k;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float G() {
        return this.n;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void H(Outline outline, long j) {
        this.i = j;
        this.d.setOutline(outline);
        this.h = outline != null;
        P();
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void I(lc6 lc6Var) {
        DisplayListCanvas displayListCanvasC = i40.c(lc6Var);
        displayListCanvasC.getClass();
        displayListCanvasC.drawRenderNode(this.d);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void J(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.m = true;
            this.d.setPivotX(((int) (this.e >> 32)) / 2.0f);
            this.d.setPivotY(((int) (4294967295L & this.e)) / 2.0f);
        } else {
            this.m = false;
            this.d.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void K(mmd mmdVar, asr asrVar, v6l v6lVar, v6l.a aVar) {
        Canvas canvasStart = this.d.start(Math.max((int) (this.e >> 32), (int) (this.i >> 32)), Math.max((int) (this.e & 4294967295L), (int) (this.i & 4294967295L)));
        try {
            h40 h40Var = this.b.a;
            Canvas canvas = h40Var.a;
            h40Var.a = canvasStart;
            qc6 qc6Var = this.c;
            qc6.b bVar = qc6Var.b;
            long jD = kc6.d(this.e);
            mmd mmdVarB = bVar.b();
            asr asrVarC = bVar.c();
            lc6 lc6VarA = bVar.a();
            long jD2 = bVar.d();
            v6l v6lVar2 = bVar.b;
            bVar.f(mmdVar);
            bVar.g(asrVar);
            bVar.e(h40Var);
            bVar.h(jD);
            bVar.b = v6lVar;
            h40Var.p();
            try {
                aVar.invoke(qc6Var);
                h40Var.f();
                bVar.f(mmdVarB);
                bVar.g(asrVarC);
                bVar.e(lc6VarA);
                bVar.h(jD2);
                bVar.b = v6lVar2;
                h40Var.a = canvas;
                this.d.end(canvasStart);
            } catch (Throwable th) {
                h40Var.f();
                qc6.b bVar2 = qc6Var.b;
                bVar2.f(mmdVarB);
                bVar2.g(asrVarC);
                bVar2.e(lc6VarA);
                bVar2.h(jD2);
                bVar2.b = v6lVar2;
                throw th;
            }
        } catch (Throwable th2) {
            this.d.end(canvasStart);
            throw th2;
        }
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float L() {
        return this.u;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void M(int i) {
        this.j = i;
        R();
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float N() {
        return this.r;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float O() {
        return this.o;
    }

    public final void P() {
        boolean z = this.y;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.z) {
            this.z = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.A) {
            this.A = z2;
            this.d.setClipToOutline(z2);
        }
    }

    public final void Q(int i) {
        RenderNode renderNode = this.d;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void R() {
        int i = this.j;
        if (i != 1 && this.k == 3) {
            Q(i);
        } else {
            Q(1);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float a() {
        return this.l;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void b(float f) {
        this.l = f;
        this.d.setAlpha(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void c(int i) {
        if (this.k == i) {
            return;
        }
        this.k = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(g40.b(i)));
        R();
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final m750 d() {
        return this.B;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void e(m750 m750Var) {
        this.B = m750Var;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void f(float f) {
        this.q = f;
        this.d.setTranslationY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void g() {
        w750.a(this.d);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void h(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.s = j;
            x750.c(this.d, r58.l(j));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void i(int i, long j, int i2) {
        int i3 = (int) (j >> 32);
        int i4 = (int) (4294967295L & j);
        this.d.setLeftTopRightBottom(i, i2, i + i3, i2 + i4);
        if (jxo.b(this.e, j)) {
            return;
        }
        if (this.m) {
            this.d.setPivotX(i3 / 2.0f);
            this.d.setPivotY(i4 / 2.0f);
        }
        this.e = j;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void j() {
        R();
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void k(float f) {
        this.n = f;
        this.d.setScaleX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void l(boolean z) {
        this.y = z;
        P();
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final int m() {
        return this.j;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void n(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.t = j;
            x750.d(this.d, r58.l(j));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final l58 o() {
        return null;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void p(float f) {
        this.x = f;
        this.d.setCameraDistance(-f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void q(float f) {
        this.u = f;
        this.d.setRotationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void r(float f) {
        this.v = f;
        this.d.setRotationY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float s() {
        return this.v;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void t(float f) {
        this.r = f;
        this.d.setElevation(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void u(float f) {
        this.w = f;
        this.d.setRotation(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void v(float f) {
        this.o = f;
        this.d.setScaleY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final boolean w() {
        return this.d.isValid();
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float x() {
        return this.w;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float y() {
        return this.q;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float z() {
        return this.p;
    }
}
