package defpackage;

import com.sportygames.commons.models.GiftItem;
import com.sportygames.commons.models.PromotionGiftsResponse;
import com.sportygames.spinmatch.model.response.DetailResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ku60 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ku60(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List<GiftItem> entityList;
        xi60 xi60Var;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((Function1) obj2).invoke(((aoe0.b) obj).a);
                break;
            default:
                kab0 kab0Var = (kab0) obj2;
                zp40 zp40Var = (zp40) obj;
                PromotionGiftsResponse promotionGiftsResponse = kab0Var.A;
                if (promotionGiftsResponse != null && (entityList = promotionGiftsResponse.getEntityList()) != null && (xi60Var = kab0Var.B) != null) {
                    double d = kab0Var.v;
                    DetailResponse detailResponse = kab0Var.z;
                    xi60Var.r0(entityList, d, detailResponse != null ? detailResponse.getMinStakeAmount() : 0.0d, zp40Var.a);
                }
                break;
        }
        return Unit.a;
    }
}
