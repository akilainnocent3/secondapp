package eh;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@k.t0(17)
@Deprecated
public final class r implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f81173i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f81174j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f81175k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f81176l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f81177m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f81178n = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f81179o = 12992;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f81180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f81181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final b f81182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public EGLDisplay f81183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public EGLContext f81184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public EGLSurface f81185g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public SurfaceTexture f81186h;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        void a();
    }

    public r(Handler handler) {
        this(handler, null);
    }

    public static EGLConfig a(EGLDisplay eGLDisplay) throws b0.b {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f81178n, 0, eGLConfigArr, 0, 1, iArr, 0);
        b0.f(zEglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null, o1.M("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        return eGLConfigArr[0];
    }

    public static EGLContext b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) throws b0.b {
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        b0.f(eGLContextEglCreateContext != null, "eglCreateContext failed");
        return eGLContextEglCreateContext;
    }

    public static EGLSurface c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i10) throws b0.b {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        if (i10 == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            b0.f(eGLSurfaceEglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        b0.f(EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext), "eglMakeCurrent failed");
        return eGLSurfaceEglCreatePbufferSurface;
    }

    public static void e(int[] iArr) throws b0.b {
        GLES20.glGenTextures(1, iArr, 0);
        b0.e();
    }

    public static EGLDisplay f() throws b0.b {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        b0.f(eGLDisplayEglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        b0.f(EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        return eGLDisplayEglGetDisplay;
    }

    public final void d() {
        b bVar = this.f81182d;
        if (bVar != null) {
            bVar.a();
        }
    }

    public SurfaceTexture g() {
        return (SurfaceTexture) eh.a.g(this.f81186h);
    }

    public void h(int i10) throws b0.b {
        EGLDisplay eGLDisplayF = f();
        this.f81183e = eGLDisplayF;
        EGLConfig eGLConfigA = a(eGLDisplayF);
        EGLContext eGLContextB = b(this.f81183e, eGLConfigA, i10);
        this.f81184f = eGLContextB;
        this.f81185g = c(this.f81183e, eGLConfigA, eGLContextB, i10);
        e(this.f81181c);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f81181c[0]);
        this.f81186h = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void i() {
        this.f81180b.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f81186h;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f81181c, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f81183e;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f81183e;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f81185g;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f81183e, this.f81185g);
            }
            EGLContext eGLContext = this.f81184f;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f81183e, eGLContext);
            }
            if (o1.f81142a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f81183e;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f81183e);
            }
            this.f81183e = null;
            this.f81184f = null;
            this.f81185g = null;
            this.f81186h = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f81180b.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        d();
        SurfaceTexture surfaceTexture = this.f81186h;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public r(Handler handler, @Nullable b bVar) {
        this.f81180b = handler;
        this.f81182d = bVar;
        this.f81181c = new int[1];
    }
}
