package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class jwd0 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final iwd0 a(ivj0 ivj0Var) {
        ivj0Var.getClass();
        return (iwd0) this.a.remove(ivj0Var);
    }

    public final List<iwd0> b(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = this.a;
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (Intrinsics.g(((ivj0) entry.getKey()).a, str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap2.remove((ivj0) it.next());
        }
        return CollectionsKt.A0(linkedHashMap.values());
    }

    public final iwd0 c(ivj0 ivj0Var) {
        LinkedHashMap linkedHashMap = this.a;
        Object iwd0Var = linkedHashMap.get(ivj0Var);
        if (iwd0Var == null) {
            iwd0Var = new iwd0(ivj0Var);
            linkedHashMap.put(ivj0Var, iwd0Var);
        }
        return (iwd0) iwd0Var;
    }
}
