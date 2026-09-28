package j$.time;

import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-341f12e635949ce385fe972d9bf062aa0727e156e520e84a100f26e1747f2bcc */
/* JADX INFO: loaded from: classes3.dex */
public final class LocalDateTime implements Temporal, TemporalAdjuster, ChronoLocalDateTime<LocalDate>, Serializable {
    public static final LocalDateTime c = K(LocalDate.d, LocalTime.e);
    public static final LocalDateTime d = K(LocalDate.e, LocalTime.MAX);
    private static final long serialVersionUID = 6207766400415563566L;
    public final LocalDate a;
    public final LocalTime b;

    public LocalDateTime(LocalDate localDate, LocalTime localTime) {
        this.a = localDate;
        this.b = localTime;
    }

    public static LocalDateTime C(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof LocalDateTime) {
            return (LocalDateTime) temporalAccessor;
        }
        if (temporalAccessor instanceof ZonedDateTime) {
            return ((ZonedDateTime) temporalAccessor).y();
        }
        if (temporalAccessor instanceof OffsetDateTime) {
            return ((OffsetDateTime) temporalAccessor).toLocalDateTime();
        }
        try {
            return new LocalDateTime(LocalDate.I(temporalAccessor), LocalTime.I(temporalAccessor));
        } catch (b e) {
            h.g("Unable to obtain LocalDateTime from TemporalAccessor: ", temporalAccessor, temporalAccessor.getClass().getName(), e);
            return null;
        }
    }

    public static LocalDateTime K(LocalDate localDate, LocalTime localTime) {
        Objects.requireNonNull(localDate, "date");
        Objects.requireNonNull(localTime, "time");
        return new LocalDateTime(localDate, localTime);
    }

    public static LocalDateTime R(long j, int i, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j2 = i;
        j$.time.temporal.a.NANO_OF_SECOND.a0(j2);
        long j3 = j + ((long) zoneOffset.b);
        return new LocalDateTime(LocalDate.d0(Math.floorDiv(j3, 86400L)), LocalTime.X((((long) ((int) Math.floorMod(j3, 86400L))) * 1000000000) + j2));
    }

    public static LocalDateTime parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDateTime) dateTimeFormatter.a(charSequence, new f(1));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 5, this);
    }

    public final boolean I(ChronoLocalDateTime chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return x((LocalDateTime) chronoLocalDateTime) < 0;
        }
        long jL = this.a.L();
        long jL2 = chronoLocalDateTime.m().L();
        if (jL >= jL2) {
            return jL == jL2 && this.b.g0() < chronoLocalDateTime.toLocalTime().g0();
        }
        return true;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime, java.lang.Comparable
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        return chronoLocalDateTime instanceof LocalDateTime ? x((LocalDateTime) chronoLocalDateTime) : super.compareTo(chronoLocalDateTime);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDateTime) temporalUnit.x(this, j);
        }
        switch (i.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return b0(this.a, 0L, 0L, 0L, j);
            case 2:
                LocalDateTime localDateTimeD0 = d0(this.a.plusDays(j / 86400000000L), this.b);
                return localDateTimeD0.b0(localDateTimeD0.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                LocalDateTime localDateTimeD1 = d0(this.a.plusDays(j / 86400000), this.b);
                return localDateTimeD1.b0(localDateTimeD1.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return a0(j);
            case 5:
                return b0(this.a, 0L, j, 0L, 0L);
            case 6:
                return b0(this.a, j, 0L, 0L, 0L);
            case 7:
                LocalDateTime localDateTimeD2 = d0(this.a.plusDays(j / 256), this.b);
                return localDateTimeD2.b0(localDateTimeD2.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return d0(this.a.b(j, temporalUnit), this.b);
        }
    }

    public final LocalDateTime a0(long j) {
        return b0(this.a, 0L, 0L, j, 0L);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* JADX INFO: renamed from: atZone, reason: merged with bridge method [inline-methods] */
    public ZonedDateTime H(ZoneId zoneId) {
        return ZonedDateTime.K(this, zoneId, null);
    }

    public final LocalDateTime b0(LocalDate localDate, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        LocalTime localTime = this.b;
        if (j5 == 0) {
            return d0(localDate, localTime);
        }
        long j6 = j / 24;
        long jG0 = localTime.g0();
        long j7 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L) + jG0;
        long jFloorDiv = Math.floorDiv(j7, 86400000000000L) + j6 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long jFloorMod = Math.floorMod(j7, 86400000000000L);
        return d0(localDate.plusDays(jFloorDiv), jFloorMod == jG0 ? this.b : LocalTime.X(jFloorMod));
    }

    @Override // j$.time.temporal.Temporal
    public final ChronoLocalDateTime c(long j, TemporalUnit temporalUnit) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = b(Long.MAX_VALUE, temporalUnit);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.b(j2, temporalUnit);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (LocalDateTime) nVar.X(this, j);
        }
        boolean zB0 = ((j$.time.temporal.a) nVar).b0();
        LocalDate localDate = this.a;
        return zB0 ? d0(localDate, this.b.a(j, nVar)) : d0(localDate.a(j, nVar), this.b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(f fVar) {
        return fVar == j$.time.temporal.o.f ? this.a : super.d(fVar);
    }

    public final LocalDateTime d0(LocalDate localDate, LocalTime localTime) {
        return (this.a == localDate && this.b == localTime) ? this : new LocalDateTime(localDate, localTime);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime j(TemporalAdjuster temporalAdjuster) {
        if (temporalAdjuster instanceof LocalDate) {
            return d0((LocalDate) temporalAdjuster, this.b);
        }
        if (temporalAdjuster instanceof LocalTime) {
            return d0(this.a, (LocalTime) temporalAdjuster);
        }
        return temporalAdjuster instanceof LocalDateTime ? (LocalDateTime) temporalAdjuster : (LocalDateTime) temporalAdjuster.f(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.a.equals(localDateTime.a) && this.b.equals(localDateTime.b)) {
                return true;
            }
        }
        return false;
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) nVar).b0() ? this.b.h(nVar) : this.a.h(nVar);
        }
        return super.h(nVar);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean i(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar != null && nVar.x(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        return aVar.isDateBased() || aVar.b0();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long k(j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) nVar).b0() ? this.b.k(nVar) : this.a.k(nVar);
        }
        return nVar.R(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.q l(j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) nVar).b0() ? this.b.l(nVar) : this.a.l(nVar);
        }
        return nVar.C(this);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoLocalDate m() {
        return this.a;
    }

    @Override // j$.time.temporal.Temporal
    public final long n(Temporal temporal, TemporalUnit temporalUnit) {
        long jMultiplyExact;
        long j;
        LocalDateTime localDateTimeC = C(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, localDateTimeC);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        if (chronoUnit.compareTo(ChronoUnit.DAYS) >= 0) {
            LocalDate localDatePlusDays = localDateTimeC.a;
            if (localDatePlusDays.isAfter(this.a) && localDateTimeC.b.compareTo(this.b) < 0) {
                localDatePlusDays = localDatePlusDays.plusDays(-1L);
            } else if (localDatePlusDays.a0(this.a) && localDateTimeC.b.compareTo(this.b) > 0) {
                localDatePlusDays = localDatePlusDays.plusDays(1L);
            }
            return this.a.n(localDatePlusDays, temporalUnit);
        }
        LocalDate localDate = this.a;
        LocalDate localDate2 = localDateTimeC.a;
        localDate.getClass();
        long jL = localDate2.L() - localDate.L();
        if (jL == 0) {
            return this.b.n(localDateTimeC.b, temporalUnit);
        }
        long jG0 = localDateTimeC.b.g0() - this.b.g0();
        if (jL > 0) {
            jMultiplyExact = jL - 1;
            j = jG0 + 86400000000000L;
        } else {
            jMultiplyExact = jL + 1;
            j = jG0 - 86400000000000L;
        }
        switch (i.a[chronoUnit.ordinal()]) {
            case 1:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400000000000L);
                break;
            case 2:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400000000L);
                j /= 1000;
                break;
            case 3:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400000L);
                j /= 1000000;
                break;
            case 4:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400L);
                j /= 1000000000;
                break;
            case 5:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 1440L);
                j /= 60000000000L;
                break;
            case 6:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 24L);
                j /= 3600000000000L;
                break;
            case 7:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 2L);
                j /= 43200000000000L;
                break;
        }
        return Math.addExact(jMultiplyExact, j);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final LocalTime toLocalTime() {
        return this.b;
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    public final int x(LocalDateTime localDateTime) {
        int iX = this.a.x(localDateTime.a);
        return iX == 0 ? this.b.compareTo(localDateTime.b) : iX;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j, TemporalUnit temporalUnit) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = b(Long.MAX_VALUE, temporalUnit);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.b(j2, temporalUnit);
    }
}
