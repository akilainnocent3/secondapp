package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import com.chartboost.sdk.privacy.model.CCPA;
import com.chartboost.sdk.privacy.model.COPPA;
import com.chartboost.sdk.privacy.model.Custom;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import com.chartboost.sdk.privacy.model.GDPR;
import com.chartboost.sdk.privacy.model.LGPD;
import com.ironsource.C4235d4;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class af {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f38187a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f38188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l7 f38189c;

    public af(SharedPreferences sharedPreferences, l7 l7Var) {
        this.f38188b = sharedPreferences;
        this.f38189c = l7Var;
        b();
    }

    public HashMap a() {
        return this.f38187a;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cb A[Catch: JSONException -> 0x005c, TryCatch #0 {JSONException -> 0x005c, blocks: (B:6:0x0016, B:8:0x0022, B:42:0x00cb, B:44:0x00da, B:45:0x00e4, B:17:0x0049, B:19:0x0051, B:22:0x005f, B:24:0x0067, B:25:0x0071, B:27:0x0079, B:29:0x0085, B:30:0x008b, B:32:0x0097, B:33:0x009d, B:35:0x00a5, B:37:0x00b1, B:38:0x00b7, B:40:0x00c3), top: B:49:0x0016 }] */
    public final void b() {
        DataUseConsent ccpa;
        SharedPreferences sharedPreferences = this.f38188b;
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString("privacy_standards", "");
            if (string.isEmpty()) {
                return;
            }
            try {
                JSONArray jSONArray = new JSONArray(string);
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    String string2 = jSONObject.getString("privacyStandard");
                    String string3 = jSONObject.getString(C4235d4.j.f61457b0);
                    int iHashCode = string2.hashCode();
                    if (iHashCode != -1172350233) {
                        if (iHashCode != 3168159) {
                            if (iHashCode != 3319983) {
                                if (iHashCode == 94846581 && string2.equals(COPPA.COPPA_STANDARD)) {
                                    ccpa = new COPPA(jSONObject.getBoolean(C4235d4.j.f61457b0));
                                } else {
                                    ccpa = new Custom(jSONObject.getString("privacyStandard"), jSONObject.getString(C4235d4.j.f61457b0));
                                }
                            } else if (string2.equals(LGPD.LGPD_STANDARD)) {
                                ccpa = new LGPD(jSONObject.getBoolean(C4235d4.j.f61457b0));
                            } else {
                                ccpa = new Custom(jSONObject.getString("privacyStandard"), jSONObject.getString(C4235d4.j.f61457b0));
                            }
                        } else if (string2.equals("gdpr")) {
                            GDPR.GDPR_CONSENT gdpr_consent = GDPR.GDPR_CONSENT.BEHAVIORAL;
                            if (gdpr_consent.getValue().equals(string3)) {
                                ccpa = new GDPR(gdpr_consent);
                            } else {
                                GDPR.GDPR_CONSENT gdpr_consent2 = GDPR.GDPR_CONSENT.NON_BEHAVIORAL;
                                if (gdpr_consent2.getValue().equals(string3)) {
                                    ccpa = new GDPR(gdpr_consent2);
                                } else {
                                    ccpa = null;
                                }
                            }
                        } else {
                            ccpa = new Custom(jSONObject.getString("privacyStandard"), jSONObject.getString(C4235d4.j.f61457b0));
                        }
                    } else if (string2.equals(CCPA.CCPA_STANDARD)) {
                        CCPA.CCPA_CONSENT ccpa_consent = CCPA.CCPA_CONSENT.OPT_IN_SALE;
                        if (ccpa_consent.getValue().equals(string3)) {
                            ccpa = new CCPA(ccpa_consent);
                        } else {
                            CCPA.CCPA_CONSENT ccpa_consent2 = CCPA.CCPA_CONSENT.OPT_OUT_SALE;
                            if (ccpa_consent2.getValue().equals(string3)) {
                                ccpa = new CCPA(ccpa_consent2);
                            } else {
                                ccpa = null;
                            }
                        }
                    } else {
                        ccpa = new Custom(jSONObject.getString("privacyStandard"), jSONObject.getString(C4235d4.j.f61457b0));
                    }
                    if (ccpa != null) {
                        this.f38187a.put(ccpa.getPrivacyStandard(), ccpa);
                    } else {
                        b(string2);
                        sb.a("Failed to load consent: " + string2, null);
                    }
                }
            } catch (JSONException e10) {
                a(e10);
                e10.printStackTrace();
            }
        }
    }

    public final void c() {
        if (this.f38188b != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f38187a.values().iterator();
            while (it.hasNext()) {
                jSONArray.put(a((DataUseConsent) it.next()));
            }
            a(this.f38188b, jSONArray);
        }
    }

    public void a(String str) {
        this.f38187a.remove(str);
        c();
    }

    public final void a(SharedPreferences sharedPreferences, JSONArray jSONArray) {
        if (sharedPreferences == null || jSONArray == null) {
            return;
        }
        sharedPreferences.edit().putString("privacy_standards", jSONArray.toString()).apply();
    }

    public final void a(JSONException jSONException) {
        this.f38189c.mo165track(o5.a(hi.d.DECODING_ERROR, jSONException.getMessage(), "", ""));
    }

    public final JSONObject a(DataUseConsent dataUseConsent) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("privacyStandard", dataUseConsent.getPrivacyStandard());
            jSONObject.put(C4235d4.j.f61457b0, dataUseConsent.getConsent());
            return jSONObject;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    public void b(DataUseConsent dataUseConsent) {
        sb.a("Added privacy standard: " + dataUseConsent.getPrivacyStandard() + " with consent: " + dataUseConsent.getConsent(), null);
        this.f38187a.put(dataUseConsent.getPrivacyStandard(), dataUseConsent);
        c();
    }

    public final void b(String str) {
        this.f38189c.mo165track(o5.a(hi.d.PERSISTED_DATA_READING_ERROR, str, "", ""));
    }
}
