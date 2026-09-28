package j$.time.chrono;

import j$.time.Clock;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-341f12e635949ce385fe972d9bf062aa0727e156e520e84a100f26e1747f2bcc */
/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends a implements Serializable {
    public static final d0 d = new d0();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map.put("en", new String[]{"BB", "BE"});
        map.put("th", new String[]{"BB", "BE"});
        map2.put("en", new String[]{"B.B.", "B.E."});
        map2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        map3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        map3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    private d0() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.temporal.q A(j$.time.temporal.a aVar) {
        int i = c0.a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.q qVar = j$.time.temporal.a.PROLEPTIC_MONTH.b;
            return j$.time.temporal.q.f(qVar.a + 6516, qVar.d + 6516);
        }
        if (i == 2) {
            j$.time.temporal.q qVar2 = j$.time.temporal.a.YEAR.b;
            return j$.time.temporal.q.g(1L, (-(qVar2.a + 543)) + 1, qVar2.d + 543);
        }
        if (i != 3) {
            return aVar.b;
        }
        j$.time.temporal.q qVar3 = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.q.f(qVar3.a + 543, qVar3.d + 543);
    }

    @Override // j$.time.chrono.Chronology
    public final List B() {
        return j$.time.d.a(g0.values());
    }

    @Override // j$.time.chrono.Chronology
    public final j D(int i) {
        if (i == 0) {
            return g0.BEFORE_BE;
        }
        if (i == 1) {
            return g0.BE;
        }
        j$.time.h.b("Invalid era: ", i);
        return null;
    }

    @Override // j$.time.chrono.Chronology
    public final int F(j jVar, int i) {
        if (jVar instanceof g0) {
            return jVar == g0.BE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate J(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof f0 ? (f0) temporalAccessor : new f0(LocalDate.I(temporalAccessor));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate O() {
        return new f0(LocalDate.I(LocalDate.now(Clock.b())));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate S(int i, int i2, int i3) {
        return new f0(LocalDate.of(i - 543, i2, i3));
    }

    @Override // j$.time.chrono.a, j$.time.chrono.Chronology
    public final ChronoLocalDate U(Map map, j$.time.format.b0 b0Var) {
        return (f0) super.U(map, b0Var);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoZonedDateTime V(Instant instant, ZoneId zoneId) {
        return i.I(this, instant, zoneId);
    }

    @Override // j$.time.chrono.Chronology
    public final boolean Y(long j) {
        return p.d.Y(j - 543);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate q(long j) {
        return new f0(LocalDate.d0(j));
    }

    @Override // j$.time.chrono.Chronology
    public final String r() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.Chronology
    public final String u() {
        return "buddhist";
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate v(int i, int i2) {
        return new f0(LocalDate.e0(i - 543, i2));
    }

    public Object writeReplace() {
        return new b0((byte) 1, this);
    }
}
