package defpackage;

import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.commons.models.PromotionGiftsResponse;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.Status;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class aw40 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ aw40(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PromotionGiftsResponse promotionGiftsResponse;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                cw40 cw40Var = (cw40) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                cw40Var.b = OtpData.Register.a((OtpData.Register) cw40Var.B1(), oTPResult);
                break;
            default:
                san sanVar = (san) obj2;
                LoadingState loadingState = (LoadingState) obj;
                List<GiftItem> entityList = null;
                Status status = loadingState != null ? loadingState.getStatus() : null;
                int i2 = status == null ? -1 : fd90.b.a[status.ordinal()];
                if (i2 == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse != null && (promotionGiftsResponse = (PromotionGiftsResponse) hTTPResponse.getData()) != null) {
                        entityList = promotionGiftsResponse.getEntityList();
                    }
                    sanVar.invoke(entityList);
                } else if (i2 == 2) {
                    sanVar.invoke(null);
                }
                break;
        }
        return Unit.a;
    }
}
