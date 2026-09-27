package ah;

import androidx.annotation.Nullable;
import cj.x6;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import re.x2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f5248d = 64;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f5249e = "CMCD-Object";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f5250f = "CMCD-Request";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f5251g = "CMCD-Session";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f5252h = "CMCD-Status";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f5253i = "br";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f5254j = "bl";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f5255k = "cid";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f5256l = "sid";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f5257m = "rtp";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f5258n = "sf";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f5259o = "st";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f5260p = "v";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f5261q = "tb";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f5262r = "d";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f5263s = "mtp";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f5264t = "ot";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f5265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f5266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f5267c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f5268a = new b() { // from class: ah.m
            @Override // ah.l.b
            public final l a(x2 x2Var) {
                return n.a(x2Var);
            }
        };

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a implements d {
            @Override // ah.l.d
            public /* synthetic */ boolean a(String str) {
                return o.c(this, str);
            }

            @Override // ah.l.d
            public /* synthetic */ int b(int i10) {
                return o.b(this, i10);
            }

            @Override // ah.l.d
            public /* synthetic */ x6 getCustomData() {
                return o.a(this);
            }
        }

        l a(x2 x2Var);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface d {
        boolean a(String str);

        int b(int i10);

        x6<String, String> getCustomData();
    }

    public l(@Nullable String str, @Nullable String str2, d dVar) {
        boolean z10 = true;
        eh.a.a(str == null || str.length() <= 64);
        if (str2 != null && str2.length() > 64) {
            z10 = false;
        }
        eh.a.a(z10);
        eh.a.g(dVar);
        this.f5265a = str;
        this.f5266b = str2;
        this.f5267c = dVar;
    }

    public boolean a() {
        return this.f5267c.a("br");
    }

    public boolean b() {
        return this.f5267c.a("bl");
    }

    public boolean c() {
        return this.f5267c.a("cid");
    }

    public boolean d() {
        return this.f5267c.a("rtp");
    }

    public boolean e() {
        return this.f5267c.a("mtp");
    }

    public boolean f() {
        return this.f5267c.a("d");
    }

    public boolean g() {
        return this.f5267c.a("ot");
    }

    public boolean h() {
        return this.f5267c.a("sid");
    }

    public boolean i() {
        return this.f5267c.a("st");
    }

    public boolean j() {
        return this.f5267c.a("sf");
    }

    public boolean k() {
        return this.f5267c.a("tb");
    }
}
