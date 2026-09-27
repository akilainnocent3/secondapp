package com.startapp.sdk.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class kc implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mc f75085a;

    public kc(mc mcVar) {
        this.f75085a = mcVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        try {
            mc mcVar = this.f75085a;
            nc ncVar = mcVar.f75192d;
            if (ncVar == null || ncVar.a(sensorEvent) || !mcVar.a(8)) {
                return;
            }
            int i10 = mcVar.f75194f;
            if ((i10 & 8) != 0) {
                return;
            }
            mcVar.f75194f = i10 | 8;
            d9 d9Var = new d9(e9.f74722e);
            d9Var.f74675d = "MP";
            d9Var.f74676e = String.valueOf(8);
            d9Var.a();
        } catch (OutOfMemoryError unused) {
            mc mcVar2 = this.f75085a;
            mcVar2.getClass();
            try {
                mcVar2.d();
            } catch (Throwable th2) {
                d9.a(th2);
            }
        } catch (Throwable th3) {
            mc mcVar3 = this.f75085a;
            if (mcVar3.a(16)) {
                int i11 = mcVar3.f75194f;
                if ((i11 & 16) != 0) {
                    return;
                }
                mcVar3.f75194f = 16 | i11;
                d9.a(th3);
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
