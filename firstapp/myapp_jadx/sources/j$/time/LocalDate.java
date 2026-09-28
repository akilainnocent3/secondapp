package j$.time;

import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
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
public final class LocalDate implements Temporal, TemporalAdjuster, ChronoLocalDate, Serializable {
    public static final LocalDate d = of(-999999999, 1, 1);
    public static final LocalDate e = of(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;
    public final int a;
    public final short b;
    public final short c;

    static {
        of(1970, 1, 1);
    }

    public LocalDate(int i, int i2, int i3) {
        this.a = i;
        this.b = (short) i2;
        this.c = (short) i3;
    }

    public static LocalDate C(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else if (j$.time.chrono.p.d.Y(i)) {
                i4 = 29;
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    h.c("Invalid date 'February 29' as '", i, "' is not a leap year");
                    return null;
                }
                throw new b("Invalid date '" + Month.K(i2).name() + " " + i3 + "'");
            }
        }
        return new LocalDate(i, i2, i3);
    }

    public static LocalDate I(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        LocalDate localDate = (LocalDate) temporalAccessor.d(j$.time.temporal.o.f);
        if (localDate != null) {
            return localDate;
        }
        h.f("Unable to obtain LocalDate from TemporalAccessor: ", temporalAccessor, " of type ", temporalAccessor.getClass().getName());
        return null;
    }

    public static LocalDate d0(long j) {
        long j2;
        j$.time.temporal.a.EPOCH_DAY.a0(j);
        long j3 = 719468 + j;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        int i3 = ((i2 + 2) % 12) + 1;
        int i4 = (i - (((i2 * 306) + 5) / 10)) + 1;
        long j7 = j5 + j2 + ((long) (i2 / 10));
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return new LocalDate(aVar.b.a(j7, aVar), i3, i4);
    }

    public static LocalDate e0(int i, int i2) {
        long j = i;
        j$.time.temporal.a.YEAR.a0(j);
        j$.time.temporal.a.DAY_OF_YEAR.a0(i2);
        boolean zY = j$.time.chrono.p.d.Y(j);
        if (i2 == 366 && !zY) {
            h.c("Invalid date 'DayOfYear 366' as '", i, "' is not a leap year");
            return null;
        }
        Month monthK = Month.K(((i2 - 1) / 31) + 1);
        if (i2 > (monthK.C(zY) + monthK.x(zY)) - 1) {
            monthK = Month.a[(monthK.ordinal() + 13) % 12];
        }
        return new LocalDate(i, monthK.getValue(), (i2 - monthK.x(zY)) + 1);
    }

    public static LocalDate i0(int i, int i2, int i3) {
        if (i2 == 2) {
            i3 = Math.min(i3, j$.time.chrono.p.d.Y((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return new LocalDate(i, i2, i3);
    }

    public static LocalDate now(Clock clock) {
        Objects.requireNonNull(clock, "clock");
        Instant instant = clock.instant();
        ZoneId zoneIdA = clock.a();
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneIdA, "zone");
        return d0(Math.floorDiv(instant.getEpochSecond() + ((long) zoneIdA.C().d(instant).b), 86400L));
    }

    public static LocalDate of(int i, int i2, int i3) {
        j$.time.temporal.a.YEAR.a0(i);
        j$.time.temporal.a.MONTH_OF_YEAR.a0(i2);
        j$.time.temporal.a.DAY_OF_MONTH.a0(i3);
        return C(i, i2, i3);
    }

    public static LocalDate parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDate) dateTimeFormatter.a(charSequence, new f(0));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 3, this);
    }

    public final int K(j$.time.temporal.n nVar) {
        switch (g.a[((j$.time.temporal.a) nVar).ordinal()]) {
            case 1:
                return this.c;
            case 2:
                return R();
            case 3:
                return ((this.c - 1) / 7) + 1;
            case 4:
                int i = this.a;
                return i >= 1 ? i : 1 - i;
            case 5:
                return getDayOfWeek().getValue();
            case 6:
                return ((this.c - 1) % 7) + 1;
            case 7:
                return ((R() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.p("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((R() - 1) / 7) + 1;
            case 10:
                return this.b;
            case 11:
                throw new j$.time.temporal.p("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.a;
            case 13:
                return this.a >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.p(c.a("Unsupported field: ", nVar));
        }
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final long L() {
        long j;
        long j2 = this.a;
        long j3 = this.b;
        long j4 = 365 * j2;
        if (j2 >= 0) {
            j = ((j2 + 399) / 400) + (((3 + j2) / 4) - ((99 + j2) / 100)) + j4;
        } else {
            j = j4 - ((j2 / (-400)) + ((j2 / (-4)) - (j2 / (-100))));
        }
        long j5 = (((367 * j3) - 362) / 12) + j + ((long) (this.c - 1));
        if (j3 > 2) {
            j5 = !z() ? j5 - 2 : j5 - 1;
        }
        return j5 - 719528;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.j P() {
        return getYear() >= 1 ? j$.time.chrono.q.CE : j$.time.chrono.q.BCE;
    }

    public final int R() {
        return (getMonth().x(z()) + this.c) - 1;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate T(j$.time.temporal.m mVar) {
        q qVar = (q) mVar;
        return plusMonths((((long) qVar.a) * 12) + ((long) qVar.b)).plusDays(qVar.c);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final int W() {
        return z() ? 366 : 365;
    }

    public final long X() {
        return ((((long) this.a) * 12) + ((long) this.b)) - 1;
    }

    public final boolean a0(ChronoLocalDate chronoLocalDate) {
        if (chronoLocalDate instanceof LocalDate) {
            return x((LocalDate) chronoLocalDate) < 0;
        }
        return L() < chronoLocalDate.L();
    }

    public ZonedDateTime atStartOfDay(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        LocalDateTime localDateTimeM = M(LocalTime.MIDNIGHT);
        if (!(zoneId instanceof ZoneOffset)) {
            Object objE = zoneId.C().e(localDateTimeM);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            if (bVar != null && bVar.x()) {
                localDateTimeM = bVar.b.a0(bVar.d.b - bVar.c.b);
            }
        }
        return ZonedDateTime.K(localDateTimeM, zoneId, null);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: atTime, reason: merged with bridge method [inline-methods] */
    public LocalDateTime M(LocalTime localTime) {
        return LocalDateTime.K(this, localTime);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final LocalDate c(long j, TemporalUnit temporalUnit) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = b(Long.MAX_VALUE, temporalUnit);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.b(j2, temporalUnit);
    }

    public final long c0(LocalDate localDate) {
        return (((localDate.X() * 32) + ((long) localDate.getDayOfMonth())) - ((X() * 32) + ((long) getDayOfMonth()))) / 32;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // j$.time.chrono.ChronoLocalDate, java.lang.Comparable
    public int compareTo(ChronoLocalDate chronoLocalDate) {
        return chronoLocalDate instanceof LocalDate ? x((LocalDate) chronoLocalDate) : super.compareTo(chronoLocalDate);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(f fVar) {
        return fVar == j$.time.temporal.o.f ? this : super.d(fVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDate) && x((LocalDate) obj) == 0;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public final LocalDate b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDate) temporalUnit.x(this, j);
        }
        switch (g.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return plusDays(j);
            case 2:
                return g0(j);
            case 3:
                return plusMonths(j);
            case 4:
                return h0(j);
            case 5:
                return h0(Math.multiplyExact(j, 10L));
            case 6:
                return h0(Math.multiplyExact(j, 100L));
            case 7:
                return h0(Math.multiplyExact(j, 1000L));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return a(Math.addExact(k(aVar), j), aVar);
            default:
                h.d("Unsupported unit: ", temporalUnit);
                return null;
        }
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final Chronology g() {
        return j$.time.chrono.p.d;
    }

    public final LocalDate g0(long j) {
        return plusDays(Math.multiplyExact(j, 7L));
    }

    public int getDayOfMonth() {
        return this.c;
    }

    public DayOfWeek getDayOfWeek() {
        return DayOfWeek.x(((int) Math.floorMod(L() + 3, 7L)) + 1);
    }

    public Month getMonth() {
        return Month.K(this.b);
    }

    public int getMonthValue() {
        return this.b;
    }

    public int getYear() {
        return this.a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? K(nVar) : super.h(nVar);
    }

    public final LocalDate h0(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return i0(aVar.b.a(((long) this.a) + j, aVar), this.b, this.c);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        int i = this.a;
        return (i & (-2048)) ^ (((i << 11) + (this.b << 6)) + this.c);
    }

    public boolean isAfter(ChronoLocalDate chronoLocalDate) {
        if (chronoLocalDate instanceof LocalDate) {
            return x((LocalDate) chronoLocalDate) > 0;
        }
        return L() > chronoLocalDate.L();
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public final LocalDate a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (LocalDate) nVar.X(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        aVar.a0(j);
        switch (g.a[aVar.ordinal()]) {
            case 1:
                int i = (int) j;
                if (this.c != i) {
                    return of(this.a, this.b, i);
                }
                return this;
            case 2:
                int i2 = (int) j;
                if (R() != i2) {
                    return e0(this.a, i2);
                }
                return this;
            case 3:
                return g0(j - k(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (this.a < 1) {
                    j = 1 - j;
                }
                return k0((int) j);
            case 5:
                return plusDays(j - ((long) getDayOfWeek().getValue()));
            case 6:
                return plusDays(j - k(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return plusDays(j - k(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return d0(j);
            case 9:
                return g0(j - k(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i3 = (int) j;
                if (this.b != i3) {
                    j$.time.temporal.a.MONTH_OF_YEAR.a0(i3);
                    return i0(this.a, i3, this.c);
                }
                return this;
            case 11:
                return plusMonths(j - X());
            case 12:
                return k0((int) j);
            case 13:
                if (k(j$.time.temporal.a.ERA) != j) {
                    return k0(1 - this.a);
                }
                return this;
            default:
                throw new j$.time.temporal.p(c.a("Unsupported field: ", nVar));
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long k(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.R(this);
        }
        if (nVar == j$.time.temporal.a.EPOCH_DAY) {
            return L();
        }
        return nVar == j$.time.temporal.a.PROLEPTIC_MONTH ? X() : K(nVar);
    }

    public final LocalDate k0(int i) {
        if (this.a == i) {
            return this;
        }
        j$.time.temporal.a.YEAR.a0(i);
        return i0(i, this.b, this.c);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.q l(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.C(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        if (!aVar.isDateBased()) {
            throw new j$.time.temporal.p(c.a("Unsupported field: ", nVar));
        }
        int i = g.a[aVar.ordinal()];
        if (i == 1) {
            return j$.time.temporal.q.f(1L, lengthOfMonth());
        }
        if (i == 2) {
            return j$.time.temporal.q.f(1L, W());
        }
        if (i == 3) {
            return j$.time.temporal.q.f(1L, (getMonth() != Month.FEBRUARY || z()) ? 5L : 4L);
        }
        if (i != 4) {
            return aVar.b;
        }
        return getYear() <= 0 ? j$.time.temporal.q.f(1L, 1000000000L) : j$.time.temporal.q.f(1L, 999999999L);
    }

    public int lengthOfMonth() {
        short s = this.b;
        if (s != 2) {
            return (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31;
        }
        return z() ? 29 : 28;
    }

    @Override // j$.time.temporal.Temporal
    public final long n(Temporal temporal, TemporalUnit temporalUnit) {
        LocalDate localDateI = I(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, localDateI);
        }
        switch (g.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return localDateI.L() - L();
            case 2:
                return (localDateI.L() - L()) / 7;
            case 3:
                return c0(localDateI);
            case 4:
                return c0(localDateI) / 12;
            case 5:
                return c0(localDateI) / 120;
            case 6:
                return c0(localDateI) / 1200;
            case 7:
                return c0(localDateI) / 12000;
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return localDateI.k(aVar) - k(aVar);
            default:
                h.d("Unsupported unit: ", temporalUnit);
                return 0L;
        }
    }

    public LocalDate plusDays(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = ((long) this.c) + j;
        if (j2 > 0) {
            if (j2 <= 28) {
                return new LocalDate(this.a, this.b, (int) j2);
            }
            if (j2 <= 59) {
                long jLengthOfMonth = lengthOfMonth();
                if (j2 <= jLengthOfMonth) {
                    return new LocalDate(this.a, this.b, (int) j2);
                }
                short s = this.b;
                if (s < 12) {
                    return new LocalDate(this.a, s + 1, (int) (j2 - jLengthOfMonth));
                }
                j$.time.temporal.a.YEAR.a0(this.a + 1);
                return new LocalDate(this.a + 1, 1, (int) (j2 - jLengthOfMonth));
            }
        }
        return d0(Math.addExact(L(), j));
    }

    public LocalDate plusMonths(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.a) * 12) + ((long) (this.b - 1)) + j;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return i0(aVar.b.a(Math.floorDiv(j2, 12L), aVar), ((int) Math.floorMod(j2, 12L)) + 1, this.c);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public String toString() {
        int i = this.a;
        short s = this.b;
        short s2 = this.c;
        int iAbs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        sb.append(s2 < 10 ? "-0" : "-");
        sb.append((int) s2);
        return sb.toString();
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: with, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LocalDate j(TemporalAdjuster temporalAdjuster) {
        return temporalAdjuster instanceof LocalDate ? (LocalDate) temporalAdjuster : (LocalDate) temporalAdjuster.f(this);
    }

    public final int x(LocalDate localDate) {
        int i = this.a - localDate.a;
        return (i == 0 && (i = this.b - localDate.b) == 0) ? this.c - localDate.c : i;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean z() {
        return j$.time.chrono.p.d.Y(this.a);
    }

    public static LocalDate now(ZoneId zoneId) {
        a aVar;
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId == ZoneOffset.UTC) {
            aVar = a.b;
        } else {
            aVar = new a(zoneId);
        }
        return now(aVar);
    }

    public static LocalDate now() {
        return now(Clock.b());
    }

    public LocalDateTime atStartOfDay() {
        return LocalDateTime.K(this, LocalTime.MIDNIGHT);
    }
}
