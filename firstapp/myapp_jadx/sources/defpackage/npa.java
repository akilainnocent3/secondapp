package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class npa extends bjb0 {
    public static npa b;
    public static final Map<Long, String> c;

    public class a extends HashMap<Long, String> {
    }

    static {
        a aVar = new a();
        aVar.put(461L, "FIREPERF_AUTOPUSH");
        aVar.put(462L, "FIREPERF");
        aVar.put(675L, "FIREPERF_INTERNAL_LOW");
        aVar.put(676L, "FIREPERF_INTERNAL_HIGH");
        c = Collections.unmodifiableMap(aVar);
    }

    @Override // defpackage.bjb0
    public final String Q() {
        return "com.google.firebase.perf.LogSourceName";
    }
}
