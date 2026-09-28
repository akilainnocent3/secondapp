package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.ui.graphics.layer.a;

/* JADX INFO: loaded from: classes.dex */
public final class d7l implements a {
    public final sc6 b;
    public final qc6 c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public float i;
    public int j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public long p;
    public long q;
    public float r;
    public float s;
    public float t;
    public float u;
    public boolean v;
    public boolean w;
    public boolean x;
    public m750 y;
    public int z;

    public d7l() {
        sc6 sc6Var = new sc6();
        qc6 qc6Var = new qc6();
        this.b = sc6Var;
        this.c = qc6Var;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.d = renderNode;
        this.e = 0L;
        renderNode.setClipToBounds(false);
        Q(renderNode, 0);
        this.i = 1.0f;
        this.j = 3;
        this.k = 1.0f;
        this.l = 1.0f;
        long j = j58.b;
        this.p = j;
        this.q = j;
        this.u = 8.0f;
        this.z = 0;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final long A() {
        return this.p;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void B(float f) {
        this.m = f;
        this.d.setTranslationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final long C() {
        return this.q;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float D() {
        return this.u;
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
        return this.j;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float G() {
        return this.k;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void H(Outline outline, long j) {
        this.d.setOutline(outline);
        this.h = outline != null;
        P();
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void I(lc6 lc6Var) {
        i40.c(lc6Var).drawRenderNode(this.d);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void J(long j) {
        long j2 = 9223372034707292159L & j;
        RenderNode renderNode = this.d;
        if (j2 == 9205357640488583168L) {
            renderNode.resetPivot();
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void K(mmd mmdVar, asr asrVar, v6l v6lVar, v6l.a aVar) {
        qc6 qc6Var = this.c;
        RecordingCanvas recordingCanvasBeginRecording = this.d.beginRecording();
        try {
            sc6 sc6Var = this.b;
            h40 h40Var = sc6Var.a;
            Canvas canvas = h40Var.a;
            h40Var.a = recordingCanvasBeginRecording;
            qc6.b bVar = qc6Var.b;
            bVar.f(mmdVar);
            bVar.g(asrVar);
            bVar.b = v6lVar;
            bVar.h(this.e);
            bVar.e(h40Var);
            aVar.invoke(qc6Var);
            sc6Var.a.a = canvas;
        } finally {
            this.d.endRecording();
        }
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float L() {
        return this.r;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void M(int i) {
        this.z = i;
        R();
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float N() {
        return this.o;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float O() {
        return this.l;
    }

    public final void P() {
        boolean z = this.v;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.w) {
            this.w = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.x) {
            this.x = z2;
            this.d.setClipToOutline(z2);
        }
    }

    public final void Q(RenderNode renderNode, int i) {
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, this.f);
            renderNode.setHasOverlappingRendering(true);
            return;
        }
        Paint paint = this.f;
        if (i == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void R() {
        int i = this.z;
        if (i != 1 && this.j == 3 && this.y == null) {
            Q(this.d, i);
        } else {
            Q(this.d, 1);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float a() {
        return this.i;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void b(float f) {
        this.i = f;
        this.d.setAlpha(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void c(int i) {
        this.j = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setBlendMode(g40.a(i));
        R();
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final m750 d() {
        return this.y;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void e(m750 m750Var) {
        this.y = m750Var;
        if (Build.VERSION.SDK_INT >= 31) {
            y750.a(this.d, m750Var);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void f(float f) {
        this.n = f;
        this.d.setTranslationY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void g() {
        this.d.discardDisplayList();
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void h(long j) {
        this.p = j;
        this.d.setAmbientShadowColor(r58.l(j));
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void i(int i, long j, int i2) {
        this.d.setPosition(i, i2, ((int) (j >> 32)) + i, ((int) (4294967295L & j)) + i2);
        this.e = kc6.d(j);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void j() {
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setColorFilter(null);
        R();
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void k(float f) {
        this.k = f;
        this.d.setScaleX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void l(boolean z) {
        this.v = z;
        P();
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final int m() {
        return this.z;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void n(long j) {
        this.q = j;
        this.d.setSpotShadowColor(r58.l(j));
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final l58 o() {
        return null;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void p(float f) {
        this.u = f;
        this.d.setCameraDistance(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void q(float f) {
        this.r = f;
        this.d.setRotationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void r(float f) {
        this.s = f;
        this.d.setRotationY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float s() {
        return this.s;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void t(float f) {
        this.o = f;
        this.d.setElevation(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void u(float f) {
        this.t = f;
        this.d.setRotationZ(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final void v(float f) {
        this.l = f;
        this.d.setScaleY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final boolean w() {
        return this.d.hasDisplayList();
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float x() {
        return this.t;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float y() {
        return this.n;
    }

    @Override // androidx.compose.ui.graphics.layer.a
    public final float z() {
        return this.m;
    }
}
