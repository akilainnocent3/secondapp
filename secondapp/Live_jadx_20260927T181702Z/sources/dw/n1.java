package dw;

import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@kotlin.jvm.internal.s1({"SMAP\nCollectionDescriptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionDescriptors.kt\nkotlinx/serialization/internal/MapLikeDescriptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n1#2:139\n*E\n"})
public abstract class n1 implements bw.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final String f79629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final bw.f f79630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final bw.f f79631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f79632d;

    public /* synthetic */ n1(String str, bw.f fVar, bw.f fVar2, kotlin.jvm.internal.x xVar) {
        this(str, fVar, fVar2);
    }

    @oy.l
    public final bw.f a() {
        return this.f79630b;
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
        throw new IllegalArgumentException(name + " is not a valid map index");
    }

    @Override // bw.f
    @oy.l
    public bw.f d(int i10) {
        if (i10 >= 0) {
            int i11 = i10 % 2;
            if (i11 == 0) {
                return this.f79630b;
            }
            if (i11 == 1) {
                return this.f79631c;
            }
            throw new IllegalStateException("Unreached");
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + h() + " expects only non-negative indices").toString());
    }

    @Override // bw.f
    public int e() {
        return this.f79632d;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return kotlin.jvm.internal.m0.g(h(), n1Var.h()) && kotlin.jvm.internal.m0.g(this.f79630b, n1Var.f79630b) && kotlin.jvm.internal.m0.g(this.f79631c, n1Var.f79631c);
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
        return bw.o.c.f22019a;
    }

    @Override // bw.f
    @oy.l
    public String h() {
        return this.f79629a;
    }

    public int hashCode() {
        return (((h().hashCode() * 31) + this.f79630b.hashCode()) * 31) + this.f79631c.hashCode();
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
    public final bw.f j() {
        return this.f79631c;
    }

    @oy.l
    public String toString() {
        return h() + '(' + this.f79630b + ", " + this.f79631c + ')';
    }

    public n1(String str, bw.f fVar, bw.f fVar2) {
        this.f79629a = str;
        this.f79630b = fVar;
        this.f79631c = fVar2;
        this.f79632d = 2;
    }
}
