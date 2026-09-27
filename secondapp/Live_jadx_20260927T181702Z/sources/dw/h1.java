package dw;

import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@kotlin.jvm.internal.s1({"SMAP\nCollectionDescriptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionDescriptors.kt\nkotlinx/serialization/internal/ListLikeDescriptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n1#2:139\n*E\n"})
@zv.g
public abstract class h1 implements bw.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final bw.f f79572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f79573b;

    public /* synthetic */ h1(bw.f fVar, kotlin.jvm.internal.x xVar) {
        this(fVar);
    }

    @oy.l
    public final bw.f a() {
        return this.f79572a;
    }

    @Override // bw.f
    public boolean b() {
        return bw.f.a.g(this);
    }

    @Override // bw.f
    public int c(@oy.l String name) {
        kotlin.jvm.internal.m0.p(name, "name");
        Integer numP1 = cv.j0.p1(name);
        if (numP1 != null) {
            return numP1.intValue();
        }
        throw new IllegalArgumentException(name + " is not a valid list index");
    }

    @Override // bw.f
    @oy.l
    public bw.f d(int i10) {
        if (i10 >= 0) {
            return this.f79572a;
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + h() + " expects only non-negative indices").toString());
    }

    @Override // bw.f
    public int e() {
        return this.f79573b;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return kotlin.jvm.internal.m0.g(this.f79572a, h1Var.f79572a) && kotlin.jvm.internal.m0.g(h(), h1Var.h());
    }

    @Override // bw.f
    @oy.l
    public String f(int i10) {
        return String.valueOf(i10);
    }

    @Override // bw.f
    @oy.l
    public List<Annotation> g(int i10) {
        if (i10 >= 0) {
            return fr.h0.J();
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + h() + " expects only non-negative indices").toString());
    }

    @Override // bw.f
    @oy.l
    public List<Annotation> getAnnotations() {
        return bw.f.a.a(this);
    }

    @Override // bw.f
    @oy.l
    public bw.n getKind() {
        return bw.o.b.f22018a;
    }

    public int hashCode() {
        return (this.f79572a.hashCode() * 31) + h().hashCode();
    }

    @Override // bw.f
    public boolean i(int i10) {
        if (i10 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + h() + " expects only non-negative indices").toString());
    }

    @Override // bw.f
    public boolean isInline() {
        return bw.f.a.f(this);
    }

    @oy.l
    public String toString() {
        return h() + '(' + this.f79572a + ')';
    }

    public h1(bw.f fVar) {
        this.f79572a = fVar;
        this.f79573b = 1;
    }
}
