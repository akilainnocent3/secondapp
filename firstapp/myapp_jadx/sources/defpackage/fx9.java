package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingTicketMarket;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public final class fx9 {
    public static final op8 a = new op8(1323307974, new yw9(), false);
    public static final op8 b = new op8(-772710817, new ax9(), false);
    public static final op8 c = new op8(-1019886444, new cx9(), false);
    public static final /* synthetic */ int d = 0;
    public static final /* synthetic */ int e = 0;

    public static final w4o a(NetworkInstantRacingTicketMarket networkInstantRacingTicketMarket) {
        Object next;
        String lowerCase;
        String lowerCase2;
        networkInstantRacingTicketMarket.getClass();
        uag uagVar = jzn.f;
        q3.b bVarA = ocx.a(uagVar, uagVar);
        do {
            if (!bVarA.hasNext()) {
                next = null;
                break;
            }
            next = bVarA.next();
            String str = ((jzn) next).a;
            Locale locale = Locale.ROOT;
            lowerCase = str.toLowerCase(locale);
            lowerCase.getClass();
            String marketType = networkInstantRacingTicketMarket.getMarketType();
            if (marketType != null) {
                lowerCase2 = marketType.toLowerCase(locale);
                lowerCase2.getClass();
            } else {
                lowerCase2 = null;
            }
        } while (!lowerCase.equals(lowerCase2));
        jzn jznVar = (jzn) next;
        if (jznVar == null) {
            return null;
        }
        String marketId = networkInstantRacingTicketMarket.getMarketId();
        String str2 = marketId == null ? "" : marketId;
        String title = networkInstantRacingTicketMarket.getTitle();
        String str3 = title == null ? "" : title;
        String subtitle = networkInstantRacingTicketMarket.getSubtitle();
        String str4 = subtitle == null ? "" : subtitle;
        String bannerTitles = networkInstantRacingTicketMarket.getBannerTitles();
        String str5 = bannerTitles == null ? "" : bannerTitles;
        String oddTitles = networkInstantRacingTicketMarket.getOddTitles();
        return new w4o(str2, jznVar, str3, str4, str5, oddTitles == null ? "" : oddTitles);
    }
}
