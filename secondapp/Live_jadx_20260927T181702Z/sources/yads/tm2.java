package yads;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class tm2 extends p51 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2 f155963d;

    public tm2(um2 um2Var) {
        this.f155963d = um2Var;
    }

    @Override // yads.j51
    public final boolean e() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        ng2.a(i10, this.f155963d.f156504g);
        um2 um2Var = this.f155963d;
        int i11 = i10 * 2;
        Object obj = um2Var.f156502e[um2Var.f156503f + i11];
        Objects.requireNonNull(obj);
        um2 um2Var2 = this.f155963d;
        Object obj2 = um2Var2.f156502e[i11 + (um2Var2.f156503f ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f155963d.f156504g;
    }
}
