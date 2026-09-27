package g9;

import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class y implements m9.f.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    public final String f86248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.m
    public final File f86249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.m
    public final Callable<InputStream> f86250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public final m9.f.c f86251d;

    public y(@oy.m String str, @oy.m File file, @oy.m Callable<InputStream> callable, @oy.l m9.f.c delegate) {
        m0.p(delegate, "delegate");
        this.f86248a = str;
        this.f86249b = file;
        this.f86250c = callable;
        this.f86251d = delegate;
    }

    @Override // m9.f.c
    @oy.l
    public m9.f a(@oy.l m9.f.b configuration) {
        m0.p(configuration, "configuration");
        return new x(configuration.f107130a, this.f86248a, this.f86249b, this.f86250c, configuration.f107132c.f107128a, this.f86251d.a(configuration));
    }
}
