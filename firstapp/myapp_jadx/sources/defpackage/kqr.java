package defpackage;

import com.sportybet.feature.payment.impl.transaction.presentation.activity.TxDetailsV2Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kqr implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kqr(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                lqr lqrVar = (lqr) obj;
                jsp jspVar = lqrVar.i;
                nor norVarA1 = lqrVar.A1();
                jspVar.getClass();
                norVarA1.getClass();
                if (norVarA1 instanceof nor.a) {
                    return jspVar.a;
                }
                if (norVarA1 instanceof nor.c) {
                    return jspVar.b;
                }
                uhc.a();
                return null;
            case 1:
                ((vx00) obj).y1();
                return Unit.a;
            default:
                int i2 = TxDetailsV2Activity.v;
                wc.a((TxDetailsV2Activity) obj);
                return Unit.a;
        }
    }
}
