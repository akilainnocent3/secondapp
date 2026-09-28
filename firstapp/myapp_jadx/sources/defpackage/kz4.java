package defpackage;

import android.text.format.DateUtils;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.bookingcode.BookingCodeInfoDto;
import com.sporty.android.core.model.bookingcode.BookingCodeInfoOutcomeDto;
import com.sporty.android.core.model.bookingcode.CategoryDto;
import com.sporty.android.core.model.bookingcode.EventDto;
import com.sporty.android.core.model.bookingcode.MarketDto;
import com.sporty.android.core.model.bookingcode.OutcomeDto;
import com.sporty.android.core.model.bookingcode.RecommendBookingCodeDto;
import com.sporty.android.core.model.bookingcode.SportDto;
import com.sporty.android.core.model.bookingcode.TournamentDto;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes4.dex */
public final class kz4 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayList a(String str, String str2, List list) {
        CategoryDto category;
        TournamentDto tournament;
        ArrayList arrayListA = kw5.a(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RecommendBookingCodeDto recommendBookingCodeDto = (RecommendBookingCodeDto) it.next();
            String bookingCode = recommendBookingCodeDto.getBookingCode();
            if (bookingCode == null) {
                bookingCode = "";
            }
            String str3 = bookingCode;
            Object bookingCodeInfoDto = null;
            if (!StringsKt.U(str3)) {
                List<EventDto> outcomes = recommendBookingCodeDto.getOutcomes();
                ArrayList arrayList = new ArrayList();
                for (EventDto eventDto : outcomes) {
                    List<MarketDto> markets = eventDto.getMarkets();
                    ArrayList arrayList2 = new ArrayList();
                    for (MarketDto marketDto : markets) {
                        List<OutcomeDto> outcomes2 = marketDto.getOutcomes();
                        ArrayList arrayList3 = new ArrayList(l48.r(outcomes2, 10));
                        for (OutcomeDto outcomeDto : outcomes2) {
                            String awayTeamName = eventDto.getAwayTeamName();
                            String eventId = eventDto.getEventId();
                            String homeTeamName = eventDto.getHomeTeamName();
                            String desc = marketDto.getDesc();
                            String id = marketDto.getId();
                            String odds = outcomeDto.getOdds();
                            Double dH = odds != null ? b.h(odds) : null;
                            String desc2 = outcomeDto.getDesc();
                            String id2 = outcomeDto.getId();
                            SportDto sport = eventDto.getSport();
                            String id3 = sport != null ? sport.getId() : null;
                            Long estimateStartTime = eventDto.getEstimateStartTime();
                            SportDto sport2 = eventDto.getSport();
                            arrayList3.add(new BookingCodeInfoOutcomeDto(awayTeamName, null, eventId, homeTeamName, desc, id, dH, desc2, id2, id3, estimateStartTime, (sport2 == null || (category = sport2.getCategory()) == null || (tournament = category.getTournament()) == null) ? null : tournament.getTournamentIcon(), str, str2));
                        }
                        p48.w(arrayList3, arrayList2);
                    }
                    p48.w(arrayList2, arrayList);
                }
                if (!arrayList.isEmpty()) {
                    List<EventDto> outcomes3 = recommendBookingCodeDto.getOutcomes();
                    ArrayList arrayList4 = new ArrayList();
                    Iterator<T> it2 = outcomes3.iterator();
                    while (it2.hasNext()) {
                        String eventId2 = ((EventDto) it2.next()).getEventId();
                        if (eventId2 != null) {
                            arrayList4.add(eventId2);
                        }
                    }
                    int size = CollectionsKt.A0(CollectionsKt.D0(arrayList4)).size();
                    ArrayList arrayList5 = new ArrayList();
                    int size2 = arrayList.size();
                    int i = 0;
                    while (i < size2) {
                        Object obj = arrayList.get(i);
                        i++;
                        Double odds2 = ((BookingCodeInfoOutcomeDto) obj).getOdds();
                        if (odds2 != null) {
                            arrayList5.add(odds2);
                        }
                    }
                    if (arrayList5.isEmpty()) {
                        arrayList5 = null;
                    }
                    if (arrayList5 != null) {
                        Iterator it3 = arrayList5.iterator();
                        if (!it3.hasNext()) {
                            zkh.a("Empty collection can't be reduced.");
                            return null;
                        }
                        Object next = it3.next();
                        while (it3.hasNext()) {
                            next = Double.valueOf(((Number) next).doubleValue() * ((Number) it3.next()).doubleValue());
                        }
                        bookingCodeInfoDto = (Double) next;
                    }
                    bookingCodeInfoDto = new BookingCodeInfoDto(null, null, Integer.valueOf(size), null, null, str3, arrayList, null, null, bookingCodeInfoDto, null, false, null, 6144, null);
                }
            }
            if (bookingCodeInfoDto != null) {
                arrayListA.add(bookingCodeInfoDto);
            }
        }
        return arrayListA;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0086  */
    public static final sy4 b(BookingCodeInfoOutcomeDto bookingCodeInfoOutcomeDto, boolean z, boolean z2) {
        UiText stringUiText;
        ofb0 ofb0VarB = pfb0.b(bookingCodeInfoOutcomeDto.getSportId());
        String eventId = bookingCodeInfoOutcomeDto.getEventId();
        rz4 aVar = eventId != null ? b3.T(eventId) : false ? rz4.b.a : new rz4.a(z, z2);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM EEE HH:mm", Locale.getDefault());
        Long startTime = bookingCodeInfoOutcomeDto.getStartTime();
        if (startTime == null) {
            stringUiText = vch0.a;
        } else {
            if (startTime.longValue() <= 0) {
                startTime = null;
            }
            if (startTime != null) {
                long jLongValue = startTime.longValue();
                if (DateUtils.isToday(jLongValue)) {
                    StringUiText stringUiText2 = vch0.a;
                    stringUiText = jz4.a(new ResourceUiText(R.string.common_dates__today), " ").h(new StringUiText(bwf0.a.s(jLongValue, true)));
                } else {
                    String str = simpleDateFormat.format(new Date(jLongValue));
                    str.getClass();
                    StringUiText stringUiText3 = vch0.a;
                    stringUiText = new StringUiText(str);
                }
            } else {
                stringUiText = vch0.a;
            }
        }
        UiText uiText = stringUiText;
        Double odds = bookingCodeInfoOutcomeDto.getOdds();
        StringUiText stringUiText4 = new StringUiText(inm.a("@", gky.a.a(bjb0.a0(odds != null ? odds.doubleValue() : 0.0d, Locale.US), false)));
        String sportId = bookingCodeInfoOutcomeDto.getSportId();
        String eventId2 = bookingCodeInfoOutcomeDto.getEventId();
        String marketId = bookingCodeInfoOutcomeDto.getMarketId();
        String outcomeId = bookingCodeInfoOutcomeDto.getOutcomeId();
        String tournamentIcon = bookingCodeInfoOutcomeDto.getTournamentIcon();
        String outcomeDescription = bookingCodeInfoOutcomeDto.getOutcomeDescription();
        if (outcomeDescription == null) {
            outcomeDescription = "";
        }
        StringUiText stringUiText5 = new StringUiText(outcomeDescription);
        String marketDescription = bookingCodeInfoOutcomeDto.getMarketDescription();
        if (marketDescription == null) {
            marketDescription = "";
        }
        StringUiText stringUiText6 = new StringUiText(marketDescription);
        String homeTeamName = bookingCodeInfoOutcomeDto.getHomeTeamName();
        if (homeTeamName == null) {
            homeTeamName = "";
        }
        StringUiText stringUiText7 = new StringUiText(homeTeamName);
        String awayTeamName = bookingCodeInfoOutcomeDto.getAwayTeamName();
        return new sy4(sportId, eventId2, marketId, outcomeId, tournamentIcon, stringUiText5, stringUiText4, stringUiText6, uiText, stringUiText7, new StringUiText(awayTeamName != null ? awayTeamName : ""), bookingCodeInfoOutcomeDto.getHomeTeamIcon(), bookingCodeInfoOutcomeDto.getAwayTeamIcon(), pfb0.a(ofb0VarB, e9f0.a), pfb0.a(ofb0VarB, e9f0.b), aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v0, types: [m2g] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v15, types: [m2g] */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v2 */
    public static final gz4 c(BookingCodeInfoDto bookingCodeInfoDto, boolean z, boolean z2, boolean z3, int i, int i2, String str, String str2, String str3, String str4) {
        ?? arrayList;
        int iNextIndex;
        String strValueOf;
        String strB;
        Pair pair;
        List listR0;
        bookingCodeInfoDto.getClass();
        int i3 = 0;
        if (z2) {
            List<BookingCodeInfoOutcomeDto> outcomeInfos = bookingCodeInfoDto.getOutcomeInfos();
            if (outcomeInfos == null || (listR0 = CollectionsKt.r0(outcomeInfos, vl8.a(new hz4(str, i3), new iz4(0)))) == null) {
                arrayList = m2g.a;
            } else {
                arrayList = new ArrayList(l48.r(listR0, 10));
                int i4 = 0;
                for (Object obj : listR0) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        kotlin.collections.b.q();
                        throw null;
                    }
                    BookingCodeInfoOutcomeDto bookingCodeInfoOutcomeDto = (BookingCodeInfoOutcomeDto) obj;
                    arrayList.add(b(bookingCodeInfoOutcomeDto, Intrinsics.g(bookingCodeInfoOutcomeDto.getEventId(), str), z));
                    i4 = i5;
                }
            }
        } else {
            List<BookingCodeInfoOutcomeDto> outcomeInfos2 = bookingCodeInfoDto.getOutcomeInfos();
            if (outcomeInfos2 != null) {
                arrayList = new ArrayList(l48.r(outcomeInfos2, 10));
                Iterator it = outcomeInfos2.iterator();
                while (it.hasNext()) {
                    arrayList.add(b((BookingCodeInfoOutcomeDto) it.next(), false, z));
                }
            } else {
                arrayList = m2g.a;
            }
        }
        ?? r11 = arrayList;
        ListIterator listIterator = r11.listIterator(r11.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            if (Intrinsics.g(((sy4) listIterator.previous()).b, str)) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        int i6 = iNextIndex == r11.size() - 1 ? -1 : iNextIndex;
        String bookingCode = bookingCodeInfoDto.getBookingCode();
        double dB = oxo.b(bookingCodeInfoDto.getFoldsAmount());
        if (Double.isNaN(dB) || Double.isInfinite(dB)) {
            strValueOf = String.valueOf(dB);
        } else {
            String str5 = dB < 0.0d ? "-" : "";
            double dAbs = Math.abs(dB);
            if (dAbs >= 1.0E12d) {
                pair = new Pair(Double.valueOf(1.0E12d), "T");
            } else if (dAbs >= 1.0E9d) {
                pair = new Pair(Double.valueOf(1.0E9d), "B");
            } else if (dAbs >= 1000000.0d) {
                pair = new Pair(Double.valueOf(1000000.0d), "M");
            } else {
                pair = dAbs >= 1000.0d ? new Pair(Double.valueOf(1000.0d), "K") : new Pair(Double.valueOf(1.0d), "");
            }
            double dDoubleValue = ((Number) pair.a).doubleValue();
            String str6 = (String) pair.b;
            BigDecimal scale = BigDecimal.valueOf(dAbs / dDoubleValue).setScale(3, RoundingMode.HALF_UP);
            strValueOf = tug.a(str5, (scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).toPlainString(), str6);
        }
        StringUiText stringUiTextD = vch0.d(strValueOf);
        Double totalOdds = bookingCodeInfoDto.getTotalOdds();
        return new gz4(bookingCode, stringUiTextD, (totalOdds == null || (strB = gky.a.b(totalOdds.doubleValue(), true)) == null) ? vch0.a : new StringUiText(strB), r11, bookingCodeInfoDto.isBetBuilder(), z3, i6, Intrinsics.g(bookingCodeInfoDto.getBookingCode(), str2) ? tzs.b.a : tzs.a.a, Intrinsics.g(bookingCodeInfoDto.getBookingCode(), str3) ? tzs.b.a : tzs.a.a, Intrinsics.g(bookingCodeInfoDto.getBookingCode(), str4) ? tzs.b.a : tzs.a.a, i, i2);
    }

    public static /* synthetic */ gz4 d(BookingCodeInfoDto bookingCodeInfoDto, boolean z, boolean z2, int i, String str, String str2, String str3, int i2) {
        boolean z3 = (i2 & 1) != 0 ? false : z;
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        return c(bookingCodeInfoDto, z3, false, z2, (i2 & 8) != 0 ? 130 : i, (i2 & 16) == 0 ? 120 : 0, null, (i2 & 64) != 0 ? null : str, (i2 & 128) != 0 ? null : str2, (i2 & 256) != 0 ? null : str3);
    }

    public static List e(Iterable iterable, sch schVar, boolean z, boolean z2, int i, String str, String str2, String str3, String str4, int i2) {
        boolean z3 = (i2 & 4) == 0;
        int i3 = (i2 & 16) != 0 ? 130 : i;
        String str5 = (i2 & 64) != 0 ? null : str;
        iterable.getClass();
        schVar.getClass();
        ArrayList arrayList = new ArrayList(l48.r(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(c((BookingCodeInfoDto) it.next(), z, z3, z2, i3, 0, str5, str2, str3, str4));
        }
        if (arrayList.isEmpty()) {
            return m2g.a;
        }
        int iOrdinal = schVar.ordinal();
        if (iOrdinal == 0) {
            return CollectionsKt.i0(a.c(CollectionsKt.b0(arrayList)), CollectionsKt.i0(arrayList, a.c(CollectionsKt.T(arrayList))));
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            return arrayList;
        }
        uhc.a();
        return null;
    }
}
