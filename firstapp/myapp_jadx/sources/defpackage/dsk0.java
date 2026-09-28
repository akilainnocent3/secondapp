package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class dsk0 extends Thread {
    public final WeakReference a;
    public final long b;
    public final CountDownLatch c;

    public dsk0(sm smVar, long j) {
        super("AdIdClientAutoDisconnectThread");
        this.a = new WeakReference(smVar);
        this.b = j;
        this.c = new CountDownLatch(1);
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        sm smVar;
        WeakReference weakReference = this.a;
        try {
            if (this.c.await(this.b, TimeUnit.MILLISECONDS) || (smVar = (sm) weakReference.get()) == null) {
                return;
            }
            smVar.b();
        } catch (InterruptedException unused) {
            sm smVar2 = (sm) weakReference.get();
            if (smVar2 != null) {
                smVar2.b();
            }
        }
    }
}
