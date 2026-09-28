package com.sportybet.plugin.realsports.data;

import com.sporty.android.core.model.MyLog;
import defpackage.h70;
import defpackage.itf0;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class LiveStreamDataWebView extends LiveStreamData {
    public String data;

    public LiveStreamDataWebView(String str, String str2, String str3) {
        super(str, getPlayerRatio(str, str3));
        this.data = str2;
    }

    private static float getPlayerRatio(String str, String str2) {
        try {
            return (float) new JSONObject(str2).optDouble(str.toLowerCase(Locale.US), 0.5625d);
        } catch (Exception e) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_COMMON);
            aVar.n("Failed to get player ratio: " + e, new Object[0]);
            return 0.5625f;
        }
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("platform", this.platform);
            jSONObject.putOpt("data", new JSONObject(this.data));
            return jSONObject;
        } catch (Exception e) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_COMMON);
            aVar.p(e, "Failed to create json object for LiveStreamDataWebView", new Object[0]);
            return jSONObject;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LiveStreamDataWebView{data='");
        sb.append(this.data);
        sb.append("', platform='");
        sb.append(this.platform);
        sb.append("', playerRatio=");
        return h70.a(sb, this.playerRatio, '}');
    }
}
