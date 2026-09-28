package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class uba implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uba(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ytw ytwVar = (ytw) obj3;
                ytw ytwVar2 = (ytw) obj2;
                ukf0 ukf0Var = (ukf0) obj;
                ukf0Var.getClass();
                if (ukf0Var.e()) {
                    imf0 imf0Var = (imf0) ytwVar.getValue();
                    long j = ((imf0) ytwVar.getValue()).a.b;
                    d2l.a(j);
                    ytwVar.setValue(imf0.b(imf0Var, 0L, gkw.a(0.9f, j, 1095216660480L & j), null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777213));
                } else {
                    ytwVar2.setValue(Boolean.TRUE);
                }
                break;
            default:
                yfx yfxVar = (yfx) obj3;
                Integer num = (Integer) obj2;
                num.getClass();
                yfx.i(yfxVar, n36.a("search?id=", num.intValue(), num.intValue() == 888999888 ? 1 : 0, "&section=0&favourite=", "&provider=0"), null, 6);
                break;
        }
        return Unit.a;
    }
}
