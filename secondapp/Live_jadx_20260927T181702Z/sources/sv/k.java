package sv;

import java.util.concurrent.TimeUnit;
import ms.u;
import qv.c1;
import qv.e1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final String f135589a = c1.e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @cs.g
    public static final long f135590b = e1.f("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @cs.g
    public static final int f135591c = e1.e("kotlinx.coroutines.scheduler.core.pool.size", u.u(c1.a(), 2), 1, 0, 8, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @cs.g
    public static final int f135592d = e1.e("kotlinx.coroutines.scheduler.max.pool.size", a.f135549w, 0, a.f135549w, 4, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @cs.g
    public static final long f135593e = TimeUnit.SECONDS.toNanos(e1.f("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, null));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.l
    @cs.g
    public static h f135594f = f.f135580a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f135595g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f135596h = true;

    @oy.l
    public static final i b(@oy.l Runnable runnable, long j10, boolean z10) {
        return new j(runnable, j10, z10);
    }

    public static final boolean c(@oy.l i iVar) {
        return iVar.f135587c;
    }

    public static final String d(boolean z10) {
        return z10 ? "Blocking" : "Non-blocking";
    }
}
