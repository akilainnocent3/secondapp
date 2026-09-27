package com.ironsource.mediationsdk;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.ironsource.B7;
import com.ironsource.C4215c2;
import com.ironsource.C4259ea;
import com.ironsource.C4287g2;
import com.ironsource.C4384la;
import com.ironsource.C4414n2;
import com.ironsource.C4485r4;
import com.ironsource.C5;
import com.ironsource.D5;
import com.ironsource.Lb;
import com.ironsource.Q6;
import com.ironsource.V1;
import com.ironsource.X0;
import com.ironsource.X9;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class d {
    public static final boolean A = false;
    private static d B = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f62452c = "auctionId";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f62453d = "armData";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f62454e = "larmData";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f62455f = "isAdUnitCapped";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f62456g = "settings";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f62457h = "waterfall";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f62458i = "genericParams";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f62459j = "configurations";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f62460k = "instances";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f62461l = "${AUCTION_LOSS}";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f62462m = "${AUCTION_MBR}";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f62463n = "${AUCTION_PRICE}";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f62464o = "${DYNAMIC_DEMAND_SOURCE}";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f62465p = "${INSTANCE}";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f62466q = "${INSTANCE_TYPE}";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f62467r = "${PLACEMENT_NAME}";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f62468s = "adMarkup";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f62469t = "dynamicDemandSource";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f62470u = "params";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f62471v = "dlpl";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f62472w = "adUnit";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f62473x = "parallelLoad";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f62474y = "bidderExclusive";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f62475z = "showPriorityEnabled";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f62476a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B7 f62477b = Lb.U().i();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f62478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<C4414n2> f62479b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private C4414n2 f62480c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private JSONObject f62481d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private JSONObject f62482e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f62483f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f62484g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private V1 f62485h;

        public a(String str) {
            this.f62478a = str;
        }

        public String a() {
            return this.f62478a;
        }

        public JSONObject b() {
            return this.f62482e;
        }

        public int c() {
            return this.f62483f;
        }

        public String d() {
            return this.f62484g;
        }

        public C4414n2 e() {
            return this.f62480c;
        }

        public JSONObject f() {
            return this.f62481d;
        }

        public V1 g() {
            return this.f62485h;
        }

        public List<C4414n2> h() {
            return this.f62479b;
        }

        public com.ironsource.mediationsdk.demandOnly.p a(String str) {
            V1 v10 = this.f62485h;
            if (v10 != null) {
                return v10.a(str);
            }
            return new com.ironsource.mediationsdk.demandOnly.p.b();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b implements Runnable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f62486d = 15000;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f62487a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f62488b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f62489c;

        public b(String str, String str2, String str3) {
            this.f62487a = str;
            this.f62488b = str2;
            this.f62489c = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = this.f62487a + ";" + this.f62488b + ";" + this.f62489c;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f62489c).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                String responseMessage = httpURLConnection.getResponseMessage();
                httpURLConnection.disconnect();
                Lb.U().q().a(new C5(responseCode == 200 || responseCode == 204 ? D5.TROUBLESHOOTING_SEND_AUCTION_URL_SUCCESS : D5.TROUBLESHOOTING_FAILED_TO_SEND_AUCTION_URL, new JSONObject().put(IronSourceConstants.EVENTS_PROVIDER, "Mediation").put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1).put(IronSourceConstants.EVENTS_EXT1, str).put("errorCode", responseCode).put("reason", responseMessage)));
            } catch (Exception e10) {
                C4485r4.d().a(e10);
                IronLog.INTERNAL.error("Send auction url failed with params - " + str + ";" + e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum c {
        NOT_SECURE,
        SECURE
    }

    public static d b() {
        return B;
    }

    public a a(JSONObject jSONObject) throws JSONException {
        String strOptString = jSONObject.optString("auctionId");
        if (TextUtils.isEmpty(strOptString)) {
            throw new JSONException("Invalid auction response - auction id is missing");
        }
        a aVar = new a(strOptString);
        JSONObject jSONObjectOptJSONObject = null;
        if (jSONObject.has("settings")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("settings");
            aVar.f62480c = new C4414n2(jSONObject2);
            jSONObjectOptJSONObject = jSONObject2.has(f62453d) ? jSONObject2.optJSONObject(f62453d) : null;
            if (jSONObject2.has("genericParams")) {
                aVar.f62481d = jSONObject2.optJSONObject("genericParams");
            }
            if (jSONObject2.has("configurations")) {
                aVar.f62482e = jSONObject2.optJSONObject("configurations");
            }
            if (jSONObject2.has(f62460k)) {
                aVar.f62485h = new V1.a(jSONObject2.optJSONObject(f62460k));
            }
        }
        aVar.f62479b = new ArrayList();
        if (jSONObject.has(f62457h)) {
            JSONArray jSONArray = jSONObject.getJSONArray(f62457h);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                C4414n2 c4414n2 = new C4414n2(jSONArray.getJSONObject(i10), i10, jSONObjectOptJSONObject);
                if (!c4414n2.n()) {
                    aVar.f62483f = 1002;
                    aVar.f62484g = "waterfall " + i10;
                    IronLog.INTERNAL.verbose("AuctionResponseItem " + i10 + " not valid - parsing error");
                    throw new JSONException("invalid response");
                }
                aVar.f62479b.add(c4414n2);
            }
        }
        return aVar;
    }

    public String c(String str) {
        String string = "";
        try {
            if (!TextUtils.isEmpty(str) && C4384la.a(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("params")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("parameters = " + jSONObject2);
                    if (jSONObject2.has("dynamicDemandSource")) {
                        string = jSONObject2.getString("dynamicDemandSource");
                        ironLog.verbose("demand source = " + string);
                        return string;
                    }
                }
            }
            return "";
        } catch (JSONException e10) {
            C4485r4.d().a(e10);
            IronLog.INTERNAL.error("exception " + e10.getMessage());
            return string;
        }
    }

    public Map<String, String> b(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("params")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object obj = jSONObject2.get(next);
                    if (obj instanceof String) {
                        map.put(next, (String) obj);
                    }
                }
            }
            return map;
        } catch (JSONException e10) {
            C4485r4.d().a(e10);
            IronLog.INTERNAL.error("exception " + e10.getMessage());
            return map;
        }
    }

    private c a() {
        c cVar = c.SECURE;
        if (Build.VERSION.SDK_INT >= 28) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() ? c.NOT_SECURE : cVar;
        }
        return (ContextProvider.getInstance().getApplicationContext().getApplicationInfo().flags & 134217728) != 0 ? c.NOT_SECURE : cVar;
    }

    public JSONObject a(i iVar) throws JSONException {
        IronSource.a aVar;
        boolean z10;
        List<String> list;
        IronSource.a aVarC = iVar.c();
        boolean zT = iVar.t();
        Map<String, Object> mapH = iVar.h();
        List<String> listL = iVar.l();
        h hVarE = iVar.e();
        int iO = iVar.o();
        ISBannerSize iSBannerSizeF = iVar.f();
        C4259ea c4259eaN = iVar.n();
        boolean zP = iVar.p();
        boolean zQ = iVar.q();
        ArrayList<C4287g2> arrayListK = iVar.k();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> it = mapH.keySet().iterator();
        while (true) {
            aVar = aVarC;
            z10 = zT;
            String strA = "";
            list = listL;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            ISBannerSize iSBannerSize = iSBannerSizeF;
            JSONObject jSONObject3 = new JSONObject();
            C4259ea c4259ea = c4259eaN;
            jSONObject3.put(Q6.f59924y0, 2);
            jSONObject3.put(Q6.f59897p0, new JSONObject((Map) mapH.get(next)));
            if (hVarE != null) {
                strA = hVarE.a(next);
            }
            jSONObject3.put(Q6.B0, strA);
            jSONObject3.put("ts", zQ ? 1 : 0);
            jSONObject2.put(next, jSONObject3);
            aVarC = aVar;
            zT = z10 ? 1 : 0;
            listL = list;
            iSBannerSizeF = iSBannerSize;
            c4259eaN = c4259ea;
        }
        ISBannerSize iSBannerSize2 = iSBannerSizeF;
        C4259ea c4259ea2 = c4259eaN;
        int i10 = 2;
        for (String str : list) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(Q6.f59924y0, 1);
            jSONObject4.put(Q6.B0, hVarE != null ? hVarE.a(str) : "");
            jSONObject2.put(str, jSONObject4);
        }
        for (C4287g2 c4287g2 : arrayListK) {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put(Q6.f59924y0, c4287g2.e() ? i10 : 1);
            Map<String, Object> mapF = c4287g2.f();
            if (!mapF.isEmpty()) {
                jSONObject5.put(Q6.f59897p0, new JSONObject(mapF));
            }
            jSONObject5.put(Q6.B0, hVarE != null ? hVarE.a(c4287g2.g()) : "");
            jSONObject5.put("ts", zQ ? 1 : 0);
            if (!c4287g2.h().isEmpty()) {
                jSONObject5.put(f62471v, c4287g2.h());
            }
            jSONObject2.put(c4287g2.g(), jSONObject5);
            i10 = 2;
        }
        jSONObject.put(Q6.f59921x0, jSONObject2);
        if (iVar.v()) {
            jSONObject.put(Q6.f59922x1, 1);
        }
        if (iVar.s()) {
            jSONObject.put("do", 1);
        }
        new X9().b(ContextProvider.getInstance().getApplicationContext());
        JSONObject jSONObjectA = new C4215c2(X0.a(aVar)).a();
        a(jSONObjectA, false);
        jSONObjectA.put(Q6.f59927z0, iO);
        jSONObjectA.put(Q6.A0, a().ordinal());
        if (c4259ea2 != null) {
            jSONObjectA.put(Q6.f59880j1, c4259ea2.i());
        }
        jSONObject.put(Q6.f59912u0, jSONObjectA);
        if (iSBannerSize2 != null) {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put(Q6.f59903r0, iSBannerSize2.getDescription());
            jSONObject6.put(Q6.f59909t0, iSBannerSize2.getWidth());
            jSONObject6.put(Q6.f59906s0, iSBannerSize2.getHeight());
            jSONObject.put(Q6.f59900q0, jSONObject6);
        }
        jSONObject.put(Q6.f59885l0, aVar.toString());
        if (iVar.b() != null) {
            jSONObject.put("adf", iVar.b());
        }
        if (iVar.d() != null) {
            jSONObject.put("mediationAdUnitId", iVar.d());
        }
        if (iVar.u() != null) {
            jSONObject.put(Q6.f59894o0, iVar.u());
        }
        jSONObject.put(Q6.f59915v0, !z10 ? 1 : 0);
        if (iVar.g() != null) {
            jSONObject.put(Q6.f59910t1, new JSONObject().put(Q6.f59913u1, iVar.g()));
        } else {
            Object objRemove = jSONObjectA.remove(Q6.f59910t1);
            if (objRemove != null) {
                jSONObject.put(Q6.f59910t1, objRemove);
            }
        }
        if (zP) {
            jSONObject.put(Q6.f59904r1, 1);
        }
        return jSONObject;
    }

    public String a(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7) {
        return str.replace(f62463n, str4).replace(f62461l, str6).replace(f62462m, str5).replace(f62465p, str2).replace(f62466q, Integer.toString(i10)).replace(f62464o, str3).replace(f62467r, str7);
    }

    public String a(String str, int i10, C4414n2 c4414n2, String str2, String str3, String str4) {
        String strI = c4414n2.i();
        return a(str, c4414n2.c(), i10, b().c(c4414n2.k()), strI, b().a(strI, str2), str3, str4);
    }

    public void a(String str, String str2, String str3) {
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new b(str, str2, str3));
    }

    public String a(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("adMarkup")) {
                    return jSONObject.getString("adMarkup");
                }
            }
        } catch (JSONException e10) {
            C4485r4.d().a(e10);
            IronLog.INTERNAL.error("exception " + e10.getMessage());
        }
        return str;
    }

    private String a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        double d10 = Double.parseDouble(str);
        double d11 = Double.parseDouble(str2);
        return d11 == 0.0d ? "" : String.valueOf(Math.round((d10 / d11) * 1000.0d) / 1000.0d);
    }

    public void a(JSONObject jSONObject, boolean z10) {
        if (jSONObject == null || jSONObject.length() <= 0 || TextUtils.isEmpty(jSONObject.optString(Q6.f59886l1)) || !this.f62476a.compareAndSet(false, true)) {
            return;
        }
        Lb.U().q().a(new C5(D5.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED, IronSourceUtils.a(z10, true, -1)));
    }
}
