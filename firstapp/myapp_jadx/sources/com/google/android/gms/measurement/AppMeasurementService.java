package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import defpackage.axi0;
import defpackage.iol0;
import defpackage.k8l0;
import defpackage.okl0;
import defpackage.skl0;
import defpackage.ual0;
import defpackage.y4l0;
import defpackage.zkl0;

/* JADX INFO: loaded from: classes4.dex */
public final class AppMeasurementService extends Service implements skl0 {
    public zkl0 a;

    @Override // defpackage.skl0
    public final void a(Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = axi0.a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray<PowerManager.WakeLock> sparseArray2 = axi0.a;
        synchronized (sparseArray2) {
            try {
                PowerManager.WakeLock wakeLock = sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                } else {
                    Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.skl0
    public final void b(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final zkl0 c() {
        zkl0 zkl0Var = this.a;
        if (zkl0Var != null) {
            return zkl0Var;
        }
        zkl0 zkl0Var2 = new zkl0(this);
        this.a = zkl0Var2;
        return zkl0Var2;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        zkl0 zkl0VarC = c();
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new ual0(iol0.C(zkl0VarC.a));
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.v("FA", c().a.getClass().getSimpleName().concat(" is starting up."));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Log.v("FA", c().a.getClass().getSimpleName().concat(" is shutting down."));
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        c();
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, final int i2) {
        final zkl0 zkl0VarC = c();
        if (intent == null) {
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Service service = zkl0VarC.a;
        final y4l0 y4l0Var = k8l0.r(service, null, null).f;
        k8l0.m(y4l0Var);
        String action = intent.getAction();
        y4l0Var.n.c(Integer.valueOf(i2), "Local AppMeasurementService called. startId, action", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        Runnable runnable = new Runnable() { // from class: xkl0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                Service service2 = zkl0VarC.a;
                skl0 skl0Var = (skl0) service2;
                int i3 = i2;
                if (skl0Var.zza(i3)) {
                    y4l0Var.n.b(Integer.valueOf(i3), "Local AppMeasurementService processed last upload request. StartId");
                    y4l0 y4l0Var2 = k8l0.r(service2, null, null).f;
                    k8l0.m(y4l0Var2);
                    y4l0Var2.n.a("Completed wakeful intent.");
                    skl0Var.a(intent);
                }
            }
        };
        iol0 iol0VarC = iol0.C(service);
        iol0VarC.b().p(new okl0(zkl0VarC, iol0VarC, runnable));
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        c();
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }

    @Override // defpackage.skl0
    public final boolean zza(int i) {
        return stopSelfResult(i);
    }
}
