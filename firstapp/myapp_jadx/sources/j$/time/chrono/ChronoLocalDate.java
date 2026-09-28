package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalUnit;

/* JADX INFO: compiled from: r8-map-id-341f12e635949ce385fe972d9bf062aa0727e156e520e84a100f26e1747f2bcc */
/* JADX INFO: loaded from: classes3.dex */
public interface ChronoLocalDate extends Temporal, TemporalAdjuster, Comparable<ChronoLocalDate> {
    default long L() {
        return k(j$.time.temporal.a.EPOCH_DAY);
    }

    default ChronoLocalDateTime M(LocalTime localTime) {
        return new e(this, localTime);
    }

    default j P() {
        return g().D(h(j$.time.temporal.a.ERA));
    }

    default ChronoLocalDate T(j$.time.temporal.m mVar) {
        return c.x(g(), mVar.x(this));
    }

    default int W() {
        return z() ? 366 : 365;
    }

    @Override // j$.time.temporal.Temporal
    default ChronoLocalDate a(long j, j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.p(j$.time.c.a("Unsupported field: ", nVar));
        }
        return c.x(g(), nVar.X(this, j));
    }

    @Override // j$.time.temporal.Temporal
    default ChronoLocalDate b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return c.x(g(), temporalUnit.x(this, j));
        }
        j$.time.h.d("Unsupported unit: ", temporalUnit);
        return null;
    }

    @Override // j$.time.temporal.Temporal
    default ChronoLocalDate c(long j, TemporalUnit temporalUnit) {
        return c.x(g(), super.c(j, temporalUnit));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    default int compareTo(ChronoLocalDate chronoLocalDate) {
        int iCompare = Long.compare(L(), chronoLocalDate.L());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((a) g()).compareTo(chronoLocalDate.g());
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object d(j$.time.f fVar) {
        if (fVar == j$.time.temporal.o.a || fVar == j$.time.temporal.o.e || fVar == j$.time.temporal.o.d || fVar == j$.time.temporal.o.g) {
            return null;
        }
        if (fVar == j$.time.temporal.o.b) {
            return g();
        }
        return fVar == j$.time.temporal.o.c ? ChronoUnit.DAYS : fVar.l(this);
    }

    boolean equals(Object obj);

    @Override // j$.time.temporal.TemporalAdjuster
    default Temporal f(Temporal temporal) {
        return temporal.a(L(), j$.time.temporal.a.EPOCH_DAY);
    }

    Chronology g();

    int hashCode();

    @Override // j$.time.temporal.TemporalAccessor
    default boolean i(j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) nVar).isDateBased();
        }
        return nVar != null && nVar.x(this);
    }

    @Override // j$.time.temporal.Temporal
    default ChronoLocalDate j(TemporalAdjuster temporalAdjuster) {
        return c.x(g(), temporalAdjuster.f(this));
    }

    @Override // j$.time.temporal.Temporal
    long n(Temporal temporal, TemporalUnit temporalUnit);

    String toString();

    default boolean z() {
        return g().Y(k(j$.time.temporal.a.YEAR));
    }
}
