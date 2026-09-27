package t7;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@s1({"SMAP\nNavArgument.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavArgument.kt\nandroidx/navigation/NavArgumentKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,238:1\n494#2,7:239\n766#3:246\n857#3,2:247\n*S KotlinDebug\n*F\n+ 1 NavArgument.kt\nandroidx/navigation/NavArgumentKt\n*L\n234#1:239,7\n236#1:246\n236#1:247,2\n*E\n"})
public final class o {
    @oy.l
    public static final List<String> a(@oy.l Map<String, androidx.navigation.d> map, @oy.l ds.l<? super String, Boolean> isArgumentMissing) {
        kotlin.jvm.internal.m0.p(map, "<this>");
        kotlin.jvm.internal.m0.p(isArgumentMissing, "isArgumentMissing");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, androidx.navigation.d> entry : map.entrySet()) {
            androidx.navigation.d value = entry.getValue();
            Boolean boolValueOf = value != null ? Boolean.valueOf(value.e()) : null;
            kotlin.jvm.internal.m0.m(boolValueOf);
            if (!boolValueOf.booleanValue() && !value.c()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (isArgumentMissing.invoke((String) obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
