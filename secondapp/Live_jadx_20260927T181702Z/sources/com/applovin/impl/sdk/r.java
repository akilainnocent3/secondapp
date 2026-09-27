package com.applovin.impl.sdk;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Queue f29136a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f29137b = new Object();

    public void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f29137b) {
            try {
                if (b() <= 25) {
                    this.f29136a.offer(appLovinAdImpl);
                } else {
                    p.h("AppLovinSdk", "Maximum queue capacity reached - discarding ad...");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int b() {
        int size;
        synchronized (this.f29137b) {
            size = this.f29136a.size();
        }
        return size;
    }

    public boolean c() {
        boolean z10;
        synchronized (this.f29137b) {
            z10 = b() == 0;
        }
        return z10;
    }

    public AppLovinAdImpl d() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.f29137b) {
            appLovinAdImpl = (AppLovinAdImpl) this.f29136a.peek();
        }
        return appLovinAdImpl;
    }

    public void b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f29137b) {
            this.f29136a.remove(appLovinAdImpl);
        }
    }

    public AppLovinAdImpl a() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.f29137b) {
            try {
                appLovinAdImpl = !c() ? (AppLovinAdImpl) this.f29136a.poll() : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return appLovinAdImpl;
    }
}
