package mv;

import kotlin.jvm.internal.m0;
import qv.z0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f115327a = -1640531527;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f115328b = 16;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final z0 f115329c = new z0("REHASH");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public static final r f115330d = new r(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    public static final r f115331e = new r(Boolean.TRUE);

    public static final r d(Object obj) {
        if (obj == null) {
            return f115330d;
        }
        return m0.g(obj, Boolean.TRUE) ? f115331e : new r(obj);
    }

    public static final Void e() {
        throw new UnsupportedOperationException("not implemented");
    }
}
