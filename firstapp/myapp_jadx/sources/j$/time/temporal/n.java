package j$.time.temporal;

import j$.time.format.a0;
import j$.time.format.b0;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-341f12e635949ce385fe972d9bf062aa0727e156e520e84a100f26e1747f2bcc */
/* JADX INFO: loaded from: classes3.dex */
public interface n {
    q C(TemporalAccessor temporalAccessor);

    default TemporalAccessor I(Map map, a0 a0Var, b0 b0Var) {
        return null;
    }

    q K();

    long R(TemporalAccessor temporalAccessor);

    Temporal X(Temporal temporal, long j);

    boolean isDateBased();

    boolean x(TemporalAccessor temporalAccessor);
}
