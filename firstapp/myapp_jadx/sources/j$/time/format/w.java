package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.temporal.TemporalAccessor;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-341f12e635949ce385fe972d9bf062aa0727e156e520e84a100f26e1747f2bcc */
/* JADX INFO: loaded from: classes3.dex */
public final class w {
    public final TemporalAccessor a;
    public final DateTimeFormatter b;
    public int c;

    public w(TemporalAccessor temporalAccessor, DateTimeFormatter dateTimeFormatter) {
        Chronology chronology = dateTimeFormatter.e;
        if (chronology != null) {
            Chronology chronology2 = (Chronology) temporalAccessor.d(j$.time.temporal.o.b);
            ZoneId zoneId = (ZoneId) temporalAccessor.d(j$.time.temporal.o.a);
            ChronoLocalDate chronoLocalDateJ = null;
            chronology = Objects.equals(chronology, chronology2) ? null : chronology;
            if (chronology != null) {
                Chronology chronology3 = chronology != null ? chronology : chronology2;
                if (chronology != null) {
                    if (temporalAccessor.i(j$.time.temporal.a.EPOCH_DAY)) {
                        chronoLocalDateJ = chronology3.J(temporalAccessor);
                    } else if (chronology != j$.time.chrono.p.d || chronology2 != null) {
                        for (j$.time.temporal.a aVar : j$.time.temporal.a.values()) {
                            if (aVar.isDateBased() && temporalAccessor.i(aVar)) {
                                throw new j$.time.b("Unable to apply override chronology '" + chronology + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + temporalAccessor);
                            }
                        }
                    }
                }
                temporalAccessor = new v(chronoLocalDateJ, temporalAccessor, chronology3, zoneId);
            }
        }
        this.a = temporalAccessor;
        this.b = dateTimeFormatter;
    }

    public final Long a(j$.time.temporal.n nVar) {
        int i = this.c;
        TemporalAccessor temporalAccessor = this.a;
        if (i <= 0 || temporalAccessor.i(nVar)) {
            return Long.valueOf(temporalAccessor.k(nVar));
        }
        return null;
    }

    public final Object b(j$.time.f fVar) {
        TemporalAccessor temporalAccessor = this.a;
        Object objD = temporalAccessor.d(fVar);
        if (objD != null || this.c != 0) {
            return objD;
        }
        throw new j$.time.b("Unable to extract " + fVar + " from temporal " + temporalAccessor);
    }

    public final String toString() {
        return this.a.toString();
    }
}
