package w2;

import java.util.concurrent.atomic.AtomicInteger;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public final AtomicInteger f142026a;

    public b(int i10) {
        this.f142026a = new AtomicInteger(i10);
    }

    public final int a() {
        return this.f142026a.decrementAndGet();
    }

    public final int b() {
        return this.f142026a.get();
    }

    public final int c() {
        return this.f142026a.getAndIncrement();
    }

    public final int d() {
        return this.f142026a.incrementAndGet();
    }
}
