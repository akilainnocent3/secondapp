package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class on7 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a(nn7 nn7Var) {
        long[] jArr = nn7Var.e;
        if (jArr.length > 0) {
            Long lValueOf = Long.valueOf(jArr[0]);
            LinkedHashMap linkedHashMap = this.a;
            if (linkedHashMap.containsKey(lValueOf)) {
                return;
            }
            linkedHashMap.put(Long.valueOf(nn7Var.e[0]), nn7Var);
        }
    }
}
