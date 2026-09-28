package defpackage;

import androidx.fragment.app.Fragment;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.commons.models.PromotionGiftsResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class kfj implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ kfj(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List<GiftItem> entityList;
        xi60 xi60Var;
        CharSequence text;
        String string;
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                tgj tgjVar = (tgj) fragment;
                tgjVar.p1 = 2;
                ul2 ul2VarS0 = tgjVar.S0();
                boolean zBooleanValue = ((Boolean) ((x5a0) tgjVar.y2).getValue()).booleanValue();
                Integer num = (Integer) ((x5a0) tgjVar.z2).getValue();
                tgjVar.Y2(ul2VarS0, zBooleanValue, num != null ? num.intValue() : 0);
                break;
            default:
                l560 l560Var = (l560) fragment;
                PromotionGiftsResponse promotionGiftsResponse = l560Var.Y;
                if (promotionGiftsResponse != null && (entityList = promotionGiftsResponse.getEntityList()) != null && (xi60Var = l560Var.Z) != null) {
                    double d = l560Var.f;
                    double d2 = l560Var.e;
                    eo80 eo80Var = l560Var.l0;
                    xi60Var.r0(entityList, d, d2, (eo80Var == null || (text = eo80Var.r0.getText()) == null || (string = text.toString()) == null) ? 0.0d : Double.parseDouble(string));
                }
                break;
        }
        return Unit.a;
    }
}
