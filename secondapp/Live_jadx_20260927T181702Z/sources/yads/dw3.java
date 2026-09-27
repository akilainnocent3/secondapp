package yads;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class dw3 extends ka {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WebView f148395g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Long f148396h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map f148397i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f148398j;

    public dw3(String str, String str2, Map map) {
        super(str);
        this.f148396h = null;
        this.f148397i = map;
        this.f148398j = str2;
    }

    @Override // yads.ka
    public final void b() {
        this.f151443b.clear();
        new Handler().postDelayed(new zv3(this), Math.max(re.j2.f125721w0 - (this.f148396h == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f148396h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f148395g = null;
    }

    @Override // yads.ka
    public final void c() {
        WebView webView = new WebView(fx3.f149293b.f149294a);
        this.f148395g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f148395g.getSettings().setAllowContentAccess(false);
        this.f148395g.getSettings().setAllowFileAccess(false);
        this.f148395g.setWebViewClient(new yv3(this));
        this.f151443b = new hw3(this.f148395g);
        ix3.a(this.f148395g, this.f148398j);
        for (String str : this.f148397i.keySet()) {
            String externalForm = ((md3) this.f148397i.get(str)).f152416b.toExternalForm();
            WebView webView2 = this.f148395g;
            if (externalForm != null && !TextUtils.isEmpty(str)) {
                ix3.a(webView2, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", externalForm).replace("%INJECTION_ID%", str));
            }
        }
        this.f148396h = Long.valueOf(System.nanoTime());
    }

    @Override // yads.ka
    public final void a(wv3 wv3Var, ia iaVar) {
        JSONObject jSONObject = new JSONObject();
        Map mapUnmodifiableMap = Collections.unmodifiableMap(iaVar.f150488d);
        for (String str : mapUnmodifiableMap.keySet()) {
            md3 md3Var = (md3) mapUnmodifiableMap.get(str);
            md3Var.getClass();
            JSONObject jSONObject2 = new JSONObject();
            lw3.a(jSONObject2, "vendorKey", md3Var.f152415a);
            lw3.a(jSONObject2, "resourceUrl", md3Var.f152416b.toString());
            lw3.a(jSONObject2, "verificationParameters", md3Var.f152417c);
            lw3.a(jSONObject, str, jSONObject2);
        }
        a(wv3Var, iaVar, jSONObject);
    }
}
