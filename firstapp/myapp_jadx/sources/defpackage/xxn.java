package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xxn implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        gun gunVar = (gun) obj;
        gunVar.getClass();
        int i = 0;
        List listSplit$default = StringsKt__StringsKt.split$default(gunVar.d, new String[]{","}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listSplit$default) {
            if (ogx.a("\\d+", (String) obj2)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
        int size = arrayList.size();
        while (i < size) {
            Object obj3 = arrayList.get(i);
            i++;
            arrayList2.add(Integer.valueOf(Integer.parseInt((String) obj3)));
        }
        return arrayList2;
    }
}
