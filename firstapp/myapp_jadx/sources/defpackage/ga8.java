package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ga8 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ga8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ha8 ha8Var = (ha8) obj;
                ha8Var.b.invoke();
                ha8Var.dismiss();
                break;
            case 1:
                ((Function1) obj).invoke(rn30.k.a);
                break;
            default:
                ((n2g0) obj).dismiss();
                break;
        }
        return Unit.a;
    }
}
