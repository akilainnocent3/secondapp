package jv;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class m2 extends u2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f100840g = AtomicIntegerFieldUpdater.newUpdater(m2.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.l
    public final ds.l<Throwable, dr.w2> f100841f;

    /* JADX WARN: Multi-variable type inference failed */
    public m2(@oy.l ds.l<? super Throwable, dr.w2> lVar) {
        this.f100841f = lVar;
    }

    @Override // jv.u2
    public boolean D() {
        return true;
    }

    @Override // jv.u2
    public void E(@oy.m Throwable th2) {
        if (f100840g.compareAndSet(this, 0, 1)) {
            this.f100841f.invoke(th2);
        }
    }

    public final /* synthetic */ int G() {
        return this._invoked$volatile;
    }

    public final /* synthetic */ void I(int i10) {
        this._invoked$volatile = i10;
    }
}
