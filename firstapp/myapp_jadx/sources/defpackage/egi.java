package defpackage;

import com.sporty.android.book.domain.entity.EventSource;
import com.sporty.android.book.domain.entity.EventSourceItem;
import com.sporty.android.book.domain.entity.SourceType;
import com.sporty.android.core.model.remixbet.RemixBetRequest;
import com.sporty.android.core.model.remixbet.RemixBetSelectionRequest;
import com.sportybet.plugin.realsports.data.RSelection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class egi {
    public static final /* synthetic */ int a = 0;

    public static final RemixBetRequest a(String str, String str2, String str3, Integer num, String str4, List list) {
        ArrayList arrayList;
        EventSourceItem preMatchSource;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(l48.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                RSelection rSelection = (RSelection) it.next();
                String str5 = rSelection.id;
                String str6 = rSelection.jointId;
                String str7 = rSelection.gameId;
                String str8 = rSelection.outcomeId;
                String str9 = rSelection.odds;
                String str10 = rSelection.marketDesc;
                String str11 = rSelection.outcomeDesc;
                String str12 = rSelection.home;
                String str13 = rSelection.away;
                String str14 = rSelection.categoryId;
                String str15 = rSelection.tournamentId;
                ArrayList arrayList3 = arrayList2;
                Long lValueOf = Long.valueOf(rSelection.startTime);
                EventSource eventSource = rSelection.eventSource;
                arrayList3.add(new RemixBetSelectionRequest(str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, lValueOf, Boolean.valueOf(((eventSource == null || (preMatchSource = eventSource.getPreMatchSource()) == null) ? null : preMatchSource.getSourceType()) == SourceType.BET_GENIUS)));
                arrayList2 = arrayList3;
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new RemixBetRequest(1, str, str2, str3, num, str4, arrayList);
    }
}
