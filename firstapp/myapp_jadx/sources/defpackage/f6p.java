package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes4.dex */
public class f6p extends itl {
    public gzi0 A;
    public View f;
    public boolean i;
    public WebView v;
    public boolean w;
    public mgb0 y;
    public psm z;

    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            f6p f6pVar = f6p.this;
            if (!f6pVar.i) {
                f6pVar.w = true;
            }
            f6pVar.i = false;
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            f6p f6pVar = f6p.this;
            f6pVar.w = false;
            f6pVar.i = true;
        }
    }

    public static void m0(CookieManager cookieManager, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_WEB);
        aVar.a("set cookie: %s, url: %s", str2, str);
        cookieManager.setCookie(str, str2);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view = this.f;
        if (view != null) {
            return view;
        }
        if (getActivity() == null) {
            return null;
        }
        View viewInflate = layoutInflater.inflate(R.layout.jap_fragment_jackpot_help, viewGroup, false);
        this.f = viewInflate;
        WebView webView = (WebView) viewInflate.findViewById(R.id.help_web_view);
        this.v = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.v.getSettings().setDomStorageEnabled(true);
        this.A.a(this.v);
        this.v.setWebViewClient(new a());
        return this.f;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.w) {
            return;
        }
        this.v.post(new Runnable() { // from class: e6p
            @Override // java.lang.Runnable
            public final void run() {
                String string;
                String strS = bjb0.S("/m/help?type=tab&theme=dark#/how-to-play/jackpot");
                CookieManager cookieManagerA = h0j0.a();
                f6p f6pVar = this.a;
                if (cookieManagerA != null && !TextUtils.isEmpty(strS)) {
                    String languageCode = f6pVar.y.getLanguageCode();
                    try {
                        Uri uri = Uri.parse(strS);
                        string = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).build().toString();
                    } catch (Exception unused) {
                        string = null;
                    }
                    f6p.m0(cookieManagerA, string, "locale=" + languageCode);
                    f6p.m0(cookieManagerA, strS, "sb_country=" + f6pVar.z.getCountryCode());
                }
                f6pVar.v.loadUrl(strS);
            }
        });
    }
}
