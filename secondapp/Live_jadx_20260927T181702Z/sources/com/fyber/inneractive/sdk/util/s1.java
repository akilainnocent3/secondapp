package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.ironsource.Q6;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f47899a = new AtomicBoolean(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile String f47900b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f47901c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f47902d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p1 f47903e = new p1(this);

    public final String a() {
        if (!TextUtils.isEmpty(this.f47900b)) {
            return this.f47900b;
        }
        if (this.f47903e != null && this.f47899a.get()) {
            Handler handler = r.f47892b;
            handler.removeCallbacks(this.f47903e);
            handler.postDelayed(this.f47903e, 50L);
        }
        return System.getProperty("http.agent");
    }

    public final void b() {
        if (this.f47901c == null || !TextUtils.isEmpty(this.f47900b)) {
            return;
        }
        this.f47900b = this.f47901c.getSharedPreferences("fyber.ua", 0).getString(Q6.f59861d0, null);
        if (!TextUtils.isEmpty(this.f47900b)) {
            IAlog.a("UserAgentProvider | populated user agent from shared prefs", new Object[0]);
            this.f47902d.compareAndSet(false, true);
        }
        r.f47891a.execute(new r1(this));
    }

    public final void c() {
        String defaultUserAgent;
        Context context = this.f47901c;
        if (context != null) {
            try {
                defaultUserAgent = WebSettings.getDefaultUserAgent(context);
            } catch (Throwable unused) {
                this.f47899a.set(false);
                defaultUserAgent = null;
            }
            if (TextUtils.isEmpty(defaultUserAgent)) {
                return;
            }
            this.f47900b = defaultUserAgent;
            if (!TextUtils.isEmpty(this.f47900b)) {
                IAlog.a("UserAgentProvider | populated user agent form updateUserAgentIfPossible", new Object[0]);
                this.f47902d.compareAndSet(false, true);
            }
            r.f47891a.execute(new q1(this, defaultUserAgent));
        }
    }
}
