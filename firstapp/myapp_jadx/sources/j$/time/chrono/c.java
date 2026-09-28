package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalUnit;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-341f12e635949ce385fe972d9bf062aa0727e156e520e84a100f26e1747f2bcc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements ChronoLocalDate, Temporal, TemporalAdjuster, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    public static ChronoLocalDate x(Chronology chronology, Temporal temporal) {
        ChronoLocalDate chronoLocalDate = (ChronoLocalDate) temporal;
        if (chronology.equals(chronoLocalDate.g())) {
            return chronoLocalDate;
        }
        j$.time.h.e("Chronology mismatch, expected: ", chronology.r(), chronoLocalDate.g().r());
        return null;
    }

    public final long C(ChronoLocalDate chronoLocalDate) {
        if (g().A(j$.time.temporal.a.MONTH_OF_YEAR).d != 12) {
            throw new IllegalStateException("ChronoLocalDateImpl only supports Chronologies with 12 months per year");
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        long jK = k(aVar) * 32;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_MONTH;
        return (((chronoLocalDate.k(aVar) * 32) + ((long) chronoLocalDate.h(aVar2))) - (jK + ((long) h(aVar2)))) / 32;
    }

    public abstract ChronoLocalDate I(long j);

    public abstract ChronoLocalDate K(long j);

    public abstract ChronoLocalDate R(long j);

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public /* bridge */ /* synthetic */ Temporal a(long j, j$.time.temporal.n nVar) {
        return a(j, nVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public ChronoLocalDate b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return super.b(j, temporalUnit);
        }
        switch (b.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return I(j);
            case 2:
                return I(Math.multiplyExact(j, 7L));
            case 3:
                return K(j);
            case 4:
                return R(j);
            case 5:
                return R(Math.multiplyExact(j, 10L));
            case 6:
                return R(Math.multiplyExact(j, 100L));
            case 7:
                return R(Math.multiplyExact(j, 1000L));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return a(Math.addExact(k(aVar), j), (j$.time.temporal.n) aVar);
            default:
                j$.time.h.d("Unsupported unit: ", temporalUnit);
                return null;
        }
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public /* bridge */ /* synthetic */ Temporal c(long j, TemporalUnit temporalUnit) {
        return c(j, temporalUnit);
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e */
    public /* bridge */ /* synthetic */ Temporal j(LocalDate localDate) {
        return j(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDate) && compareTo((ChronoLocalDate) obj) == 0;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        long jL = L();
        return g().hashCode() ^ ((int) (jL ^ (jL >>> 32)));
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final long n(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        ChronoLocalDate chronoLocalDateJ = g().J(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.requireNonNull(temporalUnit, "unit");
            return temporalUnit.between(this, chronoLocalDateJ);
        }
        switch (b.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return chronoLocalDateJ.L() - L();
            case 2:
                return (chronoLocalDateJ.L() - L()) / 7;
            case 3:
                return C(chronoLocalDateJ);
            case 4:
                return C(chronoLocalDateJ) / 12;
            case 5:
                return C(chronoLocalDateJ) / 120;
            case 6:
                return C(chronoLocalDateJ) / 1200;
            case 7:
                return C(chronoLocalDateJ) / 12000;
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return chronoLocalDateJ.k(aVar) - k(aVar);
            default:
                j$.time.h.d("Unsupported unit: ", temporalUnit);
                return 0L;
        }
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final String toString() {
        long jK = k(j$.time.temporal.a.YEAR_OF_ERA);
        long jK2 = k(j$.time.temporal.a.MONTH_OF_YEAR);
        long jK3 = k(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(g().toString());
        sb.append(" ");
        sb.append(P());
        sb.append(" ");
        sb.append(jK);
        sb.append(jK2 < 10 ? "-0" : "-");
        sb.append(jK2);
        sb.append(jK3 < 10 ? "-0" : "-");
        sb.append(jK3);
        return sb.toString();
    }
}
