package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class yxj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ yxj(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                zv70 zv70Var = (zv70) obj;
                zv70Var.getClass();
                function1.invoke(new ot70.b(zv70Var));
                break;
            default:
                function1.invoke(new io60.b(((Boolean) obj).booleanValue()));
                break;
        }
        return Unit.a;
    }
}
