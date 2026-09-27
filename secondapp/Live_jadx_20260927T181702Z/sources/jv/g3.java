package jv;

import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class g3 implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final Future<?> f100806b;

    public g3(@oy.l Future<?> future) {
        this.f100806b = future;
    }

    @Override // jv.m
    public void a(@oy.m Throwable th2) {
        if (th2 != null) {
            this.f100806b.cancel(false);
        }
    }

    @oy.l
    public String toString() {
        return "CancelFutureOnCancel[" + this.f100806b + fw.b.f85385l;
    }
}
