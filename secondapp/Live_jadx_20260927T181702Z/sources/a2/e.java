package a2;

import android.annotation.SuppressLint;
import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f3554a = "ICUCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f3555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f3556c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(21)
    public static class a {
        @k.t
        public static String a(Locale locale) {
            return locale.getScript();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(24)
    public static class b {
        @k.t
        public static ULocale a(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        @k.t
        public static ULocale b(Locale locale) {
            return ULocale.forLocale(locale);
        }

        @k.t
        public static String c(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                f3556c = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static String a(Locale locale) {
        String string = locale.toString();
        try {
            Method method = f3556c;
            if (method != null) {
                return (String) method.invoke(null, string);
            }
        } catch (IllegalAccessException e10) {
            Log.w(f3554a, e10);
        } catch (InvocationTargetException e11) {
            Log.w(f3554a, e11);
        }
        return string;
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static String b(String str) {
        try {
            Method method = f3555b;
            if (method != null) {
                return (String) method.invoke(null, str);
            }
        } catch (IllegalAccessException e10) {
            Log.w(f3554a, e10);
        } catch (InvocationTargetException e11) {
            Log.w(f3554a, e11);
        }
        return null;
    }

    @Nullable
    public static String c(@NonNull Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return b.c(b.a(b.b(locale)));
        }
        try {
            return a.a((Locale) f3556c.invoke(null, locale));
        } catch (IllegalAccessException e10) {
            Log.w(f3554a, e10);
            return a.a(locale);
        } catch (InvocationTargetException e11) {
            Log.w(f3554a, e11);
            return a.a(locale);
        }
    }
}
