package yads;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class o72 implements ja2, vu1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f153379a = new CopyOnWriteArrayList();

    @Override // yads.vu1
    public final void a() {
        Iterator it = this.f153379a.iterator();
        while (it.hasNext()) {
            ((p72) it.next()).a();
        }
    }

    @Override // yads.ja2
    public final void a(boolean z10) {
        Iterator it = this.f153379a.iterator();
        while (it.hasNext()) {
            ((p72) it.next()).a(z10);
        }
    }

    @Override // yads.ja2
    public final void c() {
    }
}
