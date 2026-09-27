package kotlin.jvm.internal;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@dr.l1(version = "1.1")
public final class c1 implements u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final Class<?> f102716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final String f102717c;

    public c1(@oy.l Class<?> jClass, @oy.l String moduleName) {
        m0.p(jClass, "jClass");
        m0.p(moduleName, "moduleName");
        this.f102716b = jClass;
        this.f102717c = moduleName;
    }

    @Override // kotlin.jvm.internal.u
    @oy.l
    public Class<?> a() {
        return this.f102716b;
    }

    public boolean equals(@oy.m Object obj) {
        return (obj instanceof c1) && m0.g(a(), ((c1) obj).a());
    }

    public int hashCode() {
        return a().hashCode();
    }

    @Override // ns.h
    @oy.l
    public Collection<ns.c<?>> s() {
        throw new cs.s();
    }

    @oy.l
    public String toString() {
        return a() + m1.f102753b;
    }
}
