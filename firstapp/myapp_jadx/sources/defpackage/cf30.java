package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.sporty.android.core.model.gift.GiftUtil;
import com.sporty.android.core.model.gift.SelectedGiftData;
import com.sportybet.plugin.realsports.betslip.widget.QuickBetView;

/* JADX INFO: loaded from: classes7.dex */
public final class cf30 implements View.OnClickListener {
    public final /* synthetic */ QuickBetView a;

    public cf30(QuickBetView quickBetView) {
        this.a = quickBetView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        QuickBetView quickBetView = this.a;
        if (quickBetView.getBetItem().m0()) {
            aj90 aj90Var = quickBetView.k0;
            if (aj90Var != null) {
                aj90Var.x1(quickBetView.getSingleGiftState().C, quickBetView.getCurrentTotalOddsForGift(), "0");
                return;
            }
            return;
        }
        SelectedGiftData selectedGiftData = quickBetView.getSingleGiftState().C;
        if (selectedGiftData == null || TextUtils.equals(GiftUtil.CLEARED_GIFT_VALUE, selectedGiftData.getGiftValue())) {
            yyk yykVar = quickBetView.i0;
            if (yykVar != null) {
                yykVar.F1(true);
                return;
            }
            return;
        }
        vjk.b bVar = new vjk.b(selectedGiftData.getRawGift(), selectedGiftData, quickBetView.getSingleGiftState().b);
        yyk yykVar2 = quickBetView.i0;
        if (yykVar2 != null) {
            yykVar2.K1(bVar);
        }
    }
}
