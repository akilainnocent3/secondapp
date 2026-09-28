package j$.time.temporal;

import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.chrono.Chronology;
import j$.time.format.a0;
import j$.time.format.b0;
import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Enum visitor error
java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
	at jadx.core.dex.visitors.EnumVisitor.searchEnumSuperCtrInsn(EnumVisitor.java:495)
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:473)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-341f12e635949ce385fe972d9bf062aa0727e156e520e84a100f26e1747f2bcc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g implements n {
    public static final g DAY_OF_QUARTER;
    public static final g QUARTER_OF_YEAR;
    public static final g WEEK_BASED_YEAR;
    public static final g WEEK_OF_WEEK_BASED_YEAR;
    public static final int[] a;
    public static final /* synthetic */ g[] b;

    static {
        g gVar = new g() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.n
            public final q C(TemporalAccessor temporalAccessor) {
                if (!x(temporalAccessor)) {
                    throw new p("Unsupported field: DayOfQuarter");
                }
                long jK = temporalAccessor.k(g.QUARTER_OF_YEAR);
                if (jK == 1) {
                    return j$.time.chrono.p.d.Y(temporalAccessor.k(a.YEAR)) ? q.f(1L, 91L) : q.f(1L, 90L);
                }
                if (jK == 2) {
                    return q.f(1L, 91L);
                }
                return (jK == 3 || jK == 4) ? q.f(1L, 92L) : K();
            }

            @Override // j$.time.temporal.n
            public final TemporalAccessor I(Map map, a0 a0Var, b0 b0Var) {
                LocalDate localDateOf;
                long jSubtractExact;
                a aVar = a.YEAR;
                HashMap map2 = (HashMap) map;
                Long l = (Long) map2.get(aVar);
                n nVar = g.QUARTER_OF_YEAR;
                Long l2 = (Long) map2.get(nVar);
                if (l != null && l2 != null) {
                    int iA = aVar.b.a(l.longValue(), aVar);
                    long jLongValue = ((Long) map2.get(g.DAY_OF_QUARTER)).longValue();
                    g gVar2 = i.a;
                    if (Chronology.s(a0Var).equals(j$.time.chrono.p.d)) {
                        if (b0Var == b0.LENIENT) {
                            localDateOf = LocalDate.of(iA, 1, 1).plusMonths(Math.multiplyExact(Math.subtractExact(l2.longValue(), 1L), 3L));
                            jSubtractExact = Math.subtractExact(jLongValue, 1L);
                        } else {
                            localDateOf = LocalDate.of(iA, ((nVar.K().a(l2.longValue(), nVar) - 1) * 3) + 1, 1);
                            if (jLongValue < 1 || jLongValue > 90) {
                                if (b0Var == b0.STRICT) {
                                    C(localDateOf).b(jLongValue, this);
                                } else {
                                    K().b(jLongValue, this);
                                }
                            }
                            jSubtractExact = jLongValue - 1;
                        }
                        map2.remove(this);
                        map2.remove(aVar);
                        map2.remove(nVar);
                        return localDateOf.plusDays(jSubtractExact);
                    }
                    j$.time.h.a("Resolve requires IsoChronology");
                }
                return null;
            }

            @Override // j$.time.temporal.n
            public final q K() {
                return q.g(1L, 90L, 92L);
            }

            @Override // j$.time.temporal.n
            public final long R(TemporalAccessor temporalAccessor) {
                if (!x(temporalAccessor)) {
                    throw new p("Unsupported field: DayOfQuarter");
                }
                return temporalAccessor.h(a.DAY_OF_YEAR) - g.a[((temporalAccessor.h(a.MONTH_OF_YEAR) - 1) / 3) + (j$.time.chrono.p.d.Y(temporalAccessor.k(a.YEAR)) ? 4 : 0)];
            }

            @Override // j$.time.temporal.n
            public final Temporal X(Temporal temporal, long j) {
                long jR = R(temporal);
                K().b(j, this);
                a aVar = a.DAY_OF_YEAR;
                return temporal.a((j - jR) + temporal.k(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }

            @Override // j$.time.temporal.n
            public final boolean x(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.i(a.DAY_OF_YEAR) || !temporalAccessor.i(a.MONTH_OF_YEAR) || !temporalAccessor.i(a.YEAR)) {
                    return false;
                }
                g gVar2 = i.a;
                return Chronology.s(temporalAccessor).equals(j$.time.chrono.p.d);
            }
        };
        DAY_OF_QUARTER = gVar;
        g gVar2 = new g() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.n
            public final q C(TemporalAccessor temporalAccessor) {
                if (x(temporalAccessor)) {
                    return K();
                }
                throw new p("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.n
            public final q K() {
                return q.f(1L, 4L);
            }

            @Override // j$.time.temporal.n
            public final long R(TemporalAccessor temporalAccessor) {
                if (x(temporalAccessor)) {
                    return (temporalAccessor.k(a.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new p("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.n
            public final Temporal X(Temporal temporal, long j) {
                long jR = R(temporal);
                K().b(j, this);
                a aVar = a.MONTH_OF_YEAR;
                return temporal.a(((j - jR) * 3) + temporal.k(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }

            @Override // j$.time.temporal.n
            public final boolean x(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.i(a.MONTH_OF_YEAR)) {
                    return false;
                }
                g gVar3 = i.a;
                return Chronology.s(temporalAccessor).equals(j$.time.chrono.p.d);
            }
        };
        QUARTER_OF_YEAR = gVar2;
        g gVar3 = new g() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.n
            public final q C(TemporalAccessor temporalAccessor) {
                if (x(temporalAccessor)) {
                    return q.f(1L, g.c0(g.b0(LocalDate.I(temporalAccessor))));
                }
                throw new p("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.n
            public final TemporalAccessor I(Map map, a0 a0Var, b0 b0Var) {
                LocalDate localDateA;
                long j;
                n nVar = g.WEEK_BASED_YEAR;
                HashMap map2 = (HashMap) map;
                Long l = (Long) map2.get(nVar);
                a aVar = a.DAY_OF_WEEK;
                Long l2 = (Long) map2.get(aVar);
                if (l != null && l2 != null) {
                    int iA = nVar.K().a(l.longValue(), nVar);
                    long jLongValue = ((Long) map2.get(g.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                    g gVar4 = i.a;
                    if (Chronology.s(a0Var).equals(j$.time.chrono.p.d)) {
                        LocalDate localDateOf = LocalDate.of(iA, 1, 4);
                        if (b0Var == b0.LENIENT) {
                            long jLongValue2 = l2.longValue();
                            if (jLongValue2 > 7) {
                                long j2 = jLongValue2 - 1;
                                localDateOf = localDateOf.g0(j2 / 7);
                                j = j2 % 7;
                            } else {
                                if (jLongValue2 < 1) {
                                    localDateOf = localDateOf.g0(Math.subtractExact(jLongValue2, 7L) / 7);
                                    j = (jLongValue2 + 6) % 7;
                                }
                                localDateA = localDateOf.g0(Math.subtractExact(jLongValue, 1L)).a(jLongValue2, aVar);
                            }
                            jLongValue2 = j + 1;
                            localDateA = localDateOf.g0(Math.subtractExact(jLongValue, 1L)).a(jLongValue2, aVar);
                        } else {
                            int iA2 = aVar.b.a(l2.longValue(), aVar);
                            if (jLongValue < 1 || jLongValue > 52) {
                                if (b0Var == b0.STRICT) {
                                    q.f(1L, g.c0(g.b0(localDateOf))).b(jLongValue, this);
                                } else {
                                    K().b(jLongValue, this);
                                }
                            }
                            localDateA = localDateOf.g0(jLongValue - 1).a(iA2, aVar);
                        }
                        map2.remove(this);
                        map2.remove(nVar);
                        map2.remove(aVar);
                        return localDateA;
                    }
                    j$.time.h.a("Resolve requires IsoChronology");
                }
                return null;
            }

            @Override // j$.time.temporal.n
            public final q K() {
                return q.g(1L, 52L, 53L);
            }

            @Override // j$.time.temporal.n
            public final long R(TemporalAccessor temporalAccessor) {
                if (x(temporalAccessor)) {
                    return g.a0(LocalDate.I(temporalAccessor));
                }
                throw new p("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.n
            public final Temporal X(Temporal temporal, long j) {
                K().b(j, this);
                return temporal.b(Math.subtractExact(j, R(temporal)), ChronoUnit.WEEKS);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }

            @Override // j$.time.temporal.n
            public final boolean x(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.i(a.EPOCH_DAY)) {
                    return false;
                }
                g gVar4 = i.a;
                return Chronology.s(temporalAccessor).equals(j$.time.chrono.p.d);
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = gVar3;
        g gVar4 = new g() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.n
            public final q C(TemporalAccessor temporalAccessor) {
                if (x(temporalAccessor)) {
                    return a.YEAR.b;
                }
                throw new p("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.n
            public final q K() {
                return a.YEAR.b;
            }

            @Override // j$.time.temporal.n
            public final long R(TemporalAccessor temporalAccessor) {
                if (x(temporalAccessor)) {
                    return g.b0(LocalDate.I(temporalAccessor));
                }
                throw new p("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.n
            public final Temporal X(Temporal temporal, long j) {
                if (!x(temporal)) {
                    throw new p("Unsupported field: WeekBasedYear");
                }
                int iA = a.YEAR.b.a(j, g.WEEK_BASED_YEAR);
                LocalDate localDateI = LocalDate.I(temporal);
                a aVar = a.DAY_OF_WEEK;
                int iH = localDateI.h(aVar);
                int iA0 = g.a0(localDateI);
                if (iA0 == 53 && g.c0(iA) == 52) {
                    iA0 = 52;
                }
                LocalDate localDateOf = LocalDate.of(iA, 1, 4);
                return temporal.j(localDateOf.plusDays(((iA0 - 1) * 7) + (iH - localDateOf.h(aVar))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }

            @Override // j$.time.temporal.n
            public final boolean x(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.i(a.EPOCH_DAY)) {
                    return false;
                }
                g gVar5 = i.a;
                return Chronology.s(temporalAccessor).equals(j$.time.chrono.p.d);
            }
        };
        WEEK_BASED_YEAR = gVar4;
        b = new g[]{gVar, gVar2, gVar3, gVar4};
        a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    public static int a0(LocalDate localDate) {
        int iOrdinal = localDate.getDayOfWeek().ordinal();
        int iR = localDate.R() - 1;
        int i = (3 - iOrdinal) + iR;
        int i2 = i - ((i / 7) * 7);
        int i3 = i2 - 3;
        if (i3 < -3) {
            i3 = i2 + 4;
        }
        if (iR < i3) {
            if (localDate.R() != 180) {
                localDate = LocalDate.e0(localDate.a, 180);
            }
            return (int) q.f(1L, c0(b0(localDate.h0(-1L)))).d;
        }
        int i4 = ((iR - i3) / 7) + 1;
        if (i4 != 53 || i3 == -3 || (i3 == -2 && localDate.z())) {
            return i4;
        }
        return 1;
    }

    public static int b0(LocalDate localDate) {
        int year = localDate.getYear();
        int iR = localDate.R();
        if (iR <= 3) {
            return iR - localDate.getDayOfWeek().ordinal() < -2 ? year - 1 : year;
        }
        if (iR >= 363) {
            return ((iR - 363) - (localDate.z() ? 1 : 0)) - localDate.getDayOfWeek().ordinal() >= 0 ? year + 1 : year;
        }
        return year;
    }

    public static int c0(int i) {
        LocalDate localDateOf = LocalDate.of(i, 1, 1);
        if (localDateOf.getDayOfWeek() != DayOfWeek.THURSDAY) {
            return (localDateOf.getDayOfWeek() == DayOfWeek.WEDNESDAY && localDateOf.z()) ? 53 : 52;
        }
        return 53;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) b.clone();
    }

    @Override // j$.time.temporal.n
    public final boolean isDateBased() {
        return true;
    }
}
