package j$.time.chrono;

import j$.time.LocalDate;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-341f12e635949ce385fe972d9bf062aa0727e156e520e84a100f26e1747f2bcc */
/* JADX INFO: loaded from: classes3.dex */
public final class v implements j, Serializable {
    public static final v d;
    public static final v[] e;
    private static final long serialVersionUID = 1466499369062886794L;
    public final transient int a;
    public final transient LocalDate b;
    public final transient String c;

    static {
        v vVar = new v(-1, LocalDate.of(1868, 1, 1), "Meiji");
        d = vVar;
        e = new v[]{vVar, new v(0, LocalDate.of(1912, 7, 30), "Taisho"), new v(1, LocalDate.of(1926, 12, 25), "Showa"), new v(2, LocalDate.of(1989, 1, 8), "Heisei"), new v(3, LocalDate.of(2019, 5, 1), "Reiwa")};
    }

    public v(int i, LocalDate localDate, String str) {
        this.a = i;
        this.b = localDate;
        this.c = str;
    }

    public static v q(LocalDate localDate) {
        if (localDate.a0(u.d)) {
            j$.time.h.a("JapaneseDate before Meiji 6 are not supported");
            return null;
        }
        for (int length = e.length - 1; length >= 0; length--) {
            v vVar = e[length];
            if (localDate.compareTo((ChronoLocalDate) vVar.b) >= 0) {
                return vVar;
            }
        }
        return null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static v s(int i) {
        int i2 = i + 1;
        if (i2 >= 0) {
            v[] vVarArr = e;
            if (i2 < vVarArr.length) {
                return vVarArr[i2];
            }
        }
        j$.time.h.b("Invalid era: ", i);
        return null;
    }

    private Object writeReplace() {
        return new b0((byte) 5, this);
    }

    @Override // j$.time.chrono.j
    public final int getValue() {
        return this.a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.q l(j$.time.temporal.n nVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        return nVar == aVar ? s.d.A(aVar) : super.l(nVar);
    }

    public final v r() {
        v[] vVarArr = e;
        if (this == vVarArr[vVarArr.length - 1]) {
            return null;
        }
        return s(this.a + 1);
    }

    public final String toString() {
        return this.c;
    }
}
