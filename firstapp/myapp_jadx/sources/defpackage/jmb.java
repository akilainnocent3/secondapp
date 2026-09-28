package defpackage;

import android.content.Context;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.luckynumber.featurematch.presentation.a;
import com.sportybet.plugin.myfavorite.widget.item.QuickAddStakeItem;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.commons.models.PromotionGiftsResponse;
import com.sportygames.lobby.remote.models.GameDetails;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class jmb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jmb(Object obj, int i) {
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
                GameDetails gameDetails = ((enb) obj).G;
                wz.a("AddMoneyClicked", gameDetails != null ? gameDetails.getName() : null, new String[0]);
                SportyGamesManager.getInstance().gotoSportyBet(xae.c, null);
                return Unit.a;
            case 1:
                fgg fggVar = (fgg) obj;
                PromotionGiftsResponse promotionGiftsResponse = fggVar.Z;
                if (promotionGiftsResponse != null && (entityList = promotionGiftsResponse.getEntityList()) != null && (xi60Var = fggVar.A) != null) {
                    bo1.b bVar = fggVar.H0;
                    xi60Var.r0(entityList, bVar != null ? bVar.c : 0.0d, bVar != null ? bVar.b : 0.0d, bVar != null ? bVar.a : 0.0d);
                }
                return Unit.a;
            case 2:
                ((Function1) obj).invoke(a.c.a);
                return Unit.a;
            default:
                int i2 = QuickAddStakeItem.M;
                return ((Context) obj).getDrawable(R.drawable.my_stake_error_bg);
        }
    }
}
