package j$.time.temporal;

import j$.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-341f12e635949ce385fe972d9bf062aa0727e156e520e84a100f26e1747f2bcc */
/* JADX INFO: loaded from: classes3.dex */
public interface Temporal extends TemporalAccessor {
    Temporal a(long j, n nVar);

    Temporal b(long j, TemporalUnit temporalUnit);

    default Temporal c(long j, TemporalUnit temporalUnit) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = b(Long.MAX_VALUE, temporalUnit);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.b(j2, temporalUnit);
    }

    /* JADX INFO: renamed from: e */
    default Temporal j(LocalDate localDate) {
        return localDate.f(this);
    }

    long n(Temporal temporal, TemporalUnit temporalUnit);
}
