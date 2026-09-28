package j$.time.chrono;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import j$.time.DayOfWeek;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAdjusters;
import j$.time.temporal.TemporalUnit;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-341f12e635949ce385fe972d9bf062aa0727e156e520e84a100f26e1747f2bcc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements Chronology {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final Locale c = new Locale("ja", "JP", "JP");

    public static boolean C() {
        if (a.get("ISO") != null) {
            return false;
        }
        l lVar = l.m;
        lVar.getClass();
        K(lVar, "Hijrah-umalqura");
        s sVar = s.d;
        sVar.getClass();
        K(sVar, "Japanese");
        x xVar = x.d;
        xVar.getClass();
        K(xVar, "Minguo");
        d0 d0Var = d0.d;
        d0Var.getClass();
        K(d0Var, "ThaiBuddhist");
        try {
            for (a aVar : Arrays.asList(new a[0])) {
                if (!aVar.r().equals("ISO")) {
                    K(aVar, aVar.r());
                }
            }
            p pVar = p.d;
            pVar.getClass();
            K(pVar, "ISO");
            return true;
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static Chronology I(String str) {
        Objects.requireNonNull(str, AnalyticsParam.EVENT_PARAM_ID);
        do {
            Chronology chronology = (Chronology) a.get(str);
            if (chronology == null) {
                chronology = (Chronology) b.get(str);
            }
            if (chronology != null) {
                return chronology;
            }
        } while (C());
        for (Chronology chronology2 : ServiceLoader.load(Chronology.class)) {
            if (str.equals(chronology2.r()) || str.equals(chronology2.u())) {
                return chronology2;
            }
        }
        j$.time.h.a("Unknown chronology: ".concat(str));
        return null;
    }

    public static Chronology K(Chronology chronology, String str) {
        String strU;
        Chronology chronology2 = (Chronology) a.putIfAbsent(str, chronology);
        if (chronology2 == null && (strU = chronology.u()) != null) {
            b.putIfAbsent(strU, chronology);
        }
        return chronology2;
    }

    public static ChronoLocalDate R(ChronoLocalDate chronoLocalDate, long j, long j2, long j3) {
        long j4;
        ChronoLocalDate chronoLocalDateB = chronoLocalDate.b(j, (TemporalUnit) ChronoUnit.MONTHS);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        ChronoLocalDate chronoLocalDateB2 = chronoLocalDateB.b(j2, (TemporalUnit) chronoUnit);
        if (j3 <= 7) {
            if (j3 < 1) {
                chronoLocalDateB2 = chronoLocalDateB2.b(Math.subtractExact(j3, 7L) / 7, (TemporalUnit) chronoUnit);
                j4 = (j3 + 6) % 7;
            }
            return chronoLocalDateB2.j(TemporalAdjusters.nextOrSame(DayOfWeek.x((int) j3)));
        }
        long j5 = j3 - 1;
        chronoLocalDateB2 = chronoLocalDateB2.b(j5 / 7, (TemporalUnit) chronoUnit);
        j4 = j5 % 7;
        j3 = j4 + 1;
        return chronoLocalDateB2.j(TemporalAdjusters.nextOrSame(DayOfWeek.x((int) j3)));
    }

    public static Chronology ofLocale(Locale locale) {
        Objects.requireNonNull(locale, "locale");
        String unicodeLocaleType = locale.getUnicodeLocaleType("ca");
        if (unicodeLocaleType == null) {
            unicodeLocaleType = locale.equals(c) ? "japanese" : null;
        }
        if (unicodeLocaleType == null || "iso".equals(unicodeLocaleType) || "iso8601".equals(unicodeLocaleType)) {
            return p.d;
        }
        do {
            Chronology chronology = (Chronology) b.get(unicodeLocaleType);
            if (chronology != null) {
                return chronology;
            }
        } while (C());
        for (Chronology chronology2 : ServiceLoader.load(Chronology.class)) {
            if (unicodeLocaleType.equals(chronology2.u())) {
                return chronology2;
            }
        }
        j$.time.h.a("Unknown calendar system: ".concat(unicodeLocaleType));
        return null;
    }

    public static void x(Map map, j$.time.temporal.a aVar, long j) {
        Long l = (Long) map.get(aVar);
        if (l == null || l.longValue() == j) {
            map.put(aVar, Long.valueOf(j));
            return;
        }
        throw new j$.time.b("Conflict found: " + aVar + " " + l + " differs from " + aVar + " " + j);
    }

    @Override // j$.time.chrono.Chronology, java.lang.Comparable
    /* JADX INFO: renamed from: E */
    public final int compareTo(Chronology chronology) {
        return r().compareTo(chronology.r());
    }

    @Override // j$.time.chrono.Chronology
    public ChronoLocalDate U(Map map, j$.time.format.b0 b0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        if (map.containsKey(aVar)) {
            return q(((Long) map.remove(aVar)).longValue());
        }
        X(map, b0Var);
        ChronoLocalDate chronoLocalDateB0 = b0(map, b0Var);
        if (chronoLocalDateB0 != null) {
            return chronoLocalDateB0;
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
        if (map.containsKey(aVar2)) {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
            if (map.containsKey(aVar3)) {
                if (map.containsKey(j$.time.temporal.a.DAY_OF_MONTH)) {
                    return a0(map, b0Var);
                }
                j$.time.temporal.a aVar4 = j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH;
                if (map.containsKey(aVar4)) {
                    j$.time.temporal.a aVar5 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                    if (map.containsKey(aVar5)) {
                        int iA = A(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                        if (b0Var == j$.time.format.b0.LENIENT) {
                            long jSubtractExact = Math.subtractExact(((Long) map.remove(aVar3)).longValue(), 1L);
                            return S(iA, 1, 1).b(jSubtractExact, (TemporalUnit) ChronoUnit.MONTHS).b(Math.subtractExact(((Long) map.remove(aVar4)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).b(Math.subtractExact(((Long) map.remove(aVar5)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
                        }
                        int iA2 = A(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                        ChronoLocalDate chronoLocalDateB = S(iA, iA2, 1).b((A(aVar5).a(((Long) map.remove(aVar5)).longValue(), aVar5) - 1) + ((A(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4) - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
                        if (b0Var != j$.time.format.b0.STRICT || chronoLocalDateB.h(aVar3) == iA2) {
                            return chronoLocalDateB;
                        }
                        j$.time.h.a("Strict mode rejected resolved date as it is in a different month");
                        return null;
                    }
                    j$.time.temporal.a aVar6 = j$.time.temporal.a.DAY_OF_WEEK;
                    if (map.containsKey(aVar6)) {
                        int iA3 = A(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                        if (b0Var == j$.time.format.b0.LENIENT) {
                            return R(S(iA3, 1, 1), Math.subtractExact(((Long) map.remove(aVar3)).longValue(), 1L), Math.subtractExact(((Long) map.remove(aVar4)).longValue(), 1L), Math.subtractExact(((Long) map.remove(aVar6)).longValue(), 1L));
                        }
                        int iA4 = A(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                        ChronoLocalDate chronoLocalDateJ = S(iA3, iA4, 1).b((A(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).j(TemporalAdjusters.nextOrSame(DayOfWeek.x(A(aVar6).a(((Long) map.remove(aVar6)).longValue(), aVar6))));
                        if (b0Var != j$.time.format.b0.STRICT || chronoLocalDateJ.h(aVar3) == iA4) {
                            return chronoLocalDateJ;
                        }
                        j$.time.h.a("Strict mode rejected resolved date as it is in a different month");
                        return null;
                    }
                }
            }
            j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_YEAR;
            if (map.containsKey(aVar7)) {
                int iA5 = A(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                if (b0Var != j$.time.format.b0.LENIENT) {
                    return v(iA5, A(aVar7).a(((Long) map.remove(aVar7)).longValue(), aVar7));
                }
                return v(iA5, 1).b(Math.subtractExact(((Long) map.remove(aVar7)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
            }
            j$.time.temporal.a aVar8 = j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR;
            if (map.containsKey(aVar8)) {
                j$.time.temporal.a aVar9 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
                if (map.containsKey(aVar9)) {
                    int iA6 = A(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                    if (b0Var == j$.time.format.b0.LENIENT) {
                        return v(iA6, 1).b(Math.subtractExact(((Long) map.remove(aVar8)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).b(Math.subtractExact(((Long) map.remove(aVar9)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
                    }
                    ChronoLocalDate chronoLocalDateB2 = v(iA6, 1).b((A(aVar9).a(((Long) map.remove(aVar9)).longValue(), aVar9) - 1) + ((A(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8) - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
                    if (b0Var != j$.time.format.b0.STRICT || chronoLocalDateB2.h(aVar2) == iA6) {
                        return chronoLocalDateB2;
                    }
                    j$.time.h.a("Strict mode rejected resolved date as it is in a different year");
                    return null;
                }
                j$.time.temporal.a aVar10 = j$.time.temporal.a.DAY_OF_WEEK;
                if (map.containsKey(aVar10)) {
                    int iA7 = A(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                    if (b0Var == j$.time.format.b0.LENIENT) {
                        return R(v(iA7, 1), 0L, Math.subtractExact(((Long) map.remove(aVar8)).longValue(), 1L), Math.subtractExact(((Long) map.remove(aVar10)).longValue(), 1L));
                    }
                    ChronoLocalDate chronoLocalDateJ2 = v(iA7, 1).b((A(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).j(TemporalAdjusters.nextOrSame(DayOfWeek.x(A(aVar10).a(((Long) map.remove(aVar10)).longValue(), aVar10))));
                    if (b0Var != j$.time.format.b0.STRICT || chronoLocalDateJ2.h(aVar2) == iA7) {
                        return chronoLocalDateJ2;
                    }
                    j$.time.h.a("Strict mode rejected resolved date as it is in a different year");
                    return null;
                }
            }
        }
        return null;
    }

    public void X(Map map, j$.time.format.b0 b0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(aVar);
        if (l != null) {
            if (b0Var != j$.time.format.b0.LENIENT) {
                aVar.a0(l.longValue());
            }
            ChronoLocalDate chronoLocalDateA = O().a(1L, (j$.time.temporal.n) j$.time.temporal.a.DAY_OF_MONTH).a(l.longValue(), (j$.time.temporal.n) aVar);
            j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
            x(map, aVar2, chronoLocalDateA.h(aVar2));
            j$.time.temporal.a aVar3 = j$.time.temporal.a.YEAR;
            x(map, aVar3, chronoLocalDateA.h(aVar3));
        }
    }

    public ChronoLocalDate a0(Map map, j$.time.format.b0 b0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int iA = A(aVar).a(((Long) map.remove(aVar)).longValue(), aVar);
        if (b0Var == j$.time.format.b0.LENIENT) {
            long jSubtractExact = Math.subtractExact(((Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L);
            return S(iA, 1, 1).b(jSubtractExact, (TemporalUnit) ChronoUnit.MONTHS).b(Math.subtractExact(((Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int iA2 = A(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int iA3 = A(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
        if (b0Var != j$.time.format.b0.SMART) {
            return S(iA, iA2, iA3);
        }
        try {
            return S(iA, iA2, iA3);
        } catch (j$.time.b unused) {
            return S(iA, iA2, 1).j(new j$.time.f(4));
        }
    }

    public ChronoLocalDate b0(Map map, j$.time.format.b0 b0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        Long l = (Long) map.remove(aVar);
        if (l == null) {
            j$.time.temporal.a aVar2 = j$.time.temporal.a.ERA;
            if (!map.containsKey(aVar2)) {
                return null;
            }
            A(aVar2).b(((Long) map.get(aVar2)).longValue(), aVar2);
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.ERA;
        Long l2 = (Long) map.remove(aVar3);
        int iA = b0Var != j$.time.format.b0.LENIENT ? A(aVar).a(l.longValue(), aVar) : Math.toIntExact(l.longValue());
        if (l2 != null) {
            x(map, j$.time.temporal.a.YEAR, F(D(A(aVar3).a(l2.longValue(), aVar3)), iA));
            return null;
        }
        j$.time.temporal.a aVar4 = j$.time.temporal.a.YEAR;
        if (map.containsKey(aVar4)) {
            x(map, aVar4, F(v(A(aVar4).a(((Long) map.get(aVar4)).longValue(), aVar4), 1).P(), iA));
            return null;
        }
        if (b0Var == j$.time.format.b0.STRICT) {
            map.put(aVar, l);
            return null;
        }
        List listB = B();
        if (listB.isEmpty()) {
            x(map, aVar4, iA);
            return null;
        }
        x(map, aVar4, F((j) listB.get(listB.size() - 1), iA));
        return null;
    }

    @Override // j$.time.chrono.Chronology
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && compareTo((a) obj) == 0;
    }

    @Override // j$.time.chrono.Chronology
    public final int hashCode() {
        return r().hashCode() ^ getClass().hashCode();
    }

    @Override // j$.time.chrono.Chronology
    public final String toString() {
        return r();
    }
}
