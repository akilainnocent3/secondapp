package jv;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class w1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f100933b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f100934c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f100935d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f100936e = 1000000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f100937f = 9223372036854L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f100938g = 4611686018427387903L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final qv.z0 f100932a = new qv.z0("REMOVED_TASK");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @oy.l
    public static final qv.z0 f100939h = new qv.z0("CLOSED_EMPTY");

    public static final long c(long j10) {
        return j10 / 1000000;
    }

    public static final long d(long j10) {
        if (j10 <= 0) {
            return 0L;
        }
        if (j10 >= f100937f) {
            return Long.MAX_VALUE;
        }
        return j10 * 1000000;
    }
}
