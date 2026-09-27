package com.mbridge.msdk.config.component.info.provider;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C4235d4;
import com.ironsource.Q6;
import com.ironsource.sdk.controller.f;
import com.mbridge.msdk.config.component.info.provider.subprovider.b;
import com.mbridge.msdk.config.component.info.provider.subprovider.c;
import com.mbridge.msdk.config.component.info.provider.subprovider.d;
import com.mbridge.msdk.config.component.info.provider.subprovider.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBConfiguration;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Map<String, Object> f65290j = new HashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Map<String, Object> f65291k = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f65292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f65293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f65294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.config.component.info.provider.subprovider.a f65295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private e f65296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f65297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d f65298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f65299h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.info.provider.listener.a f65300i = new com.mbridge.msdk.config.component.info.provider.listener.a() { // from class: hn.a
        @Override // com.mbridge.msdk.config.component.info.provider.listener.a
        public final void a(Map map) {
            com.mbridge.msdk.config.component.info.provider.a.a(map);
        }
    };

    public a(int i10, int i11, int i12) {
        this.f65292a = i10;
        this.f65293b = i11;
        this.f65294c = i12;
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Map map) {
        if (map != null) {
            if (map.containsKey(f.b.f63771c)) {
                f65291k.put(com.mbridge.msdk.config.component.common.util.c.a("546"), map.get(f.b.f63771c));
            }
            if (map.containsKey("adIdB64")) {
                f65291k.put(com.mbridge.msdk.config.component.common.util.c.a("547"), map.get("adIdB64"));
            }
            if (map.containsKey("adIdLimit")) {
                f65291k.put(com.mbridge.msdk.config.component.common.util.c.a("548"), map.get("adIdLimit"));
            }
            if (map.containsKey("amazonIdInfo")) {
                Map<String, Object> map2 = f65291k;
                map2.put(com.mbridge.msdk.config.component.common.util.c.a("549"), map.get("amazonIdInfoB64"));
                map2.put(com.mbridge.msdk.config.component.common.util.c.a("550"), map.get("amazonIdInfo"));
            }
        }
    }

    public void c() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (this.f65292a == 1) {
            this.f65295d = new com.mbridge.msdk.config.component.info.provider.subprovider.a(contextD, this.f65300i);
        }
        if (this.f65293b == 1) {
            this.f65296e = new e(contextD);
        }
        this.f65297f = new c();
        this.f65298g = new d();
        this.f65299h = new b(contextD);
    }

    public Map<String, Object> b() {
        HashMap map = new HashMap();
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (this.f65293b == 1) {
                map.put(com.mbridge.msdk.config.component.common.util.c.a("513"), this.f65297f.e(contextD));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("509"), this.f65297f.a(contextD));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("531"), Integer.valueOf(this.f65297f.j(contextD)));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("533"), this.f65297f.k(contextD));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("557"), Integer.valueOf(this.f65297f.n()));
                HashMap<String, Object> mapM = this.f65297f.m();
                map.put(com.mbridge.msdk.config.component.common.util.c.a("553"), mapM.get("available"));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("580"), mapM.get("versionName"));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("581"), mapM.get("versionCode"));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("538"), Integer.valueOf(this.f65299h.c()));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("517"), this.f65299h.d());
                map.put(com.mbridge.msdk.config.component.common.util.c.a("559"), Integer.valueOf(this.f65299h.e()));
            }
            if (this.f65294c == 1) {
                map.put(com.mbridge.msdk.config.component.common.util.c.a("534"), Integer.valueOf(this.f65298g.d(contextD)));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("535"), Integer.valueOf(this.f65298g.d(contextD)));
                Map<String, Object> mapA = this.f65298g.a(contextD);
                map.put(com.mbridge.msdk.config.component.common.util.c.a("536"), mapA.get("charging"));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("535"), mapA.get(C4235d4.j.Y));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("544"), this.f65298g.b(contextD));
            }
            return map;
        } catch (Throwable th2) {
            q0.b("DeviceInfoProvider", th2.getMessage(), th2);
            return map;
        }
    }

    public Map<String, Object> a() {
        Map<String, Object> mapA;
        String str = "";
        Map<String, Object> map = f65290j;
        if (!map.isEmpty()) {
            Map<String, Object> map2 = f65291k;
            if (!map2.isEmpty()) {
                map.putAll(map2);
            }
            return map;
        }
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            map.put(com.mbridge.msdk.config.component.common.util.c.a("524"), MBConfiguration.SDK_VERSION);
            map.put(com.mbridge.msdk.config.component.common.util.c.a("506"), "1");
            map.put(com.mbridge.msdk.config.component.common.util.c.a("567"), contextD.getPackageName());
            map.put(com.mbridge.msdk.config.component.common.util.c.a("568"), this.f65297f.d(contextD));
            map.put(com.mbridge.msdk.config.component.common.util.c.a("569"), Integer.valueOf(this.f65297f.c(contextD)));
            map.put(com.mbridge.msdk.config.component.common.util.c.a("570"), "1");
            map.put(com.mbridge.msdk.config.component.common.util.c.a("571"), "1");
            map.put(com.mbridge.msdk.config.component.common.util.c.a("572"), this.f65297f.a(contextD, contextD.getPackageName()));
            map.put(com.mbridge.msdk.config.component.common.util.c.a("573"), "2");
            map.put(com.mbridge.msdk.config.component.common.util.c.a("574"), Integer.valueOf(this.f65297f.j()));
            if (this.f65293b == 1) {
                map.put(com.mbridge.msdk.config.component.common.util.c.a("508"), this.f65297f.g());
                map.put(com.mbridge.msdk.config.component.common.util.c.a("579"), Integer.valueOf(this.f65297f.h()));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("503"), this.f65297f.f());
                map.put(com.mbridge.msdk.config.component.common.util.c.a("552"), this.f65297f.a());
                map.put(com.mbridge.msdk.config.component.common.util.c.a("551"), this.f65297f.d());
                map.put(com.mbridge.msdk.config.component.common.util.c.a("522"), this.f65296e.c());
                map.put(com.mbridge.msdk.config.component.common.util.c.a("502"), this.f65297f.i());
                map.put(com.mbridge.msdk.config.component.common.util.c.a("532"), this.f65297f.h(contextD) + "x" + this.f65297f.f(contextD));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("631"), "");
                Map<String, Object> mapE = this.f65297f.e();
                if (mapE != null && !mapE.isEmpty()) {
                    map.put(com.mbridge.msdk.config.component.common.util.c.a("505"), mapE.get("totalMem"));
                    map.put(com.mbridge.msdk.config.component.common.util.c.a("541"), mapE.get(Q6.f59917w));
                }
                map.put(com.mbridge.msdk.config.component.common.util.c.a("519"), Integer.valueOf(this.f65297f.o()));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("518"), Integer.valueOf(this.f65297f.n(contextD)));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("520"), Integer.valueOf(this.f65297f.k()));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("566"), Integer.valueOf(this.f65297f.a(com.mbridge.msdk.foundation.controller.c.n().h())));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("515"), Long.valueOf(this.f65297f.b()));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("512"), Integer.valueOf(this.f65297f.l()));
                Map<String, String> mapI = this.f65297f.i(contextD);
                if (mapI != null && !mapI.isEmpty()) {
                    String str2 = mapI.get("mnc");
                    String str3 = mapI.get("mcc");
                    String strA = com.mbridge.msdk.config.component.common.util.c.a("564");
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                    map.put(strA, str2);
                    String strA2 = com.mbridge.msdk.config.component.common.util.c.a("565");
                    if (!TextUtils.isEmpty(str3)) {
                        str = str3;
                    }
                    map.put(strA2, str);
                }
                map.put(com.mbridge.msdk.config.component.common.util.c.a("563"), this.f65297f.c());
                map.put(com.mbridge.msdk.config.component.common.util.c.a("562"), Boolean.valueOf(this.f65297f.m(contextD)));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("561"), this.f65297f.l(contextD));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("560"), Integer.valueOf(this.f65297f.b(contextD)));
            }
            if (this.f65294c == 1) {
                map.put(com.mbridge.msdk.config.component.common.util.c.a("516"), Float.valueOf(this.f65298g.c(contextD)));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("510"), this.f65298g.b());
                Map<String, Object> mapA2 = this.f65298g.a();
                if (mapA2 != null && !mapA2.isEmpty()) {
                    map.put(com.mbridge.msdk.config.component.common.util.c.a("555"), mapA2.get("totalSpace"));
                    map.put(com.mbridge.msdk.config.component.common.util.c.a("542"), mapA2.get("freeExternalSize"));
                }
            }
            if (this.f65292a == 1 && (mapA = this.f65295d.a()) != null && !mapA.isEmpty()) {
                map.put(com.mbridge.msdk.config.component.common.util.c.a("546"), mapA.get(f.b.f63771c));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("547"), mapA.get("adIdB64"));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("548"), mapA.get("adIdLimit"));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("549"), mapA.get("amazonIdInfoB64"));
                map.put(com.mbridge.msdk.config.component.common.util.c.a("550"), mapA.get("amazonIdInfo"));
            }
        } catch (Throwable th2) {
            q0.b("DeviceInfoProvider", th2.getMessage(), th2);
        }
        return f65290j;
    }

    public String a(String str) {
        Map<String, Object> map = f65290j;
        if (!map.isEmpty()) {
            Map<String, Object> map2 = f65291k;
            if (!map2.isEmpty()) {
                map.putAll(map2);
            }
        }
        if (map.containsKey(str)) {
            return String.valueOf(map.get(str));
        }
        Map<String, Object> map3 = f65291k;
        if (map3.containsKey(str)) {
            return String.valueOf(map3.get(str));
        }
        Map<String, Object> mapB = b();
        if (mapB.containsKey(str)) {
            return String.valueOf(mapB.get(str));
        }
        return "";
    }
}
