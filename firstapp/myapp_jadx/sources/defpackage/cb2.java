package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cb2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cb2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                hlf0 hlf0Var = (hlf0) obj3;
                Function1 function1 = (Function1) obj2;
                ukf0 ukf0Var = (ukf0) obj;
                if (hlf0Var != null) {
                    ((x5a0) hlf0Var.a).setValue(ukf0Var);
                }
                if (function1 != null) {
                    function1.invoke(ukf0Var);
                }
                break;
            default:
                String str = (String) obj;
                str.getClass();
                ((Function2) obj3).invoke((String) obj2, str);
                break;
        }
        return Unit.a;
    }
}
