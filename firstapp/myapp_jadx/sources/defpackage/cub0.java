package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.vip.data.StakeSafeUsageCountResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class cub0 implements Function1 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        izs izsVar = (izs) obj;
        if (izsVar.a.ordinal() == 1) {
            ytw<StakeSafeUsageCountResponse> ytwVar = gci0.a;
            HTTPResponse hTTPResponse = (HTTPResponse) izsVar.b;
            StakeSafeUsageCountResponse stakeSafeUsageCountResponse = hTTPResponse != null ? (StakeSafeUsageCountResponse) hTTPResponse.getData() : null;
            ((x5a0) ytwVar).setValue(stakeSafeUsageCountResponse != null ? stakeSafeUsageCountResponse : null);
        }
        return Unit.a;
    }
}
