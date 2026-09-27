package com.mbridge.msdk.tracker.network;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ironsource.G5;
import com.mbridge.msdk.foundation.tools.v0;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class t<T> implements Comparable<t<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f70343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f70344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile p f70345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f70346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, String> f70347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f70348f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f70349g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f70350h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f70351i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f70352j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f70353k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private v.a f70354l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Integer f70355m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private u f70356n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f70357o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f70358p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f70359q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f70360r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f70361s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private x f70362t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private b.a f70363u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f70364v;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public t(int i10, String str) {
        this(i10, str, 0);
    }

    private static int b(String str) {
        Uri uri;
        String host;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || (host = uri.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    public final boolean A() {
        return this.f70361s;
    }

    public final boolean B() {
        return this.f70360r;
    }

    public abstract v<T> a(q qVar);

    public abstract void a(T t10);

    public void a(String str) {
    }

    public b0 c(b0 b0Var) {
        return b0Var;
    }

    public b.a d() {
        return this.f70363u;
    }

    public String e() {
        if (!TextUtils.isEmpty(this.f70344b)) {
            return this.f70344b;
        }
        if (this.f70343a == null) {
            this.f70343a = new com.mbridge.msdk.tracker.network.toolbox.e();
        }
        String strA = this.f70343a.a(this);
        this.f70344b = strA;
        return strA;
    }

    public Map<String, String> f() {
        return Collections.EMPTY_MAP;
    }

    public int g() {
        return this.f70348f;
    }

    public p h() {
        return this.f70345c;
    }

    public Map<String, String> i() {
        return null;
    }

    public String j() {
        return "UTF-8";
    }

    public int k() {
        return this.f70350h;
    }

    public a l() {
        return a.NORMAL;
    }

    public long m() {
        return this.f70364v;
    }

    public long n() {
        return SystemClock.elapsedRealtime() - this.f70346d;
    }

    public x o() {
        return this.f70362t;
    }

    public String p() {
        return this.f70351i;
    }

    public final int q() {
        x xVarO = o();
        if (xVarO == null) {
            return 30000;
        }
        return xVarO.b();
    }

    public final long r() {
        x xVarO = o();
        if (xVarO == null) {
            return 30000L;
        }
        long jA = xVarO.a();
        if (jA < 0) {
            return 30000L;
        }
        return jA;
    }

    public int s() {
        return this.f70352j;
    }

    public String t() {
        return this.f70349g;
    }

    public String toString() {
        String str = "0x" + Integer.toHexString(s());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(v() ? "[X] " : "[ ] ");
        sb2.append(t());
        sb2.append(" ");
        sb2.append(str);
        sb2.append(" ");
        sb2.append(l());
        sb2.append(" ");
        sb2.append(this.f70355m);
        return sb2.toString();
    }

    public boolean u() {
        boolean z10;
        synchronized (this.f70353k) {
            z10 = this.f70359q;
        }
        return z10;
    }

    public boolean v() {
        boolean z10;
        synchronized (this.f70353k) {
            z10 = this.f70358p;
        }
        return z10;
    }

    public void w() {
        synchronized (this.f70353k) {
            this.f70359q = true;
        }
    }

    public void x() {
        synchronized (this.f70353k) {
        }
    }

    public boolean y() {
        return true;
    }

    public final boolean z() {
        return this.f70357o;
    }

    public t(int i10, String str, int i11) {
        this(i10, str, i11, "un_known");
    }

    public boolean a() {
        return false;
    }

    public void c(String str) {
        u uVar = this.f70356n;
        if (uVar != null) {
            uVar.c(this);
        }
    }

    public String d(String str) {
        if (this.f70347e != null && !TextUtils.isEmpty(str)) {
            try {
                return this.f70347e.get(str);
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public t(int i10, String str, int i11, String str2) {
        this.f70353k = new Object();
        this.f70357o = false;
        this.f70358p = false;
        this.f70359q = false;
        this.f70360r = false;
        this.f70361s = false;
        this.f70363u = null;
        this.f70364v = 0L;
        this.f70348f = i10;
        this.f70349g = str;
        this.f70350h = i11;
        this.f70351i = str2;
        a((x) new e());
        this.f70352j = b(str);
        this.f70346d = SystemClock.elapsedRealtime();
    }

    public void a(v.a aVar) {
        this.f70354l = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t<?> a(x xVar) {
        this.f70362t = xVar;
        return this;
    }

    public String c() {
        return "application/x-www-form-urlencoded; charset=" + j();
    }

    public void a(int i10) {
        u uVar = this.f70356n;
        if (uVar != null) {
            uVar.a(this, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> b(int i10) {
        this.f70355m = Integer.valueOf(i10);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> c(boolean z10) {
        this.f70360r = z10;
        return this;
    }

    public byte[] b() {
        Map<String, String> mapI = i();
        if (mapI != null && mapI.size() > 0) {
            byte[] bArrA = a(mapI, j());
            this.f70364v = bArrA.length;
            return bArrA;
        }
        this.f70364v = 0L;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t<?> a(u uVar) {
        this.f70356n = uVar;
        return this;
    }

    private byte[] a(Map<String, String> map, String str) {
        StringBuilder sb2 = new StringBuilder();
        try {
            int i10 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                i10++;
                if (entry.getKey() != null) {
                    sb2.append(URLEncoder.encode(entry.getKey(), str));
                    sb2.append(G5.T);
                    sb2.append(URLEncoder.encode(entry.getValue() == null ? "" : entry.getValue(), str));
                    if (i10 <= map.size() - 1) {
                        sb2.append('&');
                    }
                }
            }
            if (map.containsKey("rk") && map.containsKey("erk") && "1".equals(map.get("erk"))) {
                return ("p=" + URLEncoder.encode(v0.b(sb2.toString(), "ebmclXzZOhtU2sRlZxGL8A"), str)).getBytes(str);
            }
            return sb2.toString().getBytes(str);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("Encoding not supported: " + str, e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> b(boolean z10) {
        this.f70361s = z10;
        return this;
    }

    public void b(b0 b0Var) {
        v.a aVar;
        synchronized (this.f70353k) {
            aVar = this.f70354l;
        }
        if (aVar != null) {
            aVar.a(b0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> a(boolean z10) {
        this.f70357o = z10;
        return this;
    }

    public void a(v<?> vVar) {
        synchronized (this.f70353k) {
        }
    }

    public void a(p pVar) {
        this.f70345c = pVar;
    }

    public void a(String str, String str2) {
        if (this.f70347e == null) {
            this.f70347e = new HashMap();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            this.f70347e.put(str, str2);
        } catch (Exception unused) {
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(t<T> tVar) {
        a aVarL = l();
        a aVarL2 = tVar.l();
        return aVarL == aVarL2 ? this.f70355m.intValue() - tVar.f70355m.intValue() : aVarL2.ordinal() - aVarL.ordinal();
    }
}
