package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nmu implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nmu(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                yfx.i((phx) obj, "AddNewAccountDialog", null, 6);
                break;
            default:
                qub0 qub0Var = (qub0) obj;
                qub0Var.v0(qub0Var.R0(), null);
                break;
        }
        return Unit.a;
    }
}
