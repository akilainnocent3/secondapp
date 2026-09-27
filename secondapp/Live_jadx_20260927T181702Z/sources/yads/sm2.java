package yads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class sm2 extends p51 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final sm2 f155489f = new sm2(0, new Object[0]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f155490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f155491e;

    public sm2(int i10, Object[] objArr) {
        this.f155490d = objArr;
        this.f155491e = i10;
    }

    @Override // yads.p51, yads.j51
    public final int a(int i10, Object[] objArr) {
        System.arraycopy(this.f155490d, 0, objArr, i10, this.f155491e);
        return i10 + this.f155491e;
    }

    @Override // yads.j51
    public final Object[] b() {
        return this.f155490d;
    }

    @Override // yads.j51
    public final int c() {
        return this.f155491e;
    }

    @Override // yads.j51
    public final int d() {
        return 0;
    }

    @Override // yads.j51
    public final boolean e() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        ng2.a(i10, this.f155491e);
        Object obj = this.f155490d[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f155491e;
    }
}
