package com.mbridge.msdk.dycreator.bus;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
final class HandlerPoster extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PendingPostQueue f66471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f66472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EventBus f66473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f66474d;

    public HandlerPoster(EventBus eventBus, Looper looper, int i10) {
        super(looper);
        this.f66473c = eventBus;
        this.f66472b = i10;
        this.f66471a = new PendingPostQueue();
    }

    public void a(Subscription subscription, Object obj) {
        PendingPost pendingPostA = PendingPost.a(subscription, obj);
        synchronized (this) {
            try {
                this.f66471a.a(pendingPostA);
                if (!this.f66474d) {
                    this.f66474d = true;
                    if (!sendMessage(obtainMessage())) {
                        throw new EventBusException("Could not send handler message");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            do {
                PendingPost pendingPostA = this.f66471a.a();
                if (pendingPostA == null) {
                    synchronized (this) {
                        pendingPostA = this.f66471a.a();
                        if (pendingPostA == null) {
                            this.f66474d = false;
                            return;
                        }
                    }
                }
                this.f66473c.a(pendingPostA);
            } while (SystemClock.uptimeMillis() - jUptimeMillis < this.f66472b);
            if (!sendMessage(obtainMessage())) {
                throw new EventBusException("Could not send handler message");
            }
            this.f66474d = true;
        } catch (Throwable th2) {
            this.f66474d = false;
            throw th2;
        }
    }
}
