package wc;

import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f142696c = new b(3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f142697d = new b(8);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f142698e = new b(9);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f142699f = new b(6);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f142700g = new b(7);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f142701h = new b(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f142702i = new b(1, "Ad Expired");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final int f142703j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final int f142704k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final int f142705l = 3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final int f142706m = 9;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Deprecated
    public static final int f142707n = 6;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final int f142708o = 12;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Deprecated
    public static final int f142709p = 10;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Deprecated
    public static final int f142710q = 11;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Deprecated
    public static final int f142711r = 7;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Deprecated
    public static final int f142712s = 1005;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Deprecated
    public static final int f142713t = 13;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f142714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f142715b;

    public b(int i10, String str) {
        this.f142714a = com.cleveradssolutions.internal.a.d(i10);
        this.f142715b = str;
    }

    public final int a() {
        return this.f142714a;
    }

    @oy.l
    public final String b() {
        String str = this.f142715b;
        if (str != null) {
            return str;
        }
        switch (this.f142714a) {
            case 1:
                return "Ad are not ready";
            case 2:
                return "Device rejected";
            case 3:
                return "No Fill";
            case 4:
            case 5:
            default:
                return UnityAdsConstants.Messages.MSG_INTERNAL_ERROR;
            case 6:
                return "Reached cap for user";
            case 7:
                return "Not initialized";
            case 8:
                return AndroidInitializeBoldSDK.MSG_TIMEOUT;
            case 9:
                return "No internet connection";
            case 10:
                return "Invalid configuration";
            case 11:
                return "Interval has not yet passed";
            case 12:
                return "Ad already displayed";
            case 13:
                return "App not foreground";
        }
    }

    public final boolean c() {
        return this.f142715b != null;
    }

    public boolean equals(@oy.m Object obj) {
        if (obj instanceof b) {
            return this.f142714a == ((b) obj).f142714a;
        }
        return (obj instanceof Integer) && this.f142714a == ((Integer) obj).intValue();
    }

    public int hashCode() {
        return this.f142714a;
    }

    @oy.l
    public String toString() {
        return b() + " (Code: " + this.f142714a + gi.j.f86771d;
    }

    public b(int i10) {
        this(i10, null);
    }

    public b(String str) {
        this.f142714a = 0;
        this.f142715b = str;
    }
}
