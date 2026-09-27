package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.x;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements com.fyber.inneractive.sdk.response.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public URL f45108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f45109b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f45111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f45112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f45113f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f45110c = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f45114g = false;

    public final void a(x xVar, String str) {
        List arrayList = (List) this.f45110c.get(xVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f45110c.put(xVar, arrayList);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        arrayList.add(str);
    }

    public final boolean b() {
        if (!this.f45114g || this.f45108a == null) {
            return false;
        }
        String str = this.f45109b;
        if (str != null) {
            return !TextUtils.isEmpty(str) && this.f45109b.equalsIgnoreCase(CampaignEx.KEY_OMID);
        }
        return true;
    }

    public final String toString() {
        return "Verification{mJavaScriptResource=" + this.f45108a + ", mTrackingEvents=" + this.f45110c + ", mVerificationParameters='" + this.f45111d + "', mVendor='" + this.f45112e + "'}";
    }

    @Override // com.fyber.inneractive.sdk.response.i
    public final List a(x xVar) {
        HashMap map;
        if (xVar == null || (map = this.f45110c) == null) {
            return null;
        }
        return (List) map.get(xVar);
    }

    public final String a() {
        if (!this.f45114g) {
            return "JavaScriptResource = ";
        }
        if (TextUtils.isEmpty(this.f45109b)) {
            return "apiFramework = ";
        }
        if (!this.f45109b.equalsIgnoreCase(CampaignEx.KEY_OMID)) {
            return "apiFramework = " + this.f45109b;
        }
        return "JavaScriptResource_url = " + (TextUtils.isEmpty(this.f45113f) ? "" : this.f45113f);
    }
}
