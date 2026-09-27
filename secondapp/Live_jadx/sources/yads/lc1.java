package yads;

import android.util.Log;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class lc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bv1 f151936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f151937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f151938c;

    static {
        bv1 bv1Var = bv1.f147356b;
        f151936a = av1.a();
        f151937b = "YandexAds";
        f151938c = true;
    }

    public static String a(String str) {
        return "[Integration] " + str;
    }

    public static final void b(String str, Object... objArr) {
        boolean z10;
        if (!f151938c) {
            synchronized (eu1.f148844a) {
                z10 = eu1.f148845b;
            }
            if (!z10) {
                return;
            }
        }
        kotlin.jvm.internal.u1 u1Var = kotlin.jvm.internal.u1.f102789a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        kotlin.jvm.internal.m0.o(str2, "format(...)");
        String strA = a(str2);
        if (f151938c) {
            Log.i(f151937b, strA);
        }
        if (eu1.f148845b) {
            f151936a.a(du1.f148359b, f151937b, strA);
        }
    }

    public static final void c(String str, Object... objArr) {
        boolean z10;
        if (!f151938c) {
            synchronized (eu1.f148844a) {
                z10 = eu1.f148845b;
            }
            if (!z10) {
                return;
            }
        }
        kotlin.jvm.internal.u1 u1Var = kotlin.jvm.internal.u1.f102789a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        kotlin.jvm.internal.m0.o(str2, "format(...)");
        String strA = a(str2);
        if (f151938c) {
            Log.w(f151937b, strA);
        }
        if (eu1.f148845b) {
            f151936a.a(du1.f148360c, f151937b, strA);
        }
    }

    public static final void a(String str, Object... objArr) {
        boolean z10;
        if (!f151938c) {
            synchronized (eu1.f148844a) {
                z10 = eu1.f148845b;
            }
            if (!z10) {
                return;
            }
        }
        kotlin.jvm.internal.u1 u1Var = kotlin.jvm.internal.u1.f102789a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        kotlin.jvm.internal.m0.o(str2, "format(...)");
        String strA = a(str2);
        if (f151938c) {
            Log.e(f151937b, strA);
        }
        if (eu1.f148845b) {
            f151936a.a(du1.f148361d, f151937b, strA);
        }
    }
}
