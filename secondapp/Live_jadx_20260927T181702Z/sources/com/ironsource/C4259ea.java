package com.ironsource;

import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ea, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4259ea {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f61646m = "age";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f61647n = "gen";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f61648o = "lvl";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f61649p = "pay";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f61650q = "iapt";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f61651r = "ucd";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f61652s = "segName";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f61653a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f61659g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f61654b = 999999;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f61655c = 999999.99d;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f61656d = "custom";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f61657e = 5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f61658f = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f61660h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AtomicBoolean f61661i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private double f61662j = -1.0d;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f61663k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ArrayList<Pair<String, String>> f61664l = new ArrayList<>();

    @Deprecated
    public int a() {
        return this.f61658f;
    }

    @Deprecated
    public String b() {
        return this.f61659g;
    }

    public double c() {
        return this.f61662j;
    }

    public AtomicBoolean d() {
        return this.f61661i;
    }

    public int e() {
        return this.f61660h;
    }

    public ArrayList<Pair<String, String>> f() {
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        if (this.f61658f != -1) {
            arrayList.add(new Pair<>("age", this.f61658f + ""));
        }
        if (!TextUtils.isEmpty(this.f61659g)) {
            arrayList.add(new Pair<>(f61647n, this.f61659g));
        }
        if (this.f61660h != -1) {
            arrayList.add(new Pair<>("lvl", this.f61660h + ""));
        }
        if (this.f61661i != null) {
            arrayList.add(new Pair<>("pay", this.f61661i + ""));
        }
        if (this.f61662j != -1.0d) {
            arrayList.add(new Pair<>("iapt", this.f61662j + ""));
        }
        if (this.f61663k != 0) {
            arrayList.add(new Pair<>("ucd", this.f61663k + ""));
        }
        if (!TextUtils.isEmpty(this.f61653a)) {
            arrayList.add(new Pair<>("segName", this.f61653a));
        }
        arrayList.addAll(this.f61664l);
        return arrayList;
    }

    public String g() {
        return this.f61653a;
    }

    public long h() {
        return this.f61663k;
    }

    public JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        for (Pair<String, String> pair : f()) {
            try {
                jSONObject.put((String) pair.first, pair.second);
            } catch (JSONException e10) {
                C4485r4.d().a(e10);
                IronLog.INTERNAL.error("exception " + e10.getMessage());
            }
        }
        return jSONObject;
    }

    private boolean b(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    public void a(int i10) {
        if (i10 > 0 && i10 < this.f61654b) {
            this.f61660h = i10;
            return;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setLevel( " + i10 + " ) level must be between 1-" + this.f61654b, 2);
    }

    public void a(boolean z10) {
        if (this.f61661i == null) {
            this.f61661i = new AtomicBoolean();
        }
        this.f61661i.set(z10);
    }

    public void a(double d10) {
        if (d10 > 0.0d && d10 < this.f61655c) {
            this.f61662j = Math.floor(d10 * 100.0d) / 100.0d;
            return;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setIAPTotal( " + d10 + " ) iapt must be between 0-" + this.f61655c, 2);
    }

    public void a(long j10) {
        if (j10 > 0) {
            this.f61663k = j10;
            return;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setUserCreationDate( " + j10 + " ) is an invalid timestamp", 2);
    }

    public void a(String str) {
        if (b(str) && a(str, 1, 32)) {
            this.f61653a = str;
            return;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setSegmentName( " + str + " ) segment name must be alphanumeric and 1-32 in length", 2);
    }

    public void a(String str, String str2) {
        try {
            if (b(str) && b(str2) && a(str, 1, 32) && a(str2, 1, 32)) {
                String str3 = "custom_" + str;
                if (this.f61664l.size() >= 5) {
                    this.f61664l.remove(0);
                }
                this.f61664l.add(new Pair<>(str3, str2));
                return;
            }
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setCustom( " + str + " , " + str2 + " ) key and value must be alphanumeric and 1-32 in length", 2);
        } catch (Exception e10) {
            C4485r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private boolean a(String str, int i10, int i11) {
        return str != null && str.length() >= i10 && str.length() <= i11;
    }
}
