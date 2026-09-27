package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.y9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5520y9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f98668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z9 f98669b;

    public C5520y9(Context context, String str) {
        this(new ReentrantLock(), new Z9(context, str));
    }

    public final void a() {
        this.f98668a.lock();
        this.f98669b.a();
    }

    public final void b() {
        this.f98669b.b();
        this.f98668a.unlock();
    }

    public final void c() {
        Z9 z10 = this.f98669b;
        synchronized (z10) {
            z10.b();
            z10.f96868a.delete();
        }
        this.f98668a.unlock();
    }

    public C5520y9(ReentrantLock reentrantLock, Z9 z10) {
        this.f98668a = reentrantLock;
        this.f98669b = z10;
    }
}
