package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class uff extends g1z {
    public int n = -1;
    public int o = -1;
    public final ona p;
    public final ona q;

    public uff(ona onaVar, ona onaVar2) {
        this.p = onaVar;
        this.q = onaVar2;
    }

    @Override // defpackage.g1z
    public final li1 e(dhf dhfVar) throws Throwable {
        Map map = Collections.EMPTY_MAP;
        li1 li1VarE = super.e(dhfVar);
        this.n = hej.h();
        this.o = hej.h();
        return li1VarE;
    }

    public final void l(long j, Surface surface, lhe0 lhe0Var, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        hej.d(this.a, true);
        hej.c(this.c);
        HashMap map = this.b;
        km20.g("The surface is not registered.", map.containsKey(surface));
        xaz xazVarB = (xaz) map.get(surface);
        Objects.requireNonNull(xazVarB);
        if (xazVarB == hej.j) {
            xazVarB = b(surface);
            if (xazVarB == null) {
                return;
            } else {
                map.put(surface, xazVarB);
            }
        }
        xaz xazVar = xazVarB;
        if (surface != this.i) {
            f(xazVar.a());
            this.i = surface;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(Http2.INITIAL_MAX_FRAME_SIZE);
        m(xazVar, lhe0Var, surfaceTexture, this.p, this.n, true);
        m(xazVar, lhe0Var, surfaceTexture2, this.q, this.o, false);
        EGLExt.eglPresentationTimeANDROID(this.d, xazVar.a(), j);
        if (EGL14.eglSwapBuffers(this.d, xazVar.a())) {
            return;
        }
        pgt.i("DualOpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        i(surface, false);
    }

    public final void m(xaz xazVar, lhe0 lhe0Var, SurfaceTexture surfaceTexture, ona onaVar, int i, boolean z) {
        k(i);
        GLES20.glViewport(0, 0, xazVar.c(), xazVar.b());
        GLES20.glScissor(0, 0, xazVar.c(), xazVar.b());
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        lhe0Var.A(fArr2, fArr, z);
        hej.f fVar = this.k;
        fVar.getClass();
        if (fVar instanceof hej.g) {
            GLES20.glUniformMatrix4fv(((hej.g) fVar).f, 1, false, fArr2, 0);
            hej.b("glUniformMatrix4fv");
        }
        float fC = xazVar.c();
        frz<Float, Float> frzVar = onaVar.b;
        Size size = new Size((int) (frzVar.a.floatValue() * fC), (int) (frzVar.b.floatValue() * xazVar.b()));
        Size size2 = new Size(xazVar.c(), xazVar.b());
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        float[] fArr5 = new float[16];
        Matrix.setIdentityM(fArr5, 0);
        Matrix.scaleM(fArr3, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        frz<Float, Float> frzVar2 = onaVar.a;
        if (frzVar.a.floatValue() != 0.0f || frzVar.b.floatValue() != 0.0f) {
            Matrix.translateM(fArr4, 0, frzVar2.a.floatValue() / frzVar.a.floatValue(), frzVar2.b.floatValue() / frzVar.b.floatValue(), 0.0f);
        }
        Matrix.multiplyMM(fArr5, 0, fArr3, 0, fArr4, 0);
        GLES20.glUniformMatrix4fv(fVar.b, 1, false, fArr5, 0);
        hej.b("glUniformMatrix4fv");
        GLES20.glUniform1f(fVar.c, 1.0f);
        hej.b("glUniform1f");
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        hej.b("glDrawArrays");
        GLES20.glDisable(3042);
    }
}
