package defpackage;

import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sr6 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ sr6(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Set set = (Set) obj2;
                ((wv60) obj).getClass();
                set.getClass();
                return new ArrayList(set);
            default:
                x8y x8yVar = (x8y) obj;
                x8yVar.getClass();
                return x8y.a(x8yVar, (Integer) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, 32765);
        }
    }
}
