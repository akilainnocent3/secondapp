package sg.bigo.ads.common.y;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f133723a = new AtomicInteger();

    public static int a() {
        return f133723a.incrementAndGet();
    }

    public static void a(int i10) {
        f133723a.set(i10);
    }
}
