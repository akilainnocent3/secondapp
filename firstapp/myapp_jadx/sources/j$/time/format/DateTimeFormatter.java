package j$.time.format;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.chrono.Chronology;
import j$.time.temporal.TemporalAccessor;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-341f12e635949ce385fe972d9bf062aa0727e156e520e84a100f26e1747f2bcc */
/* JADX INFO: loaded from: classes3.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_DATE_TIME;
    public static final DateTimeFormatter ISO_LOCAL_DATE;
    public static final DateTimeFormatter f;
    public final d a;
    public final Locale b;
    public final DecimalStyle c;
    public final b0 d;
    public final Chronology e;

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        c0 c0Var = c0.EXCEEDS_PAD;
        dateTimeFormatterBuilder.n(aVar, 4, 10, c0Var);
        dateTimeFormatterBuilder.d('-');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        dateTimeFormatterBuilder.m(aVar2, 2);
        dateTimeFormatterBuilder.d('-');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        dateTimeFormatterBuilder.m(aVar3, 2);
        b0 b0Var = b0.STRICT;
        j$.time.chrono.p pVar = j$.time.chrono.p.d;
        DateTimeFormatter dateTimeFormatterQ = dateTimeFormatterBuilder.q(b0Var, pVar);
        ISO_LOCAL_DATE = dateTimeFormatterQ;
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = new DateTimeFormatterBuilder();
        p pVar2 = p.INSENSITIVE;
        dateTimeFormatterBuilder2.c(pVar2);
        dateTimeFormatterBuilder2.a(dateTimeFormatterQ);
        j jVar = j.e;
        dateTimeFormatterBuilder2.c(jVar);
        dateTimeFormatterBuilder2.q(b0Var, pVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder3 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder3.c(pVar2);
        dateTimeFormatterBuilder3.a(dateTimeFormatterQ);
        dateTimeFormatterBuilder3.p();
        dateTimeFormatterBuilder3.c(jVar);
        dateTimeFormatterBuilder3.q(b0Var, pVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new DateTimeFormatterBuilder();
        j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_DAY;
        dateTimeFormatterBuilder4.m(aVar4, 2);
        dateTimeFormatterBuilder4.d(':');
        j$.time.temporal.a aVar5 = j$.time.temporal.a.MINUTE_OF_HOUR;
        dateTimeFormatterBuilder4.m(aVar5, 2);
        dateTimeFormatterBuilder4.p();
        dateTimeFormatterBuilder4.d(':');
        j$.time.temporal.a aVar6 = j$.time.temporal.a.SECOND_OF_MINUTE;
        dateTimeFormatterBuilder4.m(aVar6, 2);
        dateTimeFormatterBuilder4.p();
        dateTimeFormatterBuilder4.b(j$.time.temporal.a.NANO_OF_SECOND, 0, 9, true);
        DateTimeFormatter dateTimeFormatterQ2 = dateTimeFormatterBuilder4.q(b0Var, null);
        DateTimeFormatterBuilder dateTimeFormatterBuilder5 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder5.c(pVar2);
        dateTimeFormatterBuilder5.a(dateTimeFormatterQ2);
        dateTimeFormatterBuilder5.c(jVar);
        dateTimeFormatterBuilder5.q(b0Var, null);
        DateTimeFormatterBuilder dateTimeFormatterBuilder6 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder6.c(pVar2);
        dateTimeFormatterBuilder6.a(dateTimeFormatterQ2);
        dateTimeFormatterBuilder6.p();
        dateTimeFormatterBuilder6.c(jVar);
        dateTimeFormatterBuilder6.q(b0Var, null);
        DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder7.c(pVar2);
        dateTimeFormatterBuilder7.a(dateTimeFormatterQ);
        dateTimeFormatterBuilder7.d('T');
        dateTimeFormatterBuilder7.a(dateTimeFormatterQ2);
        DateTimeFormatter dateTimeFormatterQ3 = dateTimeFormatterBuilder7.q(b0Var, pVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder8 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder8.c(pVar2);
        dateTimeFormatterBuilder8.a(dateTimeFormatterQ3);
        p pVar3 = p.LENIENT;
        dateTimeFormatterBuilder8.c(pVar3);
        dateTimeFormatterBuilder8.c(jVar);
        p pVar4 = p.STRICT;
        dateTimeFormatterBuilder8.c(pVar4);
        DateTimeFormatter dateTimeFormatterQ4 = dateTimeFormatterBuilder8.q(b0Var, pVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder9 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder9.a(dateTimeFormatterQ4);
        dateTimeFormatterBuilder9.p();
        dateTimeFormatterBuilder9.d('[');
        p pVar5 = p.SENSITIVE;
        dateTimeFormatterBuilder9.c(pVar5);
        j$.time.f fVar = DateTimeFormatterBuilder.h;
        dateTimeFormatterBuilder9.c(new s(fVar, "ZoneRegionId()"));
        dateTimeFormatterBuilder9.d(']');
        dateTimeFormatterBuilder9.q(b0Var, pVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder10 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder10.a(dateTimeFormatterQ3);
        dateTimeFormatterBuilder10.p();
        dateTimeFormatterBuilder10.c(jVar);
        dateTimeFormatterBuilder10.p();
        dateTimeFormatterBuilder10.d('[');
        dateTimeFormatterBuilder10.c(pVar5);
        dateTimeFormatterBuilder10.c(new s(fVar, "ZoneRegionId()"));
        dateTimeFormatterBuilder10.d(']');
        ISO_DATE_TIME = dateTimeFormatterBuilder10.q(b0Var, pVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder11 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder11.c(pVar2);
        dateTimeFormatterBuilder11.n(aVar, 4, 10, c0Var);
        dateTimeFormatterBuilder11.d('-');
        dateTimeFormatterBuilder11.m(j$.time.temporal.a.DAY_OF_YEAR, 3);
        dateTimeFormatterBuilder11.p();
        dateTimeFormatterBuilder11.c(jVar);
        dateTimeFormatterBuilder11.q(b0Var, pVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder12 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder12.c(pVar2);
        dateTimeFormatterBuilder12.n(j$.time.temporal.i.c, 4, 10, c0Var);
        dateTimeFormatterBuilder12.e("-W");
        dateTimeFormatterBuilder12.m(j$.time.temporal.i.b, 2);
        dateTimeFormatterBuilder12.d('-');
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_WEEK;
        dateTimeFormatterBuilder12.m(aVar7, 1);
        dateTimeFormatterBuilder12.p();
        dateTimeFormatterBuilder12.c(jVar);
        dateTimeFormatterBuilder12.q(b0Var, pVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder13 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder13.c(pVar2);
        dateTimeFormatterBuilder13.c(new g());
        f = dateTimeFormatterBuilder13.q(b0Var, null);
        DateTimeFormatterBuilder dateTimeFormatterBuilder14 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder14.c(pVar2);
        dateTimeFormatterBuilder14.m(aVar, 4);
        dateTimeFormatterBuilder14.m(aVar2, 2);
        dateTimeFormatterBuilder14.m(aVar3, 2);
        dateTimeFormatterBuilder14.p();
        dateTimeFormatterBuilder14.c(pVar3);
        dateTimeFormatterBuilder14.g("+HHMMss", "Z");
        dateTimeFormatterBuilder14.c(pVar4);
        dateTimeFormatterBuilder14.q(b0Var, pVar);
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        DateTimeFormatterBuilder dateTimeFormatterBuilder15 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder15.c(pVar2);
        dateTimeFormatterBuilder15.c(pVar3);
        dateTimeFormatterBuilder15.p();
        dateTimeFormatterBuilder15.i(aVar7, map);
        dateTimeFormatterBuilder15.e(", ");
        dateTimeFormatterBuilder15.o();
        dateTimeFormatterBuilder15.n(aVar3, 1, 2, c0.NOT_NEGATIVE);
        dateTimeFormatterBuilder15.d(' ');
        dateTimeFormatterBuilder15.i(aVar2, map2);
        dateTimeFormatterBuilder15.d(' ');
        dateTimeFormatterBuilder15.m(aVar, 4);
        dateTimeFormatterBuilder15.d(' ');
        dateTimeFormatterBuilder15.m(aVar4, 2);
        dateTimeFormatterBuilder15.d(':');
        dateTimeFormatterBuilder15.m(aVar5, 2);
        dateTimeFormatterBuilder15.p();
        dateTimeFormatterBuilder15.d(':');
        dateTimeFormatterBuilder15.m(aVar6, 2);
        dateTimeFormatterBuilder15.o();
        dateTimeFormatterBuilder15.d(' ');
        dateTimeFormatterBuilder15.g("+HHMM", "GMT");
        dateTimeFormatterBuilder15.q(b0.SMART, pVar);
    }

    public DateTimeFormatter(d dVar, Locale locale, DecimalStyle decimalStyle, b0 b0Var, Chronology chronology) {
        this.a = dVar;
        Objects.requireNonNull(locale, "locale");
        this.b = locale;
        Objects.requireNonNull(decimalStyle, "decimalStyle");
        this.c = decimalStyle;
        Objects.requireNonNull(b0Var, "resolverStyle");
        this.d = b0Var;
        this.e = chronology;
    }

    public static DateTimeFormatter ofPattern(String str) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.h(str);
        return dateTimeFormatterBuilder.r(Locale.getDefault(), b0.SMART, null);
    }

    public final Object a(CharSequence charSequence, j$.time.f fVar) {
        String string;
        Objects.requireNonNull(charSequence, "text");
        try {
            return b(charSequence).d(fVar);
        } catch (DateTimeParseException e) {
            throw e;
        } catch (RuntimeException e2) {
            if (charSequence.length() > 64) {
                string = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                string = charSequence.toString();
            }
            DateTimeParseException dateTimeParseException = new DateTimeParseException("Text '" + string + "' could not be parsed: " + e2.getMessage(), e2);
            charSequence.toString();
            throw dateTimeParseException;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0281  */
    /* JADX WARN: Code duplicated, block: B:132:0x0311  */
    /* JADX WARN: Code duplicated, block: B:134:0x031f  */
    /* JADX WARN: Code duplicated, block: B:135:0x034a  */
    /* JADX WARN: Code duplicated, block: B:169:0x0291 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x0299 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x027b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x027b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x025d  */
    public final a0 b(CharSequence charSequence) {
        j$.time.temporal.n nVar;
        j$.time.temporal.a aVar;
        j$.time.temporal.a aVar2;
        boolean zContainsKey;
        Map map;
        j$.time.q qVar;
        j$.time.q qVar2;
        j$.time.temporal.n nVar2;
        int i = 0;
        ParsePosition parsePosition = new ParsePosition(0);
        Objects.requireNonNull(charSequence, "text");
        u uVar = new u(this);
        int iC = this.a.C(uVar, charSequence, parsePosition.getIndex());
        if (iC < 0) {
            parsePosition.setErrorIndex(~iC);
            uVar = null;
        } else {
            parsePosition.setIndex(iC);
        }
        if (uVar == null || parsePosition.getErrorIndex() >= 0 || parsePosition.getIndex() < charSequence.length()) {
            String string = charSequence.length() > 64 ? charSequence.subSequence(0, 64).toString() + "..." : charSequence.toString();
            if (parsePosition.getErrorIndex() >= 0) {
                String str = "Text '" + string + "' could not be parsed at index " + parsePosition.getErrorIndex();
                parsePosition.getErrorIndex();
                throw new DateTimeParseException(str, charSequence);
            }
            String str2 = "Text '" + string + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex();
            parsePosition.getIndex();
            throw new DateTimeParseException(str2, charSequence);
        }
        a0 a0VarC = uVar.c();
        Chronology chronology = uVar.c().c;
        if (chronology == null && (chronology = uVar.a.e) == null) {
            chronology = j$.time.chrono.p.d;
        }
        a0VarC.c = chronology;
        ZoneId zoneId = a0VarC.b;
        if (zoneId == null) {
            zoneId = null;
        }
        a0VarC.b = zoneId;
        a0VarC.e = this.d;
        a0VarC.r();
        a0VarC.x(a0VarC.c.U(a0VarC.a, a0VarC.e));
        a0VarC.v();
        if (((HashMap) a0VarC.a).size() > 0) {
            loop0: while (i < 50) {
                Iterator it = ((HashMap) a0VarC.a).entrySet().iterator();
                do {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    nVar2 = (j$.time.temporal.n) ((Map.Entry) it.next()).getKey();
                    TemporalAccessor temporalAccessorI = nVar2.I(a0VarC.a, a0VarC, a0VarC.e);
                    if (temporalAccessorI != null) {
                        if (temporalAccessorI instanceof ChronoZonedDateTime) {
                            ChronoZonedDateTime chronoZonedDateTime = (ChronoZonedDateTime) temporalAccessorI;
                            ZoneId zoneId2 = a0VarC.b;
                            if (zoneId2 == null) {
                                a0VarC.b = chronoZonedDateTime.getZone();
                            } else if (!zoneId2.equals(chronoZonedDateTime.getZone())) {
                                throw new j$.time.b("ChronoZonedDateTime must use the effective parsed zone: " + a0VarC.b);
                            }
                            temporalAccessorI = chronoZonedDateTime.y();
                        }
                        if (temporalAccessorI instanceof ChronoLocalDateTime) {
                            ChronoLocalDateTime chronoLocalDateTime = (ChronoLocalDateTime) temporalAccessorI;
                            a0VarC.w(chronoLocalDateTime.toLocalTime(), j$.time.q.d);
                            a0VarC.x(chronoLocalDateTime.m());
                            break;
                        }
                        if (temporalAccessorI instanceof ChronoLocalDate) {
                            a0VarC.x((ChronoLocalDate) temporalAccessorI);
                            break;
                        }
                        if (temporalAccessorI instanceof LocalTime) {
                            a0VarC.w((LocalTime) temporalAccessorI, j$.time.q.d);
                            break;
                        }
                        j$.time.h.a("Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime");
                        return null;
                    }
                } while (((HashMap) a0VarC.a).containsKey(nVar2));
                i++;
            }
            if (i == 50) {
                j$.time.h.a("One of the parsed fields has an incorrectly implemented resolve method");
                return null;
            }
            if (i > 0) {
                a0VarC.r();
                a0VarC.x(a0VarC.c.U(a0VarC.a, a0VarC.e));
                a0VarC.v();
            }
        }
        long j = 1000000;
        if (a0VarC.g == null) {
            Map map2 = a0VarC.a;
            j$.time.temporal.a aVar3 = j$.time.temporal.a.MILLI_OF_SECOND;
            boolean zContainsKey2 = ((HashMap) map2).containsKey(aVar3);
            Map map3 = a0VarC.a;
            if (zContainsKey2) {
                long jLongValue = ((Long) ((HashMap) map3).remove(aVar3)).longValue();
                Map map4 = a0VarC.a;
                j$.time.temporal.a aVar4 = j$.time.temporal.a.MICRO_OF_SECOND;
                boolean zContainsKey3 = ((HashMap) map4).containsKey(aVar4);
                Map map5 = a0VarC.a;
                if (zContainsKey3) {
                    long jLongValue2 = (((Long) ((HashMap) map5).get(aVar4)).longValue() % 1000) + (jLongValue * 1000);
                    a0VarC.A(aVar3, aVar4, Long.valueOf(jLongValue2));
                    ((HashMap) a0VarC.a).remove(aVar4);
                    ((HashMap) a0VarC.a).put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(jLongValue2 * 1000));
                } else {
                    ((HashMap) map5).put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(jLongValue * 1000000));
                }
            } else {
                j$.time.temporal.a aVar5 = j$.time.temporal.a.MICRO_OF_SECOND;
                if (((HashMap) map3).containsKey(aVar5)) {
                    ((HashMap) a0VarC.a).put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(((Long) ((HashMap) a0VarC.a).remove(aVar5)).longValue() * 1000));
                }
            }
            Map map6 = a0VarC.a;
            j$.time.temporal.a aVar6 = j$.time.temporal.a.HOUR_OF_DAY;
            Long l = (Long) ((HashMap) map6).get(aVar6);
            if (l != null) {
                Map map7 = a0VarC.a;
                j$.time.temporal.a aVar7 = j$.time.temporal.a.MINUTE_OF_HOUR;
                Long l2 = (Long) ((HashMap) map7).get(aVar7);
                Map map8 = a0VarC.a;
                j$.time.temporal.a aVar8 = j$.time.temporal.a.SECOND_OF_MINUTE;
                Long l3 = (Long) ((HashMap) map8).get(aVar8);
                Map map9 = a0VarC.a;
                j$.time.temporal.a aVar9 = j$.time.temporal.a.NANO_OF_SECOND;
                Long l4 = (Long) ((HashMap) map9).get(aVar9);
                if ((l2 != null || (l3 == null && l4 == null)) && (l2 == null || l3 != null || l4 == null)) {
                    a0VarC.u(l.longValue(), l2 != null ? l2.longValue() : 0L, l3 != null ? l3.longValue() : 0L, l4 != null ? l4.longValue() : 0L);
                    ((HashMap) a0VarC.a).remove(aVar6);
                    ((HashMap) a0VarC.a).remove(aVar7);
                    ((HashMap) a0VarC.a).remove(aVar8);
                    ((HashMap) a0VarC.a).remove(aVar9);
                } else {
                    j = 1000000;
                }
            }
            if (a0VarC.e != b0.LENIENT && ((HashMap) a0VarC.a).size() > 0) {
                for (Map.Entry entry : ((HashMap) a0VarC.a).entrySet()) {
                    nVar = (j$.time.temporal.n) entry.getKey();
                    if (nVar instanceof j$.time.temporal.a) {
                        aVar = (j$.time.temporal.a) nVar;
                        if (aVar.b0()) {
                            aVar.a0(((Long) entry.getValue()).longValue());
                        }
                    }
                }
            }
        } else if (a0VarC.e != b0.LENIENT) {
            while (r0.hasNext()) {
                nVar = (j$.time.temporal.n) entry.getKey();
                if (nVar instanceof j$.time.temporal.a) {
                    aVar = (j$.time.temporal.a) nVar;
                    if (aVar.b0()) {
                        aVar.a0(((Long) entry.getValue()).longValue());
                    }
                }
            }
        }
        ChronoLocalDate chronoLocalDate = a0VarC.f;
        if (chronoLocalDate != null) {
            a0VarC.q(chronoLocalDate);
        }
        LocalTime localTime = a0VarC.g;
        if (localTime != null) {
            a0VarC.q(localTime);
            if (a0VarC.f != null && ((HashMap) a0VarC.a).size() > 0) {
                a0VarC.q(a0VarC.f.M(a0VarC.g));
            }
        }
        ChronoLocalDate chronoLocalDate2 = a0VarC.f;
        if (chronoLocalDate2 != null && a0VarC.g != null && (qVar = a0VarC.h) != (qVar2 = j$.time.q.d)) {
            a0VarC.f = chronoLocalDate2.T(qVar);
            a0VarC.h = qVar2;
        }
        if (a0VarC.g == null) {
            if (((HashMap) a0VarC.a).containsKey(j$.time.temporal.a.INSTANT_SECONDS)) {
                Map map10 = a0VarC.a;
                aVar2 = j$.time.temporal.a.NANO_OF_SECOND;
                zContainsKey = ((HashMap) map10).containsKey(aVar2);
                map = a0VarC.a;
                if (zContainsKey) {
                    long jLongValue3 = ((Long) ((HashMap) map).get(aVar2)).longValue();
                    ((HashMap) a0VarC.a).put(j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(jLongValue3 / 1000));
                    ((HashMap) a0VarC.a).put(j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(jLongValue3 / j));
                } else {
                    ((HashMap) map).put(aVar2, 0L);
                    ((HashMap) a0VarC.a).put(j$.time.temporal.a.MICRO_OF_SECOND, 0L);
                    ((HashMap) a0VarC.a).put(j$.time.temporal.a.MILLI_OF_SECOND, 0L);
                }
            } else if (((HashMap) a0VarC.a).containsKey(j$.time.temporal.a.SECOND_OF_DAY)) {
                Map map11 = a0VarC.a;
                aVar2 = j$.time.temporal.a.NANO_OF_SECOND;
                zContainsKey = ((HashMap) map11).containsKey(aVar2);
                map = a0VarC.a;
                if (zContainsKey) {
                    long jLongValue4 = ((Long) ((HashMap) map).get(aVar2)).longValue();
                    ((HashMap) a0VarC.a).put(j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(jLongValue4 / 1000));
                    ((HashMap) a0VarC.a).put(j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(jLongValue4 / j));
                } else {
                    ((HashMap) map).put(aVar2, 0L);
                    ((HashMap) a0VarC.a).put(j$.time.temporal.a.MICRO_OF_SECOND, 0L);
                    ((HashMap) a0VarC.a).put(j$.time.temporal.a.MILLI_OF_SECOND, 0L);
                }
            } else if (((HashMap) a0VarC.a).containsKey(j$.time.temporal.a.SECOND_OF_MINUTE)) {
                Map map12 = a0VarC.a;
                aVar2 = j$.time.temporal.a.NANO_OF_SECOND;
                zContainsKey = ((HashMap) map12).containsKey(aVar2);
                map = a0VarC.a;
                if (zContainsKey) {
                    long jLongValue5 = ((Long) ((HashMap) map).get(aVar2)).longValue();
                    ((HashMap) a0VarC.a).put(j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(jLongValue5 / 1000));
                    ((HashMap) a0VarC.a).put(j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(jLongValue5 / j));
                } else {
                    ((HashMap) map).put(aVar2, 0L);
                    ((HashMap) a0VarC.a).put(j$.time.temporal.a.MICRO_OF_SECOND, 0L);
                    ((HashMap) a0VarC.a).put(j$.time.temporal.a.MILLI_OF_SECOND, 0L);
                }
            }
        }
        if (a0VarC.f != null && a0VarC.g != null) {
            Long l5 = (Long) ((HashMap) a0VarC.a).get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l5 != null) {
                ((HashMap) a0VarC.a).put(j$.time.temporal.a.INSTANT_SECONDS, Long.valueOf(a0VarC.f.M(a0VarC.g).H(ZoneOffset.d0(l5.intValue())).Z()));
                return a0VarC;
            }
            if (a0VarC.b != null) {
                ((HashMap) a0VarC.a).put(j$.time.temporal.a.INSTANT_SECONDS, Long.valueOf(a0VarC.f.M(a0VarC.g).H(a0VarC.b).Z()));
            }
        }
        return a0VarC;
    }

    public String format(TemporalAccessor temporalAccessor) {
        StringBuilder sb = new StringBuilder(32);
        d dVar = this.a;
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            dVar.x(new w(temporalAccessor, this), sb);
            return sb.toString();
        } catch (IOException e) {
            throw new j$.time.b(e.getMessage(), e);
        }
    }

    public final String toString() {
        String string = this.a.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }

    public DateTimeFormatter withDecimalStyle(DecimalStyle decimalStyle) {
        if (this.c.equals(decimalStyle)) {
            return this;
        }
        return new DateTimeFormatter(this.a, this.b, decimalStyle, this.d, this.e);
    }

    public static DateTimeFormatter ofPattern(String str, Locale locale) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.h(str);
        return dateTimeFormatterBuilder.r(locale, b0.SMART, null);
    }
}
