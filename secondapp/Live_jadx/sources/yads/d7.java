package yads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class d7 implements u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f148087a;

    public d7(List list) {
        Iterator it = list.iterator();
        long jA = 0;
        while (it.hasNext()) {
            jA += ((j7) it.next()).a();
        }
        this.f148087a = jA;
    }

    @Override // yads.u2
    public final long a() {
        return this.f148087a;
    }

    @Override // yads.u2
    public final long a(long j10) {
        return this.f148087a;
    }
}
