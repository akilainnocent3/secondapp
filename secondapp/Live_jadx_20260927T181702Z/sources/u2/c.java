package u2;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final AtomicBoolean f137611a;

    public c(boolean z10) {
        this.f137611a = new AtomicBoolean(z10);
    }

    public final boolean a() {
        return this.f137611a.get();
    }

    public final void b(boolean z10) {
        this.f137611a.set(z10);
    }
}
