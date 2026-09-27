package yads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class wm2 extends p51 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f157448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f157449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f157450f;

    public wm2(Object[] objArr, int i10, int i11) {
        this.f157448d = objArr;
        this.f157449e = i10;
        this.f157450f = i11;
    }

    @Override // yads.j51
    public final boolean e() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        ng2.a(i10, this.f157450f);
        Object obj = this.f157448d[(i10 * 2) + this.f157449e];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f157450f;
    }
}
