package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.sb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5372sb extends InterruptionSafeThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5397tb f98294a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5372sb(C5397tb c5397tb, String str) {
        super(str);
        this.f98294a = c5397tb;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        HashMap map;
        synchronized (this.f98294a.f98352a) {
            C5397tb.a(this.f98294a);
            this.f98294a.f98356e = true;
            this.f98294a.f98352a.notifyAll();
        }
        while (isRunning()) {
            synchronized (this) {
                if (this.f98294a.f98353b.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                map = new HashMap(this.f98294a.f98353b);
                this.f98294a.f98353b.clear();
            }
            if (map.size() > 0) {
                C5397tb.a(this.f98294a, map);
                map.clear();
            }
        }
    }
}
