package androidx.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final Map<String, e1> f13392a = new LinkedHashMap();

    public final void a() {
        Iterator<e1> it = this.f13392a.values().iterator();
        while (it.hasNext()) {
            it.next().c();
        }
        this.f13392a.clear();
    }

    @k.y0({k.y0.a.LIBRARY_GROUP})
    @oy.m
    public final e1 b(@oy.l String key) {
        kotlin.jvm.internal.m0.p(key, "key");
        return this.f13392a.get(key);
    }

    @oy.l
    @k.y0({k.y0.a.LIBRARY_GROUP})
    public final Set<String> c() {
        return new HashSet(this.f13392a.keySet());
    }

    @k.y0({k.y0.a.LIBRARY_GROUP})
    public final void d(@oy.l String key, @oy.l e1 viewModel) {
        kotlin.jvm.internal.m0.p(key, "key");
        kotlin.jvm.internal.m0.p(viewModel, "viewModel");
        e1 e1VarPut = this.f13392a.put(key, viewModel);
        if (e1VarPut != null) {
            e1VarPut.f();
        }
    }
}
