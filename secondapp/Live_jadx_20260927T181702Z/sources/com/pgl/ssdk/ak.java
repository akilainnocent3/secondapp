package com.pgl.ssdk;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class ak implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float[] f71982a = {999999.0f, 999999.0f, 999999.0f};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f71983b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile ak f71984c;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Context f71990i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Sensor f71985d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Sensor f71986e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Sensor f71987f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile boolean f71988g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f71989h = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private AtomicReference<a> f71991j = new AtomicReference<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f71992k = 999999;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f71993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float[] f71994b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float[] f71995c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float[] f71996d = null;

        public a(long j10) {
            this.f71993a = j10;
        }
    }

    private ak(Context context) {
        this.f71990i = context;
    }

    public static ak a(Context context) {
        if (f71984c == null) {
            synchronized (ak.class) {
                try {
                    if (f71984c == null) {
                        f71984c = new ak(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (f71983b) {
            f71984c.c();
        }
        return f71984c;
    }

    private void c() {
        if (this.f71989h) {
            return;
        }
        try {
            SensorManager sensorManager = (SensorManager) this.f71990i.getApplicationContext().getSystemService("sensor");
            if (sensorManager != null) {
                this.f71985d = sensorManager.getDefaultSensor(1);
                this.f71986e = sensorManager.getDefaultSensor(2);
                this.f71987f = sensorManager.getDefaultSensor(4);
            }
        } catch (Exception unused) {
        }
        this.f71989h = true;
    }

    private void e() {
        this.f71992k = -1L;
        this.f71988g = false;
        try {
            SensorManager sensorManager = (SensorManager) this.f71990i.getApplicationContext().getSystemService("sensor");
            if (sensorManager != null) {
                sensorManager.unregisterListener(this);
            }
        } catch (Exception unused) {
        }
    }

    public Object[] b() {
        Object[] objArr = new Object[6];
        a aVar = this.f71991j.get();
        if (!f71983b || aVar == null) {
            a(objArr);
            return objArr;
        }
        int i10 = 0;
        do {
            if ((this.f71985d == null || aVar.f71994b != null) && ((this.f71986e == null || aVar.f71995c != null) && (this.f71987f == null || aVar.f71996d != null))) {
                break;
            }
            az.a(50L);
            i10++;
        } while (i10 <= 20);
        e();
        this.f71988g = false;
        a(objArr, aVar);
        this.f71991j.set(null);
        return objArr;
    }

    public boolean d() {
        if (this.f71985d != null) {
            try {
                SensorManager sensorManager = (SensorManager) this.f71990i.getApplicationContext().getSystemService("sensor");
                if (sensorManager != null) {
                    boolean zRegisterListener = sensorManager.registerListener(this, this.f71985d, 2);
                    Sensor sensor = this.f71986e;
                    if (sensor != null) {
                        sensorManager.registerListener(this, sensor, 2);
                    }
                    Sensor sensor2 = this.f71987f;
                    if (sensor2 != null) {
                        sensorManager.registerListener(this, sensor2, 2);
                    }
                    if (zRegisterListener) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        this.f71992k = jCurrentTimeMillis;
                        this.f71991j.set(new a(jCurrentTimeMillis));
                        this.f71988g = true;
                    } else {
                        e();
                    }
                }
            } catch (Throwable unused) {
                e();
            }
        }
        return this.f71988g;
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        a aVar = this.f71991j.get();
        if (aVar == null) {
            return;
        }
        int type = sensorEvent.sensor.getType();
        if (type == 1) {
            if (aVar.f71994b == null) {
                aVar.f71994b = sensorEvent.values;
            }
        } else if (type == 2) {
            if (aVar.f71995c == null) {
                aVar.f71995c = sensorEvent.values;
            }
        } else if (type == 4 && aVar.f71996d == null) {
            aVar.f71996d = sensorEvent.values;
        }
    }

    private static void a(Object[] objArr) {
        Float fValueOf = Float.valueOf(999999.0f);
        objArr[0] = fValueOf;
        objArr[1] = fValueOf;
        objArr[2] = fValueOf;
        objArr[3] = 999999L;
        float[] fArr = f71982a;
        objArr[4] = fArr;
        objArr[5] = fArr;
    }

    private static void a(Object[] objArr, a aVar) {
        float[] fArrA;
        Float fValueOf = Float.valueOf(999999.0f);
        float[] fArr = aVar.f71994b;
        if (fArr != null) {
            float[] fArr2 = aVar.f71995c;
            if (fArr2 != null) {
                fArrA = a(objArr, fArr, fArr2);
            } else {
                fArrA = a(objArr, fArr);
            }
            objArr[0] = Float.valueOf(fArrA[0]);
            objArr[1] = Float.valueOf(fArrA[1]);
            objArr[2] = Float.valueOf(fArrA[2]);
            objArr[4] = aVar.f71994b;
        } else {
            objArr[0] = fValueOf;
            objArr[1] = fValueOf;
            objArr[2] = fValueOf;
            objArr[4] = f71982a;
        }
        objArr[3] = Long.valueOf(aVar.f71993a);
        float[] fArr3 = aVar.f71996d;
        if (fArr3 != null) {
            objArr[5] = fArr3;
        } else {
            objArr[5] = f71982a;
        }
    }

    private static float[] a(Object[] objArr, float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        float[] fArr4 = new float[3];
        SensorManager.getRotationMatrix(fArr3, new float[9], fArr, fArr2);
        SensorManager.getOrientation(fArr3, fArr4);
        return new float[]{(((float) Math.toDegrees(fArr4[0])) + 360.0f) % 360.0f, (((float) Math.toDegrees(fArr4[1])) + 360.0f) % 360.0f, (((float) Math.toDegrees(fArr4[2])) + 360.0f) % 360.0f};
    }

    private static float[] a(Object[] objArr, float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float fSqrt = 1.0f / ((float) Math.sqrt(((f10 * f10) + (f11 * f11)) + (f12 * f12)));
        return new float[]{999999.0f, (((float) Math.toDegrees((float) Math.asin(-(f11 * fSqrt)))) + 360.0f) % 360.0f, (((float) Math.toDegrees((float) Math.atan2(-(f10 * fSqrt), f12 * fSqrt))) + 360.0f) % 360.0f};
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    public void a() {
        if (!f71983b || this.f71988g) {
            return;
        }
        d();
    }
}
