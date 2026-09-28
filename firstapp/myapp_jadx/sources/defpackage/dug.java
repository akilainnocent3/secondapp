package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class dug implements ThreadFactory {
    public final /* synthetic */ AtomicLong a;

    public class a extends os1 {
        public final /* synthetic */ Runnable a;

        public a(Runnable runnable) {
            this.a = runnable;
        }

        @Override // defpackage.os1
        public final void a() {
            this.a.run();
        }
    }

    public dug(AtomicLong atomicLong) {
        this.a = atomicLong;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = Executors.defaultThreadFactory().newThread(new a(runnable));
        threadNewThread.setName("awaitEvenIfOnMainThread task continuation executor" + this.a.getAndIncrement());
        return threadNewThread;
    }
}
