package com.fyber.inneractive.sdk.config;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import com.fyber.inneractive.sdk.util.t1;
import com.fyber.inneractive.sdk.util.v1;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v1 f44340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x0 f44341d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f44343f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f44338a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f44339b = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f44342e = new Handler(Looper.getMainLooper(), new b(this));

    public e(x0 x0Var) {
        c cVar = new c(this);
        this.f44343f = new d(this);
        this.f44341d = x0Var;
        Application application = com.fyber.inneractive.sdk.util.o.f47884a;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(cVar);
        }
    }

    public final void a() {
        IAConfigManager iAConfigManager = IAConfigManager.O;
        s sVar = iAConfigManager.f44311u;
        if (!sVar.f44482d) {
            sVar.f44481c.add(this);
        }
        v1 v1Var = new v1(TimeUnit.MINUTES, iAConfigManager.f44311u.f44480b.a("session_duration", 30, 1));
        this.f44340c = v1Var;
        v1Var.f47916e = this.f44343f;
    }

    @Override // com.fyber.inneractive.sdk.config.r
    public final void onGlobalConfigChanged(s sVar, o oVar) {
        v1 v1Var = this.f44340c;
        if (v1Var != null) {
            v1Var.f47915d = false;
            v1Var.f47917f = 0L;
            t1 t1Var = v1Var.f47914c;
            if (t1Var != null) {
                t1Var.removeMessages(1932593528);
            }
            v1 v1Var2 = new v1(TimeUnit.MINUTES, oVar.a("session_duration", 30, 1), this.f44340c.f47917f);
            this.f44340c = v1Var2;
            v1Var2.f47916e = this.f44343f;
        }
        sVar.f44481c.remove(this);
    }
}
