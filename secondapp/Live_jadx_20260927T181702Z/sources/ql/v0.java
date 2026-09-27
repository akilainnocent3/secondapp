package ql;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class v0 extends Exception {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f122503c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f122504d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f122505e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f122506f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f122507g = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f122508b;

    public v0(String str) {
        super(str);
        this.f122508b = e(str);
    }

    public int d() {
        return this.f122508b;
    }

    public final int e(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        lowerCase.getClass();
        switch (lowerCase) {
            case "service_not_available":
                return 3;
            case "toomanymessages":
                return 4;
            case "invalid_parameters":
            case "missing_to":
                return 1;
            case "messagetoobig":
                return 2;
            default:
                return 0;
        }
    }
}
