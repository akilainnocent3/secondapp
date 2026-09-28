package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rup implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rup(Object obj, int i) {
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
                return Unit.a;
            default:
                xkj0 xkj0Var = (xkj0) obj;
                dhj0.a aVar = xkj0Var.K;
                w9e w9eVar = xkj0Var.H;
                aVar.getClass();
                w9eVar.getClass();
                return new dhj0(aVar.a, aVar.b, w9eVar);
        }
    }
}
