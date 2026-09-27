package b3;

import java.util.concurrent.atomic.AtomicBoolean;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public final AtomicBoolean f20484a;

    public b(boolean z10) {
        this.f20484a = new AtomicBoolean(z10);
    }

    public final boolean a() {
        return this.f20484a.get();
    }

    public final void b(boolean z10) {
        this.f20484a.set(z10);
    }
}
