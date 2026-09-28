package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class cnp {
    public static anp a(String str) throws GeneralSecurityException {
        Map mapUnmodifiableMap;
        AtomicReference<mmp> atomicReference = y050.a;
        synchronized (y050.class) {
            mapUnmodifiableMap = Collections.unmodifiableMap(y050.d);
        }
        anp anpVar = (anp) mapUnmodifiableMap.get(str);
        if (anpVar != null) {
            return anpVar;
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(str));
    }
}
