package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.temporal.TemporalAccessor;

/* JADX INFO: compiled from: r8-map-id-341f12e635949ce385fe972d9bf062aa0727e156e520e84a100f26e1747f2bcc */
/* JADX INFO: loaded from: classes3.dex */
public final class v implements TemporalAccessor {
    public final /* synthetic */ ChronoLocalDate a;
    public final /* synthetic */ TemporalAccessor b;
    public final /* synthetic */ Chronology c;
    public final /* synthetic */ ZoneId d;

    public v(ChronoLocalDate chronoLocalDate, TemporalAccessor temporalAccessor, Chronology chronology, ZoneId zoneId) {
        this.a = chronoLocalDate;
        this.b = temporalAccessor;
        this.c = chronology;
        this.d = zoneId;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(j$.time.f fVar) {
        if (fVar == j$.time.temporal.o.b) {
            return this.c;
        }
        if (fVar == j$.time.temporal.o.a) {
            return this.d;
        }
        return fVar == j$.time.temporal.o.c ? this.b.d(fVar) : fVar.l(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean i(j$.time.temporal.n nVar) {
        ChronoLocalDate chronoLocalDate = this.a;
        return (chronoLocalDate == null || !nVar.isDateBased()) ? this.b.i(nVar) : chronoLocalDate.i(nVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long k(j$.time.temporal.n nVar) {
        ChronoLocalDate chronoLocalDate = this.a;
        return (chronoLocalDate == null || !nVar.isDateBased()) ? this.b.k(nVar) : chronoLocalDate.k(nVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.q l(j$.time.temporal.n nVar) {
        ChronoLocalDate chronoLocalDate = this.a;
        return (chronoLocalDate == null || !nVar.isDateBased()) ? this.b.l(nVar) : chronoLocalDate.l(nVar);
    }

    public final String toString() {
        String str;
        String str2 = "";
        Chronology chronology = this.c;
        if (chronology != null) {
            str = " with chronology " + chronology;
        } else {
            str = "";
        }
        ZoneId zoneId = this.d;
        if (zoneId != null) {
            str2 = " with zone " + zoneId;
        }
        return this.b + str + str2;
    }
}
