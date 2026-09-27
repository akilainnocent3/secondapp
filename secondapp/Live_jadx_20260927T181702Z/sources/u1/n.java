package u1;

import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C4235d4;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.Locale;
import k.a1;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f137557b = a(new Locale[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f137558a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(21)
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Locale[] f137559a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        @k.t
        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }

        public static boolean b(Locale locale) {
            for (Locale locale2 : f137559a) {
                if (locale2.equals(locale)) {
                    return true;
                }
            }
            return false;
        }

        @k.t
        public static boolean c(@NonNull Locale locale, @NonNull Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage()) || b(locale) || b(locale2)) {
                return false;
            }
            String strC = a2.e.c(locale);
            if (!strC.isEmpty()) {
                return strC.equals(a2.e.c(locale2));
            }
            String country = locale.getCountry();
            return country.isEmpty() || country.equals(locale2.getCountry());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(24)
    public static class b {
        @k.t
        public static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        @k.t
        public static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        @k.t
        public static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    public n(p pVar) {
        this.f137558a = pVar;
    }

    @NonNull
    public static n a(@NonNull Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? o(b.a(localeArr)) : new n(new o(localeArr));
    }

    public static Locale b(String str) {
        if (str.contains(TokenBuilder.TOKEN_DELIMITER)) {
            String[] strArrSplit = str.split(TokenBuilder.TOKEN_DELIMITER, -1);
            if (strArrSplit.length > 2) {
                return new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
            }
            if (strArrSplit.length > 1) {
                return new Locale(strArrSplit[0], strArrSplit[1]);
            }
            if (strArrSplit.length == 1) {
                return new Locale(strArrSplit[0]);
            }
        } else {
            if (!str.contains(lk.e.f104695m)) {
                return new Locale(str);
            }
            String[] strArrSplit2 = str.split(lk.e.f104695m, -1);
            if (strArrSplit2.length > 2) {
                return new Locale(strArrSplit2[0], strArrSplit2[1], strArrSplit2[2]);
            }
            if (strArrSplit2.length > 1) {
                return new Locale(strArrSplit2[0], strArrSplit2[1]);
            }
            if (strArrSplit2.length == 1) {
                return new Locale(strArrSplit2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + C4235d4.j.f61462e);
    }

    @NonNull
    public static n c(@Nullable String str) {
        if (str == null || str.isEmpty()) {
            return g();
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            localeArr[i10] = a.a(strArrSplit[i10]);
        }
        return a(localeArr);
    }

    @NonNull
    @a1(min = 1)
    public static n e() {
        return Build.VERSION.SDK_INT >= 24 ? o(b.b()) : a(Locale.getDefault());
    }

    @NonNull
    @a1(min = 1)
    public static n f() {
        return Build.VERSION.SDK_INT >= 24 ? o(b.c()) : a(Locale.getDefault());
    }

    @NonNull
    public static n g() {
        return f137557b;
    }

    @t0(21)
    public static boolean k(@NonNull Locale locale, @NonNull Locale locale2) {
        return Build.VERSION.SDK_INT >= 33 ? LocaleList.matchesLanguageAndScript(locale, locale2) : a.c(locale, locale2);
    }

    @NonNull
    @t0(24)
    public static n o(@NonNull LocaleList localeList) {
        return new n(new w(localeList));
    }

    @t0(24)
    @Deprecated
    public static n p(Object obj) {
        return o(m.a(obj));
    }

    @Nullable
    public Locale d(int i10) {
        return this.f137558a.get(i10);
    }

    public boolean equals(Object obj) {
        return (obj instanceof n) && this.f137558a.equals(((n) obj).f137558a);
    }

    @Nullable
    public Locale h(@NonNull String[] strArr) {
        return this.f137558a.b(strArr);
    }

    public int hashCode() {
        return this.f137558a.hashCode();
    }

    @k.e0(from = -1)
    public int i(@Nullable Locale locale) {
        return this.f137558a.c(locale);
    }

    public boolean j() {
        return this.f137558a.isEmpty();
    }

    @k.e0(from = 0)
    public int l() {
        return this.f137558a.size();
    }

    @NonNull
    public String m() {
        return this.f137558a.a();
    }

    @Nullable
    public Object n() {
        return this.f137558a.getLocaleList();
    }

    @NonNull
    public String toString() {
        return this.f137558a.toString();
    }
}
