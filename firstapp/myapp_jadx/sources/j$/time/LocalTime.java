package j$.time;

import com.sportybet.plugin.realsports.data.CashOut;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalUnit;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: compiled from: r8-map-id-341f12e635949ce385fe972d9bf062aa0727e156e520e84a100f26e1747f2bcc */
/* JADX INFO: loaded from: classes3.dex */
public final class LocalTime implements Temporal, TemporalAdjuster, Comparable<LocalTime>, Serializable {
    public static final LocalTime MAX;
    public static final LocalTime MIDNIGHT;
    public static final LocalTime e;
    public static final LocalTime[] f = new LocalTime[24];
    private static final long serialVersionUID = 6414437269572265201L;
    public final byte a;
    public final byte b;
    public final byte c;
    public final int d;

    static {
        int i = 0;
        while (true) {
            LocalTime[] localTimeArr = f;
            if (i >= localTimeArr.length) {
                LocalTime localTime = localTimeArr[0];
                MIDNIGHT = localTime;
                LocalTime localTime2 = localTimeArr[12];
                e = localTime;
                MAX = new LocalTime(23, 59, 59, 999999999);
                return;
            }
            localTimeArr[i] = new LocalTime(i, 0, 0, 0);
            i++;
        }
    }

    public LocalTime(int i, int i2, int i3, int i4) {
        this.a = (byte) i;
        this.b = (byte) i2;
        this.c = (byte) i3;
        this.d = i4;
    }

    public static LocalTime C(int i, int i2, int i3, int i4) {
        return ((i2 | i3) | i4) == 0 ? f[i] : new LocalTime(i, i2, i3, i4);
    }

    public static LocalTime I(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        LocalTime localTime = (LocalTime) temporalAccessor.d(j$.time.temporal.o.g);
        if (localTime != null) {
            return localTime;
        }
        h.f("Unable to obtain LocalTime from TemporalAccessor: ", temporalAccessor, " of type ", temporalAccessor.getClass().getName());
        return null;
    }

    public static LocalTime R(int i, int i2, int i3, int i4) {
        j$.time.temporal.a.HOUR_OF_DAY.a0(i);
        j$.time.temporal.a.MINUTE_OF_HOUR.a0(i2);
        j$.time.temporal.a.SECOND_OF_MINUTE.a0(i3);
        j$.time.temporal.a.NANO_OF_SECOND.a0(i4);
        return C(i, i2, i3, i4);
    }

    public static LocalTime X(long j) {
        j$.time.temporal.a.NANO_OF_DAY.a0(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (((long) i) * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (((long) i2) * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return C(i, i2, i3, (int) (j3 - (((long) i3) * 1000000000)));
    }

    public static LocalTime f0(DataInput dataInput) throws IOException {
        int i;
        int i2;
        int i3 = dataInput.readByte();
        int i4 = 0;
        if (i3 < 0) {
            i3 = ~i3;
            i2 = 0;
            i = 0;
        } else {
            byte b = dataInput.readByte();
            if (b < 0) {
                int i5 = ~b;
                i = 0;
                i4 = i5;
                i2 = 0;
            } else {
                byte b2 = dataInput.readByte();
                if (b2 < 0) {
                    i2 = ~b2;
                    i = 0;
                    i4 = b;
                } else {
                    i = dataInput.readInt();
                    i4 = b;
                    i2 = b2;
                }
            }
        }
        return R(i3, i4, i2, i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 4, this);
    }

    public final int K(j$.time.temporal.n nVar) {
        switch (j.a[((j$.time.temporal.a) nVar).ordinal()]) {
            case 1:
                return this.d;
            case 2:
                throw new j$.time.temporal.p("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return this.d / 1000;
            case 4:
                throw new j$.time.temporal.p("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return this.d / CashOut.BIG_NUMBER;
            case 6:
                return (int) (g0() / 1000000);
            case 7:
                return this.c;
            case 8:
                return h0();
            case 9:
                return this.b;
            case 10:
                return (this.a * 60) + this.b;
            case 11:
                return this.a % 12;
            case 12:
                int i = this.a % 12;
                if (i % 12 == 0) {
                    return 12;
                }
                return i;
            case 13:
                return this.a;
            case 14:
                byte b = this.a;
                if (b == 0) {
                    return 24;
                }
                return b;
            case 15:
                return this.a / 12;
            default:
                throw new j$.time.temporal.p(c.a("Unsupported field: ", nVar));
        }
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final LocalTime b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalTime) temporalUnit.x(this, j);
        }
        switch (j.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return d0(j);
            case 2:
                return d0((j % 86400000000L) * 1000);
            case 3:
                return d0((j % 86400000) * 1000000);
            case 4:
                return e0(j);
            case 5:
                return c0(j);
            case 6:
                return b0(j);
            case 7:
                return b0((j % 2) * 12);
            default:
                h.d("Unsupported unit: ", temporalUnit);
                return null;
        }
    }

    public final LocalTime b0(long j) {
        return j == 0 ? this : C(((((int) (j % 24)) + this.a) + 24) % 24, this.b, this.c, this.d);
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

    public final LocalTime c0(long j) {
        if (j != 0) {
            int i = (this.a * 60) + this.b;
            int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
            if (i != i2) {
                return C(i2 / 60, i2 % 60, this.c, this.d);
            }
        }
        return this;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(f fVar) {
        if (fVar == j$.time.temporal.o.b || fVar == j$.time.temporal.o.a || fVar == j$.time.temporal.o.e || fVar == j$.time.temporal.o.d) {
            return null;
        }
        if (fVar == j$.time.temporal.o.g) {
            return this;
        }
        if (fVar == j$.time.temporal.o.f) {
            return null;
        }
        return fVar == j$.time.temporal.o.c ? ChronoUnit.NANOS : fVar.l(this);
    }

    public final LocalTime d0(long j) {
        if (j != 0) {
            long jG0 = g0();
            long j2 = (((j % 86400000000000L) + jG0) + 86400000000000L) % 86400000000000L;
            if (jG0 != j2) {
                return C((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
            }
        }
        return this;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e */
    public final Temporal j(LocalDate localDate) {
        return (LocalTime) localDate.f(this);
    }

    public final LocalTime e0(long j) {
        if (j != 0) {
            int i = (this.b * 60) + (this.a * 3600) + this.c;
            int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
            if (i != i2) {
                return C(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.d);
            }
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalTime) {
            LocalTime localTime = (LocalTime) obj;
            if (this.a == localTime.a && this.b == localTime.b && this.c == localTime.c && this.d == localTime.d) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final Temporal f(Temporal temporal) {
        return temporal.a(g0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public final long g0() {
        return (((long) this.c) * 1000000000) + (((long) this.b) * 60000000000L) + (((long) this.a) * 3600000000000L) + ((long) this.d);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? K(nVar) : super.h(nVar);
    }

    public final int h0() {
        return (this.b * 60) + (this.a * 3600) + this.c;
    }

    public final int hashCode() {
        long jG0 = g0();
        return (int) (jG0 ^ (jG0 >>> 32));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean i(j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) nVar).b0();
        }
        return nVar != null && nVar.x(this);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public final LocalTime a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (LocalTime) nVar.X(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        aVar.a0(j);
        switch (j.a[aVar.ordinal()]) {
            case 1:
                return j0((int) j);
            case 2:
                return X(j);
            case 3:
                return j0(((int) j) * 1000);
            case 4:
                return X(j * 1000);
            case 5:
                return j0(((int) j) * CashOut.BIG_NUMBER);
            case 6:
                return X(j * 1000000);
            case 7:
                int i = (int) j;
                if (this.c != i) {
                    j$.time.temporal.a.SECOND_OF_MINUTE.a0(i);
                    return C(this.a, this.b, i, this.d);
                }
                return this;
            case 8:
                return e0(j - ((long) h0()));
            case 9:
                int i2 = (int) j;
                if (this.b != i2) {
                    j$.time.temporal.a.MINUTE_OF_HOUR.a0(i2);
                    return C(this.a, i2, this.c, this.d);
                }
                return this;
            case 10:
                return c0(j - ((long) ((this.a * 60) + this.b)));
            case 11:
                return b0(j - ((long) (this.a % 12)));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return b0(j - ((long) (this.a % 12)));
            case 13:
                int i3 = (int) j;
                if (this.a != i3) {
                    j$.time.temporal.a.HOUR_OF_DAY.a0(i3);
                    return C(i3, this.b, this.c, this.d);
                }
                return this;
            case 14:
                if (j == 24) {
                    j = 0;
                }
                int i4 = (int) j;
                if (this.a != i4) {
                    j$.time.temporal.a.HOUR_OF_DAY.a0(i4);
                    return C(i4, this.b, this.c, this.d);
                }
                return this;
            case 15:
                return b0((j - ((long) (this.a / 12))) * 12);
            default:
                throw new j$.time.temporal.p(c.a("Unsupported field: ", nVar));
        }
    }

    public final LocalTime j0(int i) {
        if (this.d == i) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.a0(i);
        return C(this.a, this.b, this.c, i);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long k(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.R(this);
        }
        if (nVar == j$.time.temporal.a.NANO_OF_DAY) {
            return g0();
        }
        return nVar == j$.time.temporal.a.MICRO_OF_DAY ? g0() / 1000 : K(nVar);
    }

    public final void k0(DataOutput dataOutput) throws IOException {
        if (this.d != 0) {
            dataOutput.writeByte(this.a);
            dataOutput.writeByte(this.b);
            dataOutput.writeByte(this.c);
            dataOutput.writeInt(this.d);
            return;
        }
        if (this.c != 0) {
            dataOutput.writeByte(this.a);
            dataOutput.writeByte(this.b);
            dataOutput.writeByte(~this.c);
            return;
        }
        byte b = this.b;
        byte b2 = this.a;
        if (b == 0) {
            dataOutput.writeByte(~b2);
        } else {
            dataOutput.writeByte(b2);
            dataOutput.writeByte(~this.b);
        }
    }

    @Override // j$.time.temporal.Temporal
    public final long n(Temporal temporal, TemporalUnit temporalUnit) {
        LocalTime localTimeI = I(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, localTimeI);
        }
        long jG0 = localTimeI.g0() - g0();
        switch (j.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return jG0;
            case 2:
                return jG0 / 1000;
            case 3:
                return jG0 / 1000000;
            case 4:
                return jG0 / 1000000000;
            case 5:
                return jG0 / 60000000000L;
            case 6:
                return jG0 / 3600000000000L;
            case 7:
                return jG0 / 43200000000000L;
            default:
                h.d("Unsupported unit: ", temporalUnit);
                return 0L;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b = this.a;
        byte b2 = this.b;
        byte b3 = this.c;
        int i = this.d;
        sb.append(b < 10 ? "0" : "");
        sb.append((int) b);
        sb.append(b2 < 10 ? ":0" : ":");
        sb.append((int) b2);
        if (b3 > 0 || i > 0) {
            sb.append(b3 < 10 ? ":0" : ":");
            sb.append((int) b3);
            if (i > 0) {
                sb.append('.');
                if (i % CashOut.BIG_NUMBER == 0) {
                    sb.append(Integer.toString((i / CashOut.BIG_NUMBER) + 1000).substring(1));
                } else if (i % 1000 == 0) {
                    sb.append(Integer.toString((i / 1000) + CashOut.BIG_NUMBER).substring(1));
                } else {
                    sb.append(Integer.toString(i + Http2Connection.DEGRADED_PONG_TIMEOUT_NS).substring(1));
                }
            }
        }
        return sb.toString();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final int compareTo(LocalTime localTime) {
        int iCompare = Integer.compare(this.a, localTime.a);
        return (iCompare == 0 && (iCompare = Integer.compare(this.b, localTime.b)) == 0 && (iCompare = Integer.compare(this.c, localTime.c)) == 0) ? Integer.compare(this.d, localTime.d) : iCompare;
    }
}
