package tt;

import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class i {
    public static final boolean a(@l a version) {
        m0.p(version, "version");
        return (version.a() == 1 && version.b() >= 4) || version.a() > 1;
    }

    public static final boolean b(@l a version) {
        m0.p(version, "version");
        return a(version);
    }
}
