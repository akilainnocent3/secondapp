package defpackage;

import com.sportybet.feature.payment.impl.deposit.presentation.adapter.DepositOthersAdapter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i5e implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i5e(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return DepositOthersAdapter._init_$lambda$0((DepositOthersAdapter) obj);
            default:
                djh djhVar = ((n2j) obj).b;
                if (djhVar != null) {
                    djhVar.f.c.setVisibility(0);
                }
                return Unit.a;
        }
    }
}
