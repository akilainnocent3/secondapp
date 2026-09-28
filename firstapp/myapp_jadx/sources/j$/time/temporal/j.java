package j$.time.temporal;

import j$.time.chrono.Chronology;
import j$.time.format.a0;
import j$.time.format.b0;
import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'JULIAN_DAY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-341f12e635949ce385fe972d9bf062aa0727e156e520e84a100f26e1747f2bcc */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements n {
    public static final j JULIAN_DAY;
    public static final j MODIFIED_JULIAN_DAY;
    public static final j RATA_DIE;
    public static final /* synthetic */ j[] d;
    private static final long serialVersionUID = -7501623920830201812L;
    public final transient String a;
    public final transient q b;
    public final transient long c;

    static {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.FOREVER;
        j jVar = new j("JULIAN_DAY", 0, "JulianDay", chronoUnit, chronoUnit2, 2440588L);
        JULIAN_DAY = jVar;
        j jVar2 = new j("MODIFIED_JULIAN_DAY", 1, "ModifiedJulianDay", chronoUnit, chronoUnit2, 40587L);
        MODIFIED_JULIAN_DAY = jVar2;
        j jVar3 = new j("RATA_DIE", 2, "RataDie", chronoUnit, chronoUnit2, 719163L);
        RATA_DIE = jVar3;
        d = new j[]{jVar, jVar2, jVar3};
    }

    public j(String str, int i, String str2, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, long j) {
        super(str, i);
        this.a = str2;
        this.b = q.f((-365243219162L) + j, 365241780471L + j);
        this.c = j;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) d.clone();
    }

    @Override // j$.time.temporal.n
    public final q C(TemporalAccessor temporalAccessor) {
        if (temporalAccessor.i(a.EPOCH_DAY)) {
            return this.b;
        }
        j$.time.h.i("Unsupported field: ", this);
        return null;
    }

    @Override // j$.time.temporal.n
    public final TemporalAccessor I(Map map, a0 a0Var, b0 b0Var) {
        long jLongValue = ((Long) ((HashMap) map).remove(this)).longValue();
        Chronology chronologyS = Chronology.s(a0Var);
        b0 b0Var2 = b0.LENIENT;
        long j = this.c;
        if (b0Var == b0Var2) {
            return chronologyS.q(Math.subtractExact(jLongValue, j));
        }
        this.b.b(jLongValue, this);
        return chronologyS.q(jLongValue - j);
    }

    @Override // j$.time.temporal.n
    public final q K() {
        return this.b;
    }

    @Override // j$.time.temporal.n
    public final long R(TemporalAccessor temporalAccessor) {
        return temporalAccessor.k(a.EPOCH_DAY) + this.c;
    }

    @Override // j$.time.temporal.n
    public final Temporal X(Temporal temporal, long j) {
        if (this.b.e(j)) {
            return temporal.a(Math.subtractExact(j, this.c), a.EPOCH_DAY);
        }
        throw new j$.time.b("Invalid value: " + this.a + " " + j);
    }

    @Override // j$.time.temporal.n
    public final boolean isDateBased() {
        return true;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }

    @Override // j$.time.temporal.n
    public final boolean x(TemporalAccessor temporalAccessor) {
        return temporalAccessor.i(a.EPOCH_DAY);
    }
}
