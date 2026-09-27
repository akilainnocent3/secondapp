package z5;

import androidx.annotation.Nullable;
import cj.w6;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import u4.c1;
import x4.m1;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class g {
    public static final String A = "nor";
    public static final String B = "nrr";
    public static final int C = 0;
    public static final int D = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f160337e = 64;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f160338f = "CMCD-Object";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f160339g = "CMCD-Request";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f160340h = "CMCD-Session";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f160341i = "CMCD-Status";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f160342j = "CMCD";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f160343k = "br";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f160344l = "bl";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f160345m = "cid";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f160346n = "sid";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f160347o = "rtp";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f160348p = "sf";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f160349q = "st";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f160350r = "v";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f160351s = "tb";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f160352t = "d";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f160353u = "mtp";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f160354v = "ot";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f160355w = "bs";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f160356x = "dl";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f160357y = "pr";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f160358z = "su";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f160359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f160360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f160361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f160362d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f160363a = new c() { // from class: z5.h
            @Override // z5.g.c
            public final g a(c1 c1Var) {
                return i.a(c1Var);
            }
        };

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a implements e {
            @Override // z5.g.e
            public /* synthetic */ boolean a(String str) {
                return j.c(this, str);
            }

            @Override // z5.g.e
            public /* synthetic */ int b(int i10) {
                return j.b(this, i10);
            }

            @Override // z5.g.e
            public /* synthetic */ w6 getCustomData() {
                return j.a(this);
            }
        }

        @Nullable
        g a(c1 c1Var);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface e {
        boolean a(String str);

        int b(int i10);

        w6<String, String> getCustomData();
    }

    public g(@Nullable String str, @Nullable String str2, e eVar) {
        this(str, str2, eVar, 0);
    }

    public boolean a() {
        return this.f160361c.a("br");
    }

    public boolean b() {
        return this.f160361c.a("bl");
    }

    public boolean c() {
        return this.f160361c.a(f160355w);
    }

    public boolean d() {
        return this.f160361c.a("cid");
    }

    public boolean e() {
        return this.f160361c.a(f160356x);
    }

    public boolean f() {
        return this.f160361c.a("rtp");
    }

    public boolean g() {
        return this.f160361c.a("mtp");
    }

    public boolean h() {
        return this.f160361c.a(A);
    }

    public boolean i() {
        return this.f160361c.a(B);
    }

    public boolean j() {
        return this.f160361c.a("d");
    }

    public boolean k() {
        return this.f160361c.a("ot");
    }

    public boolean l() {
        return this.f160361c.a(f160357y);
    }

    public boolean m() {
        return this.f160361c.a("sid");
    }

    public boolean n() {
        return this.f160361c.a("su");
    }

    public boolean o() {
        return this.f160361c.a("st");
    }

    public boolean p() {
        return this.f160361c.a("sf");
    }

    public boolean q() {
        return this.f160361c.a("tb");
    }

    public g(@Nullable String str, @Nullable String str2, e eVar, int i10) {
        boolean z10 = true;
        l0.d(str == null || str.length() <= 64);
        if (str2 != null && str2.length() > 64) {
            z10 = false;
        }
        l0.d(z10);
        l0.E(eVar);
        this.f160359a = str;
        this.f160360b = str2;
        this.f160361c = eVar;
        this.f160362d = i10;
    }
}
