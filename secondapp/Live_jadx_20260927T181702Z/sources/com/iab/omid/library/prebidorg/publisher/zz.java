package com.iab.omid.library.prebidorg.publisher;

import android.webkit.WebView;
import com.iab.omid.library.prebidorg.adsession.ze;
import com.iab.omid.library.prebidorg.adsession.zf;
import com.iab.omid.library.prebidorg.adsession.zt;
import com.iab.omid.library.prebidorg.internal.zw;
import com.iab.omid.library.prebidorg.utils.zv;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zz {

    /* JADX INFO: renamed from: zr, reason: collision with root package name */
    private com.iab.omid.library.prebidorg.adsession.zz f53766zr;

    /* JADX INFO: renamed from: zs, reason: collision with root package name */
    private com.iab.omid.library.prebidorg.adsession.media.zr f53767zs;

    /* JADX INFO: renamed from: zt, reason: collision with root package name */
    private EnumC0522zz f53768zt;

    /* JADX INFO: renamed from: zu, reason: collision with root package name */
    private long f53769zu;
    private com.iab.omid.library.prebidorg.weakreference.zr zz;

    /* JADX INFO: renamed from: com.iab.omid.library.prebidorg.publisher.zz$zz, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum EnumC0522zz {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public zz() {
        zz();
        this.zz = new com.iab.omid.library.prebidorg.weakreference.zr(null);
    }

    public void zr() {
        this.zz.clear();
    }

    public com.iab.omid.library.prebidorg.adsession.zz zs() {
        return this.f53766zr;
    }

    public com.iab.omid.library.prebidorg.adsession.media.zr zt() {
        return this.f53767zs;
    }

    public boolean zu() {
        return this.zz.get() != 0;
    }

    public void zv() {
        zw.zz().zz(zx());
    }

    public void zw() {
        zw.zz().zr(zx());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WebView zx() {
        return (WebView) this.zz.get();
    }

    public void zy() {
        zw.zz().zs(zx());
    }

    public void zz() {
        this.f53769zu = zv.zr();
        this.f53768zt = EnumC0522zz.AD_STATE_IDLE;
    }

    public void zr(String str, long j10) {
        if (j10 >= this.f53769zu) {
            this.f53768zt = EnumC0522zz.AD_STATE_VISIBLE;
            zw.zz().zz(zx(), str);
        }
    }

    public void zz(float f10) {
        zw.zz().zz(zx(), f10);
    }

    public void zz(WebView webView) {
        this.zz = new com.iab.omid.library.prebidorg.weakreference.zr(webView);
    }

    public void zz(com.iab.omid.library.prebidorg.adsession.zz zzVar) {
        this.f53766zr = zzVar;
    }

    public void zz(com.iab.omid.library.prebidorg.adsession.zs zsVar) {
        zw.zz().zz(zx(), zsVar.zs());
    }

    public void zz(zf zfVar, zt ztVar) {
        zz(zfVar, ztVar, null);
    }

    public void zz(zf zfVar, zt ztVar, JSONObject jSONObject) {
        String strZb = zfVar.zb();
        JSONObject jSONObject2 = new JSONObject();
        com.iab.omid.library.prebidorg.utils.zs.zz(jSONObject2, "environment", "app");
        com.iab.omid.library.prebidorg.utils.zs.zz(jSONObject2, "adSessionType", ztVar.zz());
        com.iab.omid.library.prebidorg.utils.zs.zz(jSONObject2, "deviceInfo", com.iab.omid.library.prebidorg.utils.zr.zt());
        com.iab.omid.library.prebidorg.utils.zs.zz(jSONObject2, "deviceCategory", com.iab.omid.library.prebidorg.utils.zz.zz().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        com.iab.omid.library.prebidorg.utils.zs.zz(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        com.iab.omid.library.prebidorg.utils.zs.zz(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, ztVar.zv().zz());
        com.iab.omid.library.prebidorg.utils.zs.zz(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, ztVar.zv().zr());
        com.iab.omid.library.prebidorg.utils.zs.zz(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        com.iab.omid.library.prebidorg.utils.zs.zz(jSONObject4, "libraryVersion", "1.4.1-Prebidorg");
        com.iab.omid.library.prebidorg.utils.zs.zz(jSONObject4, "appId", com.iab.omid.library.prebidorg.internal.zv.zr().zz().getApplicationContext().getPackageName());
        com.iab.omid.library.prebidorg.utils.zs.zz(jSONObject2, "app", jSONObject4);
        if (ztVar.zr() != null) {
            com.iab.omid.library.prebidorg.utils.zs.zz(jSONObject2, "contentUrl", ztVar.zr());
        }
        if (ztVar.zs() != null) {
            com.iab.omid.library.prebidorg.utils.zs.zz(jSONObject2, "customReferenceData", ztVar.zs());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (ze zeVar : ztVar.zw()) {
            com.iab.omid.library.prebidorg.utils.zs.zz(jSONObject5, zeVar.zr(), zeVar.zs());
        }
        zw.zz().zz(zx(), strZb, jSONObject2, jSONObject5, jSONObject);
    }

    public void zz(com.iab.omid.library.prebidorg.adsession.media.zr zrVar) {
        this.f53767zs = zrVar;
    }

    public void zz(String str) {
        zw.zz().zz(zx(), str, (JSONObject) null);
    }

    public void zz(String str, long j10) {
        if (j10 >= this.f53769zu) {
            EnumC0522zz enumC0522zz = this.f53768zt;
            EnumC0522zz enumC0522zz2 = EnumC0522zz.AD_STATE_NOTVISIBLE;
            if (enumC0522zz != enumC0522zz2) {
                this.f53768zt = enumC0522zz2;
                zw.zz().zz(zx(), str);
            }
        }
    }

    public void zz(String str, JSONObject jSONObject) {
        zw.zz().zz(zx(), str, jSONObject);
    }

    public void zz(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        com.iab.omid.library.prebidorg.utils.zs.zz(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        zw.zz().zs(zx(), jSONObject);
    }

    public void zz(JSONObject jSONObject) {
        zw.zz().zr(zx(), jSONObject);
    }

    public void zz(boolean z10) {
        if (zu()) {
            zw.zz().zr(zx(), z10 ? "foregrounded" : "backgrounded");
        }
    }

    public void zb() {
    }
}
