package defpackage;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class xn80 {

    public static final class a extends WebViewClient {
        public final /* synthetic */ qkm a;
        public final /* synthetic */ WebView b;

        public a(qkm qkmVar, WebView webView) {
            this.a = qkmVar;
            this.b = webView;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            try {
                this.a.onPageFinished(webView, str);
            } catch (Throwable unused) {
            }
            this.b.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            try {
                this.a.onReceivedError(webView, webResourceRequest, webResourceError);
            } catch (Throwable unused) {
            }
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }

        @Override // android.webkit.WebViewClient
        public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            try {
                return this.a.shouldInterceptRequest(webView, webResourceRequest);
            } catch (Throwable unused) {
                return super.shouldInterceptRequest(webView, webResourceRequest);
            }
        }
    }

    public static CharSequence a(String str) {
        int iLastIndexOf;
        try {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.h(str.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            Spanned spannedFromHtml = Html.fromHtml(str.subSequence(i, length + 1).toString(), 63);
            spannedFromHtml.getClass();
            if (!TextUtils.isEmpty(spannedFromHtml) && -1 != (iLastIndexOf = TextUtils.lastIndexOf(spannedFromHtml, '\n'))) {
                if (TextUtils.isEmpty(spannedFromHtml.subSequence(iLastIndexOf, spannedFromHtml.length()))) {
                    return spannedFromHtml.subSequence(0, iLastIndexOf);
                }
                return iLastIndexOf == spannedFromHtml.length() - 1 ? spannedFromHtml.subSequence(0, spannedFromHtml.length() - 1) : spannedFromHtml;
            }
            return spannedFromHtml;
        } catch (Exception unused) {
            return "";
        }
    }

    public static final void b(TextView textView, String str) {
        textView.getClass();
        if (str == null || str.length() == 0) {
            return;
        }
        textView.setText(a(str));
    }

    public static final void c(WebView webView, String str) {
        WebView webView2;
        str.getClass();
        try {
            webView.setVisibility(4);
            webView.setBackgroundColor(0);
            webView.setWebViewClient(new a(new qkm(0), webView));
            webView2 = webView;
            try {
                webView2.loadDataWithBaseURL(null, str, "text/html", "UTF-8", null);
            } catch (Exception unused) {
                webView2.setVisibility(0);
            }
        } catch (Exception unused2) {
            webView2 = webView;
        }
    }
}
