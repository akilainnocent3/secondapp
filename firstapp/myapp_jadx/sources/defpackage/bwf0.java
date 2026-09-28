package defpackage;

import android.os.Build;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.TemporalAccessor;
import j$.util.DateRetargetClass;
import j$.util.DesugarTimeZone;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes4.dex */
public final class bwf0 {
    public static final bwf0 a = new bwf0();

    public static String c(long j, String str) {
        Date date = new Date(j);
        Locale localeForLanguageTag = (str == null || str.length() == 0) ? Locale.US : Locale.forLanguageTag(str);
        localeForLanguageTag.getClass();
        return l(date, "dd/MM EEEE", localeForLanguageTag, 0, 0);
    }

    public static String f(long j) {
        return m(a, new Date(j), "d MMMM yyyy", false, 0);
    }

    public static String j(long j, String str) {
        Date date = new Date(j);
        Locale localeForLanguageTag = (str == null || str.length() == 0) ? Locale.US : Locale.forLanguageTag(str);
        localeForLanguageTag.getClass();
        return l(date, "EEEE", localeForLanguageTag, 0, 0);
    }

    public static String k(String str, String str2) {
        str.getClass();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSSS");
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() - simpleDateFormat.parse(str).getTime();
            if (jCurrentTimeMillis >= 604800000) {
                return (jCurrentTimeMillis / 604800000) + "w";
            }
            if (jCurrentTimeMillis >= 86400000) {
                return (jCurrentTimeMillis / 86400000) + "d";
            }
            if (jCurrentTimeMillis >= 3600000) {
                return (jCurrentTimeMillis / 3600000) + "h";
            }
            if (jCurrentTimeMillis <= 300000) {
                return str2;
            }
            return (jCurrentTimeMillis / RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS) + "m";
        } catch (ParseException unused) {
            return "";
        }
    }

    public static String l(Date date, String str, Locale locale, int i, int i2) {
        TemporalAccessor localDate;
        if (Build.VERSION.SDK_INT < 26) {
            String str2 = new SimpleDateFormat(str, locale).format(date);
            str2.getClass();
            return str2;
        }
        ZonedDateTime zonedDateTimeAtZone = DateRetargetClass.toInstant(date).atZone(i2 == 1 ? ZoneOffset.UTC : ZoneId.systemDefault());
        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern(str, locale);
        if (i != 0) {
            localDate = i != 1 ? zonedDateTimeAtZone.y() : zonedDateTimeAtZone.toLocalTime();
        } else {
            localDate = zonedDateTimeAtZone.m();
        }
        String str3 = dateTimeFormatterOfPattern.format(localDate);
        str3.getClass();
        return str3;
    }

    public static String m(bwf0 bwf0Var, Date date, String str, boolean z, int i) {
        bwf0Var.getClass();
        Locale locale = z ? Locale.getDefault() : Locale.US;
        locale.getClass();
        return l(date, str, locale, i, 0);
    }

    public static String n(long j) {
        return m(a, new Date(j), "dd MMM HH:mm", false, 2);
    }

    public static String o(int i, long j, boolean z) {
        Date date = new Date(j);
        Locale locale = z ? Locale.getDefault() : Locale.US;
        locale.getClass();
        return l(date, "dd/MM/yyyy", locale, 0, i);
    }

    public static String r(Date date) {
        date.getClass();
        return m(a, date, "dd-MM-yyyy HH:mm:ss", false, 2);
    }

    public static String u(Date date) {
        return m(a, date, "HH:mm", false, 1);
    }

    public static String w() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        calendar.setTimeInMillis(System.currentTimeMillis() - ((long) calendar.getTimeZone().getRawOffset()));
        long timeInMillis = calendar.getTimeInMillis();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        yt5.d(calendar2);
        long timeInMillis2 = calendar2.getTimeInMillis() - timeInMillis;
        if (BigDecimal.valueOf(timeInMillis2).compareTo(BigDecimal.ZERO) == 0) {
            timeInMillis2 = 24;
        }
        return String.format(Locale.US, "%,.1f", Arrays.copyOf(new Object[]{new BigDecimal(timeInMillis2 / 3600000.0f)}, 1));
    }

    public final String a(long j) {
        return m(this, new Date(j), "dd", true, 0);
    }

    public final String b(long j) {
        return m(this, new Date(j), "dd/MM", false, 0);
    }

    public final String d(long j, boolean z) {
        return m(this, new Date(j), "dd/MM HH:mm", z, 2);
    }

    public final String g(long j) {
        return m(this, new Date(j), "dd/MM/yyyy HH:mm", false, 2);
    }

    public final String h(long j) {
        return m(this, new Date(j), "dd/MM/yy", true, 0);
    }

    public final String i(Date date, boolean z) {
        date.getClass();
        return m(this, date, "dd/MM/yy", z, 0);
    }

    public final String p(Date date, boolean z) {
        date.getClass();
        return m(this, date, "dd/MM/yyyy", z, 0);
    }

    public final String s(long j, boolean z) {
        return m(this, new Date(j), "HH:mm", z, 1);
    }

    public final String v(long j) {
        return m(this, new Date(j), "MMM", true, 0);
    }

    public final String x(long j) {
        return m(this, new Date(j), "yyyy", true, 0);
    }
}
