package com.sportybet.plugin.realsports.quickmarket;

import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.quickmarket.data.MarketItemResourceData;
import defpackage.rlf;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportybet/plugin/realsports/quickmarket/DarkQuickMenuOptionActivity;", "Lcom/sportybet/plugin/realsports/quickmarket/QuickMarketOptionActivity;", "Lrlf;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class DarkQuickMenuOptionActivity extends QuickMarketOptionActivity implements rlf {
    @Override // com.sportybet.plugin.realsports.quickmarket.QuickMarketOptionActivity
    /* JADX INFO: renamed from: A1 */
    public final int getY() {
        return R.color.text_type2_primary;
    }

    @Override // com.sportybet.plugin.realsports.quickmarket.QuickMarketOptionActivity
    /* JADX INFO: renamed from: B1 */
    public final String getZ() {
        return "1";
    }

    @Override // com.sportybet.plugin.realsports.quickmarket.QuickMarketOptionActivity
    /* JADX INFO: renamed from: C1 */
    public final MarketItemResourceData getA() {
        return new MarketItemResourceData(R.color.text_type2_primary, R.drawable.spr_quick_market_select_color, R.color.text_type2_primary);
    }

    @Override // com.sportybet.plugin.realsports.quickmarket.QuickMarketOptionActivity
    /* JADX INFO: renamed from: D1 */
    public final int getV() {
        return R.color.text_type2_primary;
    }

    @Override // com.sportybet.plugin.realsports.quickmarket.QuickMarketOptionActivity
    /* JADX INFO: renamed from: E1 */
    public final int getW() {
        return R.drawable.quick_market_menu_line_divider;
    }

    @Override // com.sportybet.plugin.realsports.quickmarket.QuickMarketOptionActivity
    /* JADX INFO: renamed from: z1 */
    public final int getI() {
        return R.color.background_type2_primary;
    }
}
