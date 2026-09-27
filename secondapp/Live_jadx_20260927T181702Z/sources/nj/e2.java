package nj;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@o0
@yi.d
public final class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f116944a = 2147483647999999999L;

    public static void a(@zq.a Object blocker, long nanos) {
        LockSupport.parkNanos(blocker, Math.min(nanos, f116944a));
    }
}
