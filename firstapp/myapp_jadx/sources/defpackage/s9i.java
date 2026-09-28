package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class s9i {
    public final ArrayList a;

    public s9i(q9i... q9iVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (q9i q9iVar : q9iVarArr) {
            String strC = q9iVar.c();
            Object objA = linkedHashMap.get(strC);
            if (objA == null) {
                objA = r9i.a(strC, linkedHashMap);
            }
            ((List) objA).add(q9iVar);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() != 1) {
                kb5.a(j26.a(he.a("'", str, "' must be unique. Actual [ ["), CollectionsKt.a0(list, null, null, null, null, 63), ']'));
                throw null;
            }
            p48.w(list, arrayList);
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.a = arrayList2;
        int size = arrayList2.size();
        for (int i = 0; i < size && !((q9i) arrayList2.get(i)).a(); i++) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s9i) {
            return this.a.equals(((s9i) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
