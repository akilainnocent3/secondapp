package defpackage;

import j$.util.DesugarTimeZone;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class z4s extends du5 {
    public static final TimeZone e = DesugarTimeZone.getTimeZone("UTC");
    public final int c;
    public final ngs d;

    public z4s(Locale locale) {
        super(locale);
        int firstDayOfWeek = (Calendar.getInstance(locale).getFirstDayOfWeek() + 6) % 7;
        this.c = firstDayOfWeek != 0 ? firstDayOfWeek : 7;
        ngs ngsVarB = a.b();
        String[] weekdays = new DateFormatSymbols(locale).getWeekdays();
        String[] shortWeekdays = new DateFormatSymbols(locale).getShortWeekdays();
        List listU = ay0.u(weekdays);
        int size = listU.size();
        for (int i = 0; i < size; i++) {
            ngsVarB.add(new Pair((String) listU.get(i), shortWeekdays[i + 2]));
        }
        ngsVarB.add(new Pair(weekdays[1], shortWeekdays[1]));
        this.d = a.a(ngsVarB);
    }

    @Override // defpackage.du5
    public final String a(long j, String str, Locale locale) {
        StringBuilder sbA = y4s.a(str);
        sbA.append(locale.toLanguageTag());
        String string = sbA.toString();
        LinkedHashMap linkedHashMap = this.b;
        Object obj = linkedHashMap.get(string);
        TimeZone timeZone = e;
        Object obj2 = obj;
        if (obj == null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
            simpleDateFormat.setTimeZone(timeZone);
            linkedHashMap.put(string, simpleDateFormat);
            obj2 = simpleDateFormat;
        }
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTimeInMillis(j);
        return ((SimpleDateFormat) obj2).format(Long.valueOf(calendar.getTimeInMillis()));
    }

    @Override // defpackage.du5
    public final xt5 b(long j) {
        Calendar calendar = Calendar.getInstance(e);
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new xt5(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis());
    }

    @Override // defpackage.du5
    public final jsc c(Locale locale) {
        DateFormat dateInstance = DateFormat.getDateInstance(3, locale);
        dateInstance.getClass();
        return gu5.a(((SimpleDateFormat) dateInstance).toPattern());
    }

    @Override // defpackage.du5
    public final int d() {
        return this.c;
    }

    @Override // defpackage.du5
    public final iu5 e(int i, int i2) {
        Calendar calendar = Calendar.getInstance(e);
        calendar.clear();
        calendar.set(1, i);
        calendar.set(2, i2 - 1);
        calendar.set(5, 1);
        return l(calendar);
    }

    @Override // defpackage.du5
    public final iu5 f(long j) {
        Calendar calendar = Calendar.getInstance(e);
        calendar.setTimeInMillis(j);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return l(calendar);
    }

    @Override // defpackage.du5
    public final iu5 g(xt5 xt5Var) {
        return e(xt5Var.a, xt5Var.b);
    }

    @Override // defpackage.du5
    public final xt5 h() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new xt5(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis() + ((long) (calendar.get(16) + calendar.get(15))));
    }

    @Override // defpackage.du5
    public final List<Pair<String, String>> i() {
        return this.d;
    }

    @Override // defpackage.du5
    public final xt5 j(String str, String str2, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
        TimeZone timeZone = e;
        simpleDateFormat.setTimeZone(timeZone);
        simpleDateFormat.setLenient(false);
        try {
            Date date = simpleDateFormat.parse(str);
            if (date == null) {
                return null;
            }
            Calendar calendar = Calendar.getInstance(timeZone);
            calendar.setTime(date);
            return new xt5(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis());
        } catch (ParseException unused) {
            return null;
        }
    }

    @Override // defpackage.du5
    public final iu5 k(iu5 iu5Var, int i) {
        if (i <= 0) {
            return iu5Var;
        }
        Calendar calendar = Calendar.getInstance(e);
        calendar.setTimeInMillis(iu5Var.e);
        calendar.add(2, i);
        return l(calendar);
    }

    public final iu5 l(Calendar calendar) {
        int i = (calendar.get(7) + 6) % 7;
        int i2 = (i != 0 ? i : 7) - this.c;
        if (i2 < 0) {
            i2 += 7;
        }
        return new iu5(calendar.get(1), calendar.get(2) + 1, calendar.getActualMaximum(5), i2, calendar.getTimeInMillis());
    }

    public final String toString() {
        return "LegacyCalendarModel";
    }
}
