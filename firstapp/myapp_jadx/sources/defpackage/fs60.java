package defpackage;

import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.sporty.android.sportynews.ui.SportyNewsListFragment;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.text.c;

/* JADX INFO: loaded from: classes4.dex */
public final class fs60 extends WebViewClient {
    public final List<String> a;
    public final isc0 b;
    public final HashMap<String, Boolean> c;
    public final List<String> d;
    public final HashMap<String, Boolean> e;

    public fs60(List list, isc0 isc0Var) {
        list.getClass();
        this.a = list;
        this.b = isc0Var;
        Boolean bool = Boolean.TRUE;
        this.c = kpu.d(new Pair("https", bool), new Pair("ldjsbridge", bool));
        this.d = b.k("fonts.googleapis.com", "google-analytics.com");
        this.e = new HashMap<>();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0094  */
    /* JADX WARN: Code duplicated, block: B:44:0x009e  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:? A[LOOP:0: B:42:0x0098->B:53:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    public final boolean a(Uri uri) {
        List<String> list;
        Iterator<T> it;
        boolean zBooleanValue;
        if (uri != null) {
            String scheme = uri.getScheme();
            if (scheme != null) {
                Boolean bool = this.c.get(scheme);
                if (bool != null ? bool.booleanValue() : false) {
                    String host = uri.getHost();
                    if (host == null) {
                        zBooleanValue = true;
                    } else {
                        HashMap<String, Boolean> map = this.e;
                        if (map.containsKey(host)) {
                            Boolean bool2 = map.get(host);
                            if (bool2 != null) {
                                zBooleanValue = bool2.booleanValue();
                            }
                        } else {
                            List<String> list2 = this.a;
                            if (list2 == null || !list2.isEmpty()) {
                                Iterator<T> it2 = list2.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        String str = (String) it2.next();
                                        if (!host.equals(str)) {
                                            if (c.k(host, "." + str, false)) {
                                            }
                                        }
                                        map.put(host, Boolean.TRUE);
                                    } else {
                                        list = this.d;
                                        if (list != null || !list.isEmpty()) {
                                            it = list.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    if (c.k(host, (String) it.next(), false)) {
                                                        map.put(host, Boolean.TRUE);
                                                    }
                                                }
                                            }
                                        }
                                        map.put(host, Boolean.FALSE);
                                        itf0.a.n(ffe0.a(uri, "Resource not allowed by domain "), new Object[0]);
                                    }
                                }
                            } else {
                                list = this.d;
                                if (list != null) {
                                    it = list.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (c.k(host, (String) it.next(), false)) {
                                                map.put(host, Boolean.TRUE);
                                            }
                                        }
                                    }
                                } else {
                                    it = list.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (c.k(host, (String) it.next(), false)) {
                                                map.put(host, Boolean.TRUE);
                                            }
                                        }
                                    }
                                }
                                map.put(host, Boolean.FALSE);
                                itf0.a.n(ffe0.a(uri, "Resource not allowed by domain "), new Object[0]);
                            }
                            zBooleanValue = true;
                        }
                    }
                } else {
                    itf0.a.n(ffe0.a(uri, "Resource not allowed by scheme "), new Object[0]);
                }
                zBooleanValue = false;
            } else {
                zBooleanValue = true;
            }
            if (!zBooleanValue) {
                return true;
            }
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Object value;
        super.onPageFinished(webView, str);
        SportyNewsListFragment sportyNewsListFragment = this.b.a;
        ohp<Object>[] ohpVarArr = SportyNewsListFragment.R;
        wwd0 wwd0Var = sportyNewsListFragment.q0().f;
        do {
            value = wwd0Var.getValue();
            ((Boolean) value).getClass();
        } while (!wwd0Var.g(value, Boolean.FALSE));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Object value;
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        SportyNewsListFragment sportyNewsListFragment = this.b.a;
        ohp<Object>[] ohpVarArr = SportyNewsListFragment.R;
        wwd0 wwd0Var = sportyNewsListFragment.q0().f;
        do {
            value = wwd0Var.getValue();
            ((Boolean) value).getClass();
        } while (!wwd0Var.g(value, Boolean.FALSE));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return a(webResourceRequest != null ? webResourceRequest.getUrl() : null);
    }

    @Override // android.webkit.WebViewClient
    @fae
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return a(str != null ? Uri.parse(str) : null);
    }
}
