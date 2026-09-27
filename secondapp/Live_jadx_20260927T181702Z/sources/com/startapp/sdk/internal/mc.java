package com.startapp.sdk.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import com.startapp.motiondetector.AmortizedMaximum;
import com.startapp.motiondetector.Utils;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MotionMetadata;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class mc {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AtomicInteger f75188i = new AtomicInteger();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f75189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sf f75190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f75191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public nc f75192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f75193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f75194f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Sensor f75195g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kc f75196h = new kc(this);

    public mc(Context context, sf sfVar, p4 p4Var, Handler handler) {
        this.f75189a = context;
        this.f75190b = sfVar;
        this.f75191c = handler;
    }

    public final boolean a(int i10) {
        if (this.f75193e) {
            MotionMetadata motionMetadataJ = MetaData.E().J();
            if (motionMetadataJ == null || !motionMetadataJ.u()) {
                motionMetadataJ = null;
            }
            if (motionMetadataJ != null && (i10 & motionMetadataJ.j()) != 0) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        if (this.f75192d != null) {
            rf rfVarEdit = this.f75190b.edit();
            float fLongBitsToDouble = (float) Double.longBitsToDouble(this.f75192d.f75255d.get());
            rfVarEdit.a("e9142de3c7cc5952", Float.valueOf(fLongBitsToDouble));
            rfVarEdit.f75462a.putFloat("e9142de3c7cc5952", fLongBitsToDouble);
            long j10 = this.f75192d.f75256e.get();
            rfVarEdit.a("7783513af1730383", Long.valueOf(j10));
            rfVarEdit.f75462a.putLong("7783513af1730383", j10);
            rfVarEdit.apply();
            if (a(4)) {
                d9 d9Var = new d9(e9.f74721d);
                d9Var.f74675d = "MP.save";
                d9Var.f74676e = String.format(Locale.ENGLISH, "%.6f", Double.valueOf(a()));
                d9Var.a();
            }
        }
    }

    public final void c() {
        SensorManager sensorManager;
        MotionMetadata motionMetadataJ = MetaData.E().J();
        MotionMetadata motionMetadata = (motionMetadataJ == null || !motionMetadataJ.u()) ? null : motionMetadataJ;
        if (motionMetadata == null || (sensorManager = (SensorManager) this.f75189a.getSystemService("sensor")) == null || this.f75195g != null) {
            return;
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        int iMin = Math.min(Math.max(10000, (int) (si.f(motionMetadata.r()) * 1000)), 100000);
        if (defaultSensor == null || !sensorManager.registerListener(this.f75196h, defaultSensor, iMin)) {
            return;
        }
        this.f75195g = defaultSensor;
        double d10 = this.f75190b.getFloat("e9142de3c7cc5952", 0.0f);
        long j10 = this.f75190b.getLong("7783513af1730383", 0L);
        nc ncVar = this.f75192d;
        if (ncVar != null) {
            ncVar.interrupt();
            this.f75192d = null;
        }
        if (this.f75192d == null) {
            nc ncVar2 = new nc("startapp-mp-" + f75188i.incrementAndGet(), motionMetadata, motionMetadata.q(), d10, j10);
            this.f75192d = ncVar2;
            ncVar2.start();
        }
        if (a(1)) {
            d9 d9Var = new d9(e9.f74721d);
            d9Var.f74675d = "MP.start";
            d9Var.f74676e = defaultSensor.getName() + "," + defaultSensor.getMinDelay() + "," + defaultSensor.getPower();
            d9Var.a();
        }
    }

    public final void d() {
        Sensor sensor;
        SensorManager sensorManager = (SensorManager) this.f75189a.getSystemService("sensor");
        if (sensorManager == null || (sensor = this.f75195g) == null) {
            return;
        }
        sensorManager.unregisterListener(this.f75196h, sensor);
        this.f75195g = null;
        b();
        nc ncVar = this.f75192d;
        if (ncVar != null) {
            ncVar.interrupt();
            this.f75192d = null;
        }
        if (a(2)) {
            d9 d9Var = new d9(e9.f74721d);
            d9Var.f74675d = "MP.stop";
            d9Var.a();
        }
    }

    public final double a() {
        MotionMetadata motionMetadataJ = MetaData.E().J();
        if (motionMetadataJ == null || !motionMetadataJ.u()) {
            motionMetadataJ = null;
        }
        if (motionMetadataJ == null) {
            return -1.0d;
        }
        nc ncVar = this.f75192d;
        if (ncVar != null) {
            return Double.longBitsToDouble(ncVar.f75254c.get());
        }
        return ((double) this.f75190b.getFloat("e9142de3c7cc5952", 0.0f)) * AmortizedMaximum.calcImpact(System.currentTimeMillis(), this.f75190b.getLong("7783513af1730383", 0L), motionMetadataJ.b(), motionMetadataJ.a(), motionMetadataJ.c(), Utils.logisticalFunction(0.0d, motionMetadataJ.a(), motionMetadataJ.c()));
    }
}
