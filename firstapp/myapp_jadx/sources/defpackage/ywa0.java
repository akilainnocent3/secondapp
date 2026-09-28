package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.withdraw.WithDrawInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ywa0 implements Function1 {
    public final /* synthetic */ zwa0 a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        lk50 lk50Var = (lk50) obj;
        lk50Var.getClass();
        boolean z = lk50Var instanceof lk50.c;
        zwa0 zwa0Var = this.a;
        if (z) {
            WithDrawInfo withDrawInfo = (WithDrawInfo) ((BaseResponse) ((lk50.c) lk50Var).a).data;
            if (withDrawInfo != null) {
                wwd0 wwd0Var = zwa0Var.K;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, withDrawInfo));
            }
        } else if (lk50Var instanceof lk50.a) {
            zwa0Var.y1(xwa0.e.a);
        } else if (!(lk50Var instanceof lk50.b)) {
            uhc.a();
            return null;
        }
        return Unit.a;
    }
}
