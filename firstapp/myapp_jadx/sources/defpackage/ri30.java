package defpackage;

import android.content.Intent;
import com.sportybet.plugin.realsports.data.QuickMarketHelper;
import com.sportybet.plugin.realsports.data.QuickMarketItem;
import com.sportybet.plugin.realsports.data.QuickMarketSpotEnum;
import com.sportybet.plugin.realsports.quickmarket.QuickMarketOptionActivity;
import com.sportybet.plugin.realsports.quickmarket.data.MarketGroupDict;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class ri30 implements mi30.a {
    public final /* synthetic */ QuickMarketOptionActivity a;

    public ri30(QuickMarketOptionActivity quickMarketOptionActivity) {
        this.a = quickMarketOptionActivity;
    }

    @Override // mi30.a
    public final void a(MarketGroupDict marketGroupDict) {
        if (marketGroupDict.getId() != null) {
            QuickMarketOptionActivity quickMarketOptionActivity = this.a;
            di30 di30Var = quickMarketOptionActivity.b;
            if (di30Var != null) {
                di30Var.i(String.valueOf(marketGroupDict.getMarketId()));
            }
            QuickMarketItem quickMarketItem = new QuickMarketItem();
            quickMarketItem.title = marketGroupDict.getTitle();
            quickMarketItem.displayName = marketGroupDict.getName();
            quickMarketItem.marketId = marketGroupDict.getMarketId();
            QuickMarketHelper.addQuickMarketMenuItem(quickMarketItem, QuickMarketSpotEnum.LIVE_PAGE_LIVE_EVENTS, quickMarketOptionActivity.e, quickMarketOptionActivity.getAccountHelper().getUserId());
            if (quickMarketItem.isValid()) {
                Intent intent = new Intent();
                String str = quickMarketItem.marketId;
                String str2 = quickMarketItem.displayName;
                String str3 = quickMarketItem.specifierName;
                boolean z = quickMarketItem.hasSpecifier;
                String[] titles = quickMarketItem.getTitles();
                quickMarketOptionActivity.setResult(-1, intent.putExtra("SELECT_MARKET_DATA", new RegularMarketRule(false, str, str2, str3, z, (String[]) Arrays.copyOf(titles, titles.length))));
            }
            quickMarketOptionActivity.finish();
        }
    }
}
