package j$.time.chrono;

import j$.time.Clock;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.Month;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-341f12e635949ce385fe972d9bf062aa0727e156e520e84a100f26e1747f2bcc */
/* JADX INFO: loaded from: classes3.dex */
public final class p extends a implements Serializable {
    public static final p d = new p();
    private static final long serialVersionUID = -1440403870442975015L;

    private p() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.temporal.q A(j$.time.temporal.a aVar) {
        return aVar.b;
    }

    @Override // j$.time.chrono.Chronology
    public final List B() {
        return j$.time.d.a(q.values());
    }

    @Override // j$.time.chrono.Chronology
    public final j D(int i) {
        if (i == 0) {
            return q.BCE;
        }
        if (i == 1) {
            return q.CE;
        }
        j$.time.h.b("Invalid era: ", i);
        return null;
    }

    @Override // j$.time.chrono.Chronology
    public final int F(j jVar, int i) {
        if (jVar instanceof q) {
            return jVar == q.CE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate J(TemporalAccessor temporalAccessor) {
        return LocalDate.I(temporalAccessor);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoZonedDateTime N(Temporal temporal) {
        return ZonedDateTime.C(temporal);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate O() {
        return LocalDate.I(LocalDate.now(Clock.b()));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate S(int i, int i2, int i3) {
        return LocalDate.of(i, i2, i3);
    }

    @Override // j$.time.chrono.a, j$.time.chrono.Chronology
    public final ChronoLocalDate U(Map map, j$.time.format.b0 b0Var) {
        return (LocalDate) super.U(map, b0Var);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoZonedDateTime V(Instant instant, ZoneId zoneId) {
        return ZonedDateTime.I(instant, zoneId);
    }

    @Override // j$.time.chrono.a
    public final void X(Map map, j$.time.format.b0 b0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(aVar);
        if (l != null) {
            if (b0Var != j$.time.format.b0.LENIENT) {
                aVar.a0(l.longValue());
            }
            a.x(map, j$.time.temporal.a.MONTH_OF_YEAR, ((int) Math.floorMod(l.longValue(), 12L)) + 1);
            a.x(map, j$.time.temporal.a.YEAR, Math.floorDiv(l.longValue(), 12L));
        }
    }

    @Override // j$.time.chrono.Chronology
    public final boolean Y(long j) {
        if ((3 & j) == 0) {
            return j % 100 != 0 || j % 400 == 0;
        }
        return false;
    }

    @Override // j$.time.chrono.a
    public final ChronoLocalDate a0(Map map, j$.time.format.b0 b0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int iA = aVar.b.a(((Long) map.remove(aVar)).longValue(), aVar);
        boolean z = true;
        if (b0Var == j$.time.format.b0.LENIENT) {
            return LocalDate.of(iA, 1, 1).plusMonths(Math.subtractExact(((Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L)).plusDays(Math.subtractExact(((Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L));
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int iA2 = aVar2.b.a(((Long) map.remove(aVar2)).longValue(), aVar2);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int iA3 = aVar3.b.a(((Long) map.remove(aVar3)).longValue(), aVar3);
        if (b0Var == j$.time.format.b0.SMART) {
            if (iA2 == 4 || iA2 == 6 || iA2 == 9 || iA2 == 11) {
                iA3 = Math.min(iA3, 30);
            } else if (iA2 == 2) {
                Month month = Month.FEBRUARY;
                long j = iA;
                int i = j$.time.t.b;
                if ((3 & j) != 0 || (j % 100 == 0 && j % 400 != 0)) {
                    z = false;
                }
                iA3 = Math.min(iA3, month.C(z));
            }
        }
        return LocalDate.of(iA, iA2, iA3);
    }

    @Override // j$.time.chrono.a
    public final ChronoLocalDate b0(Map map, j$.time.format.b0 b0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        Long l = (Long) map.remove(aVar);
        if (l != null) {
            if (b0Var != j$.time.format.b0.LENIENT) {
                aVar.a0(l.longValue());
            }
            Long l2 = (Long) map.remove(j$.time.temporal.a.ERA);
            if (l2 == null) {
                j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
                Long l3 = (Long) map.get(aVar2);
                if (b0Var != j$.time.format.b0.STRICT) {
                    a.x(map, aVar2, (l3 == null || l3.longValue() > 0) ? l.longValue() : Math.subtractExact(1L, l.longValue()));
                } else if (l3 != null) {
                    long jLongValue = l3.longValue();
                    long jLongValue2 = l.longValue();
                    if (jLongValue <= 0) {
                        jLongValue2 = Math.subtractExact(1L, jLongValue2);
                    }
                    a.x(map, aVar2, jLongValue2);
                } else {
                    map.put(aVar, l);
                }
            } else if (l2.longValue() == 1) {
                a.x(map, j$.time.temporal.a.YEAR, l.longValue());
            } else {
                if (l2.longValue() != 0) {
                    j$.time.h.i("Invalid value for era: ", l2);
                    return null;
                }
                a.x(map, j$.time.temporal.a.YEAR, Math.subtractExact(1L, l.longValue()));
            }
        } else {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.ERA;
            if (map.containsKey(aVar3)) {
                aVar3.a0(((Long) map.get(aVar3)).longValue());
            }
        }
        return null;
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate q(long j) {
        return LocalDate.d0(j);
    }

    @Override // j$.time.chrono.Chronology
    public final String r() {
        return "ISO";
    }

    @Override // j$.time.chrono.Chronology
    public final String u() {
        return "iso8601";
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate v(int i, int i2) {
        return LocalDate.e0(i, i2);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDateTime w(Temporal temporal) {
        return LocalDateTime.C(temporal);
    }

    public Object writeReplace() {
        return new b0((byte) 1, this);
    }
}
