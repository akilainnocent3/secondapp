package defpackage;

import com.sportybet.android.instantwin.presentation.legends.b;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.commons.models.PromotionGiftsResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class to00 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ to00(Object obj, int i) {
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
                ((kq00) obj).x1();
                break;
            case 1:
                nn40 nn40Var = (nn40) obj;
                PromotionGiftsResponse promotionGiftsResponse = nn40Var.f0;
                if (promotionGiftsResponse != null && (entityList = promotionGiftsResponse.getEntityList()) != null && (xi60Var = nn40Var.J) != null) {
                    g060.a aVar = nn40Var.y0;
                    xi60Var.r0(entityList, aVar != null ? aVar.c : 0.0d, aVar != null ? aVar.b : 0.0d, aVar != null ? aVar.a : 0.0d);
                }
                break;
            default:
                ((Function1) obj).invoke(b.a.c.a);
                break;
        }
        return Unit.a;
    }
}
