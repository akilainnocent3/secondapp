package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class rou {
    public static boolean a(h4 h4Var, Map.Entry entry) {
        entry.getClass();
        V v = h4Var.get(entry.getKey());
        if (v != 0) {
            return v.equals(entry.getValue());
        }
        return entry.getValue() == null && h4Var.containsKey(entry.getKey());
    }
}
