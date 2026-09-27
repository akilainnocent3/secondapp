package dw;

import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class u1 implements bw.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final u1 f79674a = new u1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static final bw.n f79675b = bw.o.d.f22020a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final String f79676c = "kotlin.Nothing";

    public final Void a() {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
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
        return this == obj;
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
    public bw.n getKind() {
        return f79675b;
    }

    @Override // bw.f
    @oy.l
    public String h() {
        return f79676c;
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

    @oy.l
    public String toString() {
        return "NothingSerialDescriptor";
    }
}
