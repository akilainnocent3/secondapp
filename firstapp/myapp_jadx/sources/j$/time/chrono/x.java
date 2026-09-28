package j$.time.chrono;

import j$.time.Clock;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-341f12e635949ce385fe972d9bf062aa0727e156e520e84a100f26e1747f2bcc */
/* JADX INFO: loaded from: classes3.dex */
public final class x extends a implements Serializable {
    public static final x d = new x();
    private static final long serialVersionUID = 1039765215346859963L;

    private x() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.temporal.q A(j$.time.temporal.a aVar) {
        int i = w.a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.q qVar = j$.time.temporal.a.PROLEPTIC_MONTH.b;
            return j$.time.temporal.q.f(qVar.a - 22932, qVar.d - 22932);
        }
        if (i == 2) {
            j$.time.temporal.q qVar2 = j$.time.temporal.a.YEAR.b;
            return j$.time.temporal.q.g(1L, qVar2.d - 1911, (-qVar2.a) + 1912);
        }
        if (i != 3) {
            return aVar.b;
        }
        j$.time.temporal.q qVar3 = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.q.f(qVar3.a - 1911, qVar3.d - 1911);
    }

    @Override // j$.time.chrono.Chronology
    public final List B() {
        return j$.time.d.a(a0.values());
    }

    @Override // j$.time.chrono.Chronology
    public final j D(int i) {
        if (i == 0) {
            return a0.BEFORE_ROC;
        }
        if (i == 1) {
            return a0.ROC;
        }
        j$.time.h.b("Invalid era: ", i);
        return null;
    }

    @Override // j$.time.chrono.Chronology
    public final int F(j jVar, int i) {
        if (jVar instanceof a0) {
            return jVar == a0.ROC ? i : 1 - i;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate J(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof z ? (z) temporalAccessor : new z(LocalDate.I(temporalAccessor));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate O() {
        return new z(LocalDate.I(LocalDate.now(Clock.b())));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate S(int i, int i2, int i3) {
        return new z(LocalDate.of(i + 1911, i2, i3));
    }

    @Override // j$.time.chrono.a, j$.time.chrono.Chronology
    public final ChronoLocalDate U(Map map, j$.time.format.b0 b0Var) {
        return (z) super.U(map, b0Var);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoZonedDateTime V(Instant instant, ZoneId zoneId) {
        return i.I(this, instant, zoneId);
    }

    @Override // j$.time.chrono.Chronology
    public final boolean Y(long j) {
        return p.d.Y(j + 1911);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate q(long j) {
        return new z(LocalDate.d0(j));
    }

    @Override // j$.time.chrono.Chronology
    public final String r() {
        return "Minguo";
    }

    @Override // j$.time.chrono.Chronology
    public final String u() {
        return "roc";
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate v(int i, int i2) {
        return new z(LocalDate.e0(i + 1911, i2));
    }

    public Object writeReplace() {
        return new b0((byte) 1, this);
    }
}
