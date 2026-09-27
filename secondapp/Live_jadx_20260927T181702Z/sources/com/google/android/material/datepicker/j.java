package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build;
import android.text.format.DateUtils;
import androidx.annotation.Nullable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class j {
    public static e2.t<String, String> a(@Nullable Long l10, @Nullable Long l11) {
        return b(l10, l11, null);
    }

    public static e2.t<String, String> b(@Nullable Long l10, @Nullable Long l11, @Nullable SimpleDateFormat simpleDateFormat) {
        if (l10 == null && l11 == null) {
            return e2.t.a(null, null);
        }
        if (l10 == null) {
            return e2.t.a(null, d(l11.longValue(), simpleDateFormat));
        }
        if (l11 == null) {
            return e2.t.a(d(l10.longValue(), simpleDateFormat), null);
        }
        Calendar calendarV = c0.v();
        Calendar calendarX = c0.x();
        calendarX.setTimeInMillis(l10.longValue());
        Calendar calendarX2 = c0.x();
        calendarX2.setTimeInMillis(l11.longValue());
        if (simpleDateFormat != null) {
            return e2.t.a(simpleDateFormat.format(new Date(l10.longValue())), simpleDateFormat.format(new Date(l11.longValue())));
        }
        if (calendarX.get(1) == calendarX2.get(1)) {
            return calendarX.get(1) == calendarV.get(1) ? e2.t.a(g(l10.longValue(), Locale.getDefault()), g(l11.longValue(), Locale.getDefault())) : e2.t.a(g(l10.longValue(), Locale.getDefault()), n(l11.longValue(), Locale.getDefault()));
        }
        return e2.t.a(n(l10.longValue(), Locale.getDefault()), n(l11.longValue(), Locale.getDefault()));
    }

    public static String c(long j10) {
        return d(j10, null);
    }

    public static String d(long j10, @Nullable SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(new Date(j10));
        }
        return q(j10) ? f(j10) : m(j10);
    }

    public static String e(Context context, long j10, boolean z10, boolean z11, boolean z12) {
        String strJ = j(j10);
        if (z10) {
            strJ = String.format(context.getString(ih.a.m.I1), strJ);
        }
        if (z11) {
            return String.format(context.getString(ih.a.m.B1), strJ);
        }
        return z12 ? String.format(context.getString(ih.a.m.f92593n1), strJ) : strJ;
    }

    public static String f(long j10) {
        return g(j10, Locale.getDefault());
    }

    public static String g(long j10, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? c0.c(locale).format(new Date(j10)) : c0.o(locale).format(new Date(j10));
    }

    public static String h(long j10) {
        return i(j10, Locale.getDefault());
    }

    public static String i(long j10, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? c0.p(locale).format(new Date(j10)) : c0.k(locale).format(new Date(j10));
    }

    public static String j(long j10) {
        return q(j10) ? h(j10) : o(j10);
    }

    public static String k(Context context, int i10) {
        return c0.v().get(1) == i10 ? String.format(context.getString(ih.a.m.f92608s1), Integer.valueOf(i10)) : String.format(context.getString(ih.a.m.f92611t1), Integer.valueOf(i10));
    }

    public static String l(long j10) {
        return Build.VERSION.SDK_INT >= 24 ? c0.A(Locale.getDefault()).format(new Date(j10)) : DateUtils.formatDateTime(null, j10, 8228);
    }

    public static String m(long j10) {
        return n(j10, Locale.getDefault());
    }

    public static String n(long j10, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? c0.z(locale).format(new Date(j10)) : c0.m(locale).format(new Date(j10));
    }

    public static String o(long j10) {
        return p(j10, Locale.getDefault());
    }

    public static String p(long j10, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? c0.B(locale).format(new Date(j10)) : c0.k(locale).format(new Date(j10));
    }

    public static boolean q(long j10) {
        Calendar calendarV = c0.v();
        Calendar calendarX = c0.x();
        calendarX.setTimeInMillis(j10);
        return calendarV.get(1) == calendarX.get(1);
    }
}
