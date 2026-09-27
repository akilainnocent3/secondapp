package x4;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLU;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.os.Build;
import androidx.annotation.Nullable;
import cj.v6;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f144479a = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @k.y0({k.y0.a.LIBRARY_GROUP})
    public static final int f144480b = 4096;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f144481c = 2.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @t
    public static final long f144484f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f144485g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f144486h = "EGL_EXT_protected_content";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f144487i = "EGL_KHR_surfaceless_context";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f144488j = "GL_EXT_YUV_target";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f144489k = "EGL_EXT_gl_colorspace_bt2020_pq";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f144490l = "EGL_EXT_gl_colorspace_bt2020_hlg";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f144491m = 12445;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f144492n = 13120;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f144482d = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f144483e = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f144493o = {12445, 13120, 12344, 12344};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f144494p = 13632;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f144495q = {12445, f144494p, 12344, 12344};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f144496r = {12344};

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends Exception {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v6<Integer> f144497b;

        public a(String str) {
            this(str, v6.z());
        }

        public a(String str, List<Integer> list) {
            super(str);
            this.f144497b = v6.u(list);
        }
    }

    public static void A(int i10) throws a {
        GLES20.glDeleteFramebuffers(1, new int[]{i10}, 0);
        f();
    }

    public static void B(int i10) throws a {
        GLES20.glDeleteRenderbuffers(1, new int[]{i10}, 0);
        f();
    }

    public static void C(long j10) throws a {
        D(j10);
        f();
    }

    public static void D(long j10) {
        if (j10 == -1) {
            return;
        }
        GLES30.glDeleteSync(j10);
    }

    public static void E(int i10) throws a {
        GLES20.glDeleteTextures(1, new int[]{i10}, 0);
        f();
    }

    public static void F(@Nullable EGLDisplay eGLDisplay, @Nullable EGLContext eGLContext) throws a {
        if (eGLDisplay == null || eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
            return;
        }
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        e("Error releasing context");
        if (eGLContext == null || eGLContext.equals(EGL14.EGL_NO_CONTEXT)) {
            return;
        }
        EGL14.eglDestroyContext(eGLDisplay, eGLContext);
        e("Error destroying context");
    }

    public static void G(@Nullable EGLDisplay eGLDisplay, @Nullable EGLSurface eGLSurface) throws a {
        if (eGLDisplay == null || eGLDisplay.equals(EGL14.EGL_NO_DISPLAY) || eGLSurface == null || eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
            return;
        }
        EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
        e("Error destroying surface");
    }

    public static void H(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i10, int i11) throws a {
        K(eGLDisplay, eGLContext, eGLSurface, 0, i10, i11);
    }

    public static void I(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i10, int i11, int i12) throws a {
        K(eGLDisplay, eGLContext, eGLSurface, i10, i11, i12);
    }

    public static void J(int i10, int i11, int i12) throws a {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        if (iArr[0] != i10) {
            GLES20.glBindFramebuffer(36160, i10);
        }
        f();
        GLES20.glViewport(0, 0, i11, i12);
        f();
    }

    public static void K(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i10, int i11, int i12) throws a {
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        e("Error making context current");
        J(i10, i11, i12);
        if (eGLSurface.equals(EGL14.EGL_NO_SURFACE) || i10 != 0 || M() < 3) {
            return;
        }
        GLES30.glDrawBuffers(1, new int[]{1029}, 0);
        f();
        GLES30.glReadBuffer(1029);
        f();
    }

    public static int L() throws a {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        f();
        return iArr[0];
    }

    public static long M() throws a {
        int[] iArr = new int[1];
        EGL14.eglQueryContext(EGL14.eglGetDisplay(0), EGL14.eglGetCurrentContext(), 12440, iArr, 0);
        f();
        return iArr[0];
    }

    public static EGLContext N() {
        return EGL14.eglGetCurrentContext();
    }

    public static EGLDisplay O() throws a {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        g(!eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY), "No EGL display.");
        g(EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0), "Error in eglInitialize.");
        e("Error in getDefaultEglDisplay");
        return eGLDisplayEglGetDisplay;
    }

    public static EGLConfig P(EGLDisplay eGLDisplay, int[] iArr) throws a {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        throw new a("eglChooseConfig failed.");
    }

    public static float[] Q() {
        return new float[]{-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static float[] R() {
        return new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static boolean S() throws a {
        return V(f144490l);
    }

    public static boolean T() throws a {
        return Build.VERSION.SDK_INT >= 33 && V("EGL_EXT_gl_colorspace_bt2020_pq");
    }

    public static boolean U(int i10) throws a {
        if (i10 == 6) {
            return T();
        }
        if (i10 == 7) {
            return S();
        }
        return true;
    }

    public static boolean V(String str) throws a {
        String strEglQueryString = EGL14.eglQueryString(O(), 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }

    public static boolean W(Context context) throws a {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 24) {
            return false;
        }
        if (i10 < 26 && (com.google.android.material.internal.n.f51099b.equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) {
            return false;
        }
        if (i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return V("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean X() throws a {
        return V("EGL_KHR_surfaceless_context");
    }

    public static boolean Y() {
        String strGlGetString;
        if (Objects.equals(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT)) {
            try {
                EGLDisplay eGLDisplayO = O();
                EGLContext eGLContextM = m(eGLDisplayO);
                q(eGLContextM, eGLDisplayO);
                strGlGetString = GLES20.glGetString(7939);
                F(eGLDisplayO, eGLContextM);
            } catch (a unused) {
                return false;
            }
        } else {
            strGlGetString = GLES20.glGetString(7939);
        }
        return strGlGetString != null && strGlGetString.contains("GL_EXT_YUV_target");
    }

    @k.t0(24)
    public static ByteBuffer Z(int i10, int i11) throws a {
        GLES20.glBindBuffer(35051, i10);
        f();
        ByteBuffer byteBuffer = (ByteBuffer) GLES30.glMapBufferRange(35051, 0, i11, 1);
        f();
        GLES20.glBindBuffer(35051, 0);
        f();
        return byteBuffer;
    }

    public static void a(int i10, int i11) throws a {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(3379, iArr, 0);
        int i12 = iArr[0];
        zi.l0.h0(i12 > 0, "Create a OpenGL context first or run the GL methods on an OpenGL thread.");
        if (i10 < 0 || i11 < 0) {
            throw new a("width or height is less than 0");
        }
        if (i10 > i12 || i11 > i12) {
            throw new a("width or height is greater than GL_MAX_TEXTURE_SIZE " + i12);
        }
    }

    @k.t0(24)
    public static void a0(int i10, int i11, int i12, int i13) throws a {
        J(i10, i11, i12);
        GLES20.glBindBuffer(35051, i13);
        f();
        GLES30.glReadBuffer(36064);
        GLES30.glReadPixels(0, 0, i11, i12, 6408, 5121, 0);
        f();
        GLES20.glBindBuffer(35051, 0);
        f();
    }

    public static void b(long j10) throws a {
        if (j10 == -1) {
            return;
        }
        if (j10 == 0) {
            GLES20.glFinish();
        } else {
            GLES30.glWaitSync(j10, 0, -1L);
            f();
        }
    }

    public static void b0(int i10, Bitmap bitmap) throws a {
        a(bitmap.getWidth(), bitmap.getHeight());
        c(3553, i10, u4.a0.Q3);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        f();
    }

    public static void c(int i10, int i11, int i12) throws a {
        GLES20.glBindTexture(i10, i11);
        f();
        GLES20.glTexParameteri(i10, androidx.work.e.f20077d, i12);
        f();
        GLES20.glTexParameteri(i10, 10241, i12);
        f();
        GLES20.glTexParameteri(i10, 10242, 33071);
        f();
        GLES20.glTexParameteri(i10, 10243, 33071);
        f();
    }

    public static void c0(float[] fArr) {
        Matrix.setIdentityM(fArr, 0);
    }

    public static void d(int i10, v vVar, int i11, v vVar2) throws a {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        f();
        GLES20.glBindFramebuffer(36008, i10);
        f();
        GLES20.glBindFramebuffer(36009, i11);
        f();
        GLES30.glBlitFramebuffer(vVar.f144460a, vVar.f144461b, vVar.f144462c, vVar.f144463d, vVar2.f144460a, vVar2.f144461b, vVar2.f144462c, vVar2.f144463d, 16384, u4.a0.Q3);
        f();
        GLES20.glBindFramebuffer(36160, iArr[0]);
        f();
    }

    public static void d0(EGLDisplay eGLDisplay) throws a {
        EGL14.eglReleaseThread();
        e("Error releasing thread");
        EGL14.eglTerminate(eGLDisplay);
        e("Error terminating display");
    }

    public static void e(String str) throws a {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        throw new a(str + ", error code: 0x" + Integer.toHexString(iEglGetError), v6.A(Integer.valueOf(iEglGetError)));
    }

    @k.t0(24)
    public static void e0(int i10) throws a {
        GLES20.glBindBuffer(35051, i10);
        f();
        GLES30.glUnmapBuffer(35051);
        f();
        GLES20.glBindBuffer(35051, 0);
        f();
    }

    public static void f() throws a {
        StringBuilder sb2 = new StringBuilder();
        v6.a aVar = new v6.a();
        boolean z10 = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z10) {
                sb2.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + Integer.toHexString(iGlGetError);
            }
            sb2.append("glError: ");
            sb2.append(strGluErrorString);
            aVar.g(Integer.valueOf(iGlGetError));
            z10 = true;
        }
        if (z10) {
            throw new a(sb2.toString(), aVar.e());
        }
    }

    public static void g(boolean z10, String str) throws a {
        if (!z10) {
            throw new a(str);
        }
    }

    public static void h() throws a {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClearDepthf(1.0f);
        GLES20.glClear(16640);
        f();
    }

    public static float[] i() {
        float[] fArr = new float[16];
        c0(fArr);
        return fArr;
    }

    public static FloatBuffer j(int i10) {
        return ByteBuffer.allocateDirect(i10 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static FloatBuffer k(float[] fArr) {
        return (FloatBuffer) j(fArr.length).put(fArr).flip();
    }

    public static EGLContext l(EGLContext eGLContext, EGLDisplay eGLDisplay, @k.e0(from = 2, to = 3) int i10, int[] iArr) throws a {
        boolean z10 = true;
        zi.l0.d(Arrays.equals(iArr, f144482d) || Arrays.equals(iArr, f144483e));
        if (i10 != 2 && i10 != 3) {
            z10 = false;
        }
        zi.l0.d(z10);
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, P(eGLDisplay, iArr), eGLContext, new int[]{12440, i10, 12344}, 0);
        if (eGLContextEglCreateContext != null && !eGLContextEglCreateContext.equals(EGL14.EGL_NO_CONTEXT)) {
            e("Error in createEglContext");
            return eGLContextEglCreateContext;
        }
        EGL14.eglTerminate(eGLDisplay);
        throw new a("eglCreateContext() failed to create a valid context. The device may not support EGL version " + i10);
    }

    public static EGLContext m(EGLDisplay eGLDisplay) throws a {
        return l(EGL14.EGL_NO_CONTEXT, eGLDisplay, 2, f144482d);
    }

    public static EGLSurface n(EGLDisplay eGLDisplay, Object obj, int i10, boolean z10) throws a {
        int[] iArr;
        int[] iArr2;
        if (i10 == 3 || i10 == 10) {
            iArr = f144482d;
            iArr2 = f144496r;
        } else {
            if (i10 != 7 && i10 != 6) {
                throw new IllegalArgumentException("Unsupported color transfer: " + i10);
            }
            iArr = f144483e;
            if (z10) {
                iArr2 = f144496r;
            } else if (i10 == 6) {
                if (!T()) {
                    throw new a("BT.2020 PQ OpenGL output isn't supported.");
                }
                iArr2 = f144493o;
            } else {
                if (!S()) {
                    throw new a("BT.2020 HLG OpenGL output isn't supported.");
                }
                iArr2 = f144495q;
            }
        }
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, P(eGLDisplay, iArr), obj, iArr2, 0);
        e("Error creating a new EGL surface");
        return eGLSurfaceEglCreateWindowSurface;
    }

    public static int o() throws a {
        int iL = L();
        c(36197, iL, u4.a0.Q3);
        return iL;
    }

    public static int p(int i10) throws a {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        f();
        GLES20.glBindFramebuffer(36160, iArr[0]);
        f();
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i10, 0);
        f();
        return iArr[0];
    }

    public static EGLSurface q(EGLContext eGLContext, EGLDisplay eGLDisplay) throws a {
        EGLSurface eGLSurfaceS = X() ? EGL14.EGL_NO_SURFACE : s(eGLDisplay, 1, 1, f144482d);
        H(eGLDisplay, eGLContext, eGLSurfaceS, 1, 1);
        return eGLSurfaceS;
    }

    public static long r() throws a {
        if (M() < 3) {
            return 0L;
        }
        long jGlFenceSync = GLES30.glFenceSync(37143, 0);
        f();
        GLES20.glFlush();
        f();
        return jGlFenceSync;
    }

    public static EGLSurface s(EGLDisplay eGLDisplay, int i10, int i11, int[] iArr) throws a {
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, P(eGLDisplay, iArr), new int[]{12375, i10, 12374, i11, 12344}, 0);
        e("Error creating a new EGL Pbuffer surface");
        return eGLSurfaceEglCreatePbufferSurface;
    }

    public static int t(int i10) throws a {
        int[] iArr = new int[1];
        GLES20.glGenBuffers(1, iArr, 0);
        f();
        GLES20.glBindBuffer(35051, iArr[0]);
        f();
        GLES20.glBufferData(35051, i10, null, 35049);
        f();
        GLES20.glBindBuffer(35051, 0);
        f();
        return iArr[0];
    }

    public static int u(int i10, int i11) throws a {
        return x(i10, i11, 32857, 33640);
    }

    public static int v(int i10, int i11, boolean z10) throws a {
        return z10 ? x(i10, i11, 34842, 5131) : x(i10, i11, 6408, 5121);
    }

    public static int w(Bitmap bitmap) throws a {
        int iL = L();
        b0(iL, bitmap);
        return iL;
    }

    public static int x(int i10, int i11, int i12, int i13) throws a {
        a(i10, i11);
        int iL = L();
        c(3553, iL, u4.a0.Q3);
        GLES20.glTexImage2D(3553, 0, i12, i10, i11, 0, 6408, i13, null);
        f();
        return iL;
    }

    public static float[] y(List<float[]> list) {
        float[] fArr = new float[list.size() * 4];
        for (int i10 = 0; i10 < list.size(); i10++) {
            System.arraycopy(list.get(i10), 0, fArr, i10 * 4, 4);
        }
        return fArr;
    }

    public static void z(int i10) throws a {
        GLES20.glDeleteBuffers(1, new int[]{i10}, 0);
        f();
    }
}
