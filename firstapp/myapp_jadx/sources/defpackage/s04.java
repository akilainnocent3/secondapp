package defpackage;

import com.sporty.android.core.model.loyalty.streak.BettingStreakAchievementDto;
import com.sporty.android.core.model.loyalty.streak.BettingStreakCalendarDto;
import com.sporty.android.core.model.loyalty.streak.LoyaltyBettingStreakDayStatus;
import com.sporty.android.core.model.loyalty.streak.LoyaltyBettingStreakLevel;
import com.sporty.android.core.model.loyalty.streak.StreakWeekDto;
import com.sportygames.goldmine.data.dto.oBji.dLRYz;
import j$.time.DayOfWeek;
import j$.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class s04 {

    /* JADX INFO: loaded from: classes4.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LoyaltyBettingStreakDayStatus.values().length];
            try {
                iArr[LoyaltyBettingStreakDayStatus.Streak.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoyaltyBettingStreakDayStatus.Break.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoyaltyBettingStreakDayStatus.Event.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LoyaltyBettingStreakDayStatus.Repaired.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LoyaltyBettingStreakDayStatus.Upcoming.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return Integer.valueOf(((a7e0) t).a.a).compareTo(Integer.valueOf(((a7e0) t2).a.a));
        }
    }

    public static h04 a(BettingStreakAchievementDto bettingStreakAchievementDto) {
        bettingStreakAchievementDto.getClass();
        t6e0.a aVar = t6e0.b;
        int currentStreakLevel = bettingStreakAchievementDto.getCurrentStreakLevel();
        aVar.getClass();
        t6e0 t6e0VarA = t6e0.a.a(currentStreakLevel);
        List<LoyaltyBettingStreakLevel> levels = bettingStreakAchievementDto.getLevels();
        ArrayList arrayList = new ArrayList(l48.r(levels, 10));
        for (LoyaltyBettingStreakLevel loyaltyBettingStreakLevel : levels) {
            t6e0.a aVar2 = t6e0.b;
            int level = loyaltyBettingStreakLevel.getLevel();
            aVar2.getClass();
            arrayList.add(new a7e0(t6e0.a.a(level), loyaltyBettingStreakLevel.getThreshold(), loyaltyBettingStreakLevel.getBoost()));
        }
        return new h04(t6e0VarA, CollectionsKt.r0(arrayList, new b()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static r04 b(BettingStreakCalendarDto bettingStreakCalendarDto) {
        Pair pair;
        o4e0 o4e0Var;
        bettingStreakCalendarDto.getClass();
        List<StreakWeekDto> weeks = bettingStreakCalendarDto.getWeeks();
        ArrayList arrayList = new ArrayList(l48.r(weeks, 10));
        for (StreakWeekDto streakWeekDto : weeks) {
            String displayWeek = streakWeekDto.getDisplayWeek();
            int year = LocalDate.now().getYear();
            try {
                List listSplit$default = StringsKt__StringsKt.split$default(displayWeek, new String[]{" - "}, false, 0, 6, null);
                List listSplit$default2 = StringsKt__StringsKt.split$default(StringsKt.t0((String) listSplit$default.get(0)).toString(), new String[]{" "}, false, 0, 6, null);
                List listSplit$default3 = StringsKt__StringsKt.split$default(StringsKt.t0((String) listSplit$default.get(1)).toString(), new String[]{" "}, false, 0, 6, null);
                int i = Integer.parseInt((String) listSplit$default2.get(0));
                int iC = listSplit$default2.size() > 1 ? c((String) listSplit$default2.get(1)) : c((String) listSplit$default3.get(1));
                int i2 = Integer.parseInt((String) listSplit$default3.get(0));
                int iC2 = c((String) listSplit$default3.get(1));
                pair = new Pair(LocalDate.of(year, iC, i), iC2 < iC ? LocalDate.of(year + 1, iC2, i2) : LocalDate.of(year, iC2, i2));
            } catch (Exception e) {
                itf0.a.f(e, "Failed to parse week range: %s", displayWeek);
                LocalDate localDateE = LocalDate.now().e(DayOfWeek.SUNDAY);
                pair = new Pair(localDateE, localDateE.plusDays(6L));
            }
            LocalDate localDate = (LocalDate) pair.a;
            LocalDate localDate2 = (LocalDate) pair.b;
            String displayWeek2 = streakWeekDto.getDisplayWeek();
            List<LoyaltyBettingStreakDayStatus> days = streakWeekDto.getDays();
            ArrayList arrayList2 = new ArrayList(l48.r(days, 10));
            Iterator<T> it = days.iterator();
            while (it.hasNext()) {
                int i3 = a.a[((LoyaltyBettingStreakDayStatus) it.next()).ordinal()];
                if (i3 == 1) {
                    o4e0Var = o4e0.a;
                } else if (i3 == 2) {
                    o4e0Var = o4e0.b;
                } else if (i3 == 3) {
                    o4e0Var = o4e0.c;
                } else if (i3 == 4) {
                    o4e0Var = o4e0.e;
                } else {
                    if (i3 != 5) {
                        uhc.a();
                        return null;
                    }
                    o4e0Var = o4e0.d;
                }
                arrayList2.add(o4e0Var);
            }
            arrayList.add(new r7e0(displayWeek2, localDate, localDate2, arrayList2));
        }
        return new r04(arrayList);
    }

    public static b24 d(l24 l24Var) {
        Object obj;
        Object next;
        l24Var.getClass();
        uag uagVar = s24.c;
        q3.b bVarA = ocx.a(uagVar, uagVar);
        do {
            obj = null;
            if (!bVarA.hasNext()) {
                next = null;
                break;
            }
            next = bVarA.next();
            ((s24) next).getClass();
        } while (!"PLACING_WAGER".equals(l24Var.getType()));
        s24 s24Var = (s24) next;
        uag uagVar2 = r24.e;
        q3.b bVarA2 = ocx.a(uagVar2, uagVar2);
        while (bVarA2.hasNext()) {
            Object next2 = bVarA2.next();
            if (((r24) next2).a.equals(l24Var.getCom.sporty.android.core.model.tracking.AnalyticsParam.EVENT_STATUS java.lang.String())) {
                obj = next2;
                break;
            }
        }
        return new b24(s24Var, (r24) obj, l24Var.getEndTime(), l24Var.getCurrent(), l24Var.getTarget(), l24Var.getCurrency());
    }

    public static int c(String str) {
        switch (str.hashCode()) {
            case 66051:
                if (str.equals("Apr")) {
                    return 4;
                }
                break;
            case 66195:
                if (str.equals("Aug")) {
                    return 8;
                }
                break;
            case 68578:
                if (str.equals("Dec")) {
                    return 12;
                }
                break;
            case 70499:
                if (str.equals(dLRYz.aPET)) {
                    return 2;
                }
                break;
            case 74231:
                if (str.equals("Jan")) {
                    return 1;
                }
                break;
            case 74849:
                if (str.equals("Jul")) {
                    return 7;
                }
                break;
            case 74851:
                if (str.equals("Jun")) {
                    return 6;
                }
                break;
            case 77118:
                if (str.equals("Mar")) {
                    return 3;
                }
                break;
            case 77125:
                if (str.equals("May")) {
                    return 5;
                }
                break;
            case 78517:
                if (str.equals("Nov")) {
                    return 11;
                }
                break;
            case 79104:
                if (str.equals("Oct")) {
                    return 10;
                }
                break;
            case 83006:
                if (str.equals("Sep")) {
                    return 9;
                }
                break;
        }
        return LocalDate.now().getMonthValue();
    }
}
