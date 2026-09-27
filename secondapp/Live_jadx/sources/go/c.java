package go;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float f87204j = 14.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float f87205k = 24.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float f87206l = 14.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f87207m = "MMM";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f87208n = "dd";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f87209o = "EEE";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f87210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f87211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f87212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f87213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f87214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f87215f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f87216g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f87217h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f87218i;

    public c() {
    }

    public String a() {
        return this.f87212c;
    }

    public String b() {
        return this.f87211b;
    }

    public String c() {
        return this.f87210a;
    }

    public Integer d() {
        return this.f87216g;
    }

    public float e() {
        return this.f87215f;
    }

    public float f() {
        return this.f87214e;
    }

    public float g() {
        return this.f87213d;
    }

    public boolean h() {
        return this.f87218i;
    }

    public boolean i() {
        return this.f87217h;
    }

    public c j(String formatBottomText) {
        this.f87212c = formatBottomText;
        return this;
    }

    public c k(String formatMiddleText) {
        this.f87211b = formatMiddleText;
        return this;
    }

    public c l(String formatTopText) {
        this.f87210a = formatTopText;
        return this;
    }

    public c m(Integer selectorColor) {
        this.f87216g = selectorColor;
        return this;
    }

    public c n(boolean showBottomText) {
        this.f87218i = showBottomText;
        return this;
    }

    public c o(boolean showTopText) {
        this.f87217h = showTopText;
        return this;
    }

    public c p(float sizeBottomText) {
        this.f87215f = sizeBottomText;
        return this;
    }

    public c q(float sizeMiddleText) {
        this.f87214e = sizeMiddleText;
        return this;
    }

    public c r(float sizeTopText) {
        this.f87213d = sizeTopText;
        return this;
    }

    public void s(c defaultConfig) {
        if (defaultConfig == null) {
            return;
        }
        if (this.f87216g == null) {
            this.f87216g = defaultConfig.f87216g;
        }
        if (this.f87213d == 0.0f) {
            this.f87213d = defaultConfig.f87213d;
        }
        if (this.f87214e == 0.0f) {
            this.f87214e = defaultConfig.f87214e;
        }
        if (this.f87215f == 0.0f) {
            this.f87215f = defaultConfig.f87215f;
        }
    }

    public c(float sizeTopText, float sizeMiddleText, float sizeBottomText, Integer selectorColor) {
        this.f87213d = sizeTopText;
        this.f87214e = sizeMiddleText;
        this.f87215f = sizeBottomText;
        this.f87216g = selectorColor;
    }
}
