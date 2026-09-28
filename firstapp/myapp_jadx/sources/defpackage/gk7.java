package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gk7 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gk7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                hvg0 hvg0Var = (hvg0) obj;
                hvg0Var.getClass();
                jsz jszVar = (jsz) hvg0Var;
                jszVar.E = true;
                jszVar.D.invoke((pb80) obj2);
                pkd.f(jszVar).R();
                return Boolean.FALSE;
            default:
                ((Function1) obj2).invoke(new vs40.i((Long) obj));
                return Unit.a;
        }
    }
}
