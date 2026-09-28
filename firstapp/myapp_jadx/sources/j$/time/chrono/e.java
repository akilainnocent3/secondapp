package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-341f12e635949ce385fe972d9bf062aa0727e156e520e84a100f26e1747f2bcc */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements ChronoLocalDateTime, Temporal, TemporalAdjuster, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;
    public final transient ChronoLocalDate a;
    public final transient LocalTime b;

    public e(ChronoLocalDate chronoLocalDate, LocalTime localTime) {
        Objects.requireNonNull(localTime, "time");
        this.a = chronoLocalDate;
        this.b = localTime;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new b0((byte) 2, this);
    }

    public static e x(Chronology chronology, Temporal temporal) {
        e eVar = (e) temporal;
        if (chronology.equals(eVar.g())) {
            return eVar;
        }
        j$.time.h.e("Chronology mismatch, required: ", chronology.r(), eVar.g().r());
        return null;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final e b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return x(this.a.g(), temporalUnit.x(this, j));
        }
        switch (d.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return I(this.a, 0L, 0L, 0L, j);
            case 2:
                e eVarR = R(this.a.b(j / 86400000000L, (TemporalUnit) ChronoUnit.DAYS), this.b);
                return eVarR.I(eVarR.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                e eVarR2 = R(this.a.b(j / 86400000, (TemporalUnit) ChronoUnit.DAYS), this.b);
                return eVarR2.I(eVarR2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return I(this.a, 0L, 0L, j, 0L);
            case 5:
                return I(this.a, 0L, j, 0L, 0L);
            case 6:
                return I(this.a, j, 0L, 0L, 0L);
            case 7:
                e eVarR3 = R(this.a.b(j / 256, (TemporalUnit) ChronoUnit.DAYS), this.b);
                return eVarR3.I(eVarR3.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return R(this.a.b(j, temporalUnit), this.b);
        }
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoZonedDateTime H(ZoneId zoneId) {
        return i.C(zoneId, null, this);
    }

    public final e I(ChronoLocalDate chronoLocalDate, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        LocalTime localTime = this.b;
        if (j5 == 0) {
            return R(chronoLocalDate, localTime);
        }
        long j6 = j / 24;
        long jG0 = localTime.g0();
        long j7 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L) + jG0;
        long jFloorDiv = Math.floorDiv(j7, 86400000000000L) + j6 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long jFloorMod = Math.floorMod(j7, 86400000000000L);
        return R(chronoLocalDate.b(jFloorDiv, (TemporalUnit) ChronoUnit.DAYS), jFloorMod == jG0 ? this.b : LocalTime.X(jFloorMod));
    }

    @Override // j$.time.chrono.ChronoLocalDateTime, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final e a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return x(this.a.g(), nVar.X(this, j));
        }
        boolean zB0 = ((j$.time.temporal.a) nVar).b0();
        ChronoLocalDate chronoLocalDate = this.a;
        return zB0 ? R(chronoLocalDate, this.b.a(j, nVar)) : R(chronoLocalDate.a(j, nVar), this.b);
    }

    public final e R(Temporal temporal, LocalTime localTime) {
        ChronoLocalDate chronoLocalDate = this.a;
        return (chronoLocalDate == temporal && this.b == localTime) ? this : new e(c.x(chronoLocalDate.g(), temporal), localTime);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final e j(TemporalAdjuster temporalAdjuster) {
        if (temporalAdjuster instanceof ChronoLocalDate) {
            return R((ChronoLocalDate) temporalAdjuster, this.b);
        }
        boolean z = temporalAdjuster instanceof LocalTime;
        ChronoLocalDate chronoLocalDate = this.a;
        if (z) {
            return R(chronoLocalDate, (LocalTime) temporalAdjuster);
        }
        return temporalAdjuster instanceof e ? x(chronoLocalDate.g(), (e) temporalAdjuster) : x(chronoLocalDate.g(), (e) temporalAdjuster.f(this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDateTime) && compareTo((ChronoLocalDateTime) obj) == 0;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) nVar).b0() ? this.b.h(nVar) : this.a.h(nVar);
        }
        return l(nVar).a(k(nVar), nVar);
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
            return (((j$.time.temporal.a) nVar).b0() ? this.b : this.a).l(nVar);
        }
        return nVar.C(this);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoLocalDate m() {
        return this.a;
    }

    @Override // j$.time.temporal.Temporal
    public final long n(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        ChronoLocalDateTime chronoLocalDateTimeW = g().w(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.requireNonNull(temporalUnit, "unit");
            return temporalUnit.between(this, chronoLocalDateTimeW);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        ChronoUnit chronoUnit2 = ChronoUnit.DAYS;
        if (chronoUnit.compareTo(chronoUnit2) >= 0) {
            ChronoLocalDate chronoLocalDateM = chronoLocalDateTimeW.m();
            if (chronoLocalDateTimeW.toLocalTime().compareTo(this.b) < 0) {
                chronoLocalDateM = chronoLocalDateM.c(1L, (TemporalUnit) chronoUnit2);
            }
            return this.a.n(chronoLocalDateM, temporalUnit);
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        long jK = chronoLocalDateTimeW.k(aVar) - this.a.k(aVar);
        switch (d.a[chronoUnit.ordinal()]) {
            case 1:
                jK = Math.multiplyExact(jK, 86400000000000L);
                break;
            case 2:
                jK = Math.multiplyExact(jK, 86400000000L);
                break;
            case 3:
                jK = Math.multiplyExact(jK, 86400000L);
                break;
            case 4:
                jK = Math.multiplyExact(jK, 86400L);
                break;
            case 5:
                jK = Math.multiplyExact(jK, 1440L);
                break;
            case 6:
                jK = Math.multiplyExact(jK, 24L);
                break;
            case 7:
                jK = Math.multiplyExact(jK, 2L);
                break;
        }
        return Math.addExact(jK, this.b.n(chronoLocalDateTimeW.toLocalTime(), temporalUnit));
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final LocalTime toLocalTime() {
        return this.b;
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }
}
