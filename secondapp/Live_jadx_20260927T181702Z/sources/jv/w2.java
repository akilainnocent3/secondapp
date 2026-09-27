package jv;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class w2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f100944e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f100945f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f100946g = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f100950k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f100951l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f100952m = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final qv.z0 f100940a = new qv.z0("COMPLETING_ALREADY");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final qv.z0 f100941b = new qv.z0("COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final qv.z0 f100942c = new qv.z0("COMPLETING_RETRY");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public static final qv.z0 f100943d = new qv.z0("TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @oy.l
    public static final qv.z0 f100947h = new qv.z0("SEALED");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @oy.l
    public static final r1 f100948i = new r1(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @oy.l
    public static final r1 f100949j = new r1(true);

    @oy.m
    public static final Object g(@oy.m Object obj) {
        return obj instanceof h2 ? new i2((h2) obj) : obj;
    }

    @oy.m
    public static final Object h(@oy.m Object obj) {
        h2 h2Var;
        i2 i2Var = obj instanceof i2 ? (i2) obj : null;
        return (i2Var == null || (h2Var = i2Var.f100811a) == null) ? obj : h2Var;
    }
}
