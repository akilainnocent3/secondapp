package defpackage;

import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.remixbet.RemixBetPageDto;
import com.sporty.android.core.model.remixbet.RemixBetResponse;
import com.sporty.android.core.model.remixbet.RemixPickDto;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class y450 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v15, types: [m2g] */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.util.ArrayList] */
    public static z450 a(RemixBetResponse remixBetResponse) {
        UiText uiTextH;
        ?? arrayList;
        String strL;
        remixBetResponse.getClass();
        List<RemixBetPageDto> pages = remixBetResponse.getPages();
        List list = null;
        if (pages != null) {
            ArrayList arrayList2 = new ArrayList(l48.r(pages, 10));
            for (RemixBetPageDto remixBetPageDto : pages) {
                Integer foldsAmount = remixBetPageDto.getFoldsAmount();
                int iIntValue = foldsAmount != null ? foldsAmount.intValue() : 0;
                if (iIntValue == 1) {
                    StringUiText stringUiText = vch0.a;
                    uiTextH = new ResourceUiText(R.string.component_betslip__singles);
                } else if (iIntValue == 2) {
                    StringUiText stringUiText2 = vch0.a;
                    uiTextH = new ResourceUiText(R.string.component_betslip__doubles);
                } else if (iIntValue == 3) {
                    StringUiText stringUiText3 = vch0.a;
                    uiTextH = new ResourceUiText(R.string.component_betslip__trebles);
                } else {
                    uiTextH = iIntValue >= 4 ? vch0.d(String.valueOf(iIntValue)).h(new StringUiText(" ")).h(new ResourceUiText(R.string.component_betslip__folds_with_space)) : vch0.a;
                }
                Double totalOdds = remixBetPageDto.getTotalOdds();
                double dDoubleValue = totalOdds != null ? totalOdds.doubleValue() : 0.0d;
                String shareCode = remixBetPageDto.getShareCode();
                if (shareCode == null) {
                    shareCode = "";
                }
                ConcatUiText concatUiTextH = uiTextH.h(new StringUiText(" 1 x ")).h(vch0.d(String.valueOf(dDoubleValue)));
                List<RemixPickDto> picks = remixBetPageDto.getPicks();
                if (picks != null) {
                    arrayList = new ArrayList(l48.r(picks, 10));
                    for (RemixPickDto remixPickDto : picks) {
                        String strA = rrf.a(remixPickDto.getSportId());
                        String str = strA.length() == 0 ? null : strA;
                        String outcomeDescription = remixPickDto.getOutcomeDescription();
                        String marketDescription = remixPickDto.getMarketDescription();
                        String homeTeamName = remixPickDto.getHomeTeamName();
                        String awayTeamName = remixPickDto.getAwayTeamName();
                        Long startTime = remixPickDto.getStartTime();
                        if (startTime != null) {
                            Date date = new Date(startTime.longValue());
                            Locale locale = Locale.getDefault();
                            locale.getClass();
                            strL = bwf0.l(date, "HH:mm - dd MMM", locale, 2, 0);
                        } else {
                            strL = null;
                        }
                        Double odds = remixPickDto.getOdds();
                        arrayList.add(new w550(str, outcomeDescription, marketDescription, homeTeamName, awayTeamName, strL, odds != null ? String.valueOf(odds.doubleValue()) : null));
                    }
                } else {
                    arrayList = 0;
                }
                if (arrayList == 0) {
                    arrayList = m2g.a;
                }
                arrayList2.add(new f450(shareCode, concatUiTextH, arrayList));
            }
            list = arrayList2;
        }
        if (list == null) {
            list = m2g.a;
        }
        return new z450(list);
    }
}
