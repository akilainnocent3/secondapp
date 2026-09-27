package eh;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.opengl.Matrix;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f80909a = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f80910b = 2.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f80913e = "EGL_EXT_protected_content";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f80914f = "EGL_KHR_surfaceless_context";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f80915g = "GL_EXT_YUV_target";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f80916h = "EGL_EXT_gl_colorspace_bt2020_pq";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f80917i = 12445;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f80918j = 13120;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f80911c = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f80912d = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f80919k = {12445, 13120, 12344, 12344};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f80920l = {12344};

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(17)
    public static final class a {
        @k.t
        public static EGLContext a(EGLContext eGLContext, EGLDisplay eGLDisplay, int i10, int[] iArr) throws b {
            EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, i(eGLDisplay, iArr), eGLContext, new int[]{12440, i10, 12344}, 0);
            if (eGLContextEglCreateContext != null) {
                b0.e();
                return eGLContextEglCreateContext;
            }
            EGL14.eglTerminate(eGLDisplay);
            throw new b("eglCreateContext() failed to create a valid context. The device may not support EGL version " + i10);
        }

        @k.t
        public static EGLDisplay b() throws b {
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            b0.f(!eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY), "No EGL display.");
            b0.f(EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0), "Error in eglInitialize.");
            b0.e();
            return eGLDisplayEglGetDisplay;
        }

        @k.t
        public static EGLSurface c(EGLDisplay eGLDisplay, int[] iArr, int[] iArr2) throws b {
            EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, i(eGLDisplay, iArr), iArr2, 0);
            b0.d("Error creating surface");
            return eGLSurfaceEglCreatePbufferSurface;
        }

        @k.t
        public static EGLSurface d(EGLDisplay eGLDisplay, Object obj, int[] iArr, int[] iArr2) throws b {
            EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, i(eGLDisplay, iArr), obj, iArr2, 0);
            b0.d("Error creating surface");
            return eGLSurfaceEglCreateWindowSurface;
        }

        @k.t
        public static void e(@Nullable EGLDisplay eGLDisplay, @Nullable EGLContext eGLContext) throws b {
            if (eGLDisplay == null) {
                return;
            }
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            b0.d("Error releasing context");
            if (eGLContext != null) {
                EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                b0.d("Error destroying context");
            }
            EGL14.eglReleaseThread();
            b0.d("Error releasing thread");
            EGL14.eglTerminate(eGLDisplay);
            b0.d("Error terminating display");
        }

        @k.t
        public static void f(@Nullable EGLDisplay eGLDisplay, @Nullable EGLSurface eGLSurface) throws b {
            if (eGLDisplay == null || eGLSurface == null) {
                return;
            }
            EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
            b0.d("Error destroying surface");
        }

        @k.t
        public static void g(int i10, int i11, int i12) throws b {
            b0.f(!o1.g(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT), "No current context");
            int[] iArr = new int[1];
            GLES20.glGetIntegerv(36006, iArr, 0);
            if (iArr[0] != i10) {
                GLES20.glBindFramebuffer(36160, i10);
            }
            b0.e();
            GLES20.glViewport(0, 0, i11, i12);
            b0.e();
        }

        @k.t
        public static void h(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i10, int i11, int i12) throws b {
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
            b0.d("Error making context current");
            g(i10, i11, i12);
        }

        @k.t
        private static EGLConfig i(EGLDisplay eGLDisplay, int[] iArr) throws b {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                return eGLConfigArr[0];
            }
            throw new b("eglChooseConfig failed.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends Exception {
        public b(String str) {
            super(str);
        }
    }

    @k.t0(17)
    public static void A(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i10, int i11) throws b {
        a.h(eGLDisplay, eGLContext, eGLSurface, 0, i10, i11);
    }

    @k.t0(17)
    public static void B(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i10, int i11, int i12) throws b {
        a.h(eGLDisplay, eGLContext, eGLSurface, i10, i11, i12);
    }

    @k.t0(17)
    public static void C(int i10, int i11, int i12) throws b {
        a.g(i10, i11, i12);
    }

    @k.t0(17)
    public static EGLSurface D(EGLContext eGLContext, EGLDisplay eGLDisplay) throws b {
        return q(eGLContext, eGLDisplay, f80911c);
    }

    public static int E() throws b {
        f(!o1.g(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT), "No current context");
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        e();
        return iArr[0];
    }

    public static EGLContext F() {
        return EGL14.eglGetCurrentContext();
    }

    public static float[] G() {
        return new float[]{-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static float[] H() {
        return new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static boolean I() {
        String strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        return strEglQueryString != null && strEglQueryString.contains("EGL_EXT_gl_colorspace_bt2020_pq");
    }

    public static boolean J(Context context) {
        String strEglQueryString;
        int i10 = o1.f81142a;
        if (i10 < 24) {
            return false;
        }
        if (i10 >= 26 || !(com.google.android.material.internal.n.f51099b.equals(o1.f81144c) || "XT1650".equals(o1.f81145d))) {
            return (i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean K() {
        String strEglQueryString;
        return o1.f81142a >= 17 && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_KHR_surfaceless_context");
    }

    public static boolean L() {
        String strGlGetString;
        if (o1.f81142a < 17) {
            return false;
        }
        if (o1.g(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT)) {
            try {
                EGLDisplay eGLDisplayM = m();
                EGLContext eGLContextL = l(eGLDisplayM);
                D(eGLContextL, eGLDisplayM);
                strGlGetString = GLES20.glGetString(7939);
                y(eGLDisplayM, eGLContextL);
            } catch (b unused) {
                return false;
            }
        } else {
            strGlGetString = GLES20.glGetString(7939);
        }
        return strGlGetString != null && strGlGetString.contains("GL_EXT_YUV_target");
    }

    public static void M(float[] fArr) {
        Matrix.setIdentityM(fArr, 0);
    }

    public static void b(int i10, int i11) throws b {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(3379, iArr, 0);
        int i12 = iArr[0];
        eh.a.j(i12 > 0, "Create a OpenGL context first or run the GL methods on an OpenGL thread.");
        if (i10 < 0 || i11 < 0) {
            throw new b("width or height is less than 0");
        }
        if (i10 > i12 || i11 > i12) {
            throw new b("width or height is greater than GL_MAX_TEXTURE_SIZE " + i12);
        }
    }

    public static void c(int i10, int i11) throws b {
        GLES20.glBindTexture(i10, i11);
        e();
        GLES20.glTexParameteri(i10, androidx.work.e.f20077d, u4.a0.Q3);
        e();
        GLES20.glTexParameteri(i10, 10241, u4.a0.Q3);
        e();
        GLES20.glTexParameteri(i10, 10242, 33071);
        e();
        GLES20.glTexParameteri(i10, 10243, 33071);
        e();
    }

    public static void d(String str) throws b {
        int iEglGetError = EGL14.eglGetError();
        f(iEglGetError == 12288, str + ", error code: " + iEglGetError);
    }

    public static void e() throws b {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z10) {
                sb2.append('\n');
            }
            sb2.append("glError: ");
            sb2.append(GLU.gluErrorString(iGlGetError));
            z10 = true;
        }
        if (z10) {
            throw new b(sb2.toString());
        }
    }

    public static void f(boolean z10, String str) throws b {
        if (!z10) {
            throw new b(str);
        }
    }

    public static void g() throws b {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClearDepthf(1.0f);
        GLES20.glClear(16640);
        e();
    }

    public static float[] h() {
        float[] fArr = new float[16];
        M(fArr);
        return fArr;
    }

    public static FloatBuffer i(int i10) {
        return ByteBuffer.allocateDirect(i10 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static FloatBuffer j(float[] fArr) {
        return (FloatBuffer) i(fArr.length).put(fArr).flip();
    }

    @k.t0(17)
    public static EGLContext k(EGLContext eGLContext, EGLDisplay eGLDisplay, @k.e0(from = 2, to = 3) int i10, int[] iArr) throws b {
        boolean z10 = true;
        eh.a.a(Arrays.equals(iArr, f80911c) || Arrays.equals(iArr, f80912d));
        if (i10 != 2 && i10 != 3) {
            z10 = false;
        }
        eh.a.a(z10);
        return a.a(eGLContext, eGLDisplay, i10, iArr);
    }

    @k.t0(17)
    public static EGLContext l(EGLDisplay eGLDisplay) throws b {
        return k(EGL14.EGL_NO_CONTEXT, eGLDisplay, 2, f80911c);
    }

    @k.t0(17)
    public static EGLDisplay m() throws b {
        return a.b();
    }

    @k.t0(17)
    public static EGLSurface n(EGLDisplay eGLDisplay, Object obj, int i10, boolean z10) throws b {
        int[] iArr;
        int[] iArr2;
        if (i10 == 3 || i10 == 10) {
            iArr = f80911c;
            iArr2 = f80920l;
        } else if (i10 == 6) {
            iArr = f80912d;
            iArr2 = z10 ? f80920l : f80919k;
        } else {
            if (i10 != 7) {
                throw new IllegalArgumentException("Unsupported color transfer: " + i10);
            }
            eh.a.b(z10, "Outputting HLG to the screen is not supported.");
            iArr = f80912d;
            iArr2 = f80920l;
        }
        return a.d(eGLDisplay, obj, iArr, iArr2);
    }

    public static int o() throws b {
        int iE = E();
        c(36197, iE);
        return iE;
    }

    public static int p(int i10) throws b {
        f(!o1.g(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT), "No current context");
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        e();
        GLES20.glBindFramebuffer(36160, iArr[0]);
        e();
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i10, 0);
        e();
        return iArr[0];
    }

    @k.t0(17)
    public static EGLSurface q(EGLContext eGLContext, EGLDisplay eGLDisplay, int[] iArr) throws b {
        EGLSurface eGLSurfaceR = K() ? EGL14.EGL_NO_SURFACE : r(eGLDisplay, 1, 1, iArr);
        A(eGLDisplay, eGLContext, eGLSurfaceR, 1, 1);
        return eGLSurfaceR;
    }

    @k.t0(17)
    public static EGLSurface r(EGLDisplay eGLDisplay, int i10, int i11, int[] iArr) throws b {
        return a.c(eGLDisplay, iArr, new int[]{12375, i10, 12374, i11, 12344});
    }

    public static int s(int i10, int i11, int i12, int i13) throws b {
        b(i10, i11);
        int iE = E();
        c(3553, iE);
        GLES20.glTexImage2D(3553, 0, i12, i10, i11, 0, 6408, i13, ByteBuffer.allocateDirect(i10 * i11 * 4));
        e();
        return iE;
    }

    public static int t(int i10, int i11, boolean z10) throws b {
        if (!z10) {
            return s(i10, i11, 6408, 5121);
        }
        eh.a.j(o1.f81142a >= 18, "GLES30 extensions are not supported below API 18.");
        return s(i10, i11, 34842, 5131);
    }

    public static float[] u(List<float[]> list) {
        float[] fArr = new float[list.size() * 4];
        for (int i10 = 0; i10 < list.size(); i10++) {
            System.arraycopy(list.get(i10), 0, fArr, i10 * 4, 4);
        }
        return fArr;
    }

    public static void v(int i10) throws b {
        GLES20.glDeleteFramebuffers(1, new int[]{i10}, 0);
        e();
    }

    public static void w(int i10) throws b {
        GLES20.glDeleteRenderbuffers(1, new int[]{i10}, 0);
        e();
    }

    public static void x(int i10) throws b {
        GLES20.glDeleteTextures(1, new int[]{i10}, 0);
        e();
    }

    @k.t0(17)
    public static void y(@Nullable EGLDisplay eGLDisplay, @Nullable EGLContext eGLContext) throws b {
        a.e(eGLDisplay, eGLContext);
    }

    @k.t0(17)
    public static void z(@Nullable EGLDisplay eGLDisplay, @Nullable EGLSurface eGLSurface) throws b {
        a.f(eGLDisplay, eGLSurface);
    }
}
