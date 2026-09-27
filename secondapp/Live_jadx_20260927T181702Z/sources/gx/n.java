package gx;

import fx.b1;
import fx.c1;
import fx.d1;
import fx.v0;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class n implements c1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final v0 f87486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final v0 f87487c;

    public n(@oy.l v0 sinkPipe, @oy.l v0 sourcePipe) {
        m0.p(sinkPipe, "sinkPipe");
        m0.p(sourcePipe, "sourcePipe");
        this.f87486b = sinkPipe;
        this.f87487c = sourcePipe;
    }

    @Override // fx.c1
    @oy.l
    public b1 a() {
        return this.f87486b.r();
    }

    @oy.l
    public final v0 b() {
        return this.f87486b;
    }

    @oy.l
    public final v0 c() {
        return this.f87487c;
    }

    @Override // fx.c1
    public void cancel() {
        this.f87487c.c();
        this.f87486b.c();
    }

    @Override // fx.c1
    @oy.l
    public d1 g() {
        return this.f87487c.s();
    }
}
