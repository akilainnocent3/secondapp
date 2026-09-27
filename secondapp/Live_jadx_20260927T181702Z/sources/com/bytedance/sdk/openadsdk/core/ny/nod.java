package com.bytedance.sdk.openadsdk.core.ny;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class nod {
    private final String hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final String f36536sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final URL f36537tq;
    private final String vy;

    private nod(String str, String str2, String str3, String str4) throws MalformedURLException {
        this.hww = str2;
        this.f36537tq = new URL(str);
        this.f36536sd = str3;
        this.vy = str4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nod)) {
            return false;
        }
        nod nodVar = (nod) obj;
        if (hww(this.hww, nodVar.hww) && hww(this.f36537tq, nodVar.f36537tq) && hww(this.f36536sd, nodVar.f36536sd)) {
            return hww(this.vy, nodVar.vy);
        }
        return false;
    }

    public int hashCode() {
        String str = this.hww;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f36537tq.hashCode()) * 31;
        String str2 = this.f36536sd;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.vy;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String hww() {
        return this.hww;
    }

    public URL sd() {
        return this.f36537tq;
    }

    public String tq() {
        return this.f36536sd;
    }

    public JSONObject vy() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("apiFramework", CampaignEx.KEY_OMID);
            jSONObject.put("javascriptResourceUrl", this.f36537tq.toString());
            if (!TextUtils.isEmpty(this.hww)) {
                jSONObject.put("vendorKey", this.hww);
            }
            if (!TextUtils.isEmpty(this.f36536sd)) {
                jSONObject.put("verificationParameters", this.f36536sd);
            }
            if (!TextUtils.isEmpty(this.vy)) {
                jSONObject.put("verificationNotExecuted", this.vy);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    private boolean hww(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static nod hww(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new nod(str, str2, str3, str4);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static nod hww(JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("apiFramework");
            String strOptString2 = jSONObject.optString("javascriptResourceUrl");
            if (CampaignEx.KEY_OMID.equalsIgnoreCase(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                return new nod(strOptString2, jSONObject.optString("vendorKey"), jSONObject.optString("verificationParameters"), jSONObject.optString("verificationNotExecuted"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static HashSet<nod> hww(JSONArray jSONArray) {
        HashSet<nod> hashSet = new HashSet<>();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    hashSet.add(hww(jSONArray.getJSONObject(i10)));
                } catch (Throwable unused) {
                }
            }
        }
        return hashSet;
    }
}
