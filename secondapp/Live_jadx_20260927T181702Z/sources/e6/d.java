package e6;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements SensorEventListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f80369b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f80370c = new float[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f80371d = new float[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f80372e = new float[3];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Display f80373f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a[] f80374g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f80375h;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void a(float[] fArr, float f10);
    }

    public d(Display display, a... aVarArr) {
        this.f80373f = display;
        this.f80374g = aVarArr;
    }

    public static void e(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    public final float a(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, 131, this.f80370c);
        SensorManager.getOrientation(this.f80370c, this.f80372e);
        return this.f80372e[2];
    }

    public final void b(float[] fArr, float f10) {
        for (a aVar : this.f80374g) {
            aVar.a(fArr, f10);
        }
    }

    public final void c(float[] fArr) {
        if (!this.f80375h) {
            c.a(this.f80371d, fArr);
            this.f80375h = true;
        }
        float[] fArr2 = this.f80370c;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f80370c, 0, this.f80371d, 0);
    }

    public final void d(float[] fArr, int i10) {
        if (i10 != 0) {
            int i11 = 129;
            int i12 = 1;
            if (i10 == 1) {
                i12 = 129;
                i11 = 2;
            } else if (i10 == 2) {
                i12 = 130;
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException();
                }
                i11 = 130;
            }
            float[] fArr2 = this.f80370c;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f80370c, i11, i12, fArr);
        }
    }

    @Override // android.hardware.SensorEventListener
    @k.g
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f80369b, sensorEvent.values);
        d(this.f80369b, this.f80373f.getRotation());
        float fA = a(this.f80369b);
        e(this.f80369b);
        c(this.f80369b);
        b(this.f80369b, fA);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
