package com.startapp.sdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.webkit.WebView;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ld extends qk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f75121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ib f75122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ib f75123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f75124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f75125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f75126f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f75129i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f75130j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f75131k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Boolean f75132l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f75133m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Runnable f75134n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f75138r;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f75127g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f75128h = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f75135o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f75136p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final LinkedHashMap f75137q = new LinkedHashMap();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final cd f75139s = new cd(this);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final dd f75140t = new dd(this);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ed f75141u = new ed(this);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final fd f75142v = new fd(this);

    public ld(Context context, ib ibVar, ib ibVar2, Handler handler, long j10, long j11, boolean z10, Boolean bool, String str, String str2, String str3, Runnable runnable) {
        this.f75121a = context;
        this.f75122b = ibVar;
        this.f75123c = new ib(new gd(ibVar2));
        this.f75124d = handler;
        this.f75129i = j10;
        this.f75130j = j11;
        this.f75131k = z10;
        this.f75132l = bool;
        this.f75125e = str;
        this.f75133m = str2;
        this.f75126f = str3;
        this.f75134n = runnable;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0068 A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #0 {all -> 0x0065, blocks: (B:3:0x0002, B:5:0x0006, B:8:0x0016, B:10:0x001d, B:12:0x0023, B:14:0x0037, B:35:0x00e7, B:37:0x00eb, B:17:0x0068, B:20:0x0079, B:24:0x0089, B:26:0x008d, B:32:0x00a6, B:34:0x00ba, B:27:0x009a), top: B:41:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0088  */
    /* JADX WARN: Code duplicated, block: B:26:0x008d A[Catch: all -> 0x0065, TryCatch #0 {all -> 0x0065, blocks: (B:3:0x0002, B:5:0x0006, B:8:0x0016, B:10:0x001d, B:12:0x0023, B:14:0x0037, B:35:0x00e7, B:37:0x00eb, B:17:0x0068, B:20:0x0079, B:24:0x0089, B:26:0x008d, B:32:0x00a6, B:34:0x00ba, B:27:0x009a), top: B:41:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x009a A[Catch: all -> 0x0065, TryCatch #0 {all -> 0x0065, blocks: (B:3:0x0002, B:5:0x0006, B:8:0x0016, B:10:0x001d, B:12:0x0023, B:14:0x0037, B:35:0x00e7, B:37:0x00eb, B:17:0x0068, B:20:0x0079, B:24:0x0089, B:26:0x008d, B:32:0x00a6, B:34:0x00ba, B:27:0x009a), top: B:41:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ba A[Catch: all -> 0x0065, TryCatch #0 {all -> 0x0065, blocks: (B:3:0x0002, B:5:0x0006, B:8:0x0016, B:10:0x001d, B:12:0x0023, B:14:0x0037, B:35:0x00e7, B:37:0x00eb, B:17:0x0068, B:20:0x0079, B:24:0x0089, B:26:0x008d, B:32:0x00a6, B:34:0x00ba, B:27:0x009a), top: B:41:0x0002 }] */
    public final void a(String str, String str2, boolean z10) {
        Boolean bool;
        float fJ;
        try {
            if (this.f75135o) {
                return;
            }
            boolean z11 = true;
            this.f75127g = true;
            g0.d(this.f75121a);
            a();
            Context context = this.f75121a;
            if (z10) {
                str = str2;
            }
            g0.b(context, str);
            String str3 = this.f75133m;
            if (str3 == null || str3.isEmpty()) {
                if (MetaData.E().h().l() || !((sf) this.f75122b.a()).getBoolean("firstSucceededSmartRedirect", true)) {
                    z11 = false;
                }
                bool = this.f75132l;
                if (bool == null) {
                    fJ = MetaData.E().h().j();
                } else if (bool.booleanValue()) {
                    fJ = 100.0f;
                } else {
                    fJ = 0.0f;
                }
                if (z11 || ((Random) si.f75517d.a()).nextDouble() * 100.0d < fJ) {
                    d9 d9Var = new d9(e9.f74729l);
                    d9Var.f74677f = b();
                    d9Var.f74678g = this.f75126f;
                    d9Var.a();
                    rf rfVarEdit = ((sf) this.f75122b.a()).edit();
                    rfVarEdit.a("firstSucceededSmartRedirect", Boolean.FALSE);
                    rfVarEdit.f75462a.putBoolean("firstSucceededSmartRedirect", false);
                    rfVarEdit.apply();
                }
            } else {
                String str4 = this.f75125e;
                Locale locale = Locale.ROOT;
                if (str4.toLowerCase(locale).contains(this.f75133m.toLowerCase(locale))) {
                    if (MetaData.E().h().l()) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    bool = this.f75132l;
                    if (bool == null) {
                        fJ = MetaData.E().h().j();
                    } else if (bool.booleanValue()) {
                        fJ = 100.0f;
                    } else {
                        fJ = 0.0f;
                    }
                    if (z11) {
                        d9 d9Var2 = new d9(e9.f74729l);
                        d9Var2.f74677f = b();
                        d9Var2.f74678g = this.f75126f;
                        d9Var2.a();
                        rf rfVarEdit2 = ((sf) this.f75122b.a()).edit();
                        rfVarEdit2.a("firstSucceededSmartRedirect", Boolean.FALSE);
                        rfVarEdit2.f75462a.putBoolean("firstSucceededSmartRedirect", false);
                        rfVarEdit2.apply();
                    } else {
                        d9 d9Var3 = new d9(e9.f74729l);
                        d9Var3.f74677f = b();
                        d9Var3.f74678g = this.f75126f;
                        d9Var3.a();
                        rf rfVarEdit3 = ((sf) this.f75122b.a()).edit();
                        rfVarEdit3.a("firstSucceededSmartRedirect", Boolean.FALSE);
                        rfVarEdit3.f75462a.putBoolean("firstSucceededSmartRedirect", false);
                        rfVarEdit3.apply();
                    }
                } else {
                    d9 d9Var4 = new d9(e9.f74722e);
                    d9Var4.f74675d = "Wrong package reached";
                    d9Var4.f74676e = "Expected: " + this.f75133m + ", Link: " + this.f75125e;
                    d9Var4.f74678g = this.f75126f;
                    d9Var4.a();
                }
            }
            Runnable runnable = this.f75134n;
            if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable th2) {
            d9.a(th2);
        }
    }

    public final JSONArray b() {
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry entry : this.f75137q.entrySet()) {
            String str = (String) entry.getKey();
            Float f10 = (Float) entry.getValue();
            JSONObject jSONObject = new JSONObject();
            try {
                Float f11 = (Float) this.f75137q.get(str);
                if (f11 == null || f11.floatValue() < 0.0f) {
                    this.f75137q.put(str, Float.valueOf((System.currentTimeMillis() - this.f75138r) / 1000.0f));
                }
                jSONObject.put("time", String.valueOf(f10));
                jSONObject.put("url", str);
                jSONArray.put(jSONObject);
            } catch (JSONException unused) {
            }
        }
        return jSONArray;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        ((Executor) this.f75123c.a()).execute(new kd(this, str));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        ((Executor) this.f75123c.a()).execute(new hd(this, str));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        a();
        if (str2 != null && !g0.a(str2) && g0.b(str2)) {
            d9 d9Var = new d9(e9.f74722e);
            d9Var.f74675d = "Failed smart redirect: " + i10;
            d9Var.f74676e = str2;
            d9Var.f74678g = this.f75126f;
            d9Var.a();
        }
        super.onReceivedError(webView, i10, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (webView != null && str != null) {
            ((Executor) this.f75123c.a()).execute(new id(this, str));
            if (si.c(webView.getContext(), str)) {
                return true;
            }
            String lowerCase = str.toLowerCase(Locale.ENGLISH);
            boolean zA = g0.a(lowerCase);
            boolean zStartsWith = lowerCase.startsWith("intent://");
            if (!zA && !zStartsWith) {
                return false;
            }
            ((Executor) this.f75123c.a()).execute(new jd(this, str, zStartsWith, webView.getUrl()));
        }
        return true;
    }

    public final void a() {
        synchronized (this.f75124d) {
            this.f75124d.removeCallbacks(this.f75141u);
        }
    }
}
