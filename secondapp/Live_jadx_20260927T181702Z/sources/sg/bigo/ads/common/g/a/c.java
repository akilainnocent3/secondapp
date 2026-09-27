package sg.bigo.ads.common.g.a;

import java.util.LinkedList;
import java.util.concurrent.CountDownLatch;
import sg.bigo.ads.common.n.e;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final LinkedList<Runnable> f133025a = new LinkedList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object f133026b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final e f133027c;

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final CountDownLatch f133031a = new CountDownLatch(1);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Runnable f133032b = new Runnable() { // from class: sg.bigo.ads.common.g.a.c.a.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    a.this.f133031a.await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f133033c;

        public a(Runnable runnable) {
            this.f133033c = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f133033c.run();
            this.f133031a.countDown();
        }
    }

    public c() {
        e eVar = new e("Waitable", 1, 1);
        this.f133027c = eVar;
        eVar.allowCoreThreadTimeOut(true);
    }
}
