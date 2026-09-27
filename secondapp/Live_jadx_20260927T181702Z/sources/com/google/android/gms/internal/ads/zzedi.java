package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzedi extends zzfzz {
    private final Context zza;

    @zq.h
    private SensorManager zzb;
    private Sensor zzc;
    private long zzd;
    private int zze;
    private zzedh zzf;
    private boolean zzg;

    public zzedi(Context context) {
        super("ShakeDetector", com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS);
        this.zza = context;
    }

    public final void zza(zzedh zzedhVar) {
        this.zzf = zzedhVar;
    }

    public final void zzb() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkq)).booleanValue()) {
                    if (this.zzb == null) {
                        SensorManager sensorManager2 = (SensorManager) this.zza.getSystemService("sensor");
                        this.zzb = sensorManager2;
                        if (sensorManager2 == null) {
                            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Shake detection failed to initialize. Failed to obtain accelerometer.");
                            return;
                        }
                        this.zzc = sensorManager2.getDefaultSensor(1);
                    }
                    if (!this.zzg && (sensorManager = this.zzb) != null && (sensor = this.zzc) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.zzd = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - ((long) ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzks)).intValue());
                        this.zzg = true;
                        com.google.android.gms.ads.internal.util.zze.zza("Listening for shake gestures.");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzc() {
        synchronized (this) {
            try {
                if (this.zzg) {
                    SensorManager sensorManager = this.zzb;
                    if (sensorManager != null) {
                        sensorManager.unregisterListener(this, this.zzc);
                        com.google.android.gms.ads.internal.util.zze.zza("Stopped listening for shake gestures.");
                    }
                    this.zzg = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzz
    public final void zzd(SensorEvent sensorEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkq)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0] / 9.80665f;
            float f11 = fArr[1] / 9.80665f;
            float f12 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f10 * f10) + (f11 * f11) + (f12 * f12))) >= ((Float) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkr)).floatValue()) {
                long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
                if (this.zzd + ((long) ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzks)).intValue()) <= jCurrentTimeMillis) {
                    if (this.zzd + ((long) ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkt)).intValue()) < jCurrentTimeMillis) {
                        this.zze = 0;
                    }
                    com.google.android.gms.ads.internal.util.zze.zza("Shake detected.");
                    this.zzd = jCurrentTimeMillis;
                    int i10 = this.zze + 1;
                    this.zze = i10;
                    zzedh zzedhVar = this.zzf;
                    if (zzedhVar != null) {
                        if (i10 == ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzku)).intValue()) {
                            zzecf zzecfVar = (zzecf) zzedhVar;
                            zzecfVar.zzo(new zzecc(zzecfVar), zzece.GESTURE);
                        }
                    }
                }
            }
        }
    }
}
