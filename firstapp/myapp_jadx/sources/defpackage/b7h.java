package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b7h implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b7h(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                ((ytw) obj2).setValue(str);
                break;
            default:
                x7c0 x7c0Var = (x7c0) obj2;
                cgb.a(x7c0Var.e1(), (String) ((x5a0) x7c0Var.c1().v).getValue(), "cashout", (String) obj);
                break;
        }
        return Unit.a;
    }
}
