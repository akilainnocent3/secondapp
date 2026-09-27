package zr;

import java.nio.file.Path;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final Path f162040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.m
    public final Object f162041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.m
    public final a0 f162042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.m
    public Iterator<a0> f162043d;

    public a0(@oy.l Path path, @oy.m Object obj, @oy.m a0 a0Var) {
        kotlin.jvm.internal.m0.p(path, "path");
        this.f162040a = path;
        this.f162041b = obj;
        this.f162042c = a0Var;
    }

    @oy.m
    public final Iterator<a0> a() {
        return this.f162043d;
    }

    @oy.m
    public final Object b() {
        return this.f162041b;
    }

    @oy.m
    public final a0 c() {
        return this.f162042c;
    }

    @oy.l
    public final Path d() {
        return this.f162040a;
    }

    public final void e(@oy.m Iterator<a0> it) {
        this.f162043d = it;
    }
}
