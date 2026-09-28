package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalUnit;

/* JADX INFO: compiled from: r8-map-id-341f12e635949ce385fe972d9bf062aa0727e156e520e84a100f26e1747f2bcc */
/* JADX INFO: loaded from: classes3.dex */
public interface ChronoZonedDateTime<D extends ChronoLocalDate> extends Temporal, Comparable<ChronoZonedDateTime<?>> {
    ChronoZonedDateTime G(ZoneId zoneId);

    default long Z() {
        return ((m().L() * 86400) + ((long) toLocalTime().h0())) - ((long) o().b);
    }

    @Override // j$.time.temporal.Temporal
    ChronoZonedDateTime a(long j, j$.time.temporal.n nVar);

    @Override // j$.time.temporal.Temporal
    ChronoZonedDateTime b(long j, TemporalUnit temporalUnit);

    @Override // j$.time.temporal.Temporal
    default ChronoZonedDateTime c(long j, TemporalUnit temporalUnit) {
        return i.x(g(), super.c(j, temporalUnit));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object d(j$.time.f fVar) {
        if (fVar == j$.time.temporal.o.e || fVar == j$.time.temporal.o.a) {
            return getZone();
        }
        if (fVar == j$.time.temporal.o.d) {
            return o();
        }
        if (fVar == j$.time.temporal.o.g) {
            return toLocalTime();
        }
        if (fVar == j$.time.temporal.o.b) {
            return g();
        }
        return fVar == j$.time.temporal.o.c ? ChronoUnit.NANOS : fVar.l(this);
    }

    default Chronology g() {
        return m().g();
    }

    ZoneId getZone();

    @Override // j$.time.temporal.TemporalAccessor
    default int h(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return super.h(nVar);
        }
        int i = g.a[((j$.time.temporal.a) nVar).ordinal()];
        if (i != 1) {
            return i != 2 ? y().h(nVar) : o().b;
        }
        throw new j$.time.temporal.p("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    @Override // j$.time.temporal.Temporal
    default ChronoZonedDateTime j(TemporalAdjuster temporalAdjuster) {
        return i.x(g(), temporalAdjuster.f(this));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default long k(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.R(this);
        }
        int i = g.a[((j$.time.temporal.a) nVar).ordinal()];
        if (i != 1) {
            return i != 2 ? y().k(nVar) : o().b;
        }
        return Z();
    }

    @Override // j$.time.temporal.TemporalAccessor
    default j$.time.temporal.q l(j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            return (nVar == j$.time.temporal.a.INSTANT_SECONDS || nVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) nVar).b : y().l(nVar);
        }
        return nVar.C(this);
    }

    default ChronoLocalDate m() {
        return y().m();
    }

    ZoneOffset o();

    ChronoZonedDateTime p(ZoneId zoneId);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    default int compareTo(ChronoZonedDateTime chronoZonedDateTime) {
        int iCompare = Long.compare(Z(), chronoZonedDateTime.Z());
        return (iCompare == 0 && (iCompare = toLocalTime().d - chronoZonedDateTime.toLocalTime().d) == 0 && (iCompare = y().compareTo(chronoZonedDateTime.y())) == 0 && (iCompare = getZone().r().compareTo(chronoZonedDateTime.getZone().r())) == 0) ? g().compareTo(chronoZonedDateTime.g()) : iCompare;
    }

    default Instant toInstant() {
        return Instant.I(Z(), toLocalTime().d);
    }

    default LocalTime toLocalTime() {
        return y().toLocalTime();
    }

    ChronoLocalDateTime y();
}
