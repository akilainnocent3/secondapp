package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalUnit;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-341f12e635949ce385fe972d9bf062aa0727e156e520e84a100f26e1747f2bcc */
/* JADX INFO: loaded from: classes3.dex */
public interface ChronoLocalDateTime<D extends ChronoLocalDate> extends Temporal, TemporalAdjuster, Comparable<ChronoLocalDateTime<?>> {
    ChronoZonedDateTime H(ZoneId zoneId);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: Q */
    default int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        int iCompareTo = m().compareTo(chronoLocalDateTime.m());
        return (iCompareTo == 0 && (iCompareTo = toLocalTime().compareTo(chronoLocalDateTime.toLocalTime())) == 0) ? g().compareTo(chronoLocalDateTime.g()) : iCompareTo;
    }

    @Override // j$.time.temporal.Temporal
    ChronoLocalDateTime a(long j, j$.time.temporal.n nVar);

    @Override // j$.time.temporal.Temporal
    ChronoLocalDateTime b(long j, TemporalUnit temporalUnit);

    @Override // j$.time.temporal.Temporal
    default ChronoLocalDateTime c(long j, TemporalUnit temporalUnit) {
        return e.x(g(), super.c(j, temporalUnit));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object d(j$.time.f fVar) {
        if (fVar == j$.time.temporal.o.a || fVar == j$.time.temporal.o.e || fVar == j$.time.temporal.o.d) {
            return null;
        }
        if (fVar == j$.time.temporal.o.g) {
            return toLocalTime();
        }
        if (fVar == j$.time.temporal.o.b) {
            return g();
        }
        return fVar == j$.time.temporal.o.c ? ChronoUnit.NANOS : fVar.l(this);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    default Temporal f(Temporal temporal) {
        return temporal.a(m().L(), j$.time.temporal.a.EPOCH_DAY).a(toLocalTime().g0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    default Chronology g() {
        return m().g();
    }

    @Override // j$.time.temporal.Temporal
    default ChronoLocalDateTime j(TemporalAdjuster temporalAdjuster) {
        return e.x(g(), temporalAdjuster.f(this));
    }

    ChronoLocalDate m();

    default long toEpochSecond(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((m().L() * 86400) + ((long) toLocalTime().h0())) - ((long) zoneOffset.b);
    }

    LocalTime toLocalTime();
}
