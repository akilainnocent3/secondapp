package com.iab.omid.library.startio.publisher;

import android.webkit.WebView;
import com.iab.omid.library.startio.adsession.AdEvents;
import com.iab.omid.library.startio.adsession.AdSessionConfiguration;
import com.iab.omid.library.startio.adsession.AdSessionContext;
import com.iab.omid.library.startio.adsession.ErrorType;
import com.iab.omid.library.startio.adsession.VerificationScriptResource;
import com.iab.omid.library.startio.adsession.media.MediaEvents;
import com.iab.omid.library.startio.internal.g;
import com.iab.omid.library.startio.internal.h;
import com.iab.omid.library.startio.utils.c;
import com.iab.omid.library.startio.utils.d;
import com.iab.omid.library.startio.utils.f;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AdSessionStatePublisher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f53910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.iab.omid.library.startio.weakreference.b f53911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AdEvents f53912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MediaEvents f53913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f53914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f53915f;

    enum a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        a();
        this.f53910a = str;
        this.f53911b = new com.iab.omid.library.startio.weakreference.b(null);
    }

    private JSONArray a(List list) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.iab.omid.library.startio.attestation.b bVar = (com.iab.omid.library.startio.attestation.b) it.next();
            Iterator it2 = bVar.c().iterator();
            while (it2.hasNext()) {
                jSONArray.put(a(bVar, (String) it2.next()));
            }
        }
        return jSONArray;
    }

    public void b() {
        this.f53911b.clear();
    }

    public AdEvents c() {
        return this.f53912c;
    }

    public MediaEvents d() {
        return this.f53913d;
    }

    public boolean e() {
        return this.f53911b.get() != 0;
    }

    public void f() {
        h.a().a(getWebView(), this.f53910a);
    }

    public void g() {
        h.a().b(getWebView(), this.f53910a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WebView getWebView() {
        return (WebView) this.f53911b.get();
    }

    public void h() {
        b((JSONObject) null);
    }

    private JSONObject a(com.iab.omid.library.startio.attestation.b bVar, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mechanism", bVar.a());
        jSONObject.put("executionEnvironment", bVar.b().toString());
        jSONObject.put("version", str);
        return jSONObject;
    }

    public void b(String str, long j10) {
        if (j10 >= this.f53915f) {
            this.f53914e = a.AD_STATE_VISIBLE;
            h.a().b(getWebView(), this.f53910a, str);
        }
    }

    private JSONObject a(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, "supportedAttestationMechanisms", jSONArray);
        return jSONObject;
    }

    public void b(List list) {
        try {
            a(a(a(list)));
        } catch (JSONException e10) {
            d.a("Error creating JSON object publishSupportedAttestationMechanisms", e10);
        }
    }

    public void a() {
        this.f53915f = f.b();
        this.f53914e = a.AD_STATE_IDLE;
    }

    public void b(JSONObject jSONObject) {
        h.a().b(getWebView(), this.f53910a, jSONObject);
    }

    public void a(float f10) {
        h.a().a(getWebView(), this.f53910a, f10);
    }

    public void b(boolean z10) {
        if (e()) {
            h.a().a(getWebView(), this.f53910a, z10 ? "locked" : "unlocked");
        }
    }

    public void a(WebView webView) {
        this.f53911b = new com.iab.omid.library.startio.weakreference.b(webView);
    }

    public void a(AdEvents adEvents) {
        this.f53912c = adEvents;
    }

    public void a(AdSessionConfiguration adSessionConfiguration) {
        h.a().a(getWebView(), this.f53910a, adSessionConfiguration.toJsonObject());
    }

    public void a(ErrorType errorType, String str) {
        h.a().a(getWebView(), this.f53910a, errorType, str);
    }

    public void a(com.iab.omid.library.startio.adsession.a aVar, AdSessionContext adSessionContext) {
        a(aVar, adSessionContext, null);
    }

    public void a(com.iab.omid.library.startio.adsession.a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String strC = aVar.c();
        JSONObject jSONObject2 = new JSONObject();
        c.a(jSONObject2, "environment", "app");
        c.a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        c.a(jSONObject2, "deviceInfo", com.iab.omid.library.startio.utils.b.d());
        c.a(jSONObject2, "deviceCategory", com.iab.omid.library.startio.utils.a.a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        c.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        c.a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        c.a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        c.a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        c.a(jSONObject4, "libraryVersion", "1.6.0-Startio");
        c.a(jSONObject4, "appId", g.b().a().getApplicationContext().getPackageName());
        c.a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            c.a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            c.a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        if (adSessionContext.getUniversalAdId() != null) {
            c.a(jSONObject2, "universalAdId", adSessionContext.getUniversalAdId());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            c.a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        h.a().a(getWebView(), strC, jSONObject2, jSONObject5, jSONObject);
    }

    public void a(MediaEvents mediaEvents) {
        this.f53913d = mediaEvents;
    }

    public void a(String str) {
        a(str, (JSONObject) null);
    }

    public void a(String str, long j10) {
        if (j10 >= this.f53915f) {
            a aVar = this.f53914e;
            a aVar2 = a.AD_STATE_NOTVISIBLE;
            if (aVar != aVar2) {
                this.f53914e = aVar2;
                h.a().b(getWebView(), this.f53910a, str);
            }
        }
    }

    public void a(String str, JSONObject jSONObject) {
        h.a().a(getWebView(), this.f53910a, str, jSONObject);
    }

    public void a(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        h.a().a(getWebView(), jSONObject);
    }

    private void a(JSONObject jSONObject) {
        h.a().b(getWebView(), jSONObject);
    }

    public void a(boolean z10) {
        if (e()) {
            h.a().c(getWebView(), this.f53910a, z10 ? "foregrounded" : "backgrounded");
        }
    }

    public void i() {
    }
}
