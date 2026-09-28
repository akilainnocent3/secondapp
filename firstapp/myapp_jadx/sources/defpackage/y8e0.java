package defpackage;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes.dex */
public final class y8e0 extends tkd implements qcf {
    public final d70 F;
    public final dlf G;
    public RenderNode H;

    public y8e0(cke0 cke0Var, d70 d70Var, dlf dlfVar) {
        this.F = d70Var;
        this.G = dlfVar;
        p2(cke0Var);
    }

    public static boolean s2(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01ea A[PHI: r19
      0x01ea: PHI (r19v2 boolean) = (r19v1 boolean), (r19v11 boolean) binds: [B:92:0x01a1, B:100:0x01bb] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.qcf
    public final void A(wsr wsrVar) {
        float f;
        boolean zS2;
        char c;
        qc6 qc6Var = wsrVar.a;
        long jD = qc6Var.d();
        d70 d70Var = this.F;
        d70Var.l(jD);
        Canvas canvasC = i40.c(qc6Var.b.a());
        ((x5a0) d70Var.d).getValue();
        if (yw90.e(qc6Var.d())) {
            wsrVar.b2();
            return;
        }
        boolean zIsHardwareAccelerated = canvasC.isHardwareAccelerated();
        dlf dlfVar = this.G;
        if (!zIsHardwareAccelerated) {
            EdgeEffect edgeEffect = dlfVar.d;
            if (edgeEffect != null) {
                edgeEffect.finish();
            }
            EdgeEffect edgeEffect2 = dlfVar.e;
            if (edgeEffect2 != null) {
                edgeEffect2.finish();
            }
            EdgeEffect edgeEffect3 = dlfVar.f;
            if (edgeEffect3 != null) {
                edgeEffect3.finish();
            }
            EdgeEffect edgeEffect4 = dlfVar.g;
            if (edgeEffect4 != null) {
                edgeEffect4.finish();
            }
            EdgeEffect edgeEffect5 = dlfVar.h;
            if (edgeEffect5 != null) {
                edgeEffect5.finish();
            }
            EdgeEffect edgeEffect6 = dlfVar.i;
            if (edgeEffect6 != null) {
                edgeEffect6.finish();
            }
            EdgeEffect edgeEffect7 = dlfVar.j;
            if (edgeEffect7 != null) {
                edgeEffect7.finish();
            }
            EdgeEffect edgeEffect8 = dlfVar.k;
            if (edgeEffect8 != null) {
                edgeEffect8.finish();
            }
            wsrVar.b2();
            return;
        }
        float fC1 = wsrVar.C1(30.0f);
        boolean z = dlf.f(dlfVar.d) || dlf.g(dlfVar.h) || dlf.f(dlfVar.e) || dlf.g(dlfVar.i);
        boolean z2 = dlf.f(dlfVar.f) || dlf.g(dlfVar.j) || dlf.f(dlfVar.g) || dlf.g(dlfVar.k);
        if (z && z2) {
            t2().setPosition(0, 0, canvasC.getWidth(), canvasC.getHeight());
        } else if (z) {
            t2().setPosition(0, 0, (ycv.b(fC1) * 2) + canvasC.getWidth(), canvasC.getHeight());
        } else {
            if (!z2) {
                wsrVar.b2();
                return;
            }
            t2().setPosition(0, 0, canvasC.getWidth(), (ycv.b(fC1) * 2) + canvasC.getHeight());
        }
        RecordingCanvas recordingCanvasBeginRecording = t2().beginRecording();
        if (dlf.g(dlfVar.j)) {
            EdgeEffect edgeEffectA = dlfVar.j;
            if (edgeEffectA == null) {
                edgeEffectA = dlfVar.a(i3z.b);
                dlfVar.j = edgeEffectA;
            }
            s2(90.0f, edgeEffectA, recordingCanvasBeginRecording);
            edgeEffectA.finish();
        }
        if (dlf.f(dlfVar.f)) {
            EdgeEffect edgeEffectC = dlfVar.c();
            zS2 = s2(270.0f, edgeEffectC, recordingCanvasBeginRecording);
            f = 1.0f;
            if (dlf.g(dlfVar.f)) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (d70Var.e() & 4294967295L));
                EdgeEffect edgeEffectA2 = dlfVar.j;
                if (edgeEffectA2 == null) {
                    edgeEffectA2 = dlfVar.a(i3z.b);
                    dlfVar.j = edgeEffectA2;
                }
                int i = Build.VERSION.SDK_INT;
                float fB = i >= 31 ? cm0.b(edgeEffectC) : 0.0f;
                float f2 = 1.0f - fIntBitsToFloat;
                if (i >= 31) {
                    cm0.c(edgeEffectA2, fB, f2);
                } else {
                    edgeEffectA2.onPull(fB, f2);
                }
            }
        } else {
            f = 1.0f;
            zS2 = false;
        }
        if (dlf.g(dlfVar.h)) {
            EdgeEffect edgeEffectA3 = dlfVar.h;
            if (edgeEffectA3 == null) {
                edgeEffectA3 = dlfVar.a(i3z.a);
                dlfVar.h = edgeEffectA3;
            }
            s2(180.0f, edgeEffectA3, recordingCanvasBeginRecording);
            edgeEffectA3.finish();
        }
        if (dlf.f(dlfVar.d)) {
            EdgeEffect edgeEffectE = dlfVar.e();
            zS2 = s2(0.0f, edgeEffectE, recordingCanvasBeginRecording) || zS2;
            if (dlf.g(dlfVar.d)) {
                c = ' ';
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (d70Var.e() >> 32));
                EdgeEffect edgeEffectA4 = dlfVar.h;
                if (edgeEffectA4 == null) {
                    edgeEffectA4 = dlfVar.a(i3z.a);
                    dlfVar.h = edgeEffectA4;
                }
                int i2 = Build.VERSION.SDK_INT;
                float fB2 = i2 >= 31 ? cm0.b(edgeEffectE) : 0.0f;
                if (i2 >= 31) {
                    cm0.c(edgeEffectA4, fB2, fIntBitsToFloat2);
                } else {
                    edgeEffectA4.onPull(fB2, fIntBitsToFloat2);
                }
            } else {
                c = ' ';
            }
        } else {
            c = ' ';
        }
        if (dlf.g(dlfVar.k)) {
            EdgeEffect edgeEffectA5 = dlfVar.k;
            if (edgeEffectA5 == null) {
                edgeEffectA5 = dlfVar.a(i3z.b);
                dlfVar.k = edgeEffectA5;
            }
            s2(270.0f, edgeEffectA5, recordingCanvasBeginRecording);
            edgeEffectA5.finish();
        }
        if (dlf.f(dlfVar.g)) {
            EdgeEffect edgeEffectD = dlfVar.d();
            zS2 = s2(90.0f, edgeEffectD, recordingCanvasBeginRecording) || zS2;
            if (dlf.g(dlfVar.g)) {
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (d70Var.e() & 4294967295L));
                EdgeEffect edgeEffectA6 = dlfVar.k;
                if (edgeEffectA6 == null) {
                    edgeEffectA6 = dlfVar.a(i3z.b);
                    dlfVar.k = edgeEffectA6;
                }
                int i3 = Build.VERSION.SDK_INT;
                float fB3 = i3 >= 31 ? cm0.b(edgeEffectD) : 0.0f;
                if (i3 >= 31) {
                    cm0.c(edgeEffectA6, fB3, fIntBitsToFloat3);
                } else {
                    edgeEffectA6.onPull(fB3, fIntBitsToFloat3);
                }
            }
        }
        if (dlf.g(dlfVar.i)) {
            EdgeEffect edgeEffectA7 = dlfVar.i;
            if (edgeEffectA7 == null) {
                edgeEffectA7 = dlfVar.a(i3z.a);
                dlfVar.i = edgeEffectA7;
            }
            s2(0.0f, edgeEffectA7, recordingCanvasBeginRecording);
            edgeEffectA7.finish();
        }
        if (dlf.f(dlfVar.e)) {
            EdgeEffect edgeEffectB = dlfVar.b();
            boolean z3 = s2(180.0f, edgeEffectB, recordingCanvasBeginRecording) || zS2;
            if (dlf.g(dlfVar.e)) {
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (d70Var.e() >> c));
                EdgeEffect edgeEffectA8 = dlfVar.i;
                if (edgeEffectA8 == null) {
                    edgeEffectA8 = dlfVar.a(i3z.a);
                    dlfVar.i = edgeEffectA8;
                }
                int i4 = Build.VERSION.SDK_INT;
                float fB4 = i4 >= 31 ? cm0.b(edgeEffectB) : 0.0f;
                float f3 = f - fIntBitsToFloat4;
                if (i4 >= 31) {
                    cm0.c(edgeEffectA8, fB4, f3);
                } else {
                    edgeEffectA8.onPull(fB4, f3);
                }
            }
            zS2 = z3;
        }
        if (zS2) {
            d70Var.f();
        }
        float f4 = z2 ? 0.0f : fC1;
        if (z) {
            fC1 = 0.0f;
        }
        asr layoutDirection = wsrVar.getLayoutDirection();
        h40 h40VarB = i40.b(recordingCanvasBeginRecording);
        long jD2 = qc6Var.d();
        mmd mmdVarB = qc6Var.b.b();
        asr asrVarC = qc6Var.b.c();
        lc6 lc6VarA = qc6Var.b.a();
        long jD3 = qc6Var.b.d();
        qc6.b bVar = qc6Var.b;
        v6l v6lVar = bVar.b;
        bVar.f(wsrVar);
        bVar.g(layoutDirection);
        bVar.e(h40VarB);
        bVar.h(jD2);
        bVar.b = null;
        h40VarB.p();
        try {
            qc6Var.b.a.i(f4, fC1);
            try {
                wsrVar.b2();
                float f5 = -f4;
                float f6 = -fC1;
                qc6Var.b.a.i(f5, f6);
                h40VarB.f();
                qc6.b bVar2 = qc6Var.b;
                bVar2.f(mmdVarB);
                bVar2.g(asrVarC);
                bVar2.e(lc6VarA);
                bVar2.h(jD3);
                bVar2.b = v6lVar;
                t2().endRecording();
                int iSave = canvasC.save();
                canvasC.translate(f5, f6);
                canvasC.drawRenderNode(t2());
                canvasC.restoreToCount(iSave);
            } catch (Throwable th) {
                qc6Var.b.a.i(-f4, -fC1);
                throw th;
            }
        } catch (Throwable th2) {
            h40VarB.f();
            qc6.b bVar3 = qc6Var.b;
            bVar3.f(mmdVarB);
            bVar3.g(asrVarC);
            bVar3.e(lc6VarA);
            bVar3.h(jD3);
            bVar3.b = v6lVar;
            throw th2;
        }
    }

    public final RenderNode t2() {
        RenderNode renderNode = this.H;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeA = x8e0.a();
        this.H = renderNodeA;
        return renderNodeA;
    }
}
