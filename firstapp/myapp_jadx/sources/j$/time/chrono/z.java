package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-341f12e635949ce385fe972d9bf062aa0727e156e520e84a100f26e1747f2bcc */
/* JADX INFO: loaded from: classes3.dex */
public final class z extends c {
    private static final long serialVersionUID = 1300372329181994526L;
    public final transient LocalDate a;

    public z(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.a = localDate;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new b0((byte) 7, this);
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate I(long j) {
        return b0(this.a.plusDays(j));
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate K(long j) {
        return b0(this.a.plusMonths(j));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final long L() {
        return this.a.L();
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime M(LocalTime localTime) {
        return new e(this, localTime);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j P() {
        return X() >= 1 ? a0.ROC : a0.BEFORE_ROC;
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate R(long j) {
        return b0(this.a.h0(j));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate T(j$.time.temporal.m mVar) {
        return (z) super.T(mVar);
    }

    public final int X() {
        return this.a.getYear() - 1911;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d  */
    /* JADX WARN: Code duplicated, block: B:18:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    /* JADX WARN: Code duplicated, block: B:24:0x007f  */
    /* JADX WARN: Code duplicated, block: B:26:0x008c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0095  */
    /* JADX WARN: Code duplicated, block: B:29:0x0098  */
    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final z a(long j, j$.time.temporal.n nVar) {
        int iA;
        int i;
        int i2;
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (z) super.a(j, nVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        if (k(aVar) == j) {
            return this;
        }
        int[] iArr = y.a;
        int i3 = iArr[aVar.ordinal()];
        if (i3 == 4) {
            iA = x.d.A(aVar).a(j, aVar);
            i = iArr[aVar.ordinal()];
            if (i != 4) {
                LocalDate localDate = this.a;
                if (X() >= 1) {
                    i2 = iA + 1911;
                } else {
                    i2 = 1912 - iA;
                }
                return b0(localDate.k0(i2));
            }
            if (i != 6) {
                return b0(this.a.k0(iA + 1911));
            }
            if (i == 7) {
                return b0(this.a.k0(1912 - X()));
            }
        } else {
            if (i3 == 5) {
                x.d.A(aVar).b(j, aVar);
                return b0(this.a.plusMonths(j - (((((long) X()) * 12) + ((long) this.a.getMonthValue())) - 1)));
            }
            if (i3 == 6 || i3 == 7) {
                iA = x.d.A(aVar).a(j, aVar);
                i = iArr[aVar.ordinal()];
                if (i != 4) {
                    LocalDate localDate2 = this.a;
                    if (X() >= 1) {
                        i2 = iA + 1911;
                    } else {
                        i2 = 1912 - iA;
                    }
                    return b0(localDate2.k0(i2));
                }
                if (i != 6) {
                    return b0(this.a.k0(iA + 1911));
                }
                if (i == 7) {
                    return b0(this.a.k0(1912 - X()));
                }
            }
        }
        return b0(this.a.a(j, nVar));
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate b(long j, TemporalUnit temporalUnit) {
        return (z) super.b(j, temporalUnit);
    }

    public final z b0(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new z(localDate);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate c(long j, TemporalUnit temporalUnit) {
        return (z) super.c(j, temporalUnit);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e */
    public final Temporal j(LocalDate localDate) {
        return (z) super.j(localDate);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            return this.a.equals(((z) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final Chronology g() {
        return x.d;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        x.d.getClass();
        return this.a.hashCode() ^ (-1990173233);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate j(TemporalAdjuster temporalAdjuster) {
        return (z) super.j(temporalAdjuster);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long k(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.R(this);
        }
        int i = y.a[((j$.time.temporal.a) nVar).ordinal()];
        if (i == 4) {
            int iX = X();
            if (iX < 1) {
                iX = 1 - iX;
            }
            return iX;
        }
        if (i == 5) {
            return ((((long) X()) * 12) + ((long) this.a.getMonthValue())) - 1;
        }
        if (i == 6) {
            return X();
        }
        if (i != 7) {
            return this.a.k(nVar);
        }
        return X() < 1 ? 0 : 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.q l(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.C(this);
        }
        if (!i(nVar)) {
            throw new j$.time.temporal.p(j$.time.c.a("Unsupported field: ", nVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        int i = y.a[aVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.l(nVar);
        }
        if (i != 4) {
            return x.d.A(aVar);
        }
        j$.time.temporal.q qVar = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.q.f(1L, X() <= 0 ? (-qVar.a) + 1912 : qVar.d - 1911);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final Temporal b(long j, TemporalUnit temporalUnit) {
        return (z) super.b(j, temporalUnit);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final Temporal c(long j, TemporalUnit temporalUnit) {
        return (z) super.c(j, temporalUnit);
    }
}
