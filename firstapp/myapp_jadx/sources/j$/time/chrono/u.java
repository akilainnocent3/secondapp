package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: compiled from: r8-map-id-341f12e635949ce385fe972d9bf062aa0727e156e520e84a100f26e1747f2bcc */
/* JADX INFO: loaded from: classes3.dex */
public final class u extends c {
    public static final LocalDate d = LocalDate.of(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;
    public final transient LocalDate a;
    public final transient v b;
    public final transient int c;

    public u(LocalDate localDate) {
        if (localDate.a0(d)) {
            j$.time.h.a("JapaneseDate before Meiji 6 is not supported");
            throw null;
        }
        v vVarQ = v.q(localDate);
        this.b = vVarQ;
        this.c = (localDate.getYear() - vVarQ.b.getYear()) + 1;
        this.a = localDate;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new b0((byte) 4, this);
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate I(long j) {
        return c0(this.a.plusDays(j));
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate K(long j) {
        return c0(this.a.plusMonths(j));
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
        return this.b;
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate R(long j) {
        return c0(this.a.h0(j));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate T(j$.time.temporal.m mVar) {
        return (u) super.T(mVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final int W() {
        v vVarR = this.b.r();
        int iW = (vVarR == null || vVarR.b.getYear() != this.a.getYear()) ? this.a.W() : vVarR.b.R() - 1;
        return this.c == 1 ? iW - (this.b.b.R() - 1) : iW;
    }

    public final u X(long j, ChronoUnit chronoUnit) {
        return (u) super.b(j, (TemporalUnit) chronoUnit);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final u a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (u) super.a(j, nVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        if (k(aVar) == j) {
            return this;
        }
        int[] iArr = t.a;
        int i = iArr[aVar.ordinal()];
        if (i == 3 || i == 8 || i == 9) {
            s sVar = s.d;
            int iA = sVar.A(aVar).a(j, aVar);
            int i2 = iArr[aVar.ordinal()];
            if (i2 == 3) {
                return c0(this.a.k0(sVar.F(this.b, iA)));
            }
            if (i2 == 8) {
                return c0(this.a.k0(sVar.F(v.s(iA), this.c)));
            }
            if (i2 == 9) {
                return c0(this.a.k0(iA));
            }
        }
        return c0(this.a.a(j, nVar));
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate b(long j, TemporalUnit temporalUnit) {
        return (u) super.b(j, temporalUnit);
    }

    public final u b0(j$.time.f fVar) {
        return (u) super.j(fVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate c(long j, TemporalUnit temporalUnit) {
        return (u) super.c(j, temporalUnit);
    }

    public final u c0(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new u(localDate);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e */
    public final Temporal j(LocalDate localDate) {
        return (u) super.j(localDate);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            return this.a.equals(((u) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final Chronology g() {
        return s.d;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        s.d.getClass();
        return this.a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.TemporalAccessor
    public final boolean i(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || nVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || nVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || nVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (nVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) nVar).isDateBased();
        }
        return nVar != null && nVar.x(this);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate j(TemporalAdjuster temporalAdjuster) {
        return (u) super.j(temporalAdjuster);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long k(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.R(this);
        }
        switch (t.a[((j$.time.temporal.a) nVar).ordinal()]) {
            case 2:
                int i = this.c;
                LocalDate localDate = this.a;
                return i == 1 ? (localDate.R() - this.b.b.R()) + 1 : localDate.R();
            case 3:
                return this.c;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.p(j$.time.c.a("Unsupported field: ", nVar));
            case 8:
                return this.b.a;
            default:
                return this.a.k(nVar);
        }
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
        int i = t.a[aVar.ordinal()];
        if (i == 1) {
            return j$.time.temporal.q.f(1L, this.a.lengthOfMonth());
        }
        if (i == 2) {
            return j$.time.temporal.q.f(1L, W());
        }
        if (i != 3) {
            return s.d.A(aVar);
        }
        int year = this.b.b.getYear();
        v vVarR = this.b.r();
        return vVarR != null ? j$.time.temporal.q.f(1L, (vVarR.b.getYear() - year) + 1) : j$.time.temporal.q.f(1L, 999999999 - year);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final Temporal b(long j, TemporalUnit temporalUnit) {
        return (u) super.b(j, temporalUnit);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final Temporal c(long j, TemporalUnit temporalUnit) {
        return (u) super.c(j, temporalUnit);
    }

    public u(v vVar, int i, LocalDate localDate) {
        if (!localDate.a0(d)) {
            this.b = vVar;
            this.c = i;
            this.a = localDate;
            return;
        }
        j$.time.h.a("JapaneseDate before Meiji 6 is not supported");
        throw null;
    }
}
