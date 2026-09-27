package yads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ay extends AbstractCollection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cy f146960b;

    public ay(cy cyVar) {
        this.f146960b = cyVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f146960b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        cy cyVar = this.f146960b;
        Map mapA = cyVar.a();
        return mapA != null ? mapA.values().iterator() : new vx(cyVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f146960b.size();
    }
}
