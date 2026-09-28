package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class rs40 {
    public static rs40 b;
    public final LinkedHashMap<String, String> a = new LinkedHashMap<>();

    public static rs40 b() {
        rs40 rs40Var = b;
        if (rs40Var != null) {
            return rs40Var;
        }
        rs40 rs40Var2 = new rs40();
        b = rs40Var2;
        return rs40Var2;
    }

    public final void a() {
        this.a.clear();
    }

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap<String, String> linkedHashMap = this.a;
        Iterator<String> it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add(linkedHashMap.get(it.next()));
        }
        return arrayList;
    }
}
