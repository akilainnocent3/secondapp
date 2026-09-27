package com.mbridge.msdk.shake;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f69061a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f69062b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f69063c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f69064d = 0.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f69065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f69066f;

    public b(int i10, int i11) {
        this.f69065e = i10;
        this.f69066f = i11;
    }

    public abstract void a();

    /* JADX WARN: Code duplicated, block: B:14:0x0048  */
    /* JADX WARN: Code duplicated, block: B:16:0x0057  */
    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        long jCurrentTimeMillis;
        float[] fArr = sensorEvent.values;
        float f10 = -fArr[0];
        float f11 = -fArr[1];
        float f12 = -fArr[2];
        float f13 = this.f69062b;
        if (f13 == 0.0f || Math.abs(f10 - f13) <= this.f69065e) {
            float f14 = this.f69063c;
            if (f14 == 0.0f || Math.abs(f11 - f14) <= this.f69065e) {
                float f15 = this.f69064d;
                if (f15 != 0.0f && Math.abs(f12 - f15) > this.f69065e) {
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - this.f69061a > this.f69066f) {
                        this.f69061a = jCurrentTimeMillis;
                        a();
                    }
                }
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - this.f69061a > this.f69066f) {
                    this.f69061a = jCurrentTimeMillis;
                    a();
                }
            }
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.f69061a > this.f69066f) {
                this.f69061a = jCurrentTimeMillis;
                a();
            }
        }
        this.f69062b = f10;
        this.f69063c = f11;
        this.f69064d = f12;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
