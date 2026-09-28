package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a5l implements z7i {
    public final z4l a;
    public final t9i b;
    public final int c;

    public a5l(z4l z4lVar, t9i t9iVar, int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (q9i q9iVar : new q9i[0]) {
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
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size && !((q9i) arrayList2.get(i2)).a(); i2++) {
        }
        this.a = z4lVar;
        this.b = t9iVar;
        this.c = i;
    }

    @Override // defpackage.z7i
    public final int a() {
        return 2;
    }

    @Override // defpackage.z7i
    public final t9i b() {
        return this.b;
    }

    @Override // defpackage.z7i
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5l)) {
            return false;
        }
        a5l a5lVar = (a5l) obj;
        return this.a.equals(a5lVar.a) && Intrinsics.g(this.b, a5lVar.b) && this.c == a5lVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + gpp.a(this.c, (((this.a.hashCode() - 1262346949) * 31) + this.b.a) * 31, 31);
    }

    public final String toString() {
        return "Font(GoogleFont(\"Roboto\", bestEffort=true), weight=" + this.b + ", style=" + ((Object) n9i.b(this.c)) + ')';
    }
}
