package j$.time;

import j$.time.chrono.Chronology;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalUnit;

/* JADX INFO: compiled from: r8-map-id-341f12e635949ce385fe972d9bf062aa0727e156e520e84a100f26e1747f2bcc */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements TemporalAdjuster {
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i) {
        this.a = i;
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public Temporal f(Temporal temporal) {
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return temporal.a(temporal.l(aVar).d, aVar);
    }

    public Object l(TemporalAccessor temporalAccessor) {
        int i = this.a;
        f fVar = j$.time.temporal.o.a;
        switch (i) {
            case 0:
                return LocalDate.I(temporalAccessor);
            case 1:
                return LocalDateTime.C(temporalAccessor);
            case 2:
                return ZonedDateTime.C(temporalAccessor);
            case 3:
                f fVar2 = DateTimeFormatterBuilder.h;
                ZoneId zoneId = (ZoneId) temporalAccessor.d(fVar);
                if (zoneId == null || (zoneId instanceof ZoneOffset)) {
                    return null;
                }
                return zoneId;
            case 4:
            default:
                j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_DAY;
                if (temporalAccessor.i(aVar)) {
                    return LocalTime.X(temporalAccessor.k(aVar));
                }
                return null;
            case 5:
                return (ZoneId) temporalAccessor.d(fVar);
            case 6:
                return (Chronology) temporalAccessor.d(j$.time.temporal.o.b);
            case 7:
                return (TemporalUnit) temporalAccessor.d(j$.time.temporal.o.c);
            case 8:
                j$.time.temporal.a aVar2 = j$.time.temporal.a.OFFSET_SECONDS;
                if (temporalAccessor.i(aVar2)) {
                    return ZoneOffset.d0(temporalAccessor.h(aVar2));
                }
                return null;
            case 9:
                ZoneId zoneId2 = (ZoneId) temporalAccessor.d(fVar);
                return zoneId2 != null ? zoneId2 : (ZoneId) temporalAccessor.d(j$.time.temporal.o.d);
            case 10:
                j$.time.temporal.a aVar3 = j$.time.temporal.a.EPOCH_DAY;
                if (temporalAccessor.i(aVar3)) {
                    return LocalDate.d0(temporalAccessor.k(aVar3));
                }
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 5:
                return "ZoneId";
            case 6:
                return "Chronology";
            case 7:
                return "Precision";
            case 8:
                return "ZoneOffset";
            case 9:
                return "Zone";
            case 10:
                return "LocalDate";
            case 11:
                return "LocalTime";
            default:
                return super.toString();
        }
    }
}
