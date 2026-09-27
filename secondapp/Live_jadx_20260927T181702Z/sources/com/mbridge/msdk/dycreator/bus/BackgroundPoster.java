package com.mbridge.msdk.dycreator.bus;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
final class BackgroundPoster implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PendingPostQueue f66448a = new PendingPostQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f66449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EventBus f66450c;

    public BackgroundPoster(EventBus eventBus) {
        this.f66450c = eventBus;
    }

    public void enqueue(Subscription subscription, Object obj) {
        PendingPost pendingPostA = PendingPost.a(subscription, obj);
        synchronized (this) {
            try {
                this.f66448a.a(pendingPostA);
                if (!this.f66449b) {
                    this.f66449b = true;
                    EventBus.f66451n.execute(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                try {
                    PendingPost pendingPostA = this.f66448a.a(1000);
                    if (pendingPostA == null) {
                        synchronized (this) {
                            pendingPostA = this.f66448a.a();
                            if (pendingPostA == null) {
                                this.f66449b = false;
                                this.f66449b = false;
                                return;
                            }
                        }
                    }
                    this.f66450c.a(pendingPostA);
                } catch (InterruptedException e10) {
                    Log.w("Event", Thread.currentThread().getName() + " was interruppted", e10);
                    this.f66449b = false;
                    return;
                }
            } catch (Throwable th2) {
                this.f66449b = false;
                throw th2;
            }
        }
    }
}
