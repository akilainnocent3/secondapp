package jv;

import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class n1 implements o1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final Future<?> f100843b;

    public n1(@oy.l Future<?> future) {
        this.f100843b = future;
    }

    @Override // jv.o1
    public void a() {
        this.f100843b.cancel(false);
    }

    @oy.l
    public String toString() {
        return "DisposableFutureHandle[" + this.f100843b + fw.b.f85385l;
    }
}
