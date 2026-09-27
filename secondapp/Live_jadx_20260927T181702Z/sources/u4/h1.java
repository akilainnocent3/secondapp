package u4;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@x4.m1
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f138421a = "AndroidXMedia3";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f138422b = "1.10.0";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f138423c = "AndroidXMedia3/1.10.0";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f138424d = 1010000300;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f138425e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f138426f = 9;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final HashSet<String> f138427g = new HashSet<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f138428h = "media3.common";

    public static synchronized void a(String str) {
        if (f138427g.add(str)) {
            f138428h += ", " + str;
        }
    }

    public static synchronized String b() {
        return f138428h;
    }
}
