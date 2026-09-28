package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.withdraw.WithDrawInfo;
import com.sportygames.crash.models.BetData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class flb0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ flb0(Object obj, int i) {
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
                ylb0 ylb0Var = (ylb0) obj2;
                BetData betData = (BetData) obj;
                betData.getClass();
                ylb0Var.e3(ylb0Var.R0(), betData);
                return Unit.a;
            default:
                nrj0 nrj0Var = (nrj0) obj2;
                lk50 lk50Var = (lk50) obj;
                lk50Var.getClass();
                if (lk50Var instanceof lk50.c) {
                    WithDrawInfo withDrawInfo = (WithDrawInfo) ((BaseResponse) ((lk50.c) lk50Var).a).data;
                    if (withDrawInfo != null) {
                        wwd0 wwd0Var = nrj0Var.A;
                        wwd0Var.getClass();
                        wwd0Var.k(null, withDrawInfo);
                    }
                } else if (!(lk50Var instanceof lk50.a) && !(lk50Var instanceof lk50.b)) {
                    uhc.a();
                    return null;
                }
                return Unit.a;
        }
    }
}
