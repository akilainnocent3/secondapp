package defpackage;

import com.sporty.android.core.model.OrderBetType;
import com.sporty.android.core.model.gift.GiftBetBuilderType;
import com.sporty.android.core.model.gift.GiftDetails;
import com.sportybet.android.instantwin.model.InstantWinGiftApplicabilityContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes5.dex */
public final class gfo {

    /* JADX INFO: loaded from: classes.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[GiftBetBuilderType.values().length];
            try {
                iArr[GiftBetBuilderType.NO_LIMIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GiftBetBuilderType.LEAST_ONE_BET_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GiftBetBuilderType.ALL_BET_BUILDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static boolean a(GiftDetails giftDetails, InstantWinGiftApplicabilityContext.BetSlipType betSlipType) {
        List listK;
        betSlipType.getClass();
        if (betSlipType instanceof InstantWinGiftApplicabilityContext.BetSlipType.Single) {
            InstantWinGiftApplicabilityContext.BetCount betCount = ((InstantWinGiftApplicabilityContext.BetSlipType.Single) betSlipType).b;
            if (betCount instanceof InstantWinGiftApplicabilityContext.BetCount.Single) {
                if (c(giftDetails, b.k(OrderBetType.ALL, OrderBetType.SINGLE)) && b(giftDetails, (InstantWinGiftApplicabilityContext.BetCount.Single) betCount)) {
                    return true;
                }
            } else if (!(betCount instanceof InstantWinGiftApplicabilityContext.BetCount.Multiple)) {
                uhc.a();
                return false;
            }
        } else {
            if (!(betSlipType instanceof InstantWinGiftApplicabilityContext.BetSlipType.Multiple)) {
                if (betSlipType instanceof InstantWinGiftApplicabilityContext.BetSlipType.System) {
                    return false;
                }
                uhc.a();
                return false;
            }
            InstantWinGiftApplicabilityContext.BetSlipType.Multiple multiple = (InstantWinGiftApplicabilityContext.BetSlipType.Multiple) betSlipType;
            InstantWinGiftApplicabilityContext.BetCount betCount2 = multiple.b;
            if (betCount2 instanceof InstantWinGiftApplicabilityContext.BetCount.Single) {
                if (multiple.c) {
                    listK = b.k(OrderBetType.ALL, OrderBetType.MULTIPLE, OrderBetType.FLEX);
                } else {
                    listK = multiple.d ? b.k(OrderBetType.ALL, OrderBetType.MULTIPLE, OrderBetType.ONE_CUT) : b.k(OrderBetType.ALL, OrderBetType.MULTIPLE);
                }
                if (c(giftDetails, listK) && b(giftDetails, (InstantWinGiftApplicabilityContext.BetCount.Single) betCount2)) {
                    return true;
                }
            } else if (!(betCount2 instanceof InstantWinGiftApplicabilityContext.BetCount.Multiple)) {
                uhc.a();
                return false;
            }
        }
        return false;
    }

    public static boolean b(GiftDetails giftDetails, InstantWinGiftApplicabilityContext.BetCount.Single single) {
        GiftBetBuilderType next;
        int i = single.b;
        List<Integer> betBuilderTypes = giftDetails.getBetBuilderTypes();
        if (betBuilderTypes != null && !betBuilderTypes.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = betBuilderTypes.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                Iterator<GiftBetBuilderType> it2 = GiftBetBuilderType.getEntries().iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (next.getValue() != iIntValue);
                GiftBetBuilderType giftBetBuilderType = next;
                if (giftBetBuilderType != null) {
                    arrayList.add(giftBetBuilderType);
                }
            }
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    int i3 = a.a[((GiftBetBuilderType) obj).ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                uhc.a();
                                return false;
                            }
                            if (single.a == i) {
                            }
                        } else if (i > 0) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean c(GiftDetails giftDetails, List list) {
        OrderBetType next;
        List<Integer> betTypeScopes = giftDetails.getBetTypeScopes();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = betTypeScopes.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            Iterator<OrderBetType> it2 = OrderBetType.getEntries().iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (next.getValue() != iIntValue);
            OrderBetType orderBetType = next;
            if (orderBetType != null) {
                arrayList.add(orderBetType);
            }
        }
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (list.contains((OrderBetType) obj)) {
                    return true;
                }
            }
        }
        return false;
    }
}
