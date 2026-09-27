package yads;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class rf3 implements qf3, sf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f154944a = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f154945b = new LinkedHashSet();

    @Override // yads.qf3
    public final void a(long j10, long j11) {
        Iterator it = this.f154944a.iterator();
        while (it.hasNext()) {
            ((qf3) it.next()).a(j10, j11);
        }
    }

    @Override // yads.sf3
    public final void b() {
        Iterator it = this.f154945b.iterator();
        while (it.hasNext()) {
            ((sf3) it.next()).b();
        }
    }

    @Override // yads.sf3
    public final void a() {
        Iterator it = this.f154945b.iterator();
        while (it.hasNext()) {
            ((sf3) it.next()).a();
        }
    }
}
