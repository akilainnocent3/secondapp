package com.bytedance.sdk.openadsdk.hnv;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.os.Vibrator;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class nod {
    public static WeakReference<hww> hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    protected static final float[] f37260tq = new float[3];

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    protected static final float[] f37259sd = new float[3];
    protected static final float[] vy = new float[9];

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    protected static final float[] f37258hv = new float[3];

    public static void hww(Context context, SensorEventListener sensorEventListener) {
    }

    public static void sd(Context context, SensorEventListener sensorEventListener, int i10) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<hww> weakReference = hww;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th2) {
            vgm.hww("SensorHub", "startListenLinearAcceleration error", th2);
        }
    }

    public static void tq(Context context, SensorEventListener sensorEventListener, int i10) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<hww> weakReference = hww;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th2) {
            vgm.hww("SensorHub", "startListenGyroscope error", th2);
        }
    }

    public static void vy(Context context, SensorEventListener sensorEventListener, int i10) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<hww> weakReference = hww;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th2) {
            vgm.hww("SensorHub", "startListenRotationVector err", th2);
        }
    }

    public static void hww(hww hwwVar) {
        hww = new WeakReference<>(hwwVar);
    }

    public static void hww(Context context, SensorEventListener sensorEventListener, int i10) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<hww> weakReference = hww;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th2) {
            vgm.hww("SensorHub", "startListenAccelerometer error", th2);
        }
    }

    public static void hww(Context context, long j10) {
        if (context == null) {
            return;
        }
        ((Vibrator) context.getSystemService("vibrator")).vibrate(j10);
    }
}
