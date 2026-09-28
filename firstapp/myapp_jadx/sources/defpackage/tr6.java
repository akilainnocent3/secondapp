package defpackage;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tr6 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ tr6(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                return CollectionsKt.E0(arrayList);
            default:
                x8y x8yVar = (x8y) obj;
                x8yVar.getClass();
                return x8yVar.e;
        }
    }
}
