package yads;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class rl0 implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f155003h = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f155004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f155005c = new int[1];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EGLDisplay f155006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EGLContext f155007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EGLSurface f155008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SurfaceTexture f155009g;

    public rl0(Handler handler) {
        this.f155004b = handler;
    }

    public final SurfaceTexture a() {
        SurfaceTexture surfaceTexture = this.f155009g;
        surfaceTexture.getClass();
        return surfaceTexture;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        this.f155004b.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f155009g;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f155005c, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f155006d;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f155006d;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f155008f;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f155006d, this.f155008f);
            }
            EGLContext eGLContext = this.f155007e;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f155006d, eGLContext);
            }
            if (ib3.f150516a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f155006d;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f155006d);
            }
            this.f155006d = null;
            this.f155007e = null;
            this.f155008f = null;
            this.f155009g = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f155004b.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f155009g;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public final void a(int i10) {
        EGLConfig eGLConfig;
        int[] iArr;
        int[] iArr2;
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (eGLDisplayEglGetDisplay != null) {
            int[] iArr3 = new int[2];
            if (EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr3, 0, iArr3, 1)) {
                this.f155006d = eGLDisplayEglGetDisplay;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr4 = new int[1];
                boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, f155003h, 0, eGLConfigArr, 0, 1, iArr4, 0);
                if (zEglChooseConfig && iArr4[0] > 0 && (eGLConfig = eGLConfigArr[0]) != null) {
                    EGLDisplay eGLDisplay = this.f155006d;
                    if (i10 == 0) {
                        iArr = new int[]{12440, 2, 12344};
                    } else {
                        iArr = new int[]{12440, 2, 12992, 1, 12344};
                    }
                    EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
                    if (eGLContextEglCreateContext != null) {
                        this.f155007e = eGLContextEglCreateContext;
                        EGLDisplay eGLDisplay2 = this.f155006d;
                        if (i10 == 1) {
                            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
                        } else {
                            if (i10 == 2) {
                                iArr2 = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
                            } else {
                                iArr2 = new int[]{12375, 1, 12374, 1, 12344};
                            }
                            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay2, eGLConfig, iArr2, 0);
                            if (eGLSurfaceEglCreatePbufferSurface == null) {
                                throw new ql0("eglCreatePbufferSurface failed");
                            }
                        }
                        if (EGL14.eglMakeCurrent(eGLDisplay2, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext)) {
                            this.f155008f = eGLSurfaceEglCreatePbufferSurface;
                            GLES20.glGenTextures(1, this.f155005c, 0);
                            sz0.a();
                            SurfaceTexture surfaceTexture = new SurfaceTexture(this.f155005c[0]);
                            this.f155009g = surfaceTexture;
                            surfaceTexture.setOnFrameAvailableListener(this);
                            return;
                        }
                        throw new ql0("eglMakeCurrent failed");
                    }
                    throw new ql0("eglCreateContext failed");
                }
                Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr4[0]), eGLConfigArr[0]};
                int i11 = ib3.f150516a;
                throw new ql0(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr));
            }
            throw new ql0("eglInitialize failed");
        }
        throw new ql0("eglGetDisplay failed");
    }
}
