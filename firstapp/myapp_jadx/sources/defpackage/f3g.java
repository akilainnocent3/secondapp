package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f3g implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f3g(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((snp) obj).getClass();
                b5i.b((b5i) obj2);
                break;
            default:
                o6z o6zVar = (o6z) obj;
                o6zVar.getClass();
                ((Function1) obj2).invoke(o6zVar);
                break;
        }
        return Unit.a;
    }
}
