package u2;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final AtomicInteger f137614a;

    public d(int i10) {
        this.f137614a = new AtomicInteger(i10);
    }

    public final int a() {
        return this.f137614a.decrementAndGet();
    }

    public final int b() {
        return this.f137614a.get();
    }

    public final int c() {
        return this.f137614a.getAndIncrement();
    }

    public final int d() {
        return this.f137614a.incrementAndGet();
    }

    public /* synthetic */ d(int i10, int i11, kotlin.jvm.internal.x xVar) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
