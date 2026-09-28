package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-341f12e635949ce385fe972d9bf062aa0727e156e520e84a100f26e1747f2bcc */
/* JADX INFO: loaded from: classes3.dex */
public interface Chronology extends Comparable<Chronology> {
    static Chronology ofLocale(Locale locale) {
        return a.ofLocale(locale);
    }

    static Chronology s(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        Chronology chronology = (Chronology) temporalAccessor.d(j$.time.temporal.o.b);
        p pVar = p.d;
        if (chronology != null) {
            return chronology;
        }
        Objects.requireNonNull(pVar, "defaultObj");
        return pVar;
    }

    j$.time.temporal.q A(j$.time.temporal.a aVar);

    List B();

    j D(int i);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    int compareTo(Chronology chronology);

    int F(j jVar, int i);

    ChronoLocalDate J(TemporalAccessor temporalAccessor);

    default ChronoZonedDateTime N(Temporal temporal) {
        try {
            ZoneId zoneIdX = ZoneId.x(temporal);
            try {
                return V(Instant.C(temporal), zoneIdX);
            } catch (j$.time.b unused) {
                return i.C(zoneIdX, null, e.x(this, w(temporal)));
            }
        } catch (j$.time.b e) {
            throw new j$.time.b("Unable to obtain ChronoZonedDateTime from TemporalAccessor: " + temporal.getClass(), e);
        }
    }

    ChronoLocalDate O();

    ChronoLocalDate S(int i, int i2, int i3);

    ChronoLocalDate U(Map map, j$.time.format.b0 b0Var);

    default ChronoZonedDateTime V(Instant instant, ZoneId zoneId) {
        return i.I(this, instant, zoneId);
    }

    boolean Y(long j);

    boolean equals(Object obj);

    int hashCode();

    ChronoLocalDate q(long j);

    String r();

    String toString();

    String u();

    ChronoLocalDate v(int i, int i2);

    default ChronoLocalDateTime w(Temporal temporal) {
        try {
            return J(temporal).M(LocalTime.I(temporal));
        } catch (j$.time.b e) {
            throw new j$.time.b("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + temporal.getClass(), e);
        }
    }
}
