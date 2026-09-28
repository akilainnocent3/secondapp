package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class eji implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ytw b;

    public /* synthetic */ eji(ytw ytwVar, int i) {
        this.a = i;
        this.b = ytwVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        ytw ytwVar = this.b;
        switch (i) {
            case 0:
                zii.d(((gly) obj).a, ytwVar);
                break;
            default:
                fs50 fs50Var = (fs50) obj;
                fs50Var.getClass();
                ytwVar.setValue(fs50Var);
                break;
        }
        return Unit.a;
    }
}
