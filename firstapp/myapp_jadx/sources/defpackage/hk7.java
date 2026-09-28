package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hk7 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ hk7(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                hvg0 hvg0Var = (hvg0) obj;
                hvg0Var.getClass();
                jsz jszVar = (jsz) hvg0Var;
                jszVar.E = false;
                pkd.f(jszVar).R();
                return Boolean.FALSE;
            default:
                ((String) obj).getClass();
                return Unit.a;
        }
    }
}
