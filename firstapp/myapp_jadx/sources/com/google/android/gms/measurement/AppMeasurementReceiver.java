package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import androidx.work.impl.eLa.LhMGMAwwhzjwfz;
import defpackage.axi0;
import defpackage.k8l0;
import defpackage.y4l0;
import defpackage.yqg0;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes4.dex */
public final class AppMeasurementReceiver extends axi0 {
    public yqg0 c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.c == null) {
            this.c = new yqg0();
        }
        y4l0 y4l0Var = k8l0.r(context, null, null).f;
        k8l0.m(y4l0Var);
        if (intent == null) {
            y4l0Var.i.a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        y4l0Var.n.b(action, "Local receiver got");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                y4l0Var.i.a("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        y4l0Var.n.a("Starting wakeful intent.");
        String str = LhMGMAwwhzjwfz.Wgr;
        SparseArray<PowerManager.WakeLock> sparseArray = axi0.a;
        synchronized (sparseArray) {
            try {
                int i = axi0.b;
                int i2 = i + 1;
                axi0.b = i2;
                if (i2 <= 0) {
                    axi0.b = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i);
                ComponentName componentNameStartService = context.startService(className);
                if (componentNameStartService == null) {
                    return;
                }
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, str + componentNameStartService.flattenToShortString());
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS);
                sparseArray.put(i, wakeLockNewWakeLock);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
