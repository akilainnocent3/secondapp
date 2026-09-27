package dw;

import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class s2 implements bw.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final String f79658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final bw.e f79659b;

    public s2(@oy.l String serialName, @oy.l bw.e kind) {
        kotlin.jvm.internal.m0.p(serialName, "serialName");
        kotlin.jvm.internal.m0.p(kind, "kind");
        this.f79658a = serialName;
        this.f79659b = kind;
    }

    private final Void a() {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // bw.f
    public boolean b() {
        return bw.f.a.g(this);
    }

    @Override // bw.f
    public int c(@oy.l String name) {
        kotlin.jvm.internal.m0.p(name, "name");
        a();
        throw new dr.e0();
    }

    @Override // bw.f
    @oy.l
    public bw.f d(int i10) {
        a();
        throw new dr.e0();
    }

    @Override // bw.f
    public int e() {
        return 0;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2)) {
            return false;
        }
        s2 s2Var = (s2) obj;
        return kotlin.jvm.internal.m0.g(h(), s2Var.h()) && kotlin.jvm.internal.m0.g(getKind(), s2Var.getKind());
    }

    @Override // bw.f
    @oy.l
    public String f(int i10) {
        a();
        throw new dr.e0();
    }

    @Override // bw.f
    @oy.l
    public List<Annotation> g(int i10) {
        a();
        throw new dr.e0();
    }

    @Override // bw.f
    @oy.l
    public List<Annotation> getAnnotations() {
        return bw.f.a.a(this);
    }

    @Override // bw.f
    @oy.l
    public String h() {
        return this.f79658a;
    }

    public int hashCode() {
        return h().hashCode() + (getKind().hashCode() * 31);
    }

    @Override // bw.f
    public boolean i(int i10) {
        a();
        throw new dr.e0();
    }

    @Override // bw.f
    public boolean isInline() {
        return bw.f.a.f(this);
    }

    @Override // bw.f
    @oy.l
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public bw.e getKind() {
        return this.f79659b;
    }

    @oy.l
    public String toString() {
        return "PrimitiveDescriptor(" + h() + ')';
    }
}
