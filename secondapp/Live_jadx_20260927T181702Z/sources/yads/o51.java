package yads;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class o51 extends p51 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f153368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f153369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p51 f153370f;

    public o51(p51 p51Var, int i10, int i11) {
        this.f153370f = p51Var;
        this.f153368d = i10;
        this.f153369e = i11;
    }

    @Override // yads.p51, java.util.List
    /* JADX INFO: renamed from: a */
    public final p51 subList(int i10, int i11) {
        ng2.a(i10, i11, this.f153369e);
        p51 p51Var = this.f153370f;
        int i12 = this.f153368d;
        return p51Var.subList(i10 + i12, i11 + i12);
    }

    @Override // yads.j51
    public final Object[] b() {
        return this.f153370f.b();
    }

    @Override // yads.j51
    public final int c() {
        return this.f153370f.d() + this.f153368d + this.f153369e;
    }

    @Override // yads.j51
    public final int d() {
        return this.f153370f.d() + this.f153368d;
    }

    @Override // yads.j51
    public final boolean e() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        ng2.a(i10, this.f153369e);
        return this.f153370f.get(i10 + this.f153368d);
    }

    @Override // yads.p51, yads.j51, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // yads.p51, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f153369e;
    }

    @Override // yads.p51, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
        return listIterator(i10);
    }
}
