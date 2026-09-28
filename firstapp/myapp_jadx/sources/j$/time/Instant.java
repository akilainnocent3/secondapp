package j$.time;

import com.sportybet.plugin.realsports.data.CashOut;
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
public final class Instant implements Temporal, TemporalAdjuster, Comparable<Instant>, Serializable {
    public static final Instant c = new Instant(0, 0);
    private static final long serialVersionUID = -665713676816604388L;
    public final long a;
    public final int b;

    static {
        I(-31557014167219200L, 0L);
        I(31556889864403199L, 999999999L);
    }

    public Instant(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public static Instant C(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Instant) {
            return (Instant) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            return I(temporalAccessor.k(j$.time.temporal.a.INSTANT_SECONDS), temporalAccessor.h(j$.time.temporal.a.NANO_OF_SECOND));
        } catch (b e) {
            h.g("Unable to obtain Instant from TemporalAccessor: ", temporalAccessor, temporalAccessor.getClass().getName(), e);
            return null;
        }
    }

    public static Instant I(long j, long j2) {
        return x(Math.addExact(j, Math.floorDiv(j2, 1000000000L)), (int) Math.floorMod(j2, 1000000000L));
    }

    public static Instant now() {
        return Clock.systemUTC().instant();
    }

    public static Instant ofEpochMilli(long j) {
        return x(Math.floorDiv(j, 1000L), ((int) Math.floorMod(j, 1000L)) * CashOut.BIG_NUMBER);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 2, this);
    }

    public static Instant x(long j, int i) {
        if ((((long) i) | j) == 0) {
            return c;
        }
        if (j >= -31557014167219200L && j <= 31556889864403199L) {
            return new Instant(j, i);
        }
        h.a("Instant exceeds minimum or maximum instant");
        return null;
    }

    public final Instant K(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return I(Math.addExact(Math.addExact(this.a, j), j2 / 1000000000), ((long) this.b) + (j2 % 1000000000));
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final Instant b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (Instant) temporalUnit.x(this, j);
        }
        switch (e.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return K(0L, j);
            case 2:
                return K(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return K(j / 1000, (j % 1000) * 1000000);
            case 4:
                return K(j, 0L);
            case 5:
                return K(Math.multiplyExact(j, 60L), 0L);
            case 6:
                return K(Math.multiplyExact(j, 3600L), 0L);
            case 7:
                return K(Math.multiplyExact(j, 43200L), 0L);
            case 8:
                return K(Math.multiplyExact(j, 86400L), 0L);
            default:
                h.d("Unsupported unit: ", temporalUnit);
                return null;
        }
    }

    public final long X(Instant instant) {
        long jSubtractExact = Math.subtractExact(instant.a, this.a);
        long j = instant.b - this.b;
        if (jSubtractExact <= 0 || j >= 0) {
            return (jSubtractExact >= 0 || j <= 0) ? jSubtractExact : jSubtractExact + 1;
        }
        return jSubtractExact - 1;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (Instant) nVar.X(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        aVar.a0(j);
        int i = e.a[aVar.ordinal()];
        if (i == 1) {
            return j != ((long) this.b) ? x(this.a, (int) j) : this;
        }
        if (i == 2) {
            int i2 = ((int) j) * 1000;
            return i2 != this.b ? x(this.a, i2) : this;
        }
        if (i == 3) {
            int i3 = ((int) j) * CashOut.BIG_NUMBER;
            return i3 != this.b ? x(this.a, i3) : this;
        }
        if (i == 4) {
            return j != this.a ? x(j, this.b) : this;
        }
        throw new j$.time.temporal.p(c.a("Unsupported field: ", nVar));
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.x(this, zoneOffset);
    }

    public ZonedDateTime atZone(ZoneId zoneId) {
        return ZonedDateTime.I(this, zoneId);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int iCompare = Long.compare(this.a, instant2.a);
        return iCompare != 0 ? iCompare : this.b - instant2.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(f fVar) {
        if (fVar == j$.time.temporal.o.c) {
            return ChronoUnit.NANOS;
        }
        if (fVar == j$.time.temporal.o.b || fVar == j$.time.temporal.o.a || fVar == j$.time.temporal.o.e || fVar == j$.time.temporal.o.d || fVar == j$.time.temporal.o.f || fVar == j$.time.temporal.o.g) {
            return null;
        }
        return fVar.l(this);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e */
    public final Temporal j(LocalDate localDate) {
        return (Instant) localDate.f(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.a == instant.a && this.b == instant.b) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final Temporal f(Temporal temporal) {
        return temporal.a(this.a, j$.time.temporal.a.INSTANT_SECONDS).a(this.b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    public long getEpochSecond() {
        return this.a;
    }

    public int getNano() {
        return this.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return super.l(nVar).a(nVar.R(this), nVar);
        }
        int i = e.a[((j$.time.temporal.a) nVar).ordinal()];
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return this.b / 1000;
        }
        if (i == 3) {
            return this.b / CashOut.BIG_NUMBER;
        }
        if (i == 4) {
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            aVar.b.a(this.a, aVar);
        }
        throw new j$.time.temporal.p(c.a("Unsupported field: ", nVar));
    }

    public final int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean i(j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            return nVar == j$.time.temporal.a.INSTANT_SECONDS || nVar == j$.time.temporal.a.NANO_OF_SECOND || nVar == j$.time.temporal.a.MICRO_OF_SECOND || nVar == j$.time.temporal.a.MILLI_OF_SECOND;
        }
        return nVar != null && nVar.x(this);
    }

    public boolean isBefore(Instant instant) {
        int iCompare = Long.compare(this.a, instant.a);
        if (iCompare == 0) {
            iCompare = this.b - instant.b;
        }
        return iCompare < 0;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long k(j$.time.temporal.n nVar) {
        int i;
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.R(this);
        }
        int i2 = e.a[((j$.time.temporal.a) nVar).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else if (i2 == 2) {
            i = this.b / 1000;
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    return this.a;
                }
                throw new j$.time.temporal.p(c.a("Unsupported field: ", nVar));
            }
            i = this.b / CashOut.BIG_NUMBER;
        }
        return i;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: minus, reason: merged with bridge method [inline-methods] */
    public Instant c(long j, TemporalUnit temporalUnit) {
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
    public final long n(Temporal temporal, TemporalUnit temporalUnit) {
        Instant instantC = C(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, instantC);
        }
        switch (e.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return Math.addExact(Math.multiplyExact(Math.subtractExact(instantC.a, this.a), 1000000000L), instantC.b - this.b);
            case 2:
                return Math.addExact(Math.multiplyExact(Math.subtractExact(instantC.a, this.a), 1000000000L), instantC.b - this.b) / 1000;
            case 3:
                return Math.subtractExact(instantC.toEpochMilli(), toEpochMilli());
            case 4:
                return X(instantC);
            case 5:
                return X(instantC) / 60;
            case 6:
                return X(instantC) / 3600;
            case 7:
                return X(instantC) / 43200;
            case 8:
                return X(instantC) / 86400;
            default:
                h.d("Unsupported unit: ", temporalUnit);
                return 0L;
        }
    }

    public long toEpochMilli() {
        long j = this.a;
        return (j >= 0 || this.b <= 0) ? Math.addExact(Math.multiplyExact(j, 1000L), this.b / CashOut.BIG_NUMBER) : Math.addExact(Math.multiplyExact(j + 1, 1000L), (this.b / CashOut.BIG_NUMBER) - 1000);
    }

    public final String toString() {
        return DateTimeFormatter.f.format(this);
    }
}
