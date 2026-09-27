package bw;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class p implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f22021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final String f22022b;

    public p(@oy.l String serialName, @oy.l f original) {
        m0.p(serialName, "serialName");
        m0.p(original, "original");
        this.f22021a = original;
        this.f22022b = serialName;
    }

    @Override // bw.f
    public boolean b() {
        return this.f22021a.b();
    }

    @Override // bw.f
    @zv.g
    public int c(@oy.l String name) {
        m0.p(name, "name");
        return this.f22021a.c(name);
    }

    @Override // bw.f
    @oy.l
    @zv.g
    public f d(int i10) {
        return this.f22021a.d(i10);
    }

    @Override // bw.f
    public int e() {
        return this.f22021a.e();
    }

    @Override // bw.f
    @oy.l
    @zv.g
    public String f(int i10) {
        return this.f22021a.f(i10);
    }

    @Override // bw.f
    @oy.l
    @zv.g
    public List<Annotation> g(int i10) {
        return this.f22021a.g(i10);
    }

    @Override // bw.f
    @oy.l
    public List<Annotation> getAnnotations() {
        return this.f22021a.getAnnotations();
    }

    @Override // bw.f
    @oy.l
    public n getKind() {
        return this.f22021a.getKind();
    }

    @Override // bw.f
    @oy.l
    public String h() {
        return this.f22022b;
    }

    @Override // bw.f
    @zv.g
    public boolean i(int i10) {
        return this.f22021a.i(i10);
    }

    @Override // bw.f
    public boolean isInline() {
        return this.f22021a.isInline();
    }
}
