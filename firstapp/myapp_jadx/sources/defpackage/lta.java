package defpackage;

import android.widget.CompoundButton;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.realsports.betslip.widget.d;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class lta implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ d a;

    public lta(d dVar) {
        this.a = dVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        d dVar = this.a;
        if (dVar.s0) {
            return;
        }
        dVar.s0(z);
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("source", AnalyticsParam.EVENT_SOURCE_CONFIRM_SHEET), new AbstractMap.SimpleEntry(AnalyticsParam.EVENT_STATUS, z ? AnalyticsParam.EVENT_STATUS_CHECKED : AnalyticsParam.EVENT_STATUS_UNCHECKED)};
        HashMap map = new HashMap(2);
        for (int i = 0; i < 2; i++) {
            Map.Entry entry = entryArr[i];
            Object key = entry.getKey();
            if (w1k.a(key, entry, map, key) != null) {
                hb5.a(wga.a(key, "duplicate key: "));
                return;
            }
        }
        Map<String, ? extends Object> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        f00 f00Var = vgb0.a;
        mapUnmodifiableMap.getClass();
        vgb0.c(AnalyticsEvent.BETSLIP_GIFT_CHECKBOX_CLICK, mapUnmodifiableMap, false);
        dVar.C.c(AnalyticsEvent.BETSLIP_GIFT_CHECKBOX_CLICK, mapUnmodifiableMap, null);
    }
}
