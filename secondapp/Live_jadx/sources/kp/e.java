package kp;

import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f102837a = "com.tiktok.sdk.keystore";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f102838b = "com.tiktok.sdk.anonymousId";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f102839c = "com.tiktok.sdk.anonymousId.version";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f102840d = "com.tiktok.sdk.anonymousId.list";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f102841e = "com.tiktok.sdk.firstInstall";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f102842f = "com.tiktok.sdk.lastLaunch";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f102843g = "com.tiktok.sdk.2drTime";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f102844h = "com.tiktok.user.agent";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f102845i = "com.tiktok";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f102846j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f102847k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f102848l = 3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f102849m = "type";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f102850n = "auto";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f102851o = "Invalid appId or tiktokAppId";

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        PARTIAL_SUCCESS(Integer.valueOf(Sdk.SDKError.Reason.AD_SERVER_ERROR_VALUE)),
        API_ERROR(40000);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f102855b;

        a(Integer code) {
            this.f102855b = code;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum b {
        InstallApp("InstallApp"),
        SecondDayRetention("2Dretention"),
        LaunchAPP("LaunchAPP");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f102860b;

        b(String name) {
            this.f102860b = name;
        }
    }
}
