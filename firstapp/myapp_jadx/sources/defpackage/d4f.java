package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d4f implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d4f(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                rfj0 rfj0Var = (rfj0) obj;
                rfj0Var.getClass();
                ((Function1) obj2).invoke(new w5f.g(rfj0Var));
                break;
            default:
                String str = (String) obj;
                str.getClass();
                ((a1b0) obj2).t0(str);
                break;
        }
        return Unit.a;
    }
}
