package defpackage;

import com.sportybet.feature.payment.impl.transaction.presentation.activity.TxDetailsV2Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xb90 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ xb90(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((String) obj).getClass();
                return Unit.a;
            default:
                psm psmVar = (psm) obj;
                int i = TxDetailsV2Activity.v;
                psmVar.getClass();
                return Boolean.valueOf(psmVar.x());
        }
    }
}
