package defpackage;

import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes6.dex */
public final class gsc {
    public static final /* synthetic */ int a = 0;

    public static final int a(Date date, Date date2) {
        date.getClass();
        date2.getClass();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        yt5.e(calendar);
        long timeInMillis = calendar.getTimeInMillis();
        yt5.e(calendar2);
        return (int) ((timeInMillis - calendar2.getTimeInMillis()) / 86400000);
    }

    public static final Date b(Date date) {
        date.getClass();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        yt5.d(calendar);
        Date time = calendar.getTime();
        time.getClass();
        return time;
    }

    public static final Date c(Date date) {
        date.getClass();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        yt5.e(calendar);
        Date time = calendar.getTime();
        time.getClass();
        return time;
    }

    public static final long d(Date date) {
        date.getClass();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        yt5.e(calendar);
        return calendar.getTimeInMillis();
    }

    public static final boolean e(Date date, Date date2) {
        date.getClass();
        date2.getClass();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        return yt5.f(calendar, calendar2);
    }
}
