package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nlb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nlb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                hvi hviVar = ((enb) obj).a;
                if (hviVar != null) {
                    hviVar.e.d();
                }
                break;
            case 1:
                ((Function1) obj).invoke(c9q.j.a);
                break;
            default:
                qub0 qub0Var = (qub0) obj;
                qub0Var.e4(0, new nmu(qub0Var, 1));
                break;
        }
        return Unit.a;
    }
}
