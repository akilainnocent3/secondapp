package defpackage;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class i85 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ haj c;

    public /* synthetic */ i85(int i, haj hajVar, Object obj) {
        this.a = i;
        this.b = obj;
        this.c = hajVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        haj hajVar = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                d95 d95Var = (d95) obj2;
                Function2 function2 = (Function2) hajVar;
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue()) {
                    ej5.c(d95Var.w, null, null, new l95(d95Var, (String) CollectionsKt.b0(z76.o.b), null), 3);
                }
                function2.invoke(bool, dag.REGISTER);
                break;
            default:
                aq40 aq40Var = (aq40) obj2;
                float fFloatValue = aq40Var.a - ((Float) obj).floatValue();
                aq40Var.a = fFloatValue;
                ((Function1) hajVar).invoke(Float.valueOf(fFloatValue));
                break;
        }
        return Unit.a;
    }
}
