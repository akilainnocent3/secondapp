package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class rxr {
    public static final qxr a = new qxr();

    public static final List a(int i, int i2, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return m2g.a;
        }
        ArrayList arrayListC0 = CollectionsKt.C0(list);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            pxr pxrVar = (pxr) arrayList.get(i3);
            int index = pxrVar.getIndex();
            if (i <= index && index <= i2) {
                arrayListC0.add(pxrVar);
            }
        }
        o48.v(a, arrayListC0);
        return arrayListC0;
    }
}
