package defpackage;

import android.accounts.AccountManager;
import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import android.webkit.WebView;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class knh0 implements c0n, fjt {
    public final uqm a;
    public final ysm b;
    public final psm c;
    public final wsm d;
    public final k5b e;
    public final bnh0 f;
    public final yi5 i;
    public final AccountManager v;
    public final HashMap<String, String> w;
    public final mpe0 y;

    public knh0(Context context, uqm uqmVar, ysm ysmVar, psm psmVar, wsm wsmVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar, bnh0 bnh0Var, yi5 yi5Var) {
        uqmVar.getClass();
        ysmVar.getClass();
        psmVar.getClass();
        wsmVar.getClass();
        bnh0Var.getClass();
        yi5Var.getClass();
        this.a = uqmVar;
        this.b = ysmVar;
        this.c = psmVar;
        this.d = wsmVar;
        this.e = k5bVar;
        this.f = bnh0Var;
        this.i = yi5Var;
        this.v = AccountManager.get(context);
        this.w = new HashMap<>();
        this.y = hwr.b(new i850(this, 2));
    }

    @Override // defpackage.c0n
    public final boolean a() {
        HashMap<String, String> map = this.w;
        boolean zG = Intrinsics.g(map.get("Authorization"), this.a.getLastAccessToken());
        boolean z = !zG;
        if (!map.isEmpty() && zG) {
            return false;
        }
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_WEB);
        aVar.a("Headers need refresh. Is stale: " + z, new Object[0]);
        return true;
    }

    @Override // defpackage.c0n
    public final synchronized LinkedHashMap b() {
        LinkedHashMap linkedHashMap;
        linkedHashMap = new LinkedHashMap();
        dj5.a(this.e, new jnh0(linkedHashMap, this, null));
        synchronized (this.w) {
            this.w.clear();
            this.w.putAll(linkedHashMap);
            Unit unit = Unit.a;
        }
        return linkedHashMap;
    }

    @Override // defpackage.c0n
    public final void c(WebView webView, String str) {
        boolean zI;
        boolean zM;
        webView.getClass();
        str.getClass();
        Uri uri = Uri.parse(str);
        String host = uri.getHost();
        if (host != null) {
            String lowerCase = host.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            zI = this.f.i(lowerCase);
        } else {
            zI = false;
        }
        String path = uri.getPath();
        if (path != null) {
            String lowerCase2 = path.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            zM = StringsKt.M(lowerCase2, "autologin=yes", false);
        } else {
            zM = false;
        }
        if (!zI && !zM) {
            webView.loadUrl(str);
            if (StringsKt.M(str, "survey", false)) {
                this.d.g("UrlTool", "appendCookieRedirect_survey_isNotInsertIframeForAutoLogin", new Exception("isNotInsertIframeForAutoLogin"), a.c(new Pair("srcUrl", str)));
                return;
            }
            return;
        }
        if (!this.a.isLogin()) {
            webView.loadUrl(str);
            if (StringsKt.M(str, "survey", false)) {
                this.d.g("UrlTool", "appendCookieRedirect_survey_without_login", new Exception("User not login"), a.c(new Pair("srcUrl", str)));
                return;
            }
            return;
        }
        if (!StringsKt.M(str, "accessToken/extend?location=", false)) {
            try {
                str = oxc.a((String) this.y.getValue(), "?location=", URLEncoder.encode(str, "utf-8"));
            } catch (UnsupportedEncodingException e) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_WEB);
                aVar.d("URL Encoding failed: " + e, new Object[0]);
                return;
            }
        }
        synchronized (this.w) {
            try {
                if (a()) {
                    b();
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Map<String, String> mapL = kpu.l(this.w);
        webView.getSettings().setCacheMode(2);
        itf0.a aVar2 = itf0.a;
        StringBuilder sbA = ce7.a(aVar2, MyLog.TAG_WEB, "Loading URL with headers: ", str, ", Headers: ");
        sbA.append(mapL);
        aVar2.a(sbA.toString(), new Object[0]);
        String str2 = mapL.get("Platform");
        if (str2 == null || str2.length() <= 0) {
            this.d.g("UrlTool", "loadUrlWithHeaders_platform_isEmpty", new Exception("Platform is empty"), b.k(new Pair("url", str), new Pair("headers", mapL.toString())));
        } else {
            webView.loadUrl(str, mapL);
        }
    }

    @Override // defpackage.fjt
    public final void p() {
        this.w.clear();
    }
}
