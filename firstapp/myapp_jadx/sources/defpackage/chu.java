package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.vip.data.UserTopCoeffResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class chu implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ chu(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ijf0 ijf0Var = (ijf0) obj;
                ijf0Var.getClass();
                ((Function1) obj2).invoke(new vs40.l(ijf0Var));
                break;
            default:
                fpb0 fpb0Var = (fpb0) obj2;
                izs izsVar = (izs) obj;
                izsVar.getClass();
                lei0 lei0Var = fpb0Var.e;
                int iOrdinal = izsVar.a.ordinal();
                if (iOrdinal == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) izsVar.b;
                    fpb0Var.o = hTTPResponse != null ? (UserTopCoeffResponse) hTTPResponse.getData() : null;
                    lei0Var.getClass();
                    ej5.c(o8i0.d(lei0Var), null, null, new hei0(lei0Var, null), 3);
                } else if (iOrdinal == 2) {
                    fpb0Var.o = null;
                    lei0Var.getClass();
                    ej5.c(o8i0.d(lei0Var), null, null, new hei0(lei0Var, null), 3);
                }
                break;
        }
        return Unit.a;
    }
}
