package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class g3 implements Comparable, AppLovinCommunicatorSubscriber {
    private final List A;
    private final List B;
    private final List C;
    private final List D;
    private final Map E;
    private final boolean F;
    private final d7 G;
    private final boolean H;
    private final String I;
    private final Map J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f27070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f27071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f27073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f27074e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f27075f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f27076g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f27077h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f27078i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f27079j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f27080k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f27081l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f27082m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f27083n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f27084o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f27085p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f27086q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f27087r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f27088s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f27089t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final String f27090u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final String f27091v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final String f27092w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f27093x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final List f27094y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final List f27095z;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        MISSING("MISSING"),
        INCOMPLETE_INTEGRATION("INCOMPLETE INTEGRATION"),
        INVALID_INTEGRATION("INVALID INTEGRATION"),
        COMPLETE("COMPLETE");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f27101a;

        a(String str) {
            this.f27101a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String b() {
            return this.f27101a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum b {
        NOT_SUPPORTED("Not Supported", p1.a.f120313c, "This network does not support test mode."),
        INVALID_INTEGRATION("Invalid Integration", p1.a.f120313c, "Please address all the integration issue(s) marked in red above."),
        NOT_INITIALIZED("Not Initialized", p1.a.f120313c, "Please configure this network in your MAX dashboard."),
        DISABLED("Enable", -16776961, "Please re-launch the app to enable test ads."),
        READY("", -16776961, "");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f27108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f27109b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f27110c;

        b(String str, int i10, String str2) {
            this.f27108a = str;
            this.f27109b = i10;
            this.f27110c = str2;
        }

        public String b() {
            return this.f27110c;
        }

        public String c() {
            return this.f27108a;
        }

        public int d() {
            return this.f27109b;
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0256 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:72:0x025b  */
    /* JADX WARN: Code duplicated, block: B:75:0x026d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0279  */
    /* JADX WARN: Code duplicated, block: B:79:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:82:0x02cc  */
    /* JADX WARN: Multi-variable type inference failed */
    public g3(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        char c10;
        String adapterVersion;
        String strA;
        boolean zEquals;
        boolean zIsBeta;
        String str;
        boolean z10;
        boolean z11;
        int iLastIndexOf;
        String lowerCase;
        Integer numA;
        JSONObject jSONObject2;
        String string;
        String string2;
        boolean z12;
        this.f27070a = lVar;
        String string3 = JsonUtils.getString(jSONObject, "name", "");
        this.f27085p = string3;
        this.f27086q = JsonUtils.getString(jSONObject, "display_name", "");
        this.f27087r = JsonUtils.getString(jSONObject, "adapter_class", "");
        this.f27090u = JsonUtils.getString(jSONObject, "latest_adapter_version", "");
        this.B = a(jSONObject);
        Boolean bool = Boolean.FALSE;
        this.f27080k = JsonUtils.getBoolean(jSONObject, "hide_if_missing", bool).booleanValue();
        JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject, "configuration", new JSONObject());
        this.f27095z = a(jSONObject3, lVar);
        this.f27084o = JsonUtils.getBoolean(jSONObject3, "java_8_required", bool).booleanValue();
        this.F = JsonUtils.getBoolean(jSONObject3, "hide_initialization_status", bool).booleanValue();
        this.f27083n = JsonUtils.getBoolean(jSONObject3, "check_sdk_adapter_version_mismatch", Boolean.TRUE).booleanValue();
        this.C = JsonUtils.getList(jSONObject3, "live_network_filtering_names", null);
        JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONObject3, "test_mode", new JSONObject());
        JSONObject jSONObject5 = JsonUtils.getJSONObject(jSONObject4, "network_names", (JSONObject) null);
        if (jSONObject5 == null || jSONObject5.length() <= 0) {
            this.D = Arrays.asList(string3);
            this.E = null;
        } else {
            ArrayList arrayList = new ArrayList(Arrays.asList(string3));
            HashMap map = new HashMap(jSONObject5.length());
            Iterator<String> itKeys = jSONObject5.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                MaxAdFormat fromString = MaxAdFormat.formatFromString(next);
                String string4 = JsonUtils.getString(jSONObject5, next, null);
                if (fromString != null && !TextUtils.isEmpty(string4)) {
                    arrayList.add(string4);
                    map.put(fromString, string4);
                }
            }
            this.D = arrayList;
            this.E = map;
        }
        JSONObject jSONObject6 = JsonUtils.getJSONObject(jSONObject, "test_mode", new JSONObject());
        Boolean bool2 = Boolean.TRUE;
        this.f27078i = JsonUtils.getBoolean(jSONObject6, "supported", bool2).booleanValue();
        this.f27079j = JsonUtils.getBoolean(jSONObject, "test_mode_requires_init", Boolean.FALSE).booleanValue();
        this.f27091v = JsonUtils.getString(jSONObject6, PglCryptUtils.KEY_MESSAGE, null);
        this.G = new d7(JsonUtils.getJSONObject(jSONObject3, "tcf_config"), this.f27086q);
        List list = JsonUtils.getList(jSONObject, "existence_classes", null);
        if (list != null) {
            this.f27073d = q7.a(list);
        } else {
            this.f27073d = q7.a(JsonUtils.getString(jSONObject, "existence_class", ""));
        }
        List listA = Collections.EMPTY_LIST;
        String str2 = this.f27087r;
        String string5 = JsonUtils.getString(jSONObject3, "init_adapter_class", null);
        if (string5 != null) {
            this.f27087r = string5;
        }
        MaxAdapter maxAdapterA = y3.a(str2, lVar);
        if (maxAdapterA != null) {
            this.f27074e = true;
            try {
                adapterVersion = maxAdapterA.getAdapterVersion();
                try {
                    strA = y3.a(maxAdapterA);
                    c10 = 1;
                    try {
                        this.f27077h = y3.a(maxAdapterA, this.f27087r);
                        listA = a(maxAdapterA, JsonUtils.getBoolean(jSONObject4, "is_mrec_supported", bool2).booleanValue());
                        JSONObject jSONObject7 = JsonUtils.getJSONObject(jSONObject3, "native_ad_view_config", (JSONObject) null);
                        if (jSONObject7 != null) {
                            String string6 = JsonUtils.getString(jSONObject7, "min_adapter_version", null);
                            z10 = string6 == null || q7.a(adapterVersion, string6) >= 0;
                            try {
                                string2 = JsonUtils.getString(jSONObject7, "network_name", null);
                            } catch (Throwable th2) {
                                th = th2;
                                string2 = null;
                                com.applovin.impl.sdk.p.h("MediatedNetwork", "Failed to load adapter for network " + this.f27085p + ". Please check that you have a compatible network SDK integrated. Error: " + th);
                                str = string2;
                                zIsBeta = false;
                                Class<?> cls = Class.forName(this.f27087r);
                                z12 = false;
                                try {
                                    Class<?>[] clsArr = new Class[3];
                                    clsArr[0] = MaxAdapterResponseParameters.class;
                                    clsArr[c10] = Activity.class;
                                    clsArr[2] = MaxNativeAdAdapterListener.class;
                                    zEquals = cls.getMethod("loadNativeAd", clsArr).getDeclaringClass().equals(cls);
                                } catch (Throwable th3) {
                                    th = th3;
                                    lVar.Q();
                                    if (com.applovin.impl.sdk.p.a()) {
                                        lVar.Q().a("MediatedNetwork", "Failed to check if adapter overrides MaxNativeAdAdapter", th);
                                    }
                                    zEquals = z12;
                                }
                                this.f27089t = adapterVersion;
                                this.f27088s = strA;
                                this.f27094y = listA;
                                this.f27081l = zEquals;
                                this.f27082m = z10;
                                this.f27092w = str;
                                this.A = a(jSONObject3, adapterVersion, lVar);
                                this.f27076g = q7.a(JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "alternative_network", (JSONObject) null), "adapter_class", ""));
                                this.f27071b = a();
                                if (adapterVersion.equals(this.f27090u)) {
                                    z11 = 0;
                                } else {
                                    z11 = 0;
                                }
                                this.f27075f = z11;
                                Context contextP = com.applovin.impl.sdk.l.p();
                                iLastIndexOf = this.f27085p.lastIndexOf(lk.e.f104695m);
                                if (iLastIndexOf != -1) {
                                    lowerCase = this.f27085p.toLowerCase().substring(0, iLastIndexOf);
                                } else {
                                    lowerCase = this.f27085p.toLowerCase();
                                }
                                this.f27093x = contextP.getResources().getIdentifier("applovin_ic_mediation_" + lowerCase, "drawable", contextP.getPackageName());
                                this.f27072c = MaxAdapter.InitializationStatus.NOT_INITIALIZED.getCode();
                                AppLovinCommunicator.getInstance(contextP).subscribe(this, "adapter_initialization_status");
                                numA = lVar.U().a(this.f27087r);
                                if (numA != null) {
                                    this.f27072c = numA.intValue();
                                }
                                jSONObject2 = JsonUtils.getJSONObject(jSONObject3, "amazon_marketplace", (JSONObject) null);
                                if (jSONObject2 != null) {
                                }
                                this.H = false;
                                this.I = null;
                                this.J = null;
                                return;
                            }
                        } else {
                            string2 = null;
                            z10 = false;
                        }
                        try {
                            str = string2;
                            zIsBeta = maxAdapterA.isBeta();
                        } catch (Throwable th4) {
                            th = th4;
                            com.applovin.impl.sdk.p.h("MediatedNetwork", "Failed to load adapter for network " + this.f27085p + ". Please check that you have a compatible network SDK integrated. Error: " + th);
                            str = string2;
                            zIsBeta = false;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        string2 = null;
                        z10 = false;
                        com.applovin.impl.sdk.p.h("MediatedNetwork", "Failed to load adapter for network " + this.f27085p + ". Please check that you have a compatible network SDK integrated. Error: " + th);
                        str = string2;
                        zIsBeta = false;
                        Class<?> cls2 = Class.forName(this.f27087r);
                        z12 = false;
                        Class<?>[] clsArr2 = new Class[3];
                        clsArr2[0] = MaxAdapterResponseParameters.class;
                        clsArr2[c10] = Activity.class;
                        clsArr2[2] = MaxNativeAdAdapterListener.class;
                        zEquals = cls2.getMethod("loadNativeAd", clsArr2).getDeclaringClass().equals(cls2);
                        this.f27089t = adapterVersion;
                        this.f27088s = strA;
                        this.f27094y = listA;
                        this.f27081l = zEquals;
                        this.f27082m = z10;
                        this.f27092w = str;
                        this.A = a(jSONObject3, adapterVersion, lVar);
                        this.f27076g = q7.a(JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "alternative_network", (JSONObject) null), "adapter_class", ""));
                        this.f27071b = a();
                        if (adapterVersion.equals(this.f27090u)) {
                            z11 = 0;
                        } else {
                            z11 = 0;
                        }
                        this.f27075f = z11;
                        Context contextP2 = com.applovin.impl.sdk.l.p();
                        iLastIndexOf = this.f27085p.lastIndexOf(lk.e.f104695m);
                        if (iLastIndexOf != -1) {
                            lowerCase = this.f27085p.toLowerCase().substring(0, iLastIndexOf);
                        } else {
                            lowerCase = this.f27085p.toLowerCase();
                        }
                        this.f27093x = contextP2.getResources().getIdentifier("applovin_ic_mediation_" + lowerCase, "drawable", contextP2.getPackageName());
                        this.f27072c = MaxAdapter.InitializationStatus.NOT_INITIALIZED.getCode();
                        AppLovinCommunicator.getInstance(contextP2).subscribe(this, "adapter_initialization_status");
                        numA = lVar.U().a(this.f27087r);
                        if (numA != null) {
                            this.f27072c = numA.intValue();
                        }
                        jSONObject2 = JsonUtils.getJSONObject(jSONObject3, "amazon_marketplace", (JSONObject) null);
                        if (jSONObject2 != null) {
                        }
                        this.H = false;
                        this.I = null;
                        this.J = null;
                        return;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    c10 = 1;
                    strA = "";
                }
            } catch (Throwable th7) {
                th = th7;
                c10 = 1;
                adapterVersion = "";
                strA = adapterVersion;
            }
            try {
                Class<?> cls3 = Class.forName(this.f27087r);
                z12 = false;
                Class<?>[] clsArr3 = new Class[3];
                clsArr3[0] = MaxAdapterResponseParameters.class;
                clsArr3[c10] = Activity.class;
                clsArr3[2] = MaxNativeAdAdapterListener.class;
                zEquals = cls3.getMethod("loadNativeAd", clsArr3).getDeclaringClass().equals(cls3);
            } catch (Throwable th8) {
                th = th8;
                z12 = false;
            }
        } else {
            c10 = 1;
            this.f27074e = false;
            adapterVersion = "";
            strA = adapterVersion;
            zEquals = false;
            zIsBeta = false;
            str = null;
            z10 = false;
        }
        this.f27089t = adapterVersion;
        this.f27088s = strA;
        this.f27094y = listA;
        this.f27081l = zEquals;
        this.f27082m = z10;
        this.f27092w = str;
        this.A = a(jSONObject3, adapterVersion, lVar);
        this.f27076g = q7.a(JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "alternative_network", (JSONObject) null), "adapter_class", ""));
        this.f27071b = a();
        if (adapterVersion.equals(this.f27090u) || zIsBeta) {
            z11 = 0;
        } else {
            z11 = c10;
        }
        this.f27075f = z11;
        Context contextP3 = com.applovin.impl.sdk.l.p();
        iLastIndexOf = this.f27085p.lastIndexOf(lk.e.f104695m);
        if (iLastIndexOf != -1) {
            lowerCase = this.f27085p.toLowerCase().substring(0, iLastIndexOf);
        } else {
            lowerCase = this.f27085p.toLowerCase();
        }
        this.f27093x = contextP3.getResources().getIdentifier("applovin_ic_mediation_" + lowerCase, "drawable", contextP3.getPackageName());
        this.f27072c = MaxAdapter.InitializationStatus.NOT_INITIALIZED.getCode();
        AppLovinCommunicator.getInstance(contextP3).subscribe(this, "adapter_initialization_status");
        numA = lVar.U().a(this.f27087r);
        if (numA != null) {
            this.f27072c = numA.intValue();
        }
        jSONObject2 = JsonUtils.getJSONObject(jSONObject3, "amazon_marketplace", (JSONObject) null);
        if (jSONObject2 != null || !this.f27073d) {
            this.H = false;
            this.I = null;
            this.J = null;
            return;
        }
        this.H = c10;
        this.I = JsonUtils.getString(jSONObject2, "test_mode_app_id", null);
        JSONObject jSONObject8 = JsonUtils.getJSONObject(jSONObject2, "test_mode_slot_ids", new JSONObject());
        HashMap map2 = new HashMap(jSONObject8.length());
        Iterator<String> itKeys2 = jSONObject8.keys();
        while (itKeys2.hasNext()) {
            String next2 = itKeys2.next();
            MaxAdFormat fromString2 = MaxAdFormat.formatFromString(next2);
            JSONObject jSONObject9 = JsonUtils.getJSONObject(jSONObject8, next2, (JSONObject) null);
            if (fromString2 != null && jSONObject9 != null && (string = JsonUtils.getString(jSONObject9, CommonUrlParts.UUID, null)) != null) {
                map2.put(fromString2, new x(string, jSONObject9, fromString2));
            }
        }
        this.J = map2;
    }

    private a a() {
        a aVar;
        if (!this.f27073d) {
            aVar = this.f27074e ? a.INCOMPLETE_INTEGRATION : a.MISSING;
        } else if (this.f27074e) {
            aVar = a.COMPLETE;
        } else {
            aVar = this.f27076g ? a.MISSING : a.INCOMPLETE_INTEGRATION;
        }
        if (aVar == a.MISSING) {
            return aVar;
        }
        Iterator it = this.f27095z.iterator();
        while (it.hasNext()) {
            if (!((r4) it.next()).c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        Iterator it2 = this.A.iterator();
        while (it2.hasNext()) {
            if (!((l1) it2.next()).c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        if (!this.f27084o || com.applovin.impl.sdk.l.H0()) {
            return E() ? a.INCOMPLETE_INTEGRATION : aVar;
        }
        return a.INVALID_INTEGRATION;
    }

    public boolean A() {
        return this.f27075f;
    }

    public boolean B() {
        return this.f27077h;
    }

    public boolean C() {
        return this.H;
    }

    public boolean D() {
        return this.f27084o;
    }

    public boolean E() {
        if (!this.f27083n || !StringUtils.isValidString(this.f27088s)) {
            return false;
        }
        return !q7.d(this.f27088s).equals(q7.a(this.f27089t, this.f27088s.split("\\.").length));
    }

    public boolean F() {
        return this.f27073d;
    }

    public boolean G() {
        return this.f27071b == a.MISSING && this.f27080k;
    }

    public boolean H() {
        return this.F;
    }

    public boolean I() {
        return this.f27081l;
    }

    public boolean J() {
        return this.f27082m;
    }

    public String b() {
        return this.f27087r;
    }

    public String c() {
        return this.f27089t;
    }

    public Map d() {
        return this.J;
    }

    public String e() {
        return this.I;
    }

    public List f() {
        return this.A;
    }

    public String g() {
        return this.f27086q;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediatedNetwork";
    }

    public int h() {
        return this.f27093x;
    }

    public int i() {
        return this.f27072c;
    }

    public final String j() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n---------- ");
        sb2.append(this.f27085p);
        sb2.append(" ----------");
        sb2.append("\nStatus  - ");
        sb2.append(this.f27071b.b());
        sb2.append("\nSDK     - ");
        String str = "UNAVAILABLE";
        sb2.append((!this.f27073d || TextUtils.isEmpty(this.f27088s)) ? "UNAVAILABLE" : this.f27088s);
        sb2.append("\nAdapter - ");
        if (this.f27074e && !TextUtils.isEmpty(this.f27089t)) {
            str = this.f27089t;
        }
        sb2.append(str);
        for (r4 r4Var : n()) {
            if (!r4Var.c()) {
                sb2.append("\n* MISSING ");
                sb2.append(r4Var.b());
                sb2.append(": ");
                sb2.append(r4Var.a());
            }
        }
        for (l1 l1Var : f()) {
            if (!l1Var.c()) {
                sb2.append("\n* MISSING ");
                sb2.append(l1Var.b());
                sb2.append(": ");
                sb2.append(l1Var.a());
            }
        }
        return sb2.toString();
    }

    public String k() {
        return this.f27090u;
    }

    public List l() {
        return this.C;
    }

    public String m() {
        return this.f27085p;
    }

    public List n() {
        return this.f27095z;
    }

    public final com.applovin.impl.sdk.l o() {
        return this.f27070a;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        String string = appLovinCommunicatorMessage.getMessageData().getString("adapter_class", "");
        if (this.f27087r.equals(string)) {
            this.f27072c = appLovinCommunicatorMessage.getMessageData().getInt("init_status", 0);
            MaxAdapter maxAdapterA = y3.a(string, this.f27070a);
            if (maxAdapterA != null) {
                String strA = y3.a(maxAdapterA);
                if (this.f27088s.equals(strA)) {
                    return;
                }
                this.f27088s = strA;
                this.f27070a.u().a(this.f27088s, string);
            }
        }
    }

    public String p() {
        return this.f27088s;
    }

    public a q() {
        return this.f27071b;
    }

    public List r() {
        return this.f27094y;
    }

    public List s() {
        return this.B;
    }

    public d7 t() {
        return this.G;
    }

    public String toString() {
        return "MediatedNetwork{name=" + this.f27085p + ", displayName=" + this.f27086q + ", sdkAvailable=" + this.f27073d + ", sdkVersion=" + this.f27088s + ", adapterAvailable=" + this.f27074e + ", adapterVersion=" + this.f27089t + "}";
    }

    public List u() {
        return this.D;
    }

    public String v() {
        return this.f27091v;
    }

    public String w() {
        return this.f27092w;
    }

    public Map x() {
        return this.E;
    }

    public b y() {
        if (!this.f27078i) {
            return b.NOT_SUPPORTED;
        }
        a aVar = this.f27071b;
        if (aVar != a.COMPLETE && (aVar != a.INCOMPLETE_INTEGRATION || !F() || !z())) {
            return b.INVALID_INTEGRATION;
        }
        if (this.f27070a.u0().c()) {
            return (this.f27079j && (this.f27072c == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() || this.f27072c == MaxAdapter.InitializationStatus.INITIALIZING.getCode())) ? b.NOT_INITIALIZED : b.READY;
        }
        return b.DISABLED;
    }

    public boolean z() {
        return this.f27074e;
    }

    private List a(MaxAdapter maxAdapter, boolean z10) {
        ArrayList arrayList = new ArrayList(5);
        if (maxAdapter instanceof MaxInterstitialAdapter) {
            arrayList.add(MaxAdFormat.INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxAppOpenAdapter) {
            arrayList.add(MaxAdFormat.APP_OPEN);
        }
        if (maxAdapter instanceof MaxRewardedAdapter) {
            arrayList.add(MaxAdFormat.REWARDED);
        }
        if (maxAdapter instanceof MaxAdViewAdapter) {
            arrayList.add(MaxAdFormat.BANNER);
            arrayList.add(MaxAdFormat.LEADER);
            if (z10) {
                arrayList.add(MaxAdFormat.MREC);
            }
        }
        if (maxAdapter instanceof MaxNativeAdAdapter) {
            arrayList.add(MaxAdFormat.NATIVE);
        }
        return arrayList;
    }

    private List a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        ArrayList arrayList = new ArrayList();
        if (this.f27087r.equals("com.applovin.mediation.adapters.AppLovinMediationAdapter")) {
            r4 r4Var = new r4("com.google.android.gms.permission.AD_ID", "Please add\n<uses-permission android:name=\"com.google.android.gms.permission.AD_ID\" />\nto your AndroidManifest.xml", com.applovin.impl.sdk.l.p());
            if (r4Var.c()) {
                arrayList.add(r4Var);
            }
        }
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "permissions", new JSONObject());
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                arrayList.add(new r4(next, jSONObject2.getString(next), com.applovin.impl.sdk.l.p()));
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    private List a(JSONObject jSONObject) {
        return JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "supported_regions", null), null);
    }

    private List a(JSONObject jSONObject, String str, com.applovin.impl.sdk.l lVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "dependencies", new JSONArray());
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "dependencies_v2", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length() + jSONArray2.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new l1(jSONObject2, lVar));
            }
        }
        for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray2, i11, (JSONObject) null);
            if (jSONObject3 != null && l1.a(str, JsonUtils.getString(jSONObject3, "min_adapter_version", null), JsonUtils.getString(jSONObject3, "max_adapter_version", null))) {
                arrayList.add(new l1(jSONObject3, lVar));
            }
        }
        return arrayList;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(g3 g3Var) {
        return this.f27086q.compareToIgnoreCase(g3Var.f27086q);
    }
}
