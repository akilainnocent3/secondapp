package defpackage;

import android.os.Bundle;
import com.sportybet.plugin.realsports.betslip.domain.model.SelectionId;
import com.sportybet.plugin.realsports.betslip.liabilitycheck.domain.model.LiabilityCheckSelection;
import com.twilio.voice.EventKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class s880 {
    public static final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            nek0 nek0Var = (nek0) obj;
            Bundle bundle = new Bundle();
            bundle.putInt(EventKeys.CALL_MESSAGE_EVENT_TYPE, nek0Var.a());
            bundle.putLong("event_timestamp", nek0Var.b());
            arrayList2.add(bundle);
        }
        return arrayList2;
    }

    public static final LiabilityCheckSelection b(SelectionId selectionId) {
        ArrayList arrayList = null;
        if (selectionId == null) {
            return null;
        }
        String eventId = selectionId.getEventId();
        String marketId = selectionId.getMarketId();
        String outcomeId = selectionId.getOutcomeId();
        String specifier = selectionId.getSpecifier();
        List childSelections = selectionId.getChildSelections();
        if (childSelections != null) {
            arrayList = new ArrayList();
            Iterator it = childSelections.iterator();
            while (it.hasNext()) {
                LiabilityCheckSelection liabilityCheckSelectionB = b((SelectionId) it.next());
                if (liabilityCheckSelectionB != null) {
                    arrayList.add(liabilityCheckSelectionB);
                }
            }
        }
        return new LiabilityCheckSelection(eventId, marketId, outcomeId, specifier, arrayList, null, null, 96, null);
    }
}
