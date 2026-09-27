package fw;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class b {
    public static final byte A = 10;
    public static final byte B = 127;
    public static final int C = 126;
    public static final int D = 117;
    public static final int E = 32;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final String f85374a = "Use 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static final String f85375b = "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final String f85376c = "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public static final String f85377d = "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    public static final String f85378e = "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.l
    public static final String f85379f = "null";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final char f85380g = ',';

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final char f85381h = ':';

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final char f85382i = '{';

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final char f85383j = '}';

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final char f85384k = '[';

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final char f85385l = ']';

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final char f85386m = '\"';

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final char f85387n = '\\';

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final char f85388o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final char f85389p = 'u';

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final byte f85390q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final byte f85391r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final byte f85392s = 2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final byte f85393t = 3;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final byte f85394u = 4;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final byte f85395v = 5;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final byte f85396w = 6;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final byte f85397x = 7;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final byte f85398y = 8;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final byte f85399z = 9;

    public static final byte a(char c10) {
        if (c10 < '~') {
            return q.f85500c[c10];
        }
        return (byte) 0;
    }

    public static final char b(int i10) {
        if (i10 < 117) {
            return q.f85499b[i10];
        }
        return (char) 0;
    }

    @oy.l
    public static final String c(byte b10) {
        if (b10 == 1) {
            return "quotation mark '\"'";
        }
        if (b10 == 2) {
            return "string escape sequence '\\'";
        }
        if (b10 == 4) {
            return "comma ','";
        }
        if (b10 == 5) {
            return "colon ':'";
        }
        if (b10 == 6) {
            return "start of the object '{'";
        }
        if (b10 == 7) {
            return "end of the object '}'";
        }
        if (b10 == 8) {
            return "start of the array '['";
        }
        if (b10 == 9) {
            return "end of the array ']'";
        }
        if (b10 == 10) {
            return "end of the input";
        }
        return b10 == 127 ? "invalid token" : "valid token";
    }
}
