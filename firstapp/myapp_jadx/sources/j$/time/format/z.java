package j$.time.format;

import j$.time.chrono.Chronology;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.AbstractMap;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-341f12e635949ce385fe972d9bf062aa0727e156e520e84a100f26e1747f2bcc */
/* JADX INFO: loaded from: classes3.dex */
public class z {
    public static final ConcurrentMap a = new ConcurrentHashMap(16, 0.75f, 2);
    public static final x b = new x();
    public static final z c = new z();

    public static Object a(j$.time.temporal.n nVar, Locale locale) {
        Object yVar;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(nVar, locale);
        Object obj = ((ConcurrentHashMap) a).get(simpleImmutableEntry);
        if (obj != null) {
            return obj;
        }
        long j = 1;
        HashMap map = new HashMap();
        int i = 0;
        if (nVar == j$.time.temporal.a.ERA) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            String[] eras = dateFormatSymbols.getEras();
            while (i < eras.length) {
                if (!eras[i].isEmpty()) {
                    long j2 = i;
                    map2.put(Long.valueOf(j2), eras[i]);
                    map3.put(Long.valueOf(j2), b(eras[i]));
                }
                i++;
            }
            if (!map2.isEmpty()) {
                map.put(TextStyle.FULL, map2);
                map.put(TextStyle.SHORT, map2);
                map.put(TextStyle.NARROW, map3);
            }
            yVar = new y(map);
        } else if (nVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
            int length = dateFormatSymbols2.getMonths().length;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            int i2 = 1;
            while (i2 < length) {
                TimeZone timeZone = TimeZone.getTimeZone("UTC");
                long j3 = j;
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("LLLL", locale);
                simpleDateFormat.setTimeZone(timeZone);
                Calendar calendar = Calendar.getInstance();
                calendar.set(0, i2, 0);
                String str = simpleDateFormat.format(calendar.getTime());
                long j4 = i2;
                linkedHashMap.put(Long.valueOf(j4), str);
                DateFormatSymbols dateFormatSymbols3 = dateFormatSymbols2;
                linkedHashMap2.put(Long.valueOf(j4), str.substring(0, Character.charCount(str.codePointAt(0))));
                TimeZone timeZone2 = TimeZone.getTimeZone("UTC");
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("LLL", locale);
                simpleDateFormat2.setTimeZone(timeZone2);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(0, i2, 0);
                linkedHashMap3.put(Long.valueOf(j4), simpleDateFormat2.format(calendar2.getTime()));
                i2++;
                dateFormatSymbols2 = dateFormatSymbols3;
                j = j3;
            }
            DateFormatSymbols dateFormatSymbols4 = dateFormatSymbols2;
            long j5 = j;
            if (length > 0) {
                long j6 = length;
                linkedHashMap.put(Long.valueOf(j6), "");
                linkedHashMap2.put(Long.valueOf(j6), "");
                linkedHashMap3.put(Long.valueOf(j6), "");
                map.put(TextStyle.FULL_STANDALONE, linkedHashMap);
                map.put(TextStyle.NARROW_STANDALONE, linkedHashMap2);
                map.put(TextStyle.SHORT_STANDALONE, linkedHashMap3);
            }
            HashMap map4 = new HashMap();
            HashMap map5 = new HashMap();
            String[] months = dateFormatSymbols4.getMonths();
            for (int i3 = 0; i3 < months.length; i3++) {
                if (!months[i3].isEmpty()) {
                    long j7 = ((long) i3) + j5;
                    map4.put(Long.valueOf(j7), months[i3]);
                    map5.put(Long.valueOf(j7), b(months[i3]));
                }
            }
            if (!map4.isEmpty()) {
                map.put(TextStyle.FULL, map4);
                map.put(TextStyle.NARROW, map5);
            }
            HashMap map6 = new HashMap();
            String[] shortMonths = dateFormatSymbols4.getShortMonths();
            while (i < shortMonths.length) {
                if (!shortMonths[i].isEmpty()) {
                    map6.put(Long.valueOf(((long) i) + j5), shortMonths[i]);
                }
                i++;
            }
            if (!map6.isEmpty()) {
                map.put(TextStyle.SHORT, map6);
            }
            yVar = new y(map);
        } else if (nVar == j$.time.temporal.a.DAY_OF_WEEK) {
            DateFormatSymbols dateFormatSymbols5 = DateFormatSymbols.getInstance(locale);
            HashMap map7 = new HashMap();
            String[] weekdays = dateFormatSymbols5.getWeekdays();
            map7.put(1L, weekdays[2]);
            map7.put(2L, weekdays[3]);
            map7.put(3L, weekdays[4]);
            map7.put(4L, weekdays[5]);
            map7.put(5L, weekdays[6]);
            map7.put(6L, weekdays[7]);
            map7.put(7L, weekdays[1]);
            map.put(TextStyle.FULL, map7);
            HashMap map8 = new HashMap();
            map8.put(1L, b(weekdays[2]));
            map8.put(2L, b(weekdays[3]));
            map8.put(3L, b(weekdays[4]));
            map8.put(4L, b(weekdays[5]));
            map8.put(5L, b(weekdays[6]));
            map8.put(6L, b(weekdays[7]));
            map8.put(7L, b(weekdays[1]));
            map.put(TextStyle.NARROW, map8);
            HashMap map9 = new HashMap();
            String[] shortWeekdays = dateFormatSymbols5.getShortWeekdays();
            map9.put(1L, shortWeekdays[2]);
            map9.put(2L, shortWeekdays[3]);
            map9.put(3L, shortWeekdays[4]);
            map9.put(4L, shortWeekdays[5]);
            map9.put(5L, shortWeekdays[6]);
            map9.put(6L, shortWeekdays[7]);
            map9.put(7L, shortWeekdays[1]);
            map.put(TextStyle.SHORT, map9);
            yVar = new y(map);
        } else if (nVar == j$.time.temporal.a.AMPM_OF_DAY) {
            DateFormatSymbols dateFormatSymbols6 = DateFormatSymbols.getInstance(locale);
            HashMap map10 = new HashMap();
            HashMap map11 = new HashMap();
            String[] amPmStrings = dateFormatSymbols6.getAmPmStrings();
            while (i < amPmStrings.length) {
                if (!amPmStrings[i].isEmpty()) {
                    long j8 = i;
                    map10.put(Long.valueOf(j8), amPmStrings[i]);
                    map11.put(Long.valueOf(j8), b(amPmStrings[i]));
                }
                i++;
            }
            if (!map10.isEmpty()) {
                map.put(TextStyle.FULL, map10);
                map.put(TextStyle.SHORT, map10);
                map.put(TextStyle.NARROW, map11);
            }
            yVar = new y(map);
        } else {
            yVar = "";
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) a;
        concurrentHashMap.putIfAbsent(simpleImmutableEntry, yVar);
        return concurrentHashMap.get(simpleImmutableEntry);
    }

    public static String b(String str) {
        return str.substring(0, Character.charCount(str.codePointAt(0)));
    }

    public String c(Chronology chronology, j$.time.temporal.n nVar, long j, TextStyle textStyle, Locale locale) {
        if (chronology == j$.time.chrono.p.d || !(nVar instanceof j$.time.temporal.a)) {
            return d(nVar, j, textStyle, locale);
        }
        return null;
    }

    public String d(j$.time.temporal.n nVar, long j, TextStyle textStyle, Locale locale) {
        Object objA = a(nVar, locale);
        if (objA instanceof y) {
            return ((y) objA).a(j, textStyle);
        }
        return null;
    }

    public Iterator e(Chronology chronology, j$.time.temporal.n nVar, TextStyle textStyle, Locale locale) {
        if (chronology == j$.time.chrono.p.d || !(nVar instanceof j$.time.temporal.a)) {
            return f(nVar, textStyle, locale);
        }
        return null;
    }

    public Iterator f(j$.time.temporal.n nVar, TextStyle textStyle, Locale locale) {
        List list;
        Object objA = a(nVar, locale);
        if (!(objA instanceof y) || (list = (List) ((HashMap) ((y) objA).b).get(textStyle)) == null) {
            return null;
        }
        return list.iterator();
    }
}
