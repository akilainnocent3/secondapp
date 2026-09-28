package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class rom {
    public final HashMap a = new HashMap();
    public Map<String, String> b;

    public final synchronized Map<String, String> a() {
        Map<String, String> mapUnmodifiableMap;
        mapUnmodifiableMap = this.b;
        if (mapUnmodifiableMap == null) {
            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(this.a));
            this.b = mapUnmodifiableMap;
        }
        return mapUnmodifiableMap;
    }
}
