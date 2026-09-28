package defpackage;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class tp60 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tp60(int i, Object obj, Function1 function1) {
        this.a = i;
        this.b = function1;
        this.c = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(new zxq.z(((zsq.f) obj).b));
                break;
            default:
                lwe0 lwe0Var = (lwe0) CollectionsKt.d0((uf00) obj);
                function1.invoke(new zse0.b(lwe0Var != null ? Integer.valueOf(lwe0Var.a) : null));
                break;
        }
        return Unit.a;
    }
}
