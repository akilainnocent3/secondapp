package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class p7b {
    public static uf00 a(qcn qcnVar, scn scnVar, boolean z) {
        s4q s4qVar;
        qcnVar.getClass();
        scnVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : qcnVar) {
            if (!StringsKt.U(((hsq) obj).d)) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            String str = ((hsq) obj2).d;
            Object objA = linkedHashMap.get(str);
            if (objA == null) {
                objA = r9i.a(str, linkedHashMap);
            }
            ((List) objA).add(obj2);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            hsq hsqVar = (hsq) CollectionsKt.firstOrNull((List) entry.getValue());
            if (hsqVar == null) {
                s4qVar = null;
            } else {
                String str2 = hsqVar.c;
                String str3 = hsqVar.d;
                glq glqVar = hsqVar.f;
                int i2 = hsqVar.e;
                Boolean bool = (Boolean) scnVar.get(str2);
                s4qVar = new s4q(str2, str3, i2, glqVar, bool != null ? bool.booleanValue() : z, a4h.f((Iterable) entry.getValue()));
            }
            arrayList2.add(s4qVar);
        }
        return a4h.f(CollectionsKt.r0(CollectionsKt.R(arrayList2), new o7b()));
    }
}
