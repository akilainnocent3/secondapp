package yads;

import android.util.Log;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class fl2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bv1 f149156a;

    static {
        bv1 bv1Var = bv1.f147356b;
        f149156a = av1.a();
    }

    public static void a(String str, Object... objArr) {
        boolean z10;
        if (!ad1.f146762a) {
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
        if (ad1.f146762a) {
            Log.w("Yandex Mobile Ads", str2);
        }
        if (eu1.f148845b) {
            f149156a.a(du1.f148360c, "Yandex Mobile Ads", str2);
        }
    }
}
