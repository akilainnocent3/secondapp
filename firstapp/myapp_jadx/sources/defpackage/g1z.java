package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import com.sporty.android.core.model.bookingcode.jT.yFmFZvuWxAYfEj;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class g1z {
    public Thread c;
    public EGLConfig g;
    public Surface i;
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final HashMap b = new HashMap();
    public EGLDisplay d = EGL14.EGL_NO_DISPLAY;
    public EGLContext e = EGL14.EGL_NO_CONTEXT;
    public int[] f = hej.a;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public Map<hej.e, hej.f> j = Collections.EMPTY_MAP;
    public hej.f k = null;
    public hej.e l = hej.e.a;
    public int m = -1;

    public final void a(dhf dhfVar, li1.a aVar) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.d = eGLDisplayEglGetDisplay;
        if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            ib5.a("Unable to get EGL14 display");
            return;
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.d, iArr, 0, iArr, 1)) {
            this.d = EGL14.EGL_NO_DISPLAY;
            ib5.a("Unable to initialize EGL14");
            return;
        }
        if (aVar != null) {
            aVar.b = iArr[0] + "." + iArr[1];
        }
        int i = dhfVar.a() ? 10 : 8;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.d, new int[]{12324, i, 12323, i, 12322, i, 12321, dhfVar.a() ? 2 : 8, 12325, 0, 12326, 0, 12352, dhfVar.a() ? 64 : 4, 12610, dhfVar.a() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            ib5.a("Unable to find a suitable EGLConfig");
            return;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.d, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, dhfVar.a() ? 3 : 2, 12344}, 0);
        hej.a("eglCreateContext");
        this.g = eGLConfig;
        this.e = eGLContextEglCreateContext;
        int[] iArr2 = new int[1];
        EGL14.eglQueryContext(this.d, eGLContextEglCreateContext, 12440, iArr2, 0);
        Log.d("OpenGlRenderer", "EGLContext created, client version " + iArr2[0]);
    }

    public final tj1 b(Surface surface) {
        try {
            EGLDisplay eGLDisplay = this.d;
            EGLConfig eGLConfig = this.g;
            Objects.requireNonNull(eGLConfig);
            EGLSurface eGLSurfaceI = hej.i(eGLDisplay, eGLConfig, surface, this.f);
            EGLDisplay eGLDisplay2 = this.d;
            int[] iArr = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceI, 12375, iArr, 0);
            int i = iArr[0];
            int[] iArr2 = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceI, 12374, iArr2, 0);
            Size size = new Size(i, iArr2[0]);
            return new tj1(eGLSurfaceI, size.getWidth(), size.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e) {
            pgt.j("OpenGlRenderer", "Failed to create EGL surface: " + e.getMessage(), e);
            return null;
        }
    }

    public final void c() {
        EGLDisplay eGLDisplay = this.d;
        EGLConfig eGLConfig = this.g;
        Objects.requireNonNull(eGLConfig);
        int[] iArr = hej.a;
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        hej.a("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface != null) {
            this.h = eGLSurfaceEglCreatePbufferSurface;
        } else {
            ib5.a("surface was null");
        }
    }

    public li1 e(dhf dhfVar) throws Throwable {
        Map map = Collections.EMPTY_MAP;
        AtomicBoolean atomicBoolean = this.a;
        hej.d(atomicBoolean, false);
        li1.a aVar = new li1.a();
        aVar.a = "0.0";
        aVar.b = "0.0";
        aVar.c = "";
        aVar.d = "";
        try {
            if (dhfVar.a()) {
                frz<String, String> frzVarD = d(dhfVar);
                String str = frzVarD.a;
                str.getClass();
                String str2 = frzVarD.b;
                str2.getClass();
                if (!str.contains("GL_EXT_YUV_target")) {
                    pgt.i("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                    dhfVar = dhf.d;
                }
                this.f = hej.f(str2, dhfVar);
                aVar.c = str;
                aVar.d = str2;
            }
            a(dhfVar, aVar);
            c();
            f(this.h);
            aVar.a = hej.j();
            this.j = hej.g(dhfVar);
            int iH = hej.h();
            this.m = iH;
            k(iH);
            this.c = Thread.currentThread();
            atomicBoolean.set(true);
            if ("".isEmpty()) {
                return new li1(aVar.a, aVar.b, aVar.c, aVar.d);
            }
            ib5.a("Missing required properties:".concat(""));
            return null;
        } catch (IllegalArgumentException e) {
            e = e;
            h();
            throw e;
        } catch (IllegalStateException e2) {
            e = e2;
            h();
            throw e;
        }
    }

    public final void f(EGLSurface eGLSurface) {
        this.d.getClass();
        this.e.getClass();
        if (EGL14.eglMakeCurrent(this.d, eGLSurface, eGLSurface, this.e)) {
            return;
        }
        ib5.a("eglMakeCurrent failed");
    }

    public final void g(Surface surface) {
        hej.d(this.a, true);
        hej.c(this.c);
        HashMap map = this.b;
        if (map.containsKey(surface)) {
            return;
        }
        map.put(surface, hej.j);
    }

    public final void h() {
        Iterator<hej.f> it = this.j.values().iterator();
        while (it.hasNext()) {
            GLES20.glDeleteProgram(it.next().a);
        }
        this.j = Collections.EMPTY_MAP;
        this.k = null;
        if (!Objects.equals(this.d, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = this.d;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            HashMap map = this.b;
            for (xaz xazVar : map.values()) {
                if (!Objects.equals(xazVar.a(), EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.d, xazVar.a())) {
                    try {
                        hej.a("eglDestroySurface");
                    } catch (IllegalStateException e) {
                        pgt.d("GLUtils", e.toString(), e);
                    }
                }
            }
            map.clear();
            if (!Objects.equals(this.h, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.d, this.h);
                this.h = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals(this.e, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.d, this.e);
                this.e = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.d);
            this.d = EGL14.EGL_NO_DISPLAY;
        }
        this.g = null;
        this.m = -1;
        this.l = hej.e.a;
        this.i = null;
        this.c = null;
    }

    public final void i(Surface surface, boolean z) {
        if (this.i == surface) {
            this.i = null;
            f(this.h);
        }
        HashMap map = this.b;
        xaz xazVar = z ? (xaz) map.remove(surface) : (xaz) map.put(surface, hej.j);
        if (xazVar == null || xazVar == hej.j) {
            return;
        }
        try {
            EGL14.eglDestroySurface(this.d, xazVar.a());
        } catch (RuntimeException e) {
            pgt.j("OpenGlRenderer", "Failed to destroy EGL surface: " + e.getMessage(), e);
        }
    }

    public final void j(long j, float[] fArr, Surface surface) {
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
        if (surface != this.i) {
            f(xazVarB.a());
            this.i = surface;
            GLES20.glViewport(0, 0, xazVarB.c(), xazVarB.b());
            GLES20.glScissor(0, 0, xazVarB.c(), xazVarB.b());
        }
        hej.f fVar = this.k;
        fVar.getClass();
        if (fVar instanceof hej.g) {
            GLES20.glUniformMatrix4fv(((hej.g) fVar).f, 1, false, fArr, 0);
            hej.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        hej.b("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID(this.d, xazVarB.a(), j);
        if (EGL14.eglSwapBuffers(this.d, xazVarB.a())) {
            return;
        }
        pgt.i("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        i(surface, false);
    }

    public final void k(int i) {
        hej.f fVar = this.j.get(this.l);
        if (fVar == null) {
            uj5.a(this.l, "Unable to configure program for input format: ");
            return;
        }
        if (this.k != fVar) {
            this.k = fVar;
            fVar.b();
            Log.d("OpenGlRenderer", "Using program for input format " + this.l + ": " + this.k);
        }
        GLES20.glActiveTexture(33984);
        hej.b("glActiveTexture");
        GLES20.glBindTexture(36197, i);
        hej.b("glBindTexture");
    }

    public final frz<String, String> d(dhf dhfVar) {
        hej.d(this.a, false);
        try {
            a(dhfVar, null);
            c();
            f(this.h);
            String strGlGetString = GLES20.glGetString(7939);
            String strEglQueryString = EGL14.eglQueryString(this.d, 12373);
            if (strGlGetString == null) {
                strGlGetString = "";
            }
            if (strEglQueryString == null) {
                strEglQueryString = "";
            }
            return new frz<>(strGlGetString, strEglQueryString);
        } catch (IllegalStateException e) {
            pgt.j(yFmFZvuWxAYfEj.ePzPytNXx, "Failed to get GL or EGL extensions: " + e.getMessage(), e);
            return new frz<>("", "");
        } finally {
            h();
        }
    }
}
