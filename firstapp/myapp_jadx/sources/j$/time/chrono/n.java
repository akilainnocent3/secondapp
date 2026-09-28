package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-341f12e635949ce385fe972d9bf062aa0727e156e520e84a100f26e1747f2bcc */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends c {
    private static final long serialVersionUID = -5207853542612002020L;
    public final transient l a;
    public final transient int b;
    public final transient int c;
    public final transient int d;

    public n(l lVar, long j) {
        int i = (int) j;
        lVar.c0();
        if (i < lVar.f || i >= lVar.g) {
            j$.time.h.a("Hijrah date out of range");
            throw null;
        }
        int iBinarySearch = Arrays.binarySearch(lVar.e, i);
        iBinarySearch = iBinarySearch < 0 ? (-iBinarySearch) - 2 : iBinarySearch;
        int[] iArr = {lVar.e0(iBinarySearch), ((lVar.h + iBinarySearch) % 12) + 1, (i - lVar.e[iBinarySearch]) + 1};
        this.a = lVar;
        this.b = iArr[0];
        this.c = iArr[1];
        this.d = iArr[2];
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new b0((byte) 6, this);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final long L() {
        return this.a.f0(this.b, this.c, this.d);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime M(LocalTime localTime) {
        return new e(this, localTime);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j P() {
        return o.AH;
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate R(long j) {
        return j == 0 ? this : c0(Math.addExact(this.b, (int) j), this.c, this.d);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate T(j$.time.temporal.m mVar) {
        return (n) super.T(mVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final int W() {
        return this.a.i0(this.b, 12);
    }

    public final int X() {
        return this.a.i0(this.b, this.c - 1) + this.d;
    }

    @Override // j$.time.chrono.c
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final n I(long j) {
        return new n(this.a, L() + j);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate b(long j, TemporalUnit temporalUnit) {
        return (n) super.b(j, temporalUnit);
    }

    @Override // j$.time.chrono.c
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final n K(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.b) * 12) + ((long) (this.c - 1)) + j;
        l lVar = this.a;
        long jFloorDiv = Math.floorDiv(j2, 12L);
        if (jFloorDiv >= lVar.e0(0) && jFloorDiv <= lVar.e0(lVar.e.length - 1) - 1) {
            return c0((int) jFloorDiv, ((int) Math.floorMod(j2, 12L)) + 1, this.d);
        }
        throw new j$.time.b("Invalid Hijrah year: " + jFloorDiv);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final ChronoLocalDate c(long j, TemporalUnit temporalUnit) {
        return (n) super.c(j, temporalUnit);
    }

    public final n c0(int i, int i2, int i3) {
        int iG0 = this.a.g0(i, i2);
        if (i3 > iG0) {
            i3 = iG0;
        }
        return new n(this.a, i, i2, i3);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final n a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (n) super.a(j, nVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        this.a.A(aVar).b(j, aVar);
        int i = (int) j;
        switch (m.a[aVar.ordinal()]) {
            case 1:
                return c0(this.b, this.c, i);
            case 2:
                return I(Math.min(i, W()) - X());
            case 3:
                return I((j - k(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return I(j - ((long) (((int) Math.floorMod(L() + 3, 7L)) + 1)));
            case 5:
                return I(j - k(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return I(j - k(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new n(this.a, j);
            case 8:
                return I((j - k(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return c0(this.b, i, this.d);
            case 10:
                return K(j - (((((long) this.b) * 12) + ((long) this.c)) - 1));
            case 11:
                if (this.b < 1) {
                    i = 1 - i;
                }
                return c0(i, this.c, this.d);
            case 12:
                return c0(i, this.c, this.d);
            case 13:
                return c0(1 - this.b, this.c, this.d);
            default:
                throw new j$.time.temporal.p(j$.time.c.a("Unsupported field: ", nVar));
        }
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e */
    public final Temporal j(LocalDate localDate) {
        return (n) super.j(localDate);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.b == nVar.b && this.c == nVar.c && this.d == nVar.d && this.a.equals(nVar.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final Chronology g() {
        return this.a;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        this.a.getClass();
        return ((i & (-2048)) ^ 2100100019) ^ (((i << 11) + (i2 << 6)) + i3);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate j(TemporalAdjuster temporalAdjuster) {
        return (n) super.j(temporalAdjuster);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long k(j$.time.temporal.n nVar) {
        int iX;
        int iFloorMod;
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.R(this);
        }
        switch (m.a[((j$.time.temporal.a) nVar).ordinal()]) {
            case 1:
                iX = this.d;
                return iX;
            case 2:
                iX = X();
                return iX;
            case 3:
                iFloorMod = (this.d - 1) / 7;
                iX = iFloorMod + 1;
                return iX;
            case 4:
                iFloorMod = (int) Math.floorMod(L() + 3, 7L);
                iX = iFloorMod + 1;
                return iX;
            case 5:
                iFloorMod = (this.d - 1) % 7;
                iX = iFloorMod + 1;
                return iX;
            case 6:
                iFloorMod = (X() - 1) % 7;
                iX = iFloorMod + 1;
                return iX;
            case 7:
                return L();
            case 8:
                iFloorMod = (X() - 1) / 7;
                iX = iFloorMod + 1;
                return iX;
            case 9:
                iX = this.c;
                return iX;
            case 10:
                return ((((long) this.b) * 12) + ((long) this.c)) - 1;
            case 11:
                iX = this.b;
                return iX;
            case 12:
                iX = this.b;
                return iX;
            case 13:
                return this.b <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.p(j$.time.c.a("Unsupported field: ", nVar));
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
        int i = m.a[aVar.ordinal()];
        if (i == 1) {
            return j$.time.temporal.q.f(1L, this.a.g0(this.b, this.c));
        }
        if (i != 2) {
            return i != 3 ? this.a.A(aVar) : j$.time.temporal.q.f(1L, 5L);
        }
        return j$.time.temporal.q.f(1L, W());
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean z() {
        return this.a.Y(this.b);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final Temporal b(long j, TemporalUnit temporalUnit) {
        return (n) super.b(j, temporalUnit);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final Temporal c(long j, TemporalUnit temporalUnit) {
        return (n) super.c(j, temporalUnit);
    }

    public n(l lVar, int i, int i2, int i3) {
        lVar.f0(i, i2, i3);
        this.a = lVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }
}
