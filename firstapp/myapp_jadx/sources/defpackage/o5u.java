package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class o5u {
    public static ArrayList a(ArrayList arrayList, rdd0 rdd0Var, String str, String str2, Function1 function1) {
        rdd0Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Object objInvoke = function1.invoke(obj);
            Object arrayList2 = linkedHashMap.get(objInvoke);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(objInvoke, arrayList2);
            }
            ((List) arrayList2).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((List) entry.getValue()).size() > 1) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            djr.a(rdd0Var, new cjr.f(str, (String) entry2.getKey(), ((List) entry2.getValue()).size(), str2));
        }
        ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList3.add(CollectionsKt.T((List) ((Map.Entry) it.next()).getValue()));
        }
        return arrayList3;
    }
}
