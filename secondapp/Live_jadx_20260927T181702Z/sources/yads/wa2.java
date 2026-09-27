package yads;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class wa2 implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f157263a = new float[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f157264b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f157265c = new float[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f157266d = new float[3];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Display f157267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final va2[] f157268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f157269g;

    public wa2(Display display, va2... va2VarArr) {
        this.f157267e = display;
        this.f157268f = va2VarArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i10;
        SensorManager.getRotationMatrixFromVector(this.f157263a, sensorEvent.values);
        float[] fArr = this.f157263a;
        int rotation = this.f157267e.getRotation();
        if (rotation != 0) {
            int i11 = 129;
            if (rotation != 1) {
                i10 = 130;
                if (rotation != 2) {
                    if (rotation != 3) {
                        throw new IllegalStateException();
                    }
                    i11 = 130;
                    i10 = 1;
                }
            } else {
                i10 = 129;
                i11 = 2;
            }
            float[] fArr2 = this.f157264b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f157264b, i11, i10, fArr);
        }
        SensorManager.remapCoordinateSystem(this.f157263a, 1, 131, this.f157264b);
        SensorManager.getOrientation(this.f157264b, this.f157266d);
        float f10 = this.f157266d[2];
        Matrix.rotateM(this.f157263a, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        float[] fArr3 = this.f157263a;
        if (!this.f157269g) {
            tx0.a(this.f157265c, fArr3);
            this.f157269g = true;
        }
        float[] fArr4 = this.f157264b;
        System.arraycopy(fArr3, 0, fArr4, 0, fArr4.length);
        Matrix.multiplyMM(fArr3, 0, this.f157264b, 0, this.f157265c, 0);
        float[] fArr5 = this.f157263a;
        for (va2 va2Var : this.f157268f) {
            va2Var.a(fArr5, f10);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
