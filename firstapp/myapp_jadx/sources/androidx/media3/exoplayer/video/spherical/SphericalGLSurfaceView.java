package androidx.media3.exoplayer.video.spherical;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import defpackage.cft;
import defpackage.kzi;
import defpackage.lz60;
import defpackage.pxf0;
import defpackage.qzk;
import defpackage.s4i0;
import defpackage.t430;
import defpackage.v26;
import defpackage.v430;
import java.nio.Buffer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.luBk.Chyeyik;

/* JADX INFO: loaded from: classes.dex */
public final class SphericalGLSurfaceView extends GLSurfaceView {
    public static final /* synthetic */ int A = 0;
    public final CopyOnWriteArrayList<b> a;
    public final SensorManager b;
    public final Sensor c;
    public final androidx.media3.exoplayer.video.spherical.a d;
    public final Handler e;
    public final lz60 f;
    public SurfaceTexture i;
    public Surface v;
    public boolean w;
    public boolean y;
    public boolean z;

    public final class a implements GLSurfaceView.Renderer, androidx.media3.exoplayer.video.spherical.a.InterfaceC0065a {
        public final lz60 a;
        public final float[] d;
        public final float[] e;
        public final float[] f;
        public float i;
        public float v;
        public final float[] b = new float[16];
        public final float[] c = new float[16];
        public final float[] w = new float[16];
        public final float[] y = new float[16];

        public a(lz60 lz60Var) {
            float[] fArr = new float[16];
            this.d = fArr;
            float[] fArr2 = new float[16];
            this.e = fArr2;
            float[] fArr3 = new float[16];
            this.f = fArr3;
            this.a = lz60Var;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.v = 3.1415927f;
        }

        @Override // androidx.media3.exoplayer.video.spherical.a.InterfaceC0065a
        public final synchronized void a(float f, float[] fArr) {
            float[] fArr2 = this.d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            float f2 = -f;
            this.v = f2;
            Matrix.setRotateM(this.e, 0, -this.i, (float) Math.cos(f2), (float) Math.sin(this.v), 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
            float f = i / i2;
            Matrix.perspectiveM(this.b, 0, f > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f))) * 2.0d) : 90.0f, f, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            final SphericalGLSurfaceView sphericalGLSurfaceView = SphericalGLSurfaceView.this;
            final SurfaceTexture surfaceTextureA = this.a.a();
            int i = SphericalGLSurfaceView.A;
            sphericalGLSurfaceView.e.post(new Runnable() { // from class: kxa0
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = SphericalGLSurfaceView.A;
                    SphericalGLSurfaceView sphericalGLSurfaceView2 = sphericalGLSurfaceView;
                    SurfaceTexture surfaceTexture = sphericalGLSurfaceView2.i;
                    Surface surface = sphericalGLSurfaceView2.v;
                    SurfaceTexture surfaceTexture2 = surfaceTextureA;
                    Surface surface2 = new Surface(surfaceTexture2);
                    sphericalGLSurfaceView2.i = surfaceTexture2;
                    sphericalGLSurfaceView2.v = surface2;
                    Iterator<SphericalGLSurfaceView.b> it = sphericalGLSurfaceView2.a.iterator();
                    while (it.hasNext()) {
                        it.next().i(surface2);
                    }
                    if (surfaceTexture != null) {
                        surfaceTexture.release();
                    }
                    if (surface != null) {
                        surface.release();
                    }
                }
            });
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            float[] fArr;
            Long lD;
            synchronized (this) {
                Matrix.multiplyMM(this.y, 0, this.d, 0, this.f, 0);
                Matrix.multiplyMM(this.w, 0, this.e, 0, this.y, 0);
            }
            Matrix.multiplyMM(this.c, 0, this.b, 0, this.w, 0);
            lz60 lz60Var = this.a;
            float[] fArr2 = this.c;
            GLES20.glClear(Http2.INITIAL_MAX_FRAME_SIZE);
            try {
                qzk.b();
            } catch (qzk.a e) {
                cft.d("SceneRenderer", "Failed to draw a frame", e);
            }
            if (lz60Var.a.compareAndSet(true, false)) {
                SurfaceTexture surfaceTexture = lz60Var.y;
                surfaceTexture.getClass();
                surfaceTexture.updateTexImage();
                try {
                    qzk.b();
                } catch (qzk.a e2) {
                    cft.d("SceneRenderer", "Failed to draw a frame", e2);
                }
                if (lz60Var.b.compareAndSet(true, false)) {
                    Matrix.setIdentityM(lz60Var.i, 0);
                }
                long timestamp = lz60Var.y.getTimestamp();
                pxf0<Long> pxf0Var = lz60Var.e;
                synchronized (pxf0Var) {
                    lD = pxf0Var.d(timestamp, false);
                }
                Long l = lD;
                if (l != null) {
                    kzi kziVar = lz60Var.d;
                    float[] fArr3 = lz60Var.i;
                    float[] fArrF = kziVar.c.f(l.longValue());
                    if (fArrF != null) {
                        float[] fArr4 = kziVar.b;
                        float f = fArrF[0];
                        float f2 = -fArrF[1];
                        float f3 = -fArrF[2];
                        float length = Matrix.length(f, f2, f3);
                        if (length != 0.0f) {
                            Matrix.setRotateM(fArr4, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
                        } else {
                            Matrix.setIdentityM(fArr4, 0);
                        }
                        if (!kziVar.d) {
                            kzi.a(kziVar.a, kziVar.b);
                            kziVar.d = true;
                        }
                        Matrix.multiplyMM(fArr3, 0, kziVar.a, 0, kziVar.b, 0);
                    }
                }
                t430 t430VarF = lz60Var.f.f(timestamp);
                if (t430VarF != null) {
                    v430 v430Var = lz60Var.c;
                    if (v430.b(t430VarF)) {
                        v430Var.a = t430VarF.c;
                        v430Var.b = new v430.a(t430VarF.a.a[0]);
                        if (!t430VarF.d) {
                            t430.b bVar = t430VarF.b.a[0];
                            qzk.d(bVar.c);
                            qzk.d(bVar.d);
                        }
                    }
                }
            }
            Matrix.multiplyMM(lz60Var.v, 0, fArr2, 0, lz60Var.i, 0);
            v430 v430Var2 = lz60Var.c;
            int i = lz60Var.w;
            float[] fArr5 = lz60Var.v;
            String str = Chyeyik.UARztd;
            v430.a aVar = v430Var2.b;
            if (aVar == null) {
                return;
            }
            int i2 = v430Var2.a;
            if (i2 == 1) {
                fArr = v430.j;
            } else {
                fArr = i2 == 2 ? v430.k : v430.i;
            }
            GLES20.glUniformMatrix3fv(v430Var2.e, 1, false, fArr, 0);
            GLES20.glUniformMatrix4fv(v430Var2.d, 1, false, fArr5, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i);
            GLES20.glUniform1i(v430Var2.h, 0);
            try {
                qzk.b();
            } catch (qzk.a e3) {
                Log.e(str, "Failed to bind uniforms", e3);
            }
            GLES20.glVertexAttribPointer(v430Var2.f, 3, 5126, false, 12, (Buffer) aVar.b);
            try {
                qzk.b();
            } catch (qzk.a e4) {
                Log.e(str, "Failed to load position data", e4);
            }
            GLES20.glVertexAttribPointer(v430Var2.g, 2, 5126, false, 8, (Buffer) aVar.c);
            try {
                qzk.b();
            } catch (qzk.a e5) {
                Log.e(str, "Failed to load texture data", e5);
            }
            GLES20.glDrawArrays(aVar.d, 0, aVar.a);
            try {
                qzk.b();
            } catch (qzk.a e6) {
                Log.e(str, "Failed to render", e6);
            }
        }
    }

    public interface b {
        void i(Surface surface);

        void m();
    }

    public SphericalGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new CopyOnWriteArrayList<>();
        this.e = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.b = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        lz60 lz60Var = new lz60();
        this.f = lz60Var;
        a aVar = new a(lz60Var);
        View.OnTouchListener bVar = new androidx.media3.exoplayer.video.spherical.b(context, aVar);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.d = new androidx.media3.exoplayer.video.spherical.a(windowManager.getDefaultDisplay(), bVar, aVar);
        this.w = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(bVar);
    }

    public final void a() {
        boolean z = this.w && this.y;
        Sensor sensor = this.c;
        if (sensor == null || z == this.z) {
            return;
        }
        androidx.media3.exoplayer.video.spherical.a aVar = this.d;
        SensorManager sensorManager = this.b;
        if (z) {
            sensorManager.registerListener(aVar, sensor, 0);
        } else {
            sensorManager.unregisterListener(aVar);
        }
        this.z = z;
    }

    public v26 getCameraMotionListener() {
        return this.f;
    }

    public s4i0 getVideoFrameMetadataListener() {
        return this.f;
    }

    public Surface getVideoSurface() {
        return this.v;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.post(new Runnable() { // from class: jxa0
            @Override // java.lang.Runnable
            public final void run() {
                int i = SphericalGLSurfaceView.A;
                SphericalGLSurfaceView sphericalGLSurfaceView = this.a;
                Surface surface = sphericalGLSurfaceView.v;
                if (surface != null) {
                    Iterator<SphericalGLSurfaceView.b> it = sphericalGLSurfaceView.a.iterator();
                    while (it.hasNext()) {
                        it.next().m();
                    }
                }
                SurfaceTexture surfaceTexture = sphericalGLSurfaceView.i;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                sphericalGLSurfaceView.i = null;
                sphericalGLSurfaceView.v = null;
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.y = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.y = true;
        a();
    }

    public void setDefaultStereoMode(int i) {
        this.f.z = i;
    }

    public void setUseSensorRotation(boolean z) {
        this.w = z;
        a();
    }

    public SphericalGLSurfaceView(Context context) {
        this(context, null);
    }
}
