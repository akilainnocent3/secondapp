package vb;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<tb.f, l<?>> f140825a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<tb.f, l<?>> f140826b = new HashMap();

    public l<?> a(tb.f fVar, boolean z10) {
        return c(z10).get(fVar);
    }

    @h1
    public Map<tb.f, l<?>> b() {
        return Collections.unmodifiableMap(this.f140825a);
    }

    public final Map<tb.f, l<?>> c(boolean z10) {
        return z10 ? this.f140826b : this.f140825a;
    }

    public void d(tb.f fVar, l<?> lVar) {
        c(lVar.q()).put(fVar, lVar);
    }

    public void e(tb.f fVar, l<?> lVar) {
        Map<tb.f, l<?>> mapC = c(lVar.q());
        if (lVar.equals(mapC.get(fVar))) {
            mapC.remove(fVar);
        }
    }
}
