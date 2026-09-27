package zr;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class t implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    public ds.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> f162085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.m
    public ds.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> f162086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.m
    public ds.p<? super Path, ? super IOException, ? extends FileVisitResult> f162087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.m
    public ds.p<? super Path, ? super IOException, ? extends FileVisitResult> f162088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f162089e;

    @Override // zr.s
    public void a(@oy.l ds.p<? super Path, ? super IOException, ? extends FileVisitResult> function) {
        kotlin.jvm.internal.m0.p(function, "function");
        f();
        g(this.f162088d, "onPostVisitDirectory");
        this.f162088d = function;
    }

    @Override // zr.s
    public void b(@oy.l ds.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> function) {
        kotlin.jvm.internal.m0.p(function, "function");
        f();
        g(this.f162086b, "onVisitFile");
        this.f162086b = function;
    }

    @Override // zr.s
    public void c(@oy.l ds.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> function) {
        kotlin.jvm.internal.m0.p(function, "function");
        f();
        g(this.f162085a, "onPreVisitDirectory");
        this.f162085a = function;
    }

    @Override // zr.s
    public void d(@oy.l ds.p<? super Path, ? super IOException, ? extends FileVisitResult> function) {
        kotlin.jvm.internal.m0.p(function, "function");
        f();
        g(this.f162087c, "onVisitFileFailed");
        this.f162087c = function;
    }

    @oy.l
    public final FileVisitor<Path> e() {
        f();
        this.f162089e = true;
        return g.a(new v(this.f162085a, this.f162086b, this.f162087c, this.f162088d));
    }

    public final void f() {
        if (this.f162089e) {
            throw new IllegalStateException("This builder was already built");
        }
    }

    public final void g(Object obj, String str) {
        if (obj == null) {
            return;
        }
        throw new IllegalStateException(str + " was already defined");
    }
}
