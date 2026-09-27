package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f50668a = "UTC";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static AtomicReference<w> f50669b = new AtomicReference<>();

    @TargetApi(24)
    public static DateFormat A(Locale locale) {
        return d("yMMMM", locale);
    }

    @TargetApi(24)
    public static DateFormat B(Locale locale) {
        return d("yMMMMEEEEd", locale);
    }

    @NonNull
    public static String C(@NonNull String str) {
        int iB = b(str, "yY", 1, 0);
        if (iB >= str.length()) {
            return str;
        }
        String str2 = "EMd";
        int iB2 = b(str, "EMd", 1, iB);
        if (iB2 < str.length()) {
            str2 = "EMd,";
        }
        return str.replace(str.substring(b(str, str2, -1, iB) + 1, iB2), " ").trim();
    }

    public static void D(@Nullable w wVar) {
        f50669b.set(wVar);
    }

    public static long a(long j10) {
        Calendar calendarX = x();
        calendarX.setTimeInMillis(j10);
        return f(calendarX).getTimeInMillis();
    }

    public static int b(@NonNull String str, @NonNull String str2, int i10, int i11) {
        while (i11 >= 0 && i11 < str.length() && str2.indexOf(str.charAt(i11)) == -1) {
            if (str.charAt(i11) == '\'') {
                do {
                    i11 += i10;
                    if (i11 < 0 || i11 >= str.length()) {
                        break;
                    }
                } while (str.charAt(i11) != '\'');
            }
            i11 += i10;
        }
        return i11;
    }

    @TargetApi(24)
    public static DateFormat c(Locale locale) {
        return d("MMMd", locale);
    }

    @TargetApi(24)
    public static DateFormat d(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(w());
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton;
    }

    @NonNull
    public static String e(@NonNull String str) {
        return str.replaceAll("[^dMy/\\-.]", "").replaceAll("d{1,2}", go.c.f87208n).replaceAll("M{1,2}", "MM").replaceAll("y{1,4}", "yyyy").replaceAll("\\.$", "").replaceAll("My", "M/y");
    }

    public static Calendar f(Calendar calendar) {
        Calendar calendarY = y(calendar);
        Calendar calendarX = x();
        calendarX.set(calendarY.get(1), calendarY.get(2), calendarY.get(5));
        return calendarX;
    }

    public static SimpleDateFormat g() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(e(((SimpleDateFormat) java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toPattern()), Locale.getDefault());
        simpleDateFormat.setTimeZone(u());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    public static String h(Resources resources, SimpleDateFormat simpleDateFormat) {
        String pattern = simpleDateFormat.toPattern();
        String string = resources.getString(ih.a.m.H1);
        String string2 = resources.getString(ih.a.m.G1);
        String string3 = resources.getString(ih.a.m.F1);
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage())) {
            pattern = pattern.replaceAll("d+", "d").replaceAll("M+", "M").replaceAll("y+", "y");
        }
        return pattern.replace("d", string3).replace("M", string2).replace("y", string);
    }

    public static java.text.DateFormat i(int i10, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i10, locale);
        dateInstance.setTimeZone(u());
        return dateInstance;
    }

    public static java.text.DateFormat j() {
        return k(Locale.getDefault());
    }

    public static java.text.DateFormat k(Locale locale) {
        return i(0, locale);
    }

    public static java.text.DateFormat l() {
        return m(Locale.getDefault());
    }

    public static java.text.DateFormat m(Locale locale) {
        return i(2, locale);
    }

    public static java.text.DateFormat n() {
        return o(Locale.getDefault());
    }

    public static java.text.DateFormat o(Locale locale) {
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) m(locale);
        simpleDateFormat.applyPattern(C(simpleDateFormat.toPattern()));
        return simpleDateFormat;
    }

    @TargetApi(24)
    public static DateFormat p(Locale locale) {
        return d("MMMMEEEEd", locale);
    }

    public static java.text.DateFormat q(@NonNull java.text.DateFormat dateFormat) {
        java.text.DateFormat dateFormat2 = (java.text.DateFormat) dateFormat.clone();
        dateFormat2.setTimeZone(u());
        return dateFormat2;
    }

    public static SimpleDateFormat r(String str) {
        return s(str, Locale.getDefault());
    }

    public static SimpleDateFormat s(String str, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(u());
        return simpleDateFormat;
    }

    public static w t() {
        w wVar = f50669b.get();
        return wVar == null ? w.e() : wVar;
    }

    public static TimeZone u() {
        return TimeZone.getTimeZone("UTC");
    }

    public static Calendar v() {
        Calendar calendarC = t().c();
        calendarC.set(11, 0);
        calendarC.set(12, 0);
        calendarC.set(13, 0);
        calendarC.set(14, 0);
        calendarC.setTimeZone(u());
        return calendarC;
    }

    @TargetApi(24)
    public static android.icu.util.TimeZone w() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    public static Calendar x() {
        return y(null);
    }

    public static Calendar y(@Nullable Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(u());
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }

    @TargetApi(24)
    public static DateFormat z(Locale locale) {
        return d("yMMMd", locale);
    }
}
