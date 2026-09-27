package zr;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f162079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f162080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final List<Exception> f162081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.m
    public Path f162082d;

    public q() {
        this(0, 1, null);
    }

    public final void a(@oy.l Exception exception) {
        kotlin.jvm.internal.m0.p(exception, "exception");
        this.f162080b++;
        if (this.f162081c.size() < this.f162079a) {
            if (this.f162082d != null) {
                p.a();
                Throwable thInitCause = o.a(String.valueOf(this.f162082d)).initCause(exception);
                kotlin.jvm.internal.m0.n(thInitCause, "null cannot be cast to non-null type java.nio.file.FileSystemException");
                exception = n.a(thInitCause);
            }
            this.f162081c.add(exception);
        }
    }

    public final void b(@oy.l Path name) {
        kotlin.jvm.internal.m0.p(name, "name");
        Path path = this.f162082d;
        this.f162082d = path != null ? path.resolve(name) : null;
    }

    public final void c(@oy.l Path name) {
        kotlin.jvm.internal.m0.p(name, "name");
        Path path = this.f162082d;
        if (!kotlin.jvm.internal.m0.g(name, path != null ? path.getFileName() : null)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Path path2 = this.f162082d;
        this.f162082d = path2 != null ? path2.getParent() : null;
    }

    @oy.l
    public final List<Exception> d() {
        return this.f162081c;
    }

    @oy.m
    public final Path e() {
        return this.f162082d;
    }

    public final int f() {
        return this.f162080b;
    }

    public final void g(@oy.m Path path) {
        this.f162082d = path;
    }

    public q(int i10) {
        this.f162079a = i10;
        this.f162081c = new ArrayList();
    }

    public /* synthetic */ q(int i10, int i11, kotlin.jvm.internal.x xVar) {
        this((i11 & 1) != 0 ? 64 : i10);
    }
}
