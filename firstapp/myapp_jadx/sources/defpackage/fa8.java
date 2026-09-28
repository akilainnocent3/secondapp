package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fa8 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fa8(Object obj, int i) {
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
                Function0<Unit> function0 = ha8Var.a;
                if (function0 != null) {
                    function0.invoke();
                }
                ha8Var.dismiss();
                break;
            default:
                ((Function1) obj).invoke(new rn30.d(true));
                break;
        }
        return Unit.a;
    }
}
