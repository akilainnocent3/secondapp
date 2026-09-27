package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import io.appmetrica.analytics.internal.AppMetricaService;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Dk implements ServiceWakeLock {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f95739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ck f95740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f95741c = new HashMap();

    public Dk(@oy.l Context context, @oy.l Ck ck2) {
        this.f95739a = context;
        this.f95740b = ck2;
    }

    @oy.l
    public final String a(@oy.l String str) {
        return "io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK." + str;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized boolean acquireWakeLock(@oy.l String str) {
        try {
            if (this.f95741c.get(str) == null) {
                HashMap map = this.f95741c;
                Ck ck2 = this.f95740b;
                Context context = this.f95739a;
                String strA = a(str);
                ck2.f95703a.getClass();
                Intent intent = new Intent(context, (Class<?>) AppMetricaService.class);
                intent.setAction(strA);
                Bk bk2 = new Bk();
                try {
                    context.bindService(intent, bk2, 1);
                } catch (Throwable unused) {
                    bk2 = null;
                }
                map.put(str, bk2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f95741c.get(str) != null;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized void releaseWakeLock(@oy.l String str) {
        ServiceConnection serviceConnection = (ServiceConnection) this.f95741c.get(str);
        if (serviceConnection != null) {
            Ck ck2 = this.f95740b;
            a(str);
            Context context = this.f95739a;
            ck2.getClass();
            try {
                context.unbindService(serviceConnection);
            } catch (Throwable unused) {
            }
        }
    }
}
