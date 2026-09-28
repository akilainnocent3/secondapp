package j$.time.chrono;

import j$.time.Clock;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: compiled from: r8-map-id-341f12e635949ce385fe972d9bf062aa0727e156e520e84a100f26e1747f2bcc */
/* JADX INFO: loaded from: classes3.dex */
public final class s extends a implements Serializable {
    public static final s d = new s();
    private static final long serialVersionUID = 459996390165777884L;

    private s() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.temporal.q A(j$.time.temporal.a aVar) {
        switch (r.a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                j$.time.h.d("Unsupported field: ", aVar);
                return null;
            case 5:
                v[] vVarArr = v.e;
                int year = vVarArr[vVarArr.length - 1].b.getYear();
                int year2 = Http2Connection.DEGRADED_PONG_TIMEOUT_NS - vVarArr[vVarArr.length - 1].b.getYear();
                int year3 = vVarArr[0].b.getYear();
                int i = 1;
                while (true) {
                    v[] vVarArr2 = v.e;
                    if (i >= vVarArr2.length) {
                        return j$.time.temporal.q.g(1L, year2, 999999999 - year);
                    }
                    v vVar = vVarArr2[i];
                    year2 = Math.min(year2, (vVar.b.getYear() - year3) + 1);
                    year3 = vVar.b.getYear();
                    i++;
                }
                break;
            case 6:
                v vVar2 = v.d;
                long j = j$.time.temporal.a.DAY_OF_YEAR.b.c;
                long jMin = j;
                for (v vVar3 : v.e) {
                    long jMin2 = Math.min(jMin, (vVar3.b.W() - vVar3.b.R()) + 1);
                    jMin = vVar3.r() != null ? Math.min(jMin2, vVar3.r().b.R() - 1) : jMin2;
                }
                return j$.time.temporal.q.g(1L, jMin, j$.time.temporal.a.DAY_OF_YEAR.b.d);
            case 7:
                return j$.time.temporal.q.f(u.d.getYear(), 999999999L);
            case 8:
                long j2 = v.d.a;
                v[] vVarArr3 = v.e;
                return j$.time.temporal.q.f(j2, vVarArr3[vVarArr3.length - 1].a);
            default:
                return aVar.b;
        }
    }

    @Override // j$.time.chrono.Chronology
    public final List B() {
        v[] vVarArr = v.e;
        return j$.time.d.a((v[]) Arrays.copyOf(vVarArr, vVarArr.length));
    }

    @Override // j$.time.chrono.Chronology
    public final j D(int i) {
        return v.s(i);
    }

    @Override // j$.time.chrono.Chronology
    public final int F(j jVar, int i) {
        if (!(jVar instanceof v)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        v vVar = (v) jVar;
        int year = (vVar.b.getYear() + i) - 1;
        if (i == 1 || (year >= -999999999 && year <= 999999999 && year >= vVar.b.getYear() && jVar == v.q(LocalDate.of(year, 1, 1)))) {
            return year;
        }
        j$.time.h.a("Invalid yearOfEra value");
        return 0;
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate J(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof u ? (u) temporalAccessor : new u(LocalDate.I(temporalAccessor));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate O() {
        return new u(LocalDate.I(LocalDate.now(Clock.b())));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate S(int i, int i2, int i3) {
        return new u(LocalDate.of(i, i2, i3));
    }

    @Override // j$.time.chrono.a, j$.time.chrono.Chronology
    public final ChronoLocalDate U(Map map, j$.time.format.b0 b0Var) {
        return (u) super.U(map, b0Var);
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoZonedDateTime V(Instant instant, ZoneId zoneId) {
        return i.I(this, instant, zoneId);
    }

    @Override // j$.time.chrono.Chronology
    public final boolean Y(long j) {
        return p.d.Y(j);
    }

    @Override // j$.time.chrono.a
    public final ChronoLocalDate b0(Map map, j$.time.format.b0 b0Var) {
        u uVarB0;
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        Long l = (Long) map.get(aVar);
        v vVarS = l != null ? v.s(A(aVar).a(l.longValue(), aVar)) : null;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR_OF_ERA;
        Long l2 = (Long) map.get(aVar2);
        int iA = l2 != null ? A(aVar2).a(l2.longValue(), aVar2) : 0;
        if (vVarS == null && l2 != null && !map.containsKey(j$.time.temporal.a.YEAR) && b0Var != j$.time.format.b0.STRICT) {
            v[] vVarArr = v.e;
            vVarS = ((v[]) Arrays.copyOf(vVarArr, vVarArr.length))[((v[]) Arrays.copyOf(vVarArr, vVarArr.length)).length - 1];
        }
        if (l2 != null && vVarS != null) {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
            if (map.containsKey(aVar3)) {
                j$.time.temporal.a aVar4 = j$.time.temporal.a.DAY_OF_MONTH;
                if (map.containsKey(aVar4)) {
                    map.remove(aVar);
                    map.remove(aVar2);
                    if (b0Var == j$.time.format.b0.LENIENT) {
                        return new u(LocalDate.of((vVarS.b.getYear() + iA) - 1, 1, 1)).X(Math.subtractExact(((Long) map.remove(aVar3)).longValue(), 1L), ChronoUnit.MONTHS).X(Math.subtractExact(((Long) map.remove(aVar4)).longValue(), 1L), ChronoUnit.DAYS);
                    }
                    int iA2 = A(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    int iA3 = A(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4);
                    if (b0Var != j$.time.format.b0.SMART) {
                        LocalDate localDate = u.d;
                        LocalDate localDateOf = LocalDate.of((vVarS.b.getYear() + iA) - 1, iA2, iA3);
                        if (!localDateOf.a0(vVarS.b) && vVarS == v.q(localDateOf)) {
                            return new u(vVarS, iA, localDateOf);
                        }
                        j$.time.h.a("year, month, and day not valid for Era");
                        return null;
                    }
                    if (iA < 1) {
                        j$.time.h.b("Invalid YearOfEra: ", iA);
                        return null;
                    }
                    int year = (vVarS.b.getYear() + iA) - 1;
                    try {
                        uVarB0 = new u(LocalDate.of(year, iA2, iA3));
                    } catch (j$.time.b unused) {
                        uVarB0 = new u(LocalDate.of(year, iA2, 1)).b0(new j$.time.f(4));
                    }
                    if (uVarB0.b == vVarS || uVarB0.h(j$.time.temporal.a.YEAR_OF_ERA) <= 1 || iA <= 1) {
                        return uVarB0;
                    }
                    throw new j$.time.b("Invalid YearOfEra for Era: " + vVarS + " " + iA);
                }
            }
            j$.time.temporal.a aVar5 = j$.time.temporal.a.DAY_OF_YEAR;
            if (map.containsKey(aVar5)) {
                map.remove(aVar);
                map.remove(aVar2);
                if (b0Var == j$.time.format.b0.LENIENT) {
                    return new u(LocalDate.e0((vVarS.b.getYear() + iA) - 1, 1)).X(Math.subtractExact(((Long) map.remove(aVar5)).longValue(), 1L), ChronoUnit.DAYS);
                }
                int iA4 = A(aVar5).a(((Long) map.remove(aVar5)).longValue(), aVar5);
                LocalDate localDate2 = u.d;
                LocalDate localDate3 = vVarS.b;
                LocalDate localDateE0 = iA == 1 ? LocalDate.e0(localDate3.getYear(), (vVarS.b.R() + iA4) - 1) : LocalDate.e0((localDate3.getYear() + iA) - 1, iA4);
                if (!localDateE0.a0(vVarS.b) && vVarS == v.q(localDateE0)) {
                    return new u(vVarS, iA, localDateE0);
                }
                j$.time.h.a("Invalid parameters");
            }
        }
        return null;
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate q(long j) {
        return new u(LocalDate.d0(j));
    }

    @Override // j$.time.chrono.Chronology
    public final String r() {
        return "Japanese";
    }

    @Override // j$.time.chrono.Chronology
    public final String u() {
        return "japanese";
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate v(int i, int i2) {
        return new u(LocalDate.e0(i, i2));
    }

    public Object writeReplace() {
        return new b0((byte) 1, this);
    }
}
