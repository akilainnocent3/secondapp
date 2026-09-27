package com.mbridge.msdk.foundation.error;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.MBridgeIds;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f66945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f66946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f66947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Throwable f66948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CampaignEx f66949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MBridgeIds f66950f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f66951g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f66952h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f66953i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f66954j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f66955k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private HashMap<Object, Object> f66956l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f66957m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f66958n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f66959o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f66960p;

    public b(int i10) {
        this.f66945a = i10;
        this.f66946b = a.b(i10);
    }

    public void a(Throwable th2) {
        this.f66948d = th2;
    }

    public void b(String str) {
        this.f66952h = str;
    }

    public void c(String str) {
        this.f66947c = str;
    }

    public CampaignEx d() {
        return this.f66949e;
    }

    public int g() {
        return this.f66945a;
    }

    public int h() {
        return this.f66946b;
    }

    public String i() {
        return this.f66960p;
    }

    public MBridgeIds j() {
        if (this.f66950f == null) {
            this.f66950f = new MBridgeIds();
        }
        return this.f66950f;
    }

    public String k() {
        return this.f66952h;
    }

    public String l() {
        int i10;
        String strA = !TextUtils.isEmpty(this.f66947c) ? this.f66947c : "";
        if (TextUtils.isEmpty(strA) && (i10 = this.f66945a) != -1) {
            strA = a.a(i10);
        }
        Throwable th2 = this.f66948d;
        if (th2 == null) {
            return strA;
        }
        String message = th2.getMessage();
        if (TextUtils.isEmpty(message)) {
            return strA;
        }
        return strA + " # " + message;
    }

    public String m() {
        return this.f66955k;
    }

    public int n() {
        return this.f66954j;
    }

    public String toString() {
        return "MBFailureReason{errorCode=" + this.f66945a + ", errorSubType=" + this.f66946b + ", message='" + this.f66947c + "', cause=" + this.f66948d + ", campaign=" + this.f66949e + ", ids=" + this.f66950f + ", requestId='" + this.f66951g + "', localRequestId='" + this.f66952h + "', isHeaderBidding=" + this.f66953i + ", typeD=" + this.f66954j + ", reasonD='" + this.f66955k + "', extraMap=" + this.f66956l + ", serverErrorCode=" + this.f66957m + ", errorUrl='" + this.f66958n + "', serverErrorResponse='" + this.f66959o + '\'' + fw.b.f85383j;
    }

    public void a(CampaignEx campaignEx) {
        this.f66949e = campaignEx;
    }

    public void d(String str) {
        this.f66955k = str;
    }

    public void a(MBridgeIds mBridgeIds) {
        this.f66950f = mBridgeIds;
    }

    public void a(boolean z10) {
        this.f66953i = z10;
    }

    public b(int i10, String str) {
        this.f66945a = i10;
        if (!TextUtils.isEmpty(str)) {
            a("his_reason", str);
        }
        this.f66947c = str;
        this.f66946b = a.b(i10);
    }

    public void a(Object obj, Object obj2) {
        if (this.f66956l == null) {
            this.f66956l = new HashMap<>();
        }
        this.f66956l.put(obj, obj2);
    }

    public Object a(Object obj) {
        HashMap<Object, Object> map = this.f66956l;
        if (map != null && map.containsKey(obj)) {
            return this.f66956l.get(obj);
        }
        return null;
    }

    public void a(int i10) {
        this.f66954j = i10;
    }

    public void a(String str) {
        this.f66960p = str;
    }
}
