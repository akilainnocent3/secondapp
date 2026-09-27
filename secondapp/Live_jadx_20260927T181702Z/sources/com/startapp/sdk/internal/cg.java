package com.startapp.sdk.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class cg implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eg f74653a;

    public cg(eg egVar) {
        this.f74653a = egVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        JSONArray jSONArrayA;
        int iA = this.f74653a.f74753b.a(sensorEvent);
        eg egVar = this.f74653a;
        if (iA == egVar.f74756e) {
            egVar.b();
            eg egVar2 = this.f74653a;
            w1 w1Var = egVar2.f74755d;
            if (w1Var != null) {
                try {
                    jSONArrayA = egVar2.f74753b.a();
                } catch (Exception unused) {
                    jSONArrayA = null;
                }
                w1Var.a(jSONArrayA);
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
