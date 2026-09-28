package defpackage;

import com.sportygames.commons.models.GiftItem;
import com.sportygames.commons.models.PromotionGiftsResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yt6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yt6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List<GiftItem> entityList;
        xi60 xi60Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ytw) obj).setValue(Boolean.TRUE);
                break;
            case 1:
                ((Function1) obj).invoke(wae.DEPOSIT);
                break;
            default:
                b8b0 b8b0Var = (b8b0) obj;
                PromotionGiftsResponse promotionGiftsResponse = b8b0Var.h0;
                if (promotionGiftsResponse != null && (entityList = promotionGiftsResponse.getEntityList()) != null && (xi60Var = b8b0Var.i0) != null) {
                    fm1.c cVar = b8b0Var.A0;
                    xi60Var.r0(entityList, cVar != null ? cVar.c : 0.0d, cVar != null ? cVar.b : 0.0d, cVar != null ? cVar.a : 0.0d);
                }
                break;
        }
        return Unit.a;
    }
}
