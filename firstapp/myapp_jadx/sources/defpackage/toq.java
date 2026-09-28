package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class toq implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ toq(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                osw oswVar = (osw) obj;
                oswVar.k(oswVar.D() + 1);
                break;
            default:
                q1c0 q1c0Var = (q1c0) obj;
                q1c0Var.K0 = false;
                q1c0Var.G0();
                q1c0Var.p2();
                break;
        }
        return Unit.a;
    }
}
