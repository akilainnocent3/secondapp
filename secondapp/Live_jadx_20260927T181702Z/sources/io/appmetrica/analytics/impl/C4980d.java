package io.appmetrica.analytics.impl;

import android.os.Debug;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C4980d extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f97150a = new AtomicBoolean(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5005e f97151b;

    public C4980d(C5005e c5005e) {
        this.f97151b = c5005e;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (!isInterrupted() && this.f97150a.get()) {
            this.f97151b.f97229e.set(false);
            C5005e c5005e = this.f97151b;
            c5005e.f97227c.postAtFrontOfQueue(c5005e.f97230f);
            int i10 = this.f97151b.f97226b.get();
            while (i10 > 0) {
                try {
                    Thread.sleep(C5005e.f97223g);
                    if (this.f97151b.f97229e.get()) {
                        break;
                    } else {
                        i10--;
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
            if (i10 == 0 && !Debug.isDebuggerConnected()) {
                Iterator it = this.f97151b.f97225a.iterator();
                while (it.hasNext()) {
                    ((InterfaceC4954c) it.next()).onAppNotResponding();
                }
            }
            while (!this.f97151b.f97229e.get()) {
                Thread.sleep(C5005e.f97223g);
            }
        }
    }
}
