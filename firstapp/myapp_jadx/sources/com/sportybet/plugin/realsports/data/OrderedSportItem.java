package com.sportybet.plugin.realsports.data;

import android.text.TextUtils;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.itf0;
import defpackage.vch0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class OrderedSportItem {
    public int eventSize;
    public String id;
    public UiText nameUiText;

    public OrderedSportItem(String str, UiText uiText, int i) {
        this.id = str;
        this.nameUiText = uiText;
        this.eventSize = i;
    }

    public static OrderedSportItem fromJSONObject(String str) {
        OrderedSportItem orderedSportItem = new OrderedSportItem();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                orderedSportItem.id = jSONObject.optString(AnalyticsParam.EVENT_PARAM_ID, "");
                orderedSportItem.eventSize = jSONObject.optInt("es", 0);
                return orderedSportItem;
            } catch (Exception e) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_COMMON);
                aVar.p(e, "Can't create OrderedSportItem from JsonObject: %s", str);
            }
        }
        return orderedSportItem;
    }

    public boolean hasName() {
        UiText uiText = this.nameUiText;
        return (uiText == null || uiText.equals(vch0.a)) ? false : true;
    }

    public boolean isValid() {
        return !TextUtils.isEmpty(this.id);
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AnalyticsParam.EVENT_PARAM_ID, this.id);
            jSONObject.put("es", this.eventSize);
            return jSONObject;
        } catch (Exception e) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_COMMON);
            aVar.p(e, "Can't convert OrderedSportItem to JsonObject", new Object[0]);
            return jSONObject;
        }
    }

    public OrderedSportItem() {
    }
}
