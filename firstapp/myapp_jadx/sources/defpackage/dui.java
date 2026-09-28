package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dui implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dui(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                cxz cxzVar = (cxz) obj;
                int i2 = eui.b;
                cxzVar.getClass();
                return ((eui) obj2).onPathResult(cxzVar, "listRecursively");
            case 1:
                Function1 function1 = (Function1) obj2;
                ijf0 ijf0Var = (ijf0) obj;
                ijf0Var.getClass();
                if (ijf0Var.a.b.length() <= 11) {
                    function1.invoke(ijf0Var);
                }
                return Unit.a;
            default:
                qpi qpiVar = (qpi) obj;
                qpiVar.getClass();
                return qpi.a(qpiVar, null, false, ((qe10) obj2).i > 0, 3);
        }
    }
}
