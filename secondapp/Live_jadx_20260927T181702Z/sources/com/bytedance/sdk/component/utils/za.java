package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class za {
    private static final HashMap<String, hww> hww = new HashMap<>();

    public static com.bytedance.sdk.component.rs.hu hww(Context context, AttributeSet attributeSet, int i10, com.bytedance.sdk.component.rs.hu.sd sdVar) {
        WebView webViewHww = hww(context, attributeSet, i10, sdVar, false);
        if (webViewHww == null) {
            return null;
        }
        com.bytedance.sdk.component.rs.hu huVar = new com.bytedance.sdk.component.rs.hu(context, true, sdVar);
        huVar.setWebView(webViewHww);
        huVar.hv();
        return huVar;
    }

    public static WebView tq(Context context, AttributeSet attributeSet, int i10, com.bytedance.sdk.component.rs.hu.sd sdVar) {
        return hww(context, attributeSet, i10, sdVar, true);
    }

    public static void tq(com.bytedance.sdk.component.rs.hu huVar) {
        if (huVar == null) {
            return;
        }
        try {
            huVar.removeAllViews();
            huVar.vgm();
            huVar.setWebChromeClient(null);
            huVar.setWebViewClient(null);
            huVar.setDownloadListener(null);
            huVar.setJavaScriptEnabled(true);
            huVar.setCacheMode(-1);
            huVar.setSupportZoom(false);
            huVar.setUseWideViewPort(true);
            huVar.setJavaScriptCanOpenWindowsAutomatically(true);
            huVar.setDomStorageEnabled(true);
            huVar.setBuiltInZoomControls(false);
            huVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
            huVar.setLoadWithOverviewMode(false);
            huVar.setDefaultTextEncodingName("UTF-8");
            huVar.setDefaultFontSize(16);
        } catch (Throwable unused) {
        }
    }

    private static WebView hww(Context context, AttributeSet attributeSet, int i10, com.bytedance.sdk.component.rs.hu.sd sdVar, boolean z10) {
        WebView webViewTq;
        hww hwwVar;
        if (sdVar == null || attributeSet != null || i10 != 0 || (hwwVar = hww.get(sdVar.f34984ed)) == null) {
            webViewTq = null;
        } else {
            webViewTq = hwwVar.tq();
            if (webViewTq != null) {
                if (webViewTq instanceof com.bytedance.sdk.component.rs.hv) {
                    ((com.bytedance.sdk.component.rs.hv) webViewTq).setRecycler(false);
                }
                hww(sdVar, false);
            }
        }
        if (webViewTq != null || !z10) {
            return webViewTq;
        }
        if (!(context instanceof MutableContextWrapper)) {
            context = new MutableContextWrapper(context);
        }
        hww(sdVar, true);
        return i10 != 0 ? new com.bytedance.sdk.component.rs.hv(context, attributeSet, i10) : new com.bytedance.sdk.component.rs.hv(context, attributeSet);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class hww {
        public final HashSet<String> hww = new HashSet<>();

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        private final ArrayList<WebView> f35102sd = new ArrayList<>();

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        public final int f35103tq;
        private final String vy;

        public hww(String str, JSONObject jSONObject) {
            this.vy = str;
            this.f35103tq = jSONObject.optInt("max_count");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("scene");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i10);
                    if (!TextUtils.isEmpty(strOptString)) {
                        this.hww.add(strOptString);
                    }
                }
            }
        }

        public boolean hww(WebView webView) {
            if (webView != null && this.f35102sd.size() < this.f35103tq && !this.f35102sd.contains(webView)) {
                Context context = webView.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                    if (webView instanceof com.bytedance.sdk.component.rs.hv) {
                        ((com.bytedance.sdk.component.rs.hv) webView).setRecycler(true);
                    }
                    ViewParent parent = webView.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(webView);
                    }
                    this.f35102sd.add(webView);
                    return true;
                }
            }
            return false;
        }

        public int sd() {
            return this.f35102sd.size();
        }

        public WebView tq() {
            if (this.f35102sd.isEmpty()) {
                return null;
            }
            return this.f35102sd.remove(0);
        }

        public HashSet<String> hww() {
            return this.hww;
        }
    }

    private static void hww(final com.bytedance.sdk.component.rs.hu.sd sdVar, final boolean z10) {
        aeg.hww("webview_allocate", new aeg.hww() { // from class: com.bytedance.sdk.component.utils.za.1
            @Override // com.bytedance.sdk.component.utils.aeg.hww
            public JSONObject hww() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_new", z10 ? 1 : 0);
                    jSONObject.put("scene", sdVar.f34984ed);
                } catch (JSONException unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void hww(com.bytedance.sdk.component.rs.hu huVar) {
        WebView webView;
        if (huVar == null || (webView = huVar.getWebView()) == null) {
            return;
        }
        hww hwwVar = hww.get(huVar.getScene().f34984ed);
        if (hwwVar != null && hwwVar.hww(webView)) {
            tq(huVar);
        } else {
            hww(webView);
        }
    }

    public static boolean tq(com.bytedance.sdk.component.rs.hu.sd sdVar) {
        return (sdVar == null || hww.get(sdVar.f34984ed) == null) ? false : true;
    }

    private static void hww(WebView webView) {
        if (webView == null) {
            return;
        }
        try {
            Context context = webView.getContext();
            if (context instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            webView.setWebChromeClient(null);
            webView.setWebViewClient(null);
            ViewParent parent = webView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(webView);
            }
            webView.removeAllViews();
            webView.destroy();
        } catch (Exception unused) {
        }
    }

    public static void hww(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!TextUtils.isEmpty(next)) {
                    hww hwwVar = new hww(next, jSONObject.getJSONObject(next));
                    Iterator<String> it = hwwVar.hww().iterator();
                    while (it.hasNext()) {
                        hww.put(it.next(), hwwVar);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public static int hww(com.bytedance.sdk.component.rs.hu.sd sdVar) {
        hww hwwVar;
        if (sdVar == null || (hwwVar = hww.get(sdVar.f34984ed)) == null) {
            return 0;
        }
        return hwwVar.sd();
    }
}
