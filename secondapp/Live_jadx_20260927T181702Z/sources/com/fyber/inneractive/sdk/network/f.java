package com.fyber.inneractive.sdk.network;

import android.app.Application;
import android.os.HandlerThread;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements com.fyber.inneractive.sdk.util.e1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.util.d1 f45303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f45304e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedBlockingQueue f45300a = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JSONArray f45301b = new JSONArray();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f45305f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f45306g = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HandlerThread f45302c = new HandlerThread("EventCollectorHandlerThread", 0);

    public final void a(Application application) {
        if (!this.f45306g) {
            this.f45306g = true;
            this.f45302c.start();
            com.fyber.inneractive.sdk.util.d1 d1Var = new com.fyber.inneractive.sdk.util.d1(this.f45302c.getLooper(), this);
            this.f45303d = d1Var;
            this.f45305f = true;
            this.f45304e = 30;
            if (d1Var.hasMessages(12312329)) {
                this.f45303d.removeMessages(12312329);
            }
            long j10 = this.f45304e * 1000;
            com.fyber.inneractive.sdk.util.d1 d1Var2 = this.f45303d;
            if (d1Var2 != null) {
                d1Var2.post(new c(this, 12312329, j10));
            }
        }
        application.registerActivityLifecycleCallbacks(new d(this));
    }
}
