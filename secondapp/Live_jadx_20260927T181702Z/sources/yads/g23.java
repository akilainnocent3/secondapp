package yads;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.view.MotionEvent;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class g23 implements GLSurfaceView.Renderer, b73, va2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ps2 f149361a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f149364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f149365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f149366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f149367g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f149368h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i23 f149371k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f149362b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f149363c = new float[16];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f149369i = new float[16];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f149370j = new float[16];

    public g23(i23 i23Var, ps2 ps2Var) {
        this.f149371k = i23Var;
        float[] fArr = new float[16];
        this.f149364d = fArr;
        float[] fArr2 = new float[16];
        this.f149365e = fArr2;
        float[] fArr3 = new float[16];
        this.f149366f = fArr3;
        this.f149361a = ps2Var;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.f149368h = 3.1415927f;
    }

    @Override // yads.va2
    public final synchronized void a(float[] fArr, float f10) {
        float[] fArr2 = this.f149364d;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f11 = -f10;
        this.f149368h = f11;
        Matrix.setRotateM(this.f149365e, 0, -this.f149367g, (float) Math.cos(f11), (float) Math.sin(this.f149368h), 0.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        synchronized (this) {
            Matrix.multiplyMM(this.f149370j, 0, this.f149364d, 0, this.f149366f, 0);
            Matrix.multiplyMM(this.f149369i, 0, this.f149365e, 0, this.f149370j, 0);
        }
        Matrix.multiplyMM(this.f149363c, 0, this.f149362b, 0, this.f149369i, 0);
        this.f149361a.a(this.f149363c);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        GLES20.glViewport(0, 0, i10, i11);
        float f10 = i10 / i11;
        Matrix.perspectiveM(this.f149362b, 0, f10 > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f10))) * 2.0d) : 90.0f, f10, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        this.f149371k.b(this.f149361a.a());
    }

    public final boolean a(MotionEvent motionEvent) {
        return this.f149371k.performClick();
    }
}
