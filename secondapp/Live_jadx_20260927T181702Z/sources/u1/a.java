package u1;

import android.os.Build;
import android.os.ext.SdkExtensions;
import dr.g1;
import dr.h1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;
import k.t0;
import k.y0;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final a f137526a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @k.j(extension = 30)
    @cs.g
    public static final int f137527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @k.j(extension = 31)
    @cs.g
    public static final int f137528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @k.j(extension = 33)
    @cs.g
    public static final int f137529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @k.j(extension = 1000000)
    @cs.g
    public static final int f137530e;

    /* JADX INFO: renamed from: u1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(30)
    public static final class C1419a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final C1419a f137531a = new C1419a();

        @k.t
        public final int a(int i10) {
            return SdkExtensions.getExtensionVersion(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @er.e(er.a.BINARY)
    @h1
    @Retention(RetentionPolicy.CLASS)
    public @interface b {
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f137527b = i10 >= 30 ? C1419a.f137531a.a(30) : 0;
        f137528c = i10 >= 30 ? C1419a.f137531a.a(31) : 0;
        f137529d = i10 >= 30 ? C1419a.f137531a.a(33) : 0;
        f137530e = i10 >= 30 ? C1419a.f137531a.a(1000000) : 0;
    }

    @k.j(api = 24)
    @cs.o
    @dr.o(message = "Android N is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 24`.", replaceWith = @g1(expression = "android.os.Build.VERSION.SDK_INT >= 24", imports = {}))
    public static final boolean a() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @k.j(api = 25)
    @cs.o
    @dr.o(message = "Android N MR1 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 25`.", replaceWith = @g1(expression = "android.os.Build.VERSION.SDK_INT >= 25", imports = {}))
    public static final boolean b() {
        return Build.VERSION.SDK_INT >= 25;
    }

    @k.j(api = 26)
    @cs.o
    @dr.o(message = "Android O is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead use `Build.VERSION.SDK_INT >= 26`.", replaceWith = @g1(expression = "android.os.Build.VERSION.SDK_INT >= 26", imports = {}))
    public static final boolean c() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @k.j(api = 27)
    @cs.o
    @dr.o(message = "Android O MR1 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 27`.", replaceWith = @g1(expression = "android.os.Build.VERSION.SDK_INT >= 27", imports = {}))
    public static final boolean d() {
        return Build.VERSION.SDK_INT >= 27;
    }

    @k.j(api = 28)
    @cs.o
    @dr.o(message = "Android P is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 28`.", replaceWith = @g1(expression = "android.os.Build.VERSION.SDK_INT >= 28", imports = {}))
    public static final boolean e() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @k.h1
    @cs.o
    @y0({y0.a.LIBRARY})
    public static final boolean f(@oy.l String codename, @oy.l String buildCodename) {
        m0.p(codename, "codename");
        m0.p(buildCodename, "buildCodename");
        if (m0.g("REL", buildCodename)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = buildCodename.toUpperCase(locale);
        m0.o(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = codename.toUpperCase(locale);
        m0.o(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    @k.j(api = 29)
    @cs.o
    @dr.o(message = "Android Q is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 29`.", replaceWith = @g1(expression = "android.os.Build.VERSION.SDK_INT >= 29", imports = {}))
    public static final boolean g() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @k.j(api = 30)
    @cs.o
    @dr.o(message = "Android R is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 30`.", replaceWith = @g1(expression = "android.os.Build.VERSION.SDK_INT >= 30", imports = {}))
    public static final boolean h() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @k.j(api = 31, codename = l3.a.R4)
    @cs.o
    @dr.o(message = "Android S is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 31`.", replaceWith = @g1(expression = "android.os.Build.VERSION.SDK_INT >= 31", imports = {}))
    public static final boolean i() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            return true;
        }
        if (i10 < 30) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        m0.o(CODENAME, "CODENAME");
        return f(l3.a.R4, CODENAME);
    }

    @k.j(api = 32, codename = "Sv2")
    @cs.o
    @dr.o(message = "Android Sv2 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 32`.", replaceWith = @g1(expression = "android.os.Build.VERSION.SDK_INT >= 32", imports = {}))
    public static final boolean j() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 32) {
            return true;
        }
        if (i10 < 31) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        m0.o(CODENAME, "CODENAME");
        return f("Sv2", CODENAME);
    }

    @k.j(api = 33, codename = "Tiramisu")
    @cs.o
    @dr.o(message = "Android Tiramisu is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 33`.", replaceWith = @g1(expression = "android.os.Build.VERSION.SDK_INT >= 33", imports = {}))
    public static final boolean k() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            return true;
        }
        if (i10 < 32) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        m0.o(CODENAME, "CODENAME");
        return f("Tiramisu", CODENAME);
    }

    @k.j(api = 34, codename = "UpsideDownCake")
    @cs.o
    @dr.o(message = "Android UpsideDownCase is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 34`.", replaceWith = @g1(expression = "android.os.Build.VERSION.SDK_INT >= 34", imports = {}))
    public static final boolean l() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            return true;
        }
        if (i10 < 33) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        m0.o(CODENAME, "CODENAME");
        return f("UpsideDownCake", CODENAME);
    }

    @k.j(codename = "VanillaIceCream")
    @b
    @cs.o
    public static final boolean m() {
        if (Build.VERSION.SDK_INT < 34) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        m0.o(CODENAME, "CODENAME");
        return f("VanillaIceCream", CODENAME);
    }
}
