package yads;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class n43 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile n43 f152875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f152876c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f152877a = new LinkedHashMap();

    public final void a(ie1 ie1Var, Object obj) {
        synchronized (f152876c) {
            Set set = (Set) this.f152877a.get(ie1Var);
            if (set != null) {
                set.remove(obj);
            }
        }
    }

    public final void b(ie1 ie1Var, Object obj) {
        synchronized (f152876c) {
            try {
                Set linkedHashSet = (Set) this.f152877a.get(ie1Var);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f152877a.put(ie1Var, linkedHashSet);
                }
                linkedHashSet.add(obj);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
