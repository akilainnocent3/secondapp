package yads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public class u extends n implements SortedMap {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SortedSet f156167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a0 f156168g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(a0 a0Var, SortedMap sortedMap) {
        super(a0Var, sortedMap);
        this.f156168g = a0Var;
    }

    public SortedSet a() {
        return new v(this.f156168g, b());
    }

    public SortedMap b() {
        return (SortedMap) this.f152791d;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return b().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return b().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new u(this.f156168g, b().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return b().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new u(this.f156168g, b().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new u(this.f156168g, b().tailMap(obj));
    }

    @Override // yads.n, java.util.AbstractMap, java.util.Map
    public SortedSet keySet() {
        SortedSet sortedSet = this.f156167f;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetA = a();
        this.f156167f = sortedSetA;
        return sortedSetA;
    }
}
