package w2;

import java.util.concurrent.atomic.AtomicBoolean;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public final AtomicBoolean f142025a;

    public a(boolean z10) {
        this.f142025a = new AtomicBoolean(z10);
    }

    public final boolean a() {
        return this.f142025a.get();
    }

    public final void b(boolean z10) {
        this.f142025a.set(z10);
    }
}
