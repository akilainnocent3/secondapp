package yads;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class fo2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f149196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f149197b;

    public /* synthetic */ fo2(Map map, int i10) {
        this((i10 & 1) != 0 ? fr.n1.z() : map, (c) null);
    }

    public final void a(Object obj, String str) {
        if (obj != null) {
            this.f149196a.put(str, obj);
        }
    }

    public final void b(Object obj, String str) {
        if (obj == null) {
            this.f149196a.put(str, "undefined");
        } else {
            this.f149196a.put(str, obj);
        }
    }

    public fo2(Map map, c cVar) {
        map = kotlin.jvm.internal.v1.H(map) ? map : null;
        this.f149196a = map == null ? new LinkedHashMap() : map;
        this.f149197b = cVar;
    }
}
