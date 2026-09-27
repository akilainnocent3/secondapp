package jv;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f100775b = AtomicIntegerFieldUpdater.newUpdater(c0.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    @cs.g
    public final Throwable f100776a;

    public c0(@oy.l Throwable th2, boolean z10) {
        this.f100776a = th2;
        this._handled$volatile = z10 ? 1 : 0;
    }

    public final boolean a() {
        return f100775b.get(this) == 1;
    }

    public final /* synthetic */ int b() {
        return this._handled$volatile;
    }

    public final boolean d() {
        return f100775b.compareAndSet(this, 0, 1);
    }

    public final /* synthetic */ void e(int i10) {
        this._handled$volatile = i10;
    }

    @oy.l
    public String toString() {
        return x0.a(this) + fw.b.f85384k + this.f100776a + fw.b.f85385l;
    }

    public /* synthetic */ c0(Throwable th2, boolean z10, int i10, kotlin.jvm.internal.x xVar) {
        this(th2, (i10 & 2) != 0 ? false : z10);
    }
}
