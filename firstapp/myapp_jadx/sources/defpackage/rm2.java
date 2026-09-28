package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballTicketMarket;
import com.sportybet.plugin.realsports.data.Bet;
import com.sportybet.plugin.realsports.data.BetSelection;
import com.sportybet.plugin.realsports.data.SubBet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
public final class rm2 {
    public static final fi6 a(List list, zl2 zl2Var, xo6 xo6Var) {
        boolean z = zl2Var.b;
        boolean z2 = zl2Var.a;
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            BetSelection betSelection = (BetSelection) it.next();
            if (!h(betSelection, xo6Var)) {
                return fi6.b;
            }
            int i3 = betSelection.status;
            if (i3 == 2 && !z2 && !z) {
                return fi6.c;
            }
            if ((i3 == 3 || i3 == 4 || i3 == 5 || i3 == 6) && (z2 || z)) {
                return fi6.c;
            }
            if (i3 == 0 || i3 == 1) {
                i2++;
            }
            if (i3 != 0) {
                i++;
            }
        }
        if (i == list.size()) {
            return fi6.d;
        }
        return ((z2 || z) && i2 < zl2Var.c) ? fi6.c : fi6.a;
    }

    public static String b(pl5 pl5Var) {
        StringBuilder sb = new StringBuilder(pl5Var.size());
        for (int i = 0; i < pl5Var.size(); i++) {
            byte bA = pl5Var.a(i);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                        } else {
                            sb.append((char) bA);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final BetSelection c(Bet bet, xo6 xo6Var) {
        Object next;
        bet.getClass();
        xo6Var.getClass();
        List<BetSelection> list = bet.selections;
        list.getClass();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            BetSelection betSelection = (BetSelection) next;
            betSelection.getClass();
            if (!h(betSelection, xo6Var)) {
                return (BetSelection) next;
            }
        }
        next = null;
        return (BetSelection) next;
    }

    public static final boolean d(List list) {
        if (!list.isEmpty()) {
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    List<String> list2 = ((BetSelection) it.next()).subBetIdIndex;
                    if (list2 == null || list2.isEmpty()) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean e(Bet bet, xo6 xo6Var) {
        bet.getClass();
        xo6Var.getClass();
        String str = bet.maxCashOutAmount;
        if (str != null && !StringsKt.U(str) && !Intrinsics.e(b.i(str), 0.0f)) {
            zl2 zl2Var = new zl2(bet.isFlexBet(), bet.isAnyWin(), bet.minToWin);
            int i = 0;
            if (bet.combinationNum == 1) {
                List<BetSelection> list = bet.selections;
                list.getClass();
                if (a(list, zl2Var, xo6Var) != fi6.a) {
                }
            } else {
                if (bet.isHugeCombo) {
                    List<BetSelection> list2 = bet.selections;
                    list2.getClass();
                    if (d(list2)) {
                        List<BetSelection> list3 = bet.selections;
                        ArrayList arrayListA = kw5.a(list3);
                        Iterator<T> it = list3.iterator();
                        while (it.hasNext()) {
                            Iterable iterable = ((BetSelection) it.next()).subBetIdIndex;
                            if (iterable == null) {
                                iterable = m2g.a;
                            }
                            p48.w(iterable, arrayListA);
                        }
                        List<String> listA0 = CollectionsKt.A0(CollectionsKt.D0(arrayListA));
                        ArrayList arrayList = new ArrayList(l48.r(listA0, 10));
                        for (String str2 : listA0) {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj : list3) {
                                List<String> list4 = ((BetSelection) obj).subBetIdIndex;
                                if (list4 != null && list4.contains(str2)) {
                                    arrayList2.add(obj);
                                }
                            }
                            arrayList.add(arrayList2);
                        }
                        ArrayList arrayList3 = new ArrayList(l48.r(arrayList, 10));
                        int size = arrayList.size();
                        while (i < size) {
                            Object obj2 = arrayList.get(i);
                            i++;
                            arrayList3.add(a((List) obj2, zl2Var, xo6Var));
                        }
                        return f(arrayList3);
                    }
                }
                List<SubBet> list5 = bet.subBets;
                if (list5 != null && !list5.isEmpty()) {
                    List<BetSelection> list6 = bet.selections;
                    list6.getClass();
                    if (d(list6)) {
                        List<SubBet> list7 = bet.subBets;
                        list7.getClass();
                        List<BetSelection> list8 = bet.selections;
                        list8.getClass();
                        ArrayList arrayList4 = new ArrayList(l48.r(list7, 10));
                        for (SubBet subBet : list7) {
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj3 : list8) {
                                List<String> list9 = ((BetSelection) obj3).subBetIdIndex;
                                if (list9 != null && list9.contains(String.valueOf(subBet.getSortNum()))) {
                                    arrayList5.add(obj3);
                                }
                            }
                            arrayList4.add(arrayList5);
                        }
                        ArrayList arrayList6 = new ArrayList(l48.r(arrayList4, 10));
                        int size2 = arrayList4.size();
                        while (i < size2) {
                            Object obj4 = arrayList4.get(i);
                            i++;
                            arrayList6.add(a((List) obj4, zl2Var, xo6Var));
                        }
                        return f(arrayList6);
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean f(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (((fi6) obj) == fi6.b) {
                        return true;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return true;
            }
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                if (((fi6) obj2) == fi6.c) {
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean g(Bet bet, xo6 xo6Var) {
        bet.getClass();
        xo6Var.getClass();
        return bet.isFlexBet() && !xo6Var.c;
    }

    public static final boolean h(BetSelection betSelection, xo6 xo6Var) {
        Object bVar;
        betSelection.getClass();
        xo6Var.getClass();
        Integer num = betSelection.settleStatus;
        boolean z = true;
        if ((num != null && num.intValue() == 1) || betSelection.status != 0 || betSelection.marketStatus != 0 || betSelection.isOutcomeActive == 1) {
            return true;
        }
        if (!xo6Var.a) {
            return false;
        }
        try {
            zi50.a aVar = zi50.b;
            float f = (float) betSelection.currentProbability;
            if (xo6Var.b > f || f > 1.0f) {
                z = false;
            }
            bVar = Boolean.valueOf(z);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        Object obj = Boolean.FALSE;
        if (bVar instanceof zi50.b) {
            bVar = obj;
        }
        return ((Boolean) bVar).booleanValue();
    }

    public static final vk70 i(NetworkScheduledFootballTicketMarket networkScheduledFootballTicketMarket) {
        String str;
        String str2;
        networkScheduledFootballTicketMarket.getClass();
        String marketId = networkScheduledFootballTicketMarket.getMarketId();
        if (marketId == null) {
            marketId = "";
        }
        String title = networkScheduledFootballTicketMarket.getTitle();
        if (title == null) {
            title = "";
        }
        String subTitle = networkScheduledFootballTicketMarket.getSubTitle();
        if (subTitle == null) {
            subTitle = "";
        }
        String bannerTitles = networkScheduledFootballTicketMarket.getBannerTitles();
        if (bannerTitles == null) {
            bannerTitles = "";
        }
        String oddTitles = networkScheduledFootballTicketMarket.getOddTitles();
        if (oddTitles == null) {
            String str3 = bannerTitles;
            str2 = "";
            str = str3;
        } else {
            str = bannerTitles;
            str2 = oddTitles;
        }
        return new vk70(marketId, title, subTitle, str, str2);
    }
}
