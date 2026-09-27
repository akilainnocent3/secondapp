package c2;

import android.icu.number.NumberFormatter;
import android.icu.number.UnlocalizedNumberFormatter;
import android.icu.text.DateFormat;
import android.icu.text.DateTimePatternGenerator;
import android.icu.util.Calendar;
import android.icu.util.MeasureUnit;
import android.os.Build;
import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Locale;
import k.t;
import k.t0;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@t0(21)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f22221a = "j";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f22222b = {"BS", "BZ", "KY", "PR", "PW", "US"};

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22223a;

        static {
            int[] iArr = new int[DateFormat.HourCycle.values().length];
            f22223a = iArr;
            try {
                iArr[DateFormat.HourCycle.HOUR_CYCLE_11.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22223a[DateFormat.HourCycle.HOUR_CYCLE_12.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22223a[DateFormat.HourCycle.HOUR_CYCLE_23.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22223a[DateFormat.HourCycle.HOUR_CYCLE_24.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(24)
    public static class b {
        @t
        public static String a(@NonNull Locale locale) {
            return Calendar.getInstance(locale).getType();
        }

        @t
        public static Locale b() {
            return Locale.getDefault(Locale.Category.FORMAT);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(33)
    public static class c {
        @t
        public static String a(@NonNull Locale locale) {
            return b(DateTimePatternGenerator.getInstance(locale).getDefaultHourCycle());
        }

        public static String b(DateFormat.HourCycle hourCycle) {
            int i10 = a.f22223a[hourCycle.ordinal()];
            if (i10 == 1) {
                return f.f22247b;
            }
            if (i10 == 2) {
                return f.f22248c;
            }
            if (i10 != 3) {
                return i10 != 4 ? "" : f.f22250e;
            }
            return f.f22249d;
        }

        @t
        public static String c(@NonNull Locale locale) {
            String identifier = ((UnlocalizedNumberFormatter) ((UnlocalizedNumberFormatter) NumberFormatter.with().usage("weather")).unit(MeasureUnit.CELSIUS)).locale(locale).format(1L).getOutputUnit().getIdentifier();
            return identifier.startsWith(g.f22254c) ? g.f22254c : identifier;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f22224a = "ca";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f22225b = "chinese";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f22226c = "dangi";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f22227d = "gregorian";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f22228e = "hebrew";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f22229f = "indian";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f22230g = "islamic";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f22231h = "islamic-civil";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f22232i = "islamic-rgsa";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f22233j = "islamic-tbla";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f22234k = "islamic-umalqura";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f22235l = "persian";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f22236m = "";

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @Retention(RetentionPolicy.SOURCE)
        @y0({y0.a.LIBRARY})
        public @interface a {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f22237a = "fw";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f22238b = "sun";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f22239c = "mon";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f22240d = "tue";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f22241e = "wed";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f22242f = "thu";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f22243g = "fri";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f22244h = "sat";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f22245i = "";

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @Retention(RetentionPolicy.SOURCE)
        @y0({y0.a.LIBRARY})
        public @interface a {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f22246a = "hc";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f22247b = "h11";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f22248c = "h12";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f22249d = "h23";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f22250e = "h24";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f22251f = "";

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @Retention(RetentionPolicy.SOURCE)
        @y0({y0.a.LIBRARY})
        public @interface a {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f22252a = "mu";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f22253b = "celsius";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f22254c = "fahrenhe";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f22255d = "kelvin";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f22256e = "";

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @Retention(RetentionPolicy.SOURCE)
        @y0({y0.a.LIBRARY})
        public @interface a {
        }
    }

    public static String a(@NonNull Locale locale) {
        return p(java.util.Calendar.getInstance(locale).getFirstDayOfWeek());
    }

    public static String b(@NonNull Locale locale) {
        return android.text.format.DateFormat.getBestDateTimePattern(locale, "jm").contains("H") ? f.f22249d : f.f22248c;
    }

    @NonNull
    public static String c() {
        return f(true);
    }

    @NonNull
    public static String d(@NonNull Locale locale) {
        return e(locale, true);
    }

    @NonNull
    public static String e(@NonNull Locale locale, boolean z10) {
        String strV = v("ca", "", locale, z10);
        if (strV != null) {
            return strV;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return b.a(locale);
        }
        return z10 ? d.f22227d : "";
    }

    @NonNull
    public static String f(boolean z10) {
        return e(Build.VERSION.SDK_INT >= 24 ? b.b() : g(), z10);
    }

    public static Locale g() {
        return Locale.getDefault();
    }

    @NonNull
    public static String h() {
        return k(true);
    }

    @NonNull
    public static String i(@NonNull Locale locale) {
        return j(locale, true);
    }

    @NonNull
    public static String j(@NonNull Locale locale, boolean z10) {
        String strV = v(e.f22237a, "", locale, z10);
        return strV != null ? strV : a(locale);
    }

    @NonNull
    public static String k(boolean z10) {
        return j(Build.VERSION.SDK_INT >= 24 ? b.b() : g(), z10);
    }

    @NonNull
    public static String l() {
        return o(true);
    }

    @NonNull
    public static String m(@NonNull Locale locale) {
        return n(locale, true);
    }

    @NonNull
    public static String n(@NonNull Locale locale, boolean z10) {
        String strV = v(f.f22246a, "", locale, z10);
        if (strV != null) {
            return strV;
        }
        return Build.VERSION.SDK_INT >= 33 ? c.a(locale) : b(locale);
    }

    @NonNull
    public static String o(boolean z10) {
        return n(Build.VERSION.SDK_INT >= 24 ? b.b() : g(), z10);
    }

    public static String p(int i10) {
        return (i10 < 1 || i10 > 7) ? "" : new String[]{e.f22238b, e.f22239c, e.f22240d, e.f22241e, e.f22242f, e.f22243g, e.f22244h}[i10 - 1];
    }

    public static String q(Locale locale) {
        return Arrays.binarySearch(f22222b, locale.getCountry()) >= 0 ? g.f22254c : g.f22253b;
    }

    @NonNull
    public static String r() {
        return u(true);
    }

    @NonNull
    public static String s(@NonNull Locale locale) {
        return t(locale, true);
    }

    @NonNull
    public static String t(@NonNull Locale locale, boolean z10) {
        String strV = v(g.f22252a, "", locale, z10);
        if (strV != null) {
            return strV;
        }
        return Build.VERSION.SDK_INT >= 33 ? c.c(locale) : q(locale);
    }

    @NonNull
    public static String u(boolean z10) {
        return t(Build.VERSION.SDK_INT >= 24 ? b.b() : g(), z10);
    }

    public static String v(String str, String str2, Locale locale, boolean z10) {
        String unicodeLocaleType = locale.getUnicodeLocaleType(str);
        if (unicodeLocaleType != null) {
            return unicodeLocaleType;
        }
        if (z10) {
            return null;
        }
        return str2;
    }
}
