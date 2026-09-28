package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.withdraw.WithDrawInfo;
import com.sportybet.android.kepay.withdraw.KeWithdrawActivity;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lif implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lif(Object obj, int i) {
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
                sif sifVar = (sif) obj2;
                lk50 lk50Var = (lk50) obj;
                if (lk50Var instanceof lk50.c) {
                    WithDrawInfo withDrawInfo = (WithDrawInfo) ((BaseResponse) ((lk50.c) lk50Var).a).data;
                    if (withDrawInfo != null && withDrawInfo.hasInfo) {
                        BigDecimal bigDecimalDivide = new BigDecimal(withDrawInfo.maxWithdrawAmount).divide(BigDecimal.valueOf(10000L), 2, RoundingMode.HALF_UP);
                        l9k0 l9k0Var = sifVar.j1;
                        bigDecimalDivide.getClass();
                        l9k0Var.getClass();
                        l9k0Var.e = bigDecimalDivide;
                    }
                } else if (!(lk50Var instanceof lk50.a) && !(lk50Var instanceof lk50.b)) {
                    uhc.a();
                    return null;
                }
                return Unit.a;
            default:
                KeWithdrawActivity keWithdrawActivity = (KeWithdrawActivity) obj2;
                int i2 = KeWithdrawActivity.Z;
                boolean z = ((rr00) obj) instanceof rr00.b;
                keWithdrawActivity.e.setEnabled(z);
                if (!z) {
                    keWithdrawActivity.e.setText("");
                }
                return null;
        }
    }
}
