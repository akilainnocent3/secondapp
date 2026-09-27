package com.mbridge.msdk.setting;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C4235d4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.g0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.y0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f69021a = "h";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile h f69022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile g f69023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static HashMap<String, l> f69024d = new HashMap<>();

    private h() {
    }

    public static void a(Context context, String str) {
        FastKV fastKVBuild;
        Map<String, Object> all = null;
        if (com.mbridge.msdk.foundation.controller.d.a().e()) {
            try {
                fastKVBuild = new FastKV.Builder(com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_CONFIG), "mbridge").build();
            } catch (Exception unused) {
                fastKVBuild = null;
            }
        } else {
            fastKVBuild = null;
        }
        if (fastKVBuild == null) {
            try {
                Map<String, ?> all2 = context.getSharedPreferences("mbridge", 0).getAll();
                for (String str2 : all2.keySet()) {
                    if (str2.startsWith(str + lk.e.f104695m)) {
                        f69024d.put(str2, l.l((String) all2.get(str2)));
                    }
                }
                return;
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
        try {
            all = fastKVBuild.getAll();
        } catch (Exception unused2) {
        }
        if (all != null) {
            try {
                for (String str3 : all.keySet()) {
                    if (str3.startsWith(str + lk.e.f104695m)) {
                        f69024d.put(str3, l.l((String) all.get(str3)));
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public static h b() {
        if (f69022b == null) {
            synchronized (h.class) {
                try {
                    if (f69022b == null) {
                        f69022b = new h();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f69022b;
    }

    public g c() {
        return f69023c != null ? f69023c : a();
    }

    public g d(String str) {
        if (f69023c == null) {
            try {
                String strA = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(str);
                if (!TextUtils.isEmpty(strA)) {
                    JSONObject jSONObject = new JSONObject(strA);
                    if (jSONObject.has("b")) {
                        jSONObject.remove("b");
                    }
                    if (jSONObject.has("c")) {
                        jSONObject.remove("c");
                    }
                    f69023c = g.D(jSONObject.toString());
                    if (f69023c != null) {
                        f69023c.O0();
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return f69023c;
    }

    public l e(String str, String str2) {
        l lVarB = b(str, str2);
        if (lVarB != null && lVarB.L() == 0) {
            lVarB.d(1);
        }
        return lVarB;
    }

    public String f(String str, String str2) {
        return com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(str + lk.e.f104695m + str2);
    }

    public boolean g(String str, String str2) {
        g gVarD = d(str2);
        if (g(str2) && a(str2, 1, str)) {
            new j().b(com.mbridge.msdk.foundation.controller.c.n().d(), str2, com.mbridge.msdk.foundation.controller.c.n().c());
        }
        l lVarE = e(str2, str);
        if (gVarD != null && lVarE != null) {
            long jU0 = gVarD.u0() * 1000;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jO = lVarE.o() + jU0;
            if (jO > jCurrentTimeMillis) {
                q0.c(f69021a, "unit setting  nexttime is not ready  [settingNextRequestTime= " + jO + " currentTime = " + jCurrentTimeMillis + C4235d4.j.f61462e);
                return false;
            }
        }
        q0.c(f69021a, "unit setting timeout or not exists");
        return true;
    }

    public void h(String str) {
        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().c("ivreward_" + str);
    }

    public void i(String str, String str2) {
        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("ivreward_" + str, str2);
    }

    public void j(String str, String str2) {
        try {
            String strA = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(str + lk.e.f104695m + str2);
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strA);
            jSONObject.put("current_time", System.currentTimeMillis());
            a(str, str2, jSONObject.toString());
        } catch (Throwable th2) {
            q0.b(f69021a, th2.getMessage());
        }
    }

    public void h(String str, String str2) {
        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(str, str2);
        f69023c = g.D(str2);
        if (f69023c != null) {
            f69023c.O0();
            com.mbridge.msdk.config.manager.a.b().b(str, str2);
        }
        i.a(f69023c);
        g0.a().a(f69023c.R());
    }

    public void i(String str) {
        try {
            String strE = e(str);
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strE);
            jSONObject.put("current_time", System.currentTimeMillis());
            h(str, jSONObject.toString());
        } catch (Throwable th2) {
            q0.b(f69021a, th2.getMessage());
        }
    }

    public String f(String str) {
        g gVarD = d(str);
        if (gVarD == null) {
            return "0";
        }
        int iE0 = gVarD.e0();
        String strD0 = gVarD.d0();
        return (iE0 == 0 || !(!TextUtils.isEmpty(strD0) && !strD0.equalsIgnoreCase(fw.b.f85379f))) ? "0" : "1";
    }

    public String c(String str) {
        return com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("ivreward_" + str);
    }

    public String e(String str) {
        if (str == null) {
            return "";
        }
        try {
            String strA = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(str);
            return strA == null ? "" : strA;
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
            return "";
        }
    }

    public l c(String str, String str2) {
        l lVarA = a(str, str2);
        return lVarA == null ? l.N() : lVarA;
    }

    public g b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return a();
            }
            g gVarD = d(str);
            return gVarD == null ? a() : gVarD;
        } catch (Exception unused) {
            return a();
        }
    }

    public boolean g(String str) {
        g gVarD = d(str);
        if (gVarD != null) {
            long jB = gVarD.B() * 1000;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jX = gVarD.x() + jB;
            if (jX > jCurrentTimeMillis) {
                q0.c(f69021a, "app setting nexttime is not ready  [settingNextRequestTime= " + jX + " currentTime = " + jCurrentTimeMillis + C4235d4.j.f61462e);
                return false;
            }
        }
        q0.c(f69021a, "app setting timeout or not exists");
        return true;
    }

    private l b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = com.mbridge.msdk.foundation.controller.c.n().b();
        }
        String str3 = str + lk.e.f104695m + str2;
        if (f69024d.containsKey(str3)) {
            return f69024d.get(str3);
        }
        l lVarL = null;
        try {
            lVarL = l.l(com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(str3));
            f69024d.put(str3, lVarL);
            return lVarL;
        } catch (Exception e10) {
            e10.printStackTrace();
            return lVarL;
        }
    }

    public l d(String str, String str2) {
        l lVarE = e(str, str2);
        return lVarE == null ? l.N() : lVarE;
    }

    public void a(String str) {
        i.a(str, this);
    }

    public g a() {
        return i.a();
    }

    public l a(String str, String str2) {
        return b(str, str2);
    }

    public boolean a(String str, int i10, String str2) {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            String str3 = str + lk.e.f104695m + i10 + lk.e.f104695m + str2;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j10 = 0;
            long jLongValue = ((Long) y0.a(contextD, str3, 0L)).longValue();
            g gVarD = d(str);
            if (gVarD == null) {
                gVarD = b().a();
            } else {
                j10 = jLongValue;
            }
            if (j10 + (gVarD.p0() * 1000) > jCurrentTimeMillis) {
                return false;
            }
            y0.b(contextD, str3, Long.valueOf(jCurrentTimeMillis));
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return jSONObject2;
        }
        if (jSONObject2 != null && jSONObject2.length() != 0) {
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    if ("unitSetting".equals(next) && jSONObject.has("unitSetting")) {
                        JSONArray jSONArray = jSONObject.getJSONArray("unitSetting");
                        jSONArray.put(0, a((JSONObject) jSONArray.get(0), (JSONObject) jSONObject2.getJSONArray("unitSetting").get(0)));
                        jSONObject.put(next, jSONArray);
                    } else {
                        jSONObject.put(next, jSONObject2.opt(next));
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
        return jSONObject;
    }

    public void a(String str, String str2, String str3) {
        String str4 = str + lk.e.f104695m + str2;
        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(str4, str3);
        f69024d.put(str4, l.l(str3));
    }
}
