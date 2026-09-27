package yads;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class qf1 {
    public static ArrayList a(Object... objArr) {
        objArr.getClass();
        int length = objArr.length;
        kx.a(length, "arraySize");
        ArrayList arrayList = new ArrayList(td1.b(((long) length) + 5 + ((long) (length / 10))));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }
}
