package com.fyber.inneractive.sdk.click;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.h1;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h0;
import com.fyber.inneractive.sdk.util.v;
import com.fyber.inneractive.sdk.web.v0;
import com.ironsource.G5;
import java.net.URLDecoder;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f44278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f44279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f44280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o f44281d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h1 f44285h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public v0 f44287j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f44288k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.fyber.inneractive.sdk.ignite.m f44289l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f44282e = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f44284g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f44286i = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f44283f = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f44290m = IAConfigManager.O.f44311u.f44480b.a(false, "should_decode_url");

    public r(boolean z10) {
        this.f44280c = true;
        this.f44280c = z10;
    }

    public final void a(Context context, String str, o oVar, v0 v0Var, boolean z10, com.fyber.inneractive.sdk.ignite.m mVar, String str2) {
        Uri uri;
        this.f44278a = context;
        this.f44279b = str;
        this.f44281d = oVar;
        this.f44288k = z10;
        this.f44284g = System.currentTimeMillis();
        this.f44287j = v0Var;
        this.f44289l = mVar;
        if (a(this.f44279b) == null) {
            String str3 = this.f44279b;
            try {
                try {
                    if (this.f44290m) {
                        uri = !h0.c(str3) ? Uri.parse(URLDecoder.decode(str3, G5.N)) : Uri.parse(str3);
                    } else {
                        uri = h0.c(str3) ? Uri.parse(URLDecoder.decode(str3, G5.N)) : Uri.parse(str3);
                    }
                } catch (Exception unused) {
                    IAlog.a("%sgetDecodedUri: Failed parsing Uri!", "SuperClickHandler");
                    uri = null;
                }
                if (a(uri)) {
                    IAlog.a("%sfollowRedirects: Fetching uri: %s", IAlog.a(this), uri.toString());
                    String string = uri.toString();
                    h1 h1Var = new h1(new m(this, string, str2), string);
                    this.f44285h = h1Var;
                    IAConfigManager.O.f44309s.a(h1Var);
                }
            } catch (Exception e10) {
                if (e10 instanceof InterruptedException) {
                    return;
                }
                IAlog.b("%sfailed followRedirects %s", IAlog.a(this), e10);
                this.f44283f.add(new j(str3, false, q.INTERNAL_REDIRECT, null));
                a(new b(str3, q.FAILED, "followRedirects", e10));
            }
        }
    }

    public final boolean a(Uri uri) {
        if (uri == null) {
            IAlog.a("%s followRedirects: Got a url which is not valid: null", IAlog.a(this));
            this.f44283f.add(new j(null, false, null, "Invalid url"));
            a(a(uri.toString(), "followRedirects", "Invalid url"));
            return false;
        }
        String scheme = uri.getScheme();
        if (scheme != null && (scheme.equalsIgnoreCase("http") || scheme.equalsIgnoreCase("https"))) {
            return true;
        }
        IAlog.a("%scould not follow redirects for scheme: %s", IAlog.a(this), uri.getScheme());
        IAlog.a("%sfull url: %s", IAlog.a(this), uri.toString());
        this.f44283f.add(new j(uri.toString(), false, null, "Invalid scheme: " + uri.getScheme()));
        a(a(uri.toString(), "followRedirects", "Invalid scheme: " + uri.getScheme()));
        return false;
    }

    public final b a(String str) {
        Uri uri;
        try {
            uri = Uri.parse(str);
        } catch (Exception unused) {
            IAlog.a("IAJavaUtil: getValidUri: Invalid url %s", str);
            uri = null;
        }
        if (uri == null) {
            this.f44283f.add(new j(str, false, null, "illegal uri"));
            return a(a(str, null, "illegal uri"));
        }
        if (this.f44286i.isEmpty()) {
            this.f44283f.add(new j(str, false, null, "no click handlers found"));
            return a(a(str, null, "no click handlers found"));
        }
        for (a aVar : this.f44286i) {
            if (aVar.a(uri, this)) {
                Context context = this.f44278a;
                b bVarA = context != null ? aVar.a(context, uri, this.f44283f) : null;
                if (bVarA != null) {
                    return a(bVarA);
                }
            }
        }
        return null;
    }

    public static void a(r rVar, String str, String str2, String str3, Exception exc) {
        if (rVar.f44280c) {
            Intent intent = new Intent(rVar.f44278a, (Class<?>) InneractiveInternalBrowserActivity.class);
            if (!TextUtils.isEmpty(str)) {
                InneractiveInternalBrowserActivity.setHtmlExtra(str);
            }
            intent.putExtra("extra_url", str2);
            intent.putExtra("spotId", str3);
            if (!(rVar.f44278a instanceof Activity)) {
                intent.setFlags(268435456);
            }
            try {
                Context context = rVar.f44278a;
                if (context != null) {
                    context.startActivity(intent);
                }
                ArrayList arrayList = rVar.f44283f;
                boolean z10 = exc == null;
                q qVar = q.OPENED_IN_INTERNAL_BROWSER;
                arrayList.add(new j(str2, z10, qVar, v.a(exc)));
                rVar.a(new b(str2, qVar, "followRedirects", null));
                return;
            } catch (ActivityNotFoundException unused) {
                rVar.f44283f.add(new j(str2, false, q.OPENED_IN_INTERNAL_BROWSER, "internal browser not registered"));
                rVar.a(a(str2, "followRedirects", "internal browser not registered"));
                return;
            }
        }
        rVar.f44283f.add(new j(str2, false, q.OPENED_IN_INTERNAL_BROWSER, "internal browser not usable"));
        rVar.a(a(str2, "followRedirects", "internal browser not usable"));
    }

    public static b a(String str, String str2, String str3) {
        return new b(str, q.FAILED, str2, new p(str3));
    }

    public final b a(b bVar) {
        ArrayList arrayList = this.f44283f;
        bVar.f44250f.clear();
        bVar.f44250f.addAll(arrayList);
        bVar.f44249e = System.currentTimeMillis() - this.f44284g;
        IAlog.a("%s reporting result: %s", IAlog.a(this), bVar);
        com.fyber.inneractive.sdk.util.r.f47892b.post(new n(this, bVar));
        return bVar;
    }
}
