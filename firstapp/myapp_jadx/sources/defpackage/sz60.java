package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes8.dex */
public final class sz60 extends c3 implements Callable<Void> {
    @Override // java.util.concurrent.Callable
    public final Void call() {
        FutureTask<Void> futureTask = c3.c;
        this.b = Thread.currentThread();
        try {
            this.a.run();
            return null;
        } finally {
            lazySet(futureTask);
            this.b = null;
        }
    }
}
