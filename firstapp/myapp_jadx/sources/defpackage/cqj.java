package defpackage;

import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class cqj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cqj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                q28 q28Var = (q28) obj;
                q28Var.getClass();
                return Boolean.valueOf(q28Var.a == ((q28) obj2).a);
            default:
                x7b.a aVar = (x7b.a) obj;
                aVar.getClass();
                return Boolean.valueOf(!((Set) obj2).contains(aVar.a.getCode()));
        }
    }
}
