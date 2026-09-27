package jv;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class s extends c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f100872c = AtomicIntegerFieldUpdater.newUpdater(s.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public s(@oy.l or.f<?> fVar, @oy.m Throwable th2, boolean z10) {
        if (th2 == null) {
            th2 = new CancellationException("Continuation " + fVar + " was cancelled normally");
        }
        super(th2, z10);
    }

    public final /* synthetic */ int f() {
        return this._resumed$volatile;
    }

    public final boolean h() {
        return f100872c.compareAndSet(this, 0, 1);
    }

    public final /* synthetic */ void i(int i10) {
        this._resumed$volatile = i10;
    }
}
