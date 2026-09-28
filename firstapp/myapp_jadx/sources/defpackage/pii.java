package defpackage;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.sporty.android.core.model.loyalty.RewardShowOffData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class pii extends WebViewClient {
    public final /* synthetic */ RewardShowOffData a;
    public final /* synthetic */ Function0<Unit> b;

    public pii(RewardShowOffData rewardShowOffData, Function0<Unit> function0) {
        this.a = rewardShowOffData;
        this.b = function0;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (webView != null) {
            webView.evaluateJavascript(qae0.c("\n                    (function() {\n                        function runScript() {\n                            " + this.a.getRewardShowOffJsScript() + "\n                        }\n                        if (document.readyState === 'complete') {\n                            runScript();\n                        } else {\n                            document.addEventListener('DOMContentLoaded', runScript);\n                        }\n                    })();\n                    "), null);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        itf0.a.d("onReceivedError: " + webResourceError, new Object[0]);
        this.b.invoke();
    }
}
