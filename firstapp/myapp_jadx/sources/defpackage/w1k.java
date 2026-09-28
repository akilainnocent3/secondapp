package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w1k {
    public static Object a(Object obj, Map.Entry entry, HashMap map, Object obj2) {
        Objects.requireNonNull(obj);
        Object value = entry.getValue();
        Objects.requireNonNull(value);
        return map.put(obj2, value);
    }
}
