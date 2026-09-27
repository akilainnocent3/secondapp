package yads;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class vf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicLong f156943a = new AtomicLong();

    public static long a() {
        return f156943a.getAndIncrement();
    }
}
