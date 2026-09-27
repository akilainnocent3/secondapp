package re;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f125908a = "ExoPlayerLib";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f125909b = "2.19.1";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f125910c = "ExoPlayerLib/2.19.1";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f125911d = 2019001;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f125912e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f125913f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final HashSet<String> f125914g = new HashSet<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f125915h = "goog.exo.core";

    public static synchronized void a(String str) {
        if (f125914g.add(str)) {
            f125915h += ", " + str;
        }
    }

    public static synchronized String b() {
        return f125915h;
    }
}
