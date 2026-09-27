package yads;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class d62 implements m62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f148086a = new CopyOnWriteArrayList();

    @Override // yads.m62
    public final void a(long j10, long j11) {
        Iterator it = this.f148086a.iterator();
        while (it.hasNext()) {
            ((m62) it.next()).a(j10, j11);
        }
    }

    @Override // yads.m62
    public final void b() {
        Iterator it = this.f148086a.iterator();
        while (it.hasNext()) {
            ((m62) it.next()).b();
        }
    }

    @Override // yads.m62
    public final void a() {
        Iterator it = this.f148086a.iterator();
        while (it.hasNext()) {
            ((m62) it.next()).a();
        }
    }
}
