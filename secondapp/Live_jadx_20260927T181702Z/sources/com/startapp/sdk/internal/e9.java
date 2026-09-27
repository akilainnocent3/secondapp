package com.startapp.sdk.internal;

import androidx.core.app.NotificationCompat;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class e9 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f74720c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e9 f74721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e9 f74722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e9 f74723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e9 f74724g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e9 f74725h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e9 f74726i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e9 f74727j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final e9 f74728k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final e9 f74729l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final e9 f74730m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final e9 f74731n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final e9 f74732o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final e9 f74733p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g9 f74735b;

    static {
        f9 f9Var = new f9();
        f9Var.f74793b = 23;
        f9Var.f74794c = 50;
        f9Var.f74795d = true;
        i9 i9Var = new i9();
        String[] strArr = {MobileAdsBridgeBase.initializeMethodName};
        ArrayList arrayList = i9Var.f74980a;
        if (arrayList == null) {
            arrayList = new ArrayList();
            i9Var.f74980a = arrayList;
        }
        String str = strArr[0];
        if (str != null) {
            arrayList.add(str);
        }
        i9 i9VarA = i9Var.a("value");
        i9VarA.f74983d = "8h";
        f9 f9VarA = f9Var.a(new j9(i9VarA));
        i9 i9VarA2 = new i9().a("value", to.c.channelApi);
        i9VarA2.f74983d = "30m";
        f9 f9VarA2 = f9VarA.a(new j9(i9VarA2));
        i9 i9Var2 = new i9();
        String[] strArr2 = {"CNS.shown", "CNS.closed"};
        ArrayList arrayList2 = i9Var2.f74981b;
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
            i9Var2.f74981b = arrayList2;
        }
        for (int i10 = 0; i10 < 2; i10++) {
            String str2 = strArr2[i10];
            if (str2 != null) {
                arrayList2.add(str2);
            }
        }
        i9 i9VarA3 = i9Var2.a("value");
        i9VarA3.f74983d = "10s";
        f9 f9VarA3 = f9VarA2.a(new j9(i9VarA3));
        f9VarA3.f74796e = "2h";
        f9VarA3.f74797f = "2s";
        f74721d = new e9("general", new g9(f9VarA3));
        f9 f9Var2 = new f9();
        f9Var2.f74793b = 17;
        f9Var2.f74794c = 20;
        f9Var2.f74795d = true;
        i9 i9Var3 = new i9();
        String[] strArr3 = {"fake_click"};
        ArrayList arrayList3 = i9Var3.f74981b;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            i9Var3.f74981b = arrayList3;
        }
        String str3 = strArr3[0];
        if (str3 != null) {
            arrayList3.add(str3);
        }
        i9 i9VarA4 = i9Var3.a("appActivity", "value", to.c.channelApi);
        i9VarA4.f74983d = "30m";
        f9 f9VarA4 = f9Var2.a(new j9(i9VarA4));
        i9 i9Var4 = new i9();
        String[] strArr4 = {"fake_click"};
        ArrayList arrayList4 = i9Var4.f74981b;
        if (arrayList4 == null) {
            arrayList4 = new ArrayList();
            i9Var4.f74981b = arrayList4;
        }
        String str4 = strArr4[0];
        if (str4 != null) {
            arrayList4.add(str4);
        }
        i9 i9VarA5 = i9Var4.a("appActivity", "value");
        i9VarA5.f74983d = "10s";
        f9 f9VarA5 = f9VarA4.a(new j9(i9VarA5));
        f9VarA5.f74796e = "4h";
        f9VarA5.f74797f = "5s";
        f74722e = new e9("error", new g9(f9VarA5));
        f9 f9Var3 = new f9();
        f9Var3.f74792a = 0.0d;
        f9Var3.f74793b = 17;
        f9Var3.f74794c = 30;
        f9Var3.f74795d = true;
        i9 i9VarA6 = new i9().a("appActivity", "value", to.c.channelApi);
        i9VarA6.f74983d = "12h";
        f9 f9VarA6 = f9Var3.a(new j9(i9VarA6));
        i9 i9VarA7 = new i9().a("appActivity", "value");
        i9VarA7.f74983d = "1h";
        f9 f9VarA7 = f9VarA6.a(new j9(i9VarA7));
        f9VarA7.f74796e = "1d";
        f9VarA7.f74797f = "5s";
        g9 g9Var = new g9(f9VarA7);
        f74723f = new e9("exception", g9Var);
        new e9("exception_nt", g9Var);
        f9 f9Var4 = new f9();
        f9Var4.f74793b = 17;
        f9Var4.f74794c = 40;
        f9Var4.f74795d = true;
        i9 i9VarA8 = new i9().a("value", to.c.channelApi);
        i9VarA8.f74983d = "1h";
        f9 f9VarA8 = f9Var4.a(new j9(i9VarA8));
        f9VarA8.f74796e = "2d";
        f9VarA8.f74797f = "5s";
        f74724g = new e9("exception_fatal", new g9(f9VarA8));
        f74725h = new e9("anr", g9Var);
        f9 f9Var5 = new f9();
        f9Var5.f74792a = 0.0d;
        f9Var5.f74793b = 17;
        f9Var5.f74794c = 10;
        f9Var5.f74795d = false;
        f9Var5.f74797f = "10s";
        new e9("netdiag", new g9(f9Var5));
        f9 f9Var6 = new f9();
        f9Var6.f74793b = 3007;
        f9Var6.f74794c = 90;
        f9Var6.f74795d = true;
        i9 i9VarA9 = new i9().a(NotificationCompat.CATEGORY_SERVICE);
        i9VarA9.f74983d = "1m";
        f9 f9VarA9 = f9Var6.a(new j9(i9VarA9));
        f9VarA9.f74796e = "1h";
        f74726i = new e9("periodic", new g9(f9VarA9));
        f9 f9Var7 = new f9();
        f9Var7.f74794c = 90;
        f9Var7.f74795d = true;
        f9Var7.f74796e = "4h";
        f74727j = new e9("nonimpression", new g9(f9Var7));
        f9 f9Var8 = new f9();
        f9Var8.f74793b = 17;
        f9Var8.f74794c = 10;
        f9Var8.f74795d = true;
        f9Var8.f74796e = "4h";
        f74728k = new e9("impression_responses", new g9(f9Var8));
        f9 f9Var9 = new f9();
        f9Var9.f74792a = 0.0d;
        f9Var9.f74793b = 17;
        f9Var9.f74794c = 60;
        f9Var9.f74795d = true;
        f9Var9.f74796e = "1d";
        f9Var9.f74797f = "5s";
        f74729l = new e9("success_smart_redirect_hop_info", new g9(f9Var9));
        f9 f9Var10 = new f9();
        f9Var10.f74793b = 17;
        f9Var10.f74794c = 70;
        f9Var10.f74795d = false;
        new e9("triggeredLink", new g9(f9Var10));
        f9 f9Var11 = new f9();
        f9Var11.f74793b = 23;
        f9Var11.f74794c = 80;
        f9Var11.f74795d = true;
        f9Var11.f74796e = "1d";
        f74730m = new e9("ct", new g9(f9Var11));
        f9 f9Var12 = new f9();
        f9Var12.f74793b = 23;
        f9Var12.f74794c = 80;
        f9Var12.f74795d = true;
        f9Var12.f74796e = "1d";
        f74731n = new e9("lt", new g9(f9Var12));
        f9 f9Var13 = new f9();
        f9Var13.f74793b = 23;
        f9Var13.f74794c = 80;
        f9Var13.f74795d = true;
        f9Var13.f74796e = "1d";
        f74732o = new e9("nir", new g9(f9Var13));
        f9 f9Var14 = new f9();
        f9Var14.f74793b = 19;
        f9Var14.f74794c = 10;
        f9Var14.f74795d = true;
        f9Var14.f74796e = "12h";
        f74733p = new e9("sensors", new g9(f9Var14));
    }

    public e9(String str, g9 g9Var) {
        this.f74734a = str;
        this.f74735b = g9Var;
        f74720c.put(str, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e9.class != obj.getClass()) {
            return false;
        }
        return si.a((Object) this.f74734a, (Object) ((e9) obj).f74734a);
    }

    public final int hashCode() {
        return this.f74734a.hashCode();
    }

    public final String toString() {
        return this.f74734a;
    }
}
