package j$.time.temporal;

import j$.time.Duration;

/* JADX INFO: compiled from: r8-map-id-341f12e635949ce385fe972d9bf062aa0727e156e520e84a100f26e1747f2bcc */
/* JADX INFO: loaded from: classes3.dex */
public enum h implements TemporalUnit {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");

    public final String a;

    static {
        Duration.ofSeconds(31556952L);
        Duration.ofSeconds(7889238L);
    }

    h(String str) {
        this.a = str;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final long between(Temporal temporal, Temporal temporal2) {
        if (temporal.getClass() != temporal2.getClass()) {
            return temporal.n(temporal2, this);
        }
        int i = b.a[ordinal()];
        if (i == 1) {
            g gVar = i.c;
            return Math.subtractExact(temporal2.k(gVar), temporal.k(gVar));
        }
        if (i == 2) {
            return temporal.n(temporal2, ChronoUnit.MONTHS) / 3;
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Temporal x(Temporal temporal, long j) {
        int i = b.a[ordinal()];
        if (i == 1) {
            g gVar = i.c;
            return temporal.a(Math.addExact(temporal.h(gVar), j), gVar);
        }
        if (i == 2) {
            return temporal.b(j / 4, ChronoUnit.YEARS).b((j % 4) * 3, ChronoUnit.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }
}
