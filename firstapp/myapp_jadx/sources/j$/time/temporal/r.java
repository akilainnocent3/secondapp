package j$.time.temporal;

import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.format.a0;
import j$.time.format.b0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-341f12e635949ce385fe972d9bf062aa0727e156e520e84a100f26e1747f2bcc */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements n {
    public static final q f = q.f(1, 7);
    public static final q g = q.g(0, 4, 6);
    public static final q h = q.g(0, 52, 54);
    public static final q i = q.g(1, 52, 53);
    public final String a;
    public final WeekFields b;
    public final TemporalUnit c;
    public final TemporalUnit d;
    public final q e;

    public r(String str, WeekFields weekFields, TemporalUnit temporalUnit, TemporalUnit temporalUnit2, q qVar) {
        this.a = str;
        this.b = weekFields;
        this.c = temporalUnit;
        this.d = temporalUnit2;
        this.e = qVar;
    }

    public static int a(int i2, int i3) {
        return ((i3 - 1) + (i2 + 7)) / 7;
    }

    @Override // j$.time.temporal.n
    public final q C(TemporalAccessor temporalAccessor) {
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.d;
        if (temporalUnit == chronoUnit) {
            return this.e;
        }
        if (temporalUnit == ChronoUnit.MONTHS) {
            return f(temporalAccessor, a.DAY_OF_MONTH);
        }
        if (temporalUnit == ChronoUnit.YEARS) {
            return f(temporalAccessor, a.DAY_OF_YEAR);
        }
        if (temporalUnit == WeekFields.h) {
            return g(temporalAccessor);
        }
        if (temporalUnit == ChronoUnit.FOREVER) {
            return a.YEAR.b;
        }
        throw new IllegalStateException("unreachable, rangeUnit: " + temporalUnit + ", this: " + this);
    }

    @Override // j$.time.temporal.n
    public final TemporalAccessor I(Map map, a0 a0Var, b0 b0Var) {
        ChronoLocalDate chronoLocalDateB;
        ChronoLocalDate chronoLocalDateB2;
        ChronoLocalDate chronoLocalDateB3;
        HashMap map2 = (HashMap) map;
        long jLongValue = ((Long) map2.get(this)).longValue();
        int intExact = Math.toIntExact(jLongValue);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        q qVar = this.e;
        WeekFields weekFields = this.b;
        TemporalUnit temporalUnit = this.d;
        if (temporalUnit == chronoUnit) {
            long jFloorMod = Math.floorMod((qVar.a(jLongValue, this) - 1) + (weekFields.getFirstDayOfWeek().getValue() - 1), 7) + 1;
            map2.remove(this);
            map2.put(a.DAY_OF_WEEK, Long.valueOf(jFloorMod));
            return null;
        }
        a aVar = a.DAY_OF_WEEK;
        if (!map2.containsKey(aVar)) {
            return null;
        }
        int iFloorMod = Math.floorMod(aVar.b.a(((Long) map2.get(aVar)).longValue(), aVar) - weekFields.getFirstDayOfWeek().getValue(), 7) + 1;
        Chronology chronologyS = Chronology.s(a0Var);
        a aVar2 = a.YEAR;
        if (!map2.containsKey(aVar2)) {
            if ((temporalUnit != WeekFields.h && temporalUnit != ChronoUnit.FOREVER) || !map2.containsKey(weekFields.f) || !map2.containsKey(weekFields.e)) {
                return null;
            }
            r rVar = weekFields.f;
            int iA = rVar.e.a(((Long) map2.get(rVar)).longValue(), weekFields.f);
            if (b0Var == b0.LENIENT) {
                chronoLocalDateB = e(chronologyS, iA, 1, iFloorMod).b(Math.subtractExact(((Long) map2.get(weekFields.e)).longValue(), 1L), (TemporalUnit) chronoUnit);
            } else {
                r rVar2 = weekFields.e;
                ChronoLocalDate chronoLocalDateE = e(chronologyS, iA, rVar2.e.a(((Long) map2.get(rVar2)).longValue(), weekFields.e), iFloorMod);
                if (b0Var == b0.STRICT && c(chronoLocalDateE) != iA) {
                    j$.time.h.a("Strict mode rejected resolved date as it is in a different week-based-year");
                    return null;
                }
                chronoLocalDateB = chronoLocalDateE;
            }
            map2.remove(this);
            map2.remove(weekFields.f);
            map2.remove(weekFields.e);
            map2.remove(aVar);
            return chronoLocalDateB;
        }
        int iA2 = aVar2.b.a(((Long) map2.get(aVar2)).longValue(), aVar2);
        ChronoUnit chronoUnit2 = ChronoUnit.MONTHS;
        if (temporalUnit == chronoUnit2) {
            a aVar3 = a.MONTH_OF_YEAR;
            if (map2.containsKey(aVar3)) {
                long jLongValue2 = ((Long) map2.get(aVar3)).longValue();
                long j = intExact;
                if (b0Var == b0.LENIENT) {
                    ChronoLocalDate chronoLocalDateB4 = chronologyS.S(iA2, 1, 1).b(Math.subtractExact(jLongValue2, 1L), (TemporalUnit) chronoUnit2);
                    int iB = b(chronoLocalDateB4);
                    int iH = chronoLocalDateB4.h(a.DAY_OF_MONTH);
                    chronoLocalDateB3 = chronoLocalDateB4.b(Math.addExact(Math.multiplyExact(Math.subtractExact(j, a(h(iH, iB), iH)), 7L), iFloorMod - b(chronoLocalDateB4)), (TemporalUnit) ChronoUnit.DAYS);
                } else {
                    ChronoLocalDate chronoLocalDateS = chronologyS.S(iA2, aVar3.b.a(jLongValue2, aVar3), 1);
                    long jA = qVar.a(j, this);
                    int iB2 = b(chronoLocalDateS);
                    int iH2 = chronoLocalDateS.h(a.DAY_OF_MONTH);
                    ChronoLocalDate chronoLocalDateB5 = chronoLocalDateS.b((((int) (jA - ((long) a(h(iH2, iB2), iH2)))) * 7) + (iFloorMod - b(chronoLocalDateS)), (TemporalUnit) ChronoUnit.DAYS);
                    if (b0Var == b0.STRICT && chronoLocalDateB5.k(aVar3) != jLongValue2) {
                        j$.time.h.a("Strict mode rejected resolved date as it is in a different month");
                        return null;
                    }
                    chronoLocalDateB3 = chronoLocalDateB5;
                }
                map2.remove(this);
                map2.remove(aVar2);
                map2.remove(aVar3);
                map2.remove(aVar);
                return chronoLocalDateB3;
            }
        }
        if (temporalUnit != ChronoUnit.YEARS) {
            return null;
        }
        long j2 = intExact;
        ChronoLocalDate chronoLocalDateS2 = chronologyS.S(iA2, 1, 1);
        if (b0Var == b0.LENIENT) {
            int iB3 = b(chronoLocalDateS2);
            int iH3 = chronoLocalDateS2.h(a.DAY_OF_YEAR);
            chronoLocalDateB2 = chronoLocalDateS2.b(Math.addExact(Math.multiplyExact(Math.subtractExact(j2, a(h(iH3, iB3), iH3)), 7L), iFloorMod - b(chronoLocalDateS2)), (TemporalUnit) ChronoUnit.DAYS);
        } else {
            long jA2 = qVar.a(j2, this);
            int iB4 = b(chronoLocalDateS2);
            int iH4 = chronoLocalDateS2.h(a.DAY_OF_YEAR);
            ChronoLocalDate chronoLocalDateB6 = chronoLocalDateS2.b((((int) (jA2 - ((long) a(h(iH4, iB4), iH4)))) * 7) + (iFloorMod - b(chronoLocalDateS2)), (TemporalUnit) ChronoUnit.DAYS);
            if (b0Var == b0.STRICT && chronoLocalDateB6.k(aVar2) != iA2) {
                j$.time.h.a("Strict mode rejected resolved date as it is in a different year");
                return null;
            }
            chronoLocalDateB2 = chronoLocalDateB6;
        }
        map2.remove(this);
        map2.remove(aVar2);
        map2.remove(aVar);
        return chronoLocalDateB2;
    }

    @Override // j$.time.temporal.n
    public final q K() {
        return this.e;
    }

    @Override // j$.time.temporal.n
    public final long R(TemporalAccessor temporalAccessor) {
        int iC;
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.d;
        if (temporalUnit == chronoUnit) {
            iC = b(temporalAccessor);
        } else if (temporalUnit == ChronoUnit.MONTHS) {
            int iB = b(temporalAccessor);
            int iH = temporalAccessor.h(a.DAY_OF_MONTH);
            iC = a(h(iH, iB), iH);
        } else if (temporalUnit == ChronoUnit.YEARS) {
            int iB2 = b(temporalAccessor);
            int iH2 = temporalAccessor.h(a.DAY_OF_YEAR);
            iC = a(h(iH2, iB2), iH2);
        } else if (temporalUnit == WeekFields.h) {
            iC = d(temporalAccessor);
        } else {
            if (temporalUnit != ChronoUnit.FOREVER) {
                throw new IllegalStateException("unreachable, rangeUnit: " + temporalUnit + ", this: " + this);
            }
            iC = c(temporalAccessor);
        }
        return iC;
    }

    @Override // j$.time.temporal.n
    public final Temporal X(Temporal temporal, long j) {
        int iA = this.e.a(j, this);
        int iH = temporal.h(this);
        if (iA == iH) {
            return temporal;
        }
        if (this.d != ChronoUnit.FOREVER) {
            return temporal.b(iA - iH, this.c);
        }
        WeekFields weekFields = this.b;
        return e(Chronology.s(temporal), (int) j, temporal.h(weekFields.e), temporal.h(weekFields.c));
    }

    public final int b(TemporalAccessor temporalAccessor) {
        return Math.floorMod(temporalAccessor.h(a.DAY_OF_WEEK) - this.b.getFirstDayOfWeek().getValue(), 7) + 1;
    }

    public final int c(TemporalAccessor temporalAccessor) {
        int iB = b(temporalAccessor);
        int iH = temporalAccessor.h(a.YEAR);
        a aVar = a.DAY_OF_YEAR;
        int iH2 = temporalAccessor.h(aVar);
        int iH3 = h(iH2, iB);
        int iA = a(iH3, iH2);
        if (iA == 0) {
            return iH - 1;
        }
        return iA >= a(iH3, ((int) temporalAccessor.l(aVar).d) + this.b.b) ? iH + 1 : iH;
    }

    public final int d(TemporalAccessor temporalAccessor) {
        int iA;
        int iB = b(temporalAccessor);
        a aVar = a.DAY_OF_YEAR;
        int iH = temporalAccessor.h(aVar);
        int iH2 = h(iH, iB);
        int iA2 = a(iH2, iH);
        if (iA2 == 0) {
            return d(Chronology.s(temporalAccessor).J(temporalAccessor).c(iH, (TemporalUnit) ChronoUnit.DAYS));
        }
        return (iA2 <= 50 || iA2 < (iA = a(iH2, ((int) temporalAccessor.l(aVar).d) + this.b.b))) ? iA2 : (iA2 - iA) + 1;
    }

    public final ChronoLocalDate e(Chronology chronology, int i2, int i3, int i4) {
        ChronoLocalDate chronoLocalDateS = chronology.S(i2, 1, 1);
        int iH = h(1, b(chronoLocalDateS));
        return chronoLocalDateS.b(((Math.min(i3, a(iH, chronoLocalDateS.W() + this.b.b) - 1) - 1) * 7) + (i4 - 1) + (-iH), (TemporalUnit) ChronoUnit.DAYS);
    }

    public final q f(TemporalAccessor temporalAccessor, a aVar) {
        int iH = h(temporalAccessor.h(aVar), b(temporalAccessor));
        q qVarL = temporalAccessor.l(aVar);
        return q.f(a(iH, (int) qVarL.a), a(iH, (int) qVarL.d));
    }

    public final q g(TemporalAccessor temporalAccessor) {
        a aVar = a.DAY_OF_YEAR;
        if (!temporalAccessor.i(aVar)) {
            return h;
        }
        int iB = b(temporalAccessor);
        int iH = temporalAccessor.h(aVar);
        int iH2 = h(iH, iB);
        int iA = a(iH2, iH);
        if (iA == 0) {
            return g(Chronology.s(temporalAccessor).J(temporalAccessor).c(iH + 7, (TemporalUnit) ChronoUnit.DAYS));
        }
        int i2 = (int) temporalAccessor.l(aVar).d;
        int iA2 = a(iH2, this.b.b + i2);
        return iA >= iA2 ? g(Chronology.s(temporalAccessor).J(temporalAccessor).b((i2 - iH) + 8, (TemporalUnit) ChronoUnit.DAYS)) : q.f(1L, iA2 - 1);
    }

    public final int h(int i2, int i3) {
        int iFloorMod = Math.floorMod(i2 - i3, 7);
        return iFloorMod + 1 > this.b.b ? 7 - iFloorMod : -iFloorMod;
    }

    @Override // j$.time.temporal.n
    public final boolean isDateBased() {
        return true;
    }

    public final String toString() {
        return this.a + "[" + this.b.toString() + "]";
    }

    @Override // j$.time.temporal.n
    public final boolean x(TemporalAccessor temporalAccessor) {
        if (!temporalAccessor.i(a.DAY_OF_WEEK)) {
            return false;
        }
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.d;
        if (temporalUnit == chronoUnit) {
            return true;
        }
        if (temporalUnit == ChronoUnit.MONTHS) {
            return temporalAccessor.i(a.DAY_OF_MONTH);
        }
        if (temporalUnit == ChronoUnit.YEARS) {
            return temporalAccessor.i(a.DAY_OF_YEAR);
        }
        if (temporalUnit == WeekFields.h) {
            return temporalAccessor.i(a.DAY_OF_YEAR);
        }
        if (temporalUnit == ChronoUnit.FOREVER) {
            return temporalAccessor.i(a.YEAR);
        }
        return false;
    }
}
