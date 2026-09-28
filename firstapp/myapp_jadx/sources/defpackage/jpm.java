package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class jpm implements BiFunction {
    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        ArrayList arrayList = new ArrayList((List) obj);
        arrayList.addAll((List) obj2);
        return arrayList;
    }
}
