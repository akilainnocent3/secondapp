package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes8.dex */
public final class p760 extends AtomicLong implements ThreadFactory {
    public final String a;
    public final int b;
    public final boolean c;

    public static final class a extends Thread {
    }

    public p760(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.a + '-' + incrementAndGet();
        Thread aVar = this.c ? new a(runnable, str) : new Thread(runnable, str);
        aVar.setPriority(this.b);
        aVar.setDaemon(true);
        return aVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return uf80.a(new StringBuilder("RxThreadFactory["), this.a, "]");
    }

    public p760(String str) {
        this(str, 5, false);
    }
}
