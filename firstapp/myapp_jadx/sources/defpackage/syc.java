package defpackage;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class syc {
    public static frz<String, String> a(Long l, Long l2) {
        if (l == null && l2 == null) {
            return new frz<>(null, null);
        }
        if (l == null) {
            return new frz<>(null, b(l2.longValue()));
        }
        if (l2 == null) {
            return new frz<>(b(l.longValue()), null);
        }
        Calendar calendarF = rqh0.f();
        Calendar calendarG = rqh0.g(null);
        calendarG.setTimeInMillis(l.longValue());
        Calendar calendarG2 = rqh0.g(null);
        calendarG2.setTimeInMillis(l2.longValue());
        if (calendarG.get(1) == calendarG2.get(1)) {
            return calendarG.get(1) == calendarF.get(1) ? new frz<>(c(l.longValue(), Locale.getDefault()), c(l2.longValue(), Locale.getDefault())) : new frz<>(c(l.longValue(), Locale.getDefault()), d(l2.longValue(), Locale.getDefault()));
        }
        return new frz<>(d(l.longValue(), Locale.getDefault()), d(l2.longValue(), Locale.getDefault()));
    }

    public static String b(long j) {
        Calendar calendarF = rqh0.f();
        Calendar calendarG = rqh0.g(null);
        calendarG.setTimeInMillis(j);
        return calendarF.get(1) == calendarG.get(1) ? c(j, Locale.getDefault()) : d(j, Locale.getDefault());
    }

    public static String c(long j, Locale locale) {
        return rqh0.b("MMMd", locale).format(new Date(j));
    }

    public static String d(long j, Locale locale) {
        return rqh0.b("yMMMd", locale).format(new Date(j));
    }
}
