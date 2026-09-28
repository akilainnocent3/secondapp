package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ii00 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ ii00(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Unit.a;
            default:
                List listR0 = CollectionsKt.r0((List) df80.b.getValue(), new e840(0));
                ArrayList arrayList = new ArrayList();
                int size = listR0.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(((j5d) listR0.get(i)).a());
                }
                return arrayList;
        }
    }
}
