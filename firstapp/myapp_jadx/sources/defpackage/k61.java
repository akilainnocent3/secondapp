package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k61 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ osw b;

    public /* synthetic */ k61(int i, osw oswVar) {
        this.a = i;
        this.b = oswVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        osw oswVar = this.b;
        switch (i) {
            case 0:
                urr urrVar = (urr) obj;
                urrVar.getClass();
                oswVar.k((int) Float.intBitsToFloat((int) (urrVar.T(0L) >> 32)));
                break;
            default:
                ukf0 ukf0Var = (ukf0) obj;
                ukf0Var.getClass();
                oswVar.k(ycv.b(ukf0Var.h(0) - ukf0Var.g(0)));
                break;
        }
        return Unit.a;
    }
}
