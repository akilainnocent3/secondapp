package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class cho implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cho(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function0) obj).invoke();
                break;
            default:
                zy10 zy10Var = (zy10) obj;
                zt50 zt50Var = zy10Var.b;
                zy10Var.r0(zt50Var != null ? zt50Var.z : null, zt50Var != null ? zt50Var.S : null, zy10Var.v0);
                break;
        }
        return Unit.a;
    }
}
