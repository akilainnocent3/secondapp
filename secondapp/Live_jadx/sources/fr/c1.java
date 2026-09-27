package fr;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class c1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f85091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f85092b;

    public c1(int i10, T t10) {
        this.f85091a = i10;
        this.f85092b = t10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ c1 d(c1 c1Var, int i10, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            i10 = c1Var.f85091a;
        }
        if ((i11 & 2) != 0) {
            obj = c1Var.f85092b;
        }
        return c1Var.c(i10, obj);
    }

    public final int a() {
        return this.f85091a;
    }

    public final T b() {
        return this.f85092b;
    }

    @oy.l
    public final c1<T> c(int i10, T t10) {
        return new c1<>(i10, t10);
    }

    public final int e() {
        return this.f85091a;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return this.f85091a == c1Var.f85091a && kotlin.jvm.internal.m0.g(this.f85092b, c1Var.f85092b);
    }

    public final T f() {
        return this.f85092b;
    }

    public int hashCode() {
        int i10 = this.f85091a * 31;
        T t10 = this.f85092b;
        return i10 + (t10 == null ? 0 : t10.hashCode());
    }

    @oy.l
    public String toString() {
        return "IndexedValue(index=" + this.f85091a + ", value=" + this.f85092b + ')';
    }
}
