package com.sportybet.plugin.realsports.data;

import android.text.TextUtils;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.itf0;
import defpackage.uf80;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class QuickMarketItem {
    public String displayName;
    public boolean hasSpecifier;
    public String marketId;
    public String specifierName;
    public String title;

    public static QuickMarketItem fromJSONObject(String str) {
        QuickMarketItem quickMarketItem = new QuickMarketItem();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                quickMarketItem.marketId = jSONObject.optString(AnalyticsParam.EVENT_PARAM_ID, "");
                quickMarketItem.displayName = jSONObject.optString("n", "");
                quickMarketItem.title = jSONObject.optString("t", "");
                quickMarketItem.hasSpecifier = jSONObject.optBoolean("s", false);
                quickMarketItem.specifierName = jSONObject.optString("sn", "");
                return quickMarketItem;
            } catch (Exception e) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_COMMON);
                aVar.p(e, "Can't create QuickMarketItem from JsonObject: %s", str);
            }
        }
        return quickMarketItem;
    }

    public String[] getTitles() {
        return TextUtils.isEmpty(this.title) ? new String[0] : this.title.split(",");
    }

    public boolean isValid() {
        if (TextUtils.isEmpty(this.marketId) || TextUtils.isEmpty(this.displayName)) {
            return false;
        }
        return !TextUtils.isEmpty(this.title);
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AnalyticsParam.EVENT_PARAM_ID, this.marketId);
            jSONObject.put("n", this.displayName);
            jSONObject.put("t", this.title);
            jSONObject.put("s", this.hasSpecifier);
            jSONObject.put("sn", this.specifierName);
            return jSONObject;
        } catch (Exception e) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_COMMON);
            aVar.p(e, "Can't convert QuickMarketItem to JsonObject", new Object[0]);
            return jSONObject;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("QuickMarketItem{marketId='");
        sb.append(this.marketId);
        sb.append("', displayName='");
        sb.append(this.displayName);
        sb.append("', title='");
        sb.append(this.title);
        sb.append("', hasSpecifier=");
        sb.append(this.hasSpecifier);
        sb.append(", specifierName='");
        return uf80.a(sb, this.specifierName, "'}");
    }
}
