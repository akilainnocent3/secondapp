package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b840 implements Function0 {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List listR0 = CollectionsKt.r0((List) df80.a.getValue(), new d840());
        ArrayList arrayList = new ArrayList();
        int size = listR0.size();
        for (int i = 0; i < size; i++) {
            vih vihVar = (vih) listR0.get(i);
            vihVar.getClass();
            arrayList.add(new Pair(vihVar.a(), vihVar.type()));
        }
        return arrayList;
    }
}
