package defpackage;

import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.transaction.ui.txlist.TxListActivity;
import com.sportybet.android.transaction.ui.txlist.model.TxListItem;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.commons.models.PromotionGiftsResponse;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.Status;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bd90 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bd90(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PromotionGiftsResponse promotionGiftsResponse;
        brg0 brg0Var;
        String str;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
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
            default:
                TxListActivity txListActivity = (TxListActivity) obj2;
                TxListItem txListItem = (TxListItem) obj;
                int i3 = TxListActivity.K;
                txListItem.getClass();
                if ((txListItem instanceof TxListItem.b) && (str = (brg0Var = ((TxListItem.b) txListItem).a).a) != null && str.length() != 0) {
                    txListActivity.z.b(new a3h0(brg0Var.a));
                    String string = brg0Var.k.e(txListActivity).toString();
                    iym iymVarZ1 = txListActivity.z1();
                    StringUiText stringUiText = qqg0.a;
                    gym.a(iymVarZ1, new xpg0.c(string.replace(" - ", "-").replace(" ", "_").toLowerCase()));
                }
                break;
        }
        return Unit.a;
    }
}
