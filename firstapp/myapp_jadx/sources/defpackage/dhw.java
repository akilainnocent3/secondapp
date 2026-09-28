package defpackage;

import com.sportybet.android.multimaker.domain.model.MultiMakerMarket;
import com.sportybet.plugin.realsports.data.Market;

/* JADX INFO: loaded from: classes4.dex */
public final class dhw {
    public static final MultiMakerMarket a(Market market) {
        String str;
        String str2;
        if (market == null) {
            return new MultiMakerMarket(0);
        }
        String str3 = market.id;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = market.specifier;
        if (str4 == null) {
            str2 = "";
            str = str2;
        } else {
            str = str4;
            str2 = "";
        }
        int i = market.product;
        String str5 = market.desc;
        if (str5 == null) {
            str5 = str2;
        }
        return new MultiMakerMarket(str3, i, market.status, str, str5);
    }
}
