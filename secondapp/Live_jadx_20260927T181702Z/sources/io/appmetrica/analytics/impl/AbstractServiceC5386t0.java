package io.appmetrica.analytics.impl;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.t0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractServiceC5386t0 extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public M1 f98336a;

    @Override // android.app.Service
    @oy.m
    public IBinder onBind(@oy.l Intent intent) {
        M1 m10 = this.f98336a;
        if (m10 == null) {
            kotlin.jvm.internal.m0.S("serviceDelegate");
            m10 = null;
        }
        return m10.a(intent);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(@oy.l Configuration configuration) {
        super.onConfigurationChanged(configuration);
        M1 m10 = this.f98336a;
        if (m10 == null) {
            kotlin.jvm.internal.m0.S("serviceDelegate");
            m10 = null;
        }
        m10.a(configuration);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (this.f98336a == null) {
            this.f98336a = new M1(this, new C5411u0(this));
        }
        M1 m10 = this.f98336a;
        if (m10 == null) {
            kotlin.jvm.internal.m0.S("serviceDelegate");
            m10 = null;
        }
        m10.b();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        M1 m10 = this.f98336a;
        if (m10 == null) {
            kotlin.jvm.internal.m0.S("serviceDelegate");
            m10 = null;
        }
        m10.c();
    }

    @Override // android.app.Service
    public void onRebind(@oy.l Intent intent) {
        super.onRebind(intent);
        M1 m10 = this.f98336a;
        if (m10 == null) {
            kotlin.jvm.internal.m0.S("serviceDelegate");
            m10 = null;
        }
        m10.b(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(@oy.l Intent intent, int i10, int i11) {
        M1 m10 = this.f98336a;
        if (m10 == null) {
            kotlin.jvm.internal.m0.S("serviceDelegate");
            m10 = null;
        }
        return m10.a(intent, i10, i11);
    }

    @Override // android.app.Service
    public boolean onUnbind(@oy.l Intent intent) {
        M1 m10 = this.f98336a;
        if (m10 == null) {
            kotlin.jvm.internal.m0.S("serviceDelegate");
            m10 = null;
        }
        return m10.c(intent);
    }
}
