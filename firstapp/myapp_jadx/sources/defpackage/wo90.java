package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wo90 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ wo90(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                ucn ucnVar = (ucn) obj;
                ucnVar.getClass();
                function1.invoke(new pq90.b.a(ucnVar));
                break;
            default:
                ijf0 ijf0Var = (ijf0) obj;
                ijf0Var.getClass();
                function1.invoke(ijf0Var);
                break;
        }
        return Unit.a;
    }
}
