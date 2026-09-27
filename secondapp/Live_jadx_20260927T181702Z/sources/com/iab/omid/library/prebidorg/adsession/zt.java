package com.iab.omid.library.prebidorg.adsession;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class zt {

    /* JADX INFO: renamed from: zr, reason: collision with root package name */
    private final WebView f53704zr;

    /* JADX INFO: renamed from: zs, reason: collision with root package name */
    private final List f53705zs;

    /* JADX INFO: renamed from: zt, reason: collision with root package name */
    private final Map f53706zt;

    /* JADX INFO: renamed from: zu, reason: collision with root package name */
    private final String f53707zu;

    /* JADX INFO: renamed from: zv, reason: collision with root package name */
    private final String f53708zv;

    /* JADX INFO: renamed from: zw, reason: collision with root package name */
    private final String f53709zw;

    /* JADX INFO: renamed from: zx, reason: collision with root package name */
    private final zu f53710zx;
    private final zd zz;

    private zt(zd zdVar, WebView webView, String str, List list, String str2, String str3, zu zuVar) {
        ArrayList arrayList = new ArrayList();
        this.f53705zs = arrayList;
        this.f53706zt = new HashMap();
        this.zz = zdVar;
        this.f53704zr = webView;
        this.f53707zu = str;
        this.f53710zx = zuVar;
        if (list != null) {
            arrayList.addAll(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ze zeVar = (ze) it.next();
                this.f53706zt.put(UUID.randomUUID().toString(), zeVar);
            }
        }
        this.f53709zw = str2;
        this.f53708zv = str3;
    }

    public static zt zz(zd zdVar, WebView webView, String str, String str2) {
        com.iab.omid.library.prebidorg.utils.zw.zz(zdVar, "Partner is null");
        com.iab.omid.library.prebidorg.utils.zw.zz(webView, "WebView is null");
        if (str2 != null) {
            com.iab.omid.library.prebidorg.utils.zw.zz(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new zt(zdVar, webView, null, null, str, str2, zu.HTML);
    }

    public String zr() {
        return this.f53709zw;
    }

    public String zs() {
        return this.f53708zv;
    }

    public Map zt() {
        return Collections.unmodifiableMap(this.f53706zt);
    }

    public String zu() {
        return this.f53707zu;
    }

    public zd zv() {
        return this.zz;
    }

    public List zw() {
        return Collections.unmodifiableList(this.f53705zs);
    }

    public WebView zx() {
        return this.f53704zr;
    }

    public static zt zz(zd zdVar, String str, List list, String str2, String str3) {
        com.iab.omid.library.prebidorg.utils.zw.zz(zdVar, "Partner is null");
        com.iab.omid.library.prebidorg.utils.zw.zz((Object) str, "OM SDK JS script content is null");
        com.iab.omid.library.prebidorg.utils.zw.zz(list, "VerificationScriptResources is null");
        if (str3 != null) {
            com.iab.omid.library.prebidorg.utils.zw.zz(str3, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new zt(zdVar, null, str, list, str2, str3, zu.NATIVE);
    }

    public zu zz() {
        return this.f53710zx;
    }
}
