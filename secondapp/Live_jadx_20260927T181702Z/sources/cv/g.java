package cv;

import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final g f77201a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final Charset f77202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final Charset f77203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final Charset f77204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final Charset f77205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final Charset f77206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final Charset f77207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @oy.m
    public static volatile Charset f77208h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @oy.m
    public static volatile Charset f77209i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @oy.m
    public static volatile Charset f77210j;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        kotlin.jvm.internal.m0.o(charsetForName, "forName(...)");
        f77202b = charsetForName;
        Charset charsetForName2 = Charset.forName("UTF-16");
        kotlin.jvm.internal.m0.o(charsetForName2, "forName(...)");
        f77203c = charsetForName2;
        Charset charsetForName3 = Charset.forName(CharEncoding.UTF_16BE);
        kotlin.jvm.internal.m0.o(charsetForName3, "forName(...)");
        f77204d = charsetForName3;
        Charset charsetForName4 = Charset.forName(CharEncoding.UTF_16LE);
        kotlin.jvm.internal.m0.o(charsetForName4, "forName(...)");
        f77205e = charsetForName4;
        Charset charsetForName5 = Charset.forName("US-ASCII");
        kotlin.jvm.internal.m0.o(charsetForName5, "forName(...)");
        f77206f = charsetForName5;
        Charset charsetForName6 = Charset.forName(CharEncoding.ISO_8859_1);
        kotlin.jvm.internal.m0.o(charsetForName6, "forName(...)");
        f77207g = charsetForName6;
    }

    @cs.j(name = "UTF32")
    @oy.l
    public final Charset a() {
        Charset charset = f77208h;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32");
        kotlin.jvm.internal.m0.o(charsetForName, "forName(...)");
        f77208h = charsetForName;
        return charsetForName;
    }

    @cs.j(name = "UTF32_BE")
    @oy.l
    public final Charset b() {
        Charset charset = f77210j;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32BE");
        kotlin.jvm.internal.m0.o(charsetForName, "forName(...)");
        f77210j = charsetForName;
        return charsetForName;
    }

    @cs.j(name = "UTF32_LE")
    @oy.l
    public final Charset c() {
        Charset charset = f77209i;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32LE");
        kotlin.jvm.internal.m0.o(charsetForName, "forName(...)");
        f77209i = charsetForName;
        return charsetForName;
    }
}
