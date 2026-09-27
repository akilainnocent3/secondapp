package r7;

import android.os.Messenger;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c1 {
    public static final int A = 1;
    public static final int B = 2;
    public static final int C = 3;
    public static final int D = 4;
    public static final int E = 5;
    public static final int F = 6;
    public static final int G = 7;
    public static final int H = 8;
    public static final String I = "error";
    public static final int J = 1;
    public static final int K = 2;
    public static final int L = 3;
    public static final int M = 4;
    public static final int N = 4;
    public static final int O = 1;
    public static final int P = 2;
    public static final int Q = 3;
    public static final int R = 3;
    public static final int S = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f123709a = "android.media.MediaRouteProviderService";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f123710b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f123711c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f123712d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f123713e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f123714f = 5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f123715g = 6;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f123716h = 7;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f123717i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f123718j = 9;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f123719k = 10;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f123720l = 11;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f123721m = 12;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f123722n = 13;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f123723o = 14;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f123724p = "routeId";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f123725q = "routeGroupId";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f123726r = "volume";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f123727s = "unselectReason";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f123728t = "memberRouteIds";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f123729u = "memberRouteId";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f123730v = "groupableTitle";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f123731w = "transferableTitle";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f123732x = "groupRoute";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f123733y = "dynamicRoutes";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f123734z = 0;

    public static boolean a(Messenger messenger) {
        if (messenger != null) {
            try {
                if (messenger.getBinder() != null) {
                    return true;
                }
            } catch (NullPointerException unused) {
            }
        }
        return false;
    }
}
