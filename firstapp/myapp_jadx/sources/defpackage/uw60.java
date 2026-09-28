package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uw60 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        obj.getClass();
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = list.get(i);
            uv60 uv60Var = kx60.c;
            nk0.d dVar = null;
            if (!Intrinsics.g(obj2, Boolean.FALSE) && obj2 != null) {
                dVar = (nk0.d) uv60Var.b.invoke(obj2);
            }
            dVar.getClass();
            arrayList.add(dVar);
        }
        return arrayList;
    }
}
