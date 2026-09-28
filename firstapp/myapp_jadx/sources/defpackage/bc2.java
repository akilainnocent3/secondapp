package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bc2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bc2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ej5.c((v5b) obj3, null, null, new qc2((j5i) obj, (b1g0) obj2, null), 3);
                break;
            default:
                Function2 function2 = (Function2) obj2;
                wwd0 wwd0Var = ((gkb0) obj3).a;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, (vjb0) function2.invoke((vjb0) value, obj)));
                break;
        }
        return Unit.a;
    }
}
