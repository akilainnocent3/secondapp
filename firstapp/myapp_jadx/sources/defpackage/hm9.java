package defpackage;

import com.sporty.android.core.model.realsports.liabilitycheck.LiabilityCheckDto;
import com.sportybet.plugin.realsports.betslip.liabilitycheck.domain.model.LiabilityCheckSelection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class hm9 {
    public static final op8 a = new op8(720505375, new gm9(), false);

    public static final LiabilityCheckDto a(LiabilityCheckSelection liabilityCheckSelection) {
        ArrayList arrayList;
        liabilityCheckSelection.getClass();
        String eventId = liabilityCheckSelection.getEventId();
        String marketId = liabilityCheckSelection.getMarketId();
        String outcomeId = liabilityCheckSelection.getOutcomeId();
        String specifier = liabilityCheckSelection.getSpecifier();
        String sportId = liabilityCheckSelection.getSportId();
        Boolean boolIsLive = liabilityCheckSelection.isLive();
        List<LiabilityCheckSelection> childSelections = liabilityCheckSelection.getChildSelections();
        if (childSelections != null) {
            arrayList = new ArrayList(l48.r(childSelections, 10));
            Iterator<T> it = childSelections.iterator();
            while (it.hasNext()) {
                arrayList.add(a((LiabilityCheckSelection) it.next()));
            }
        } else {
            arrayList = null;
        }
        return new LiabilityCheckDto(eventId, marketId, outcomeId, specifier, sportId, boolIsLive, arrayList);
    }
}
