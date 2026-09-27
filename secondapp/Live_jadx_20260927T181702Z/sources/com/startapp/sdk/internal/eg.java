package com.startapp.sdk.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import com.startapp.sdk.adsbase.remoteconfig.BaseSensorConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.SensorsConfig;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class eg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f74752a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SensorManager f74754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w1 f74755d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final cg f74757f = new cg(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bg f74753b = new bg();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f74756e = 0;

    public eg(Context context, w1 w1Var) {
        this.f74752a = null;
        this.f74754c = (SensorManager) context.getSystemService("sensor");
        this.f74755d = w1Var;
        this.f74752a = new HashMap();
        SensorsConfig sensorsConfigT = MetaData.E().T();
        a(13, sensorsConfigT.a());
        a(9, sensorsConfigT.b());
        a(5, sensorsConfigT.d());
        a(10, sensorsConfigT.e());
        a(2, sensorsConfigT.f());
        a(6, sensorsConfigT.g());
        a(12, sensorsConfigT.i());
        a(11, sensorsConfigT.j());
        a(16, sensorsConfigT.c());
    }

    public final void a() {
        Sensor defaultSensor;
        for (Integer num : this.f74752a.keySet()) {
            int iIntValue = num.intValue();
            dg dgVar = (dg) this.f74752a.get(num);
            if (Build.VERSION.SDK_INT >= dgVar.f74697a && (defaultSensor = this.f74754c.getDefaultSensor(iIntValue)) != null) {
                this.f74754c.registerListener(this.f74757f, defaultSensor, dgVar.f74698b);
                this.f74756e++;
            }
        }
    }

    public final void b() {
        this.f74754c.unregisterListener(this.f74757f);
    }

    public final void a(int i10, BaseSensorConfig baseSensorConfig) {
        if (baseSensorConfig.c()) {
            this.f74752a.put(Integer.valueOf(i10), new dg(baseSensorConfig.b(), baseSensorConfig.a()));
        }
    }
}
