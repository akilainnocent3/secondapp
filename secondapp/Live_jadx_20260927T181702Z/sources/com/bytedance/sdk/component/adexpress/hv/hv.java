package com.bytedance.sdk.component.adexpress.hv;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.hww.omn;
import com.bytedance.sdk.component.rs.hu;
import com.bytedance.sdk.component.utils.za;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import k.g1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hv {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private static int f34390hu = 10;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private static final byte[] f34391hv = new byte[0];

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private static int f34392ok = 10;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private static volatile hv f34393rs;
    private final AtomicBoolean vgm = new AtomicBoolean(false);
    private List<hu> hww = new ArrayList();

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private List<hu> f34395tq = new ArrayList();

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private Map<Integer, sd> f34394sd = new HashMap();
    private Map<Integer, vy> vy = new HashMap();

    private hv() {
        com.bytedance.sdk.component.adexpress.hww.hww.sd sdVarSd = com.bytedance.sdk.component.adexpress.hww.hww.hww.hww().sd();
        if (sdVarSd != null) {
            f34390hu = sdVarSd.nod();
            f34392ok = sdVarSd.vhb();
        }
    }

    private void hu(hu huVar) {
        if (huVar == null) {
            return;
        }
        if (za.tq(huVar.getScene())) {
            za.hww(huVar);
            return;
        }
        if (this.hww.size() >= f34390hu) {
            try {
                Context context = huVar.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                huVar.wgt();
                return;
            } catch (Throwable th2) {
                th2.getMessage();
                return;
            }
        }
        if (this.hww.contains(huVar)) {
            return;
        }
        try {
            Context context2 = huVar.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                huVar.setRecycler(true);
                this.hww.add(huVar);
                sd();
            }
        } catch (Throwable th3) {
            sd();
            th3.getMessage();
        }
    }

    public static hv hww() {
        if (f34393rs == null) {
            synchronized (hv.class) {
                try {
                    if (f34393rs == null) {
                        f34393rs = new hv();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f34393rs;
    }

    public void hv(hu huVar) {
        WebView webView;
        if (huVar == null || (webView = huVar.getWebView()) == null) {
            return;
        }
        sd sdVar = this.f34394sd.get(Integer.valueOf(webView.hashCode()));
        if (sdVar != null) {
            sdVar.hww(null);
        }
        huVar.b_("SDK_INJECT_GLOBAL");
    }

    @g1
    public void sd(hu huVar) {
        if (huVar == null) {
            return;
        }
        za.tq(huVar);
        huVar.b_("SDK_INJECT_GLOBAL");
        hv(huVar);
        hu(huVar);
    }

    @g1
    public void tq(hu huVar) {
        if (huVar == null) {
            return;
        }
        za.tq(huVar);
        huVar.b_("SDK_INJECT_GLOBAL");
        hv(huVar);
        hww(huVar);
    }

    public boolean vy(hu huVar) {
        if (huVar == null) {
            return false;
        }
        try {
            Context context = huVar.getContext();
            if (context instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            huVar.wgt();
            return true;
        } catch (Throwable th2) {
            th2.getMessage();
            return true;
        }
    }

    public int sd() {
        return this.hww.size();
    }

    @Nullable
    public hu tq(Context context, String str) {
        hu.sd sdVar = hu.sd.ADS;
        if (za.tq(sdVar)) {
            if (!com.bytedance.sdk.component.adexpress.vy.hv.hww(str) || za.hww(sdVar) > 1) {
                return za.hww(context, null, 0, sdVar);
            }
            return null;
        }
        if (sd() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.vy.hv.hww(str) && sd() <= 1) {
            sd();
            return null;
        }
        hu huVarRemove = this.hww.remove(0);
        if (huVarRemove == null) {
            return null;
        }
        try {
            Context context2 = huVarRemove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                huVarRemove.setRecycler(false);
                sd();
            }
            return huVarRemove;
        } catch (Throwable unused) {
            sd();
            return null;
        }
    }

    public int vy() {
        return this.f34395tq.size();
    }

    @Nullable
    public hu hww(Context context, String str) {
        hu.sd sdVar = hu.sd.ADS_V3;
        if (za.tq(sdVar)) {
            if (!com.bytedance.sdk.component.adexpress.vy.hv.hww(str) || za.hww(sdVar) > 1) {
                return za.hww(context, null, 0, sdVar);
            }
            return null;
        }
        if (vy() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.vy.hv.hww(str) && vy() <= 1) {
            vy();
            return null;
        }
        hu huVarRemove = this.f34395tq.remove(0);
        if (huVarRemove == null) {
            return null;
        }
        try {
            Context context2 = huVarRemove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                huVarRemove.setRecycler(false);
                vy();
            }
            return huVarRemove;
        } catch (Throwable unused) {
            vy();
            return null;
        }
    }

    public void tq() {
        for (hu huVar : this.hww) {
            if (huVar != null) {
                try {
                    Context context = huVar.getContext();
                    if (context instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                    }
                    huVar.wgt();
                } catch (Throwable th2) {
                    th2.getMessage();
                }
            }
        }
        this.hww.clear();
        for (hu huVar2 : this.f34395tq) {
            if (huVar2 != null) {
                try {
                    Context context2 = huVar2.getContext();
                    if (context2 instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                    }
                    huVar2.wgt();
                } catch (Throwable th3) {
                    th3.getMessage();
                }
            }
        }
        this.f34395tq.clear();
    }

    public void hww(hu huVar) {
        if (huVar == null) {
            return;
        }
        if (za.tq(huVar.getScene())) {
            za.hww(huVar);
            return;
        }
        if (this.f34395tq.size() >= f34392ok) {
            try {
                Context context = huVar.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                huVar.wgt();
                return;
            } catch (Throwable th2) {
                th2.getMessage();
                return;
            }
        }
        if (this.f34395tq.contains(huVar)) {
            return;
        }
        try {
            Context context2 = huVar.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                huVar.setRecycler(true);
                this.f34395tq.add(huVar);
                vy();
            }
        } catch (Throwable th3) {
            vy();
            th3.getMessage();
        }
    }

    public void tq(int i10) {
        synchronized (f34391hv) {
            f34392ok = i10;
        }
    }

    @SuppressLint({"JavascriptInterface"})
    public void hww(hu huVar, tq tqVar) {
        WebView webView;
        if (huVar == null || tqVar == null || (webView = huVar.getWebView()) == null) {
            return;
        }
        sd sdVar = this.f34394sd.get(Integer.valueOf(webView.hashCode()));
        if (sdVar != null) {
            sdVar.hww(tqVar);
        } else {
            sdVar = new sd(tqVar);
            this.f34394sd.put(Integer.valueOf(webView.hashCode()), sdVar);
        }
        huVar.hww(sdVar, "SDK_INJECT_GLOBAL");
    }

    @SuppressLint({"JavascriptInterface"})
    public void hww(WebView webView, omn omnVar, String str) {
        if (webView == null || omnVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        vy vyVar = this.vy.get(Integer.valueOf(webView.hashCode()));
        if (vyVar != null) {
            vyVar.hww(omnVar);
        } else {
            vyVar = new vy(omnVar);
            this.vy.put(Integer.valueOf(webView.hashCode()), vyVar);
        }
        webView.addJavascriptInterface(vyVar, str);
    }

    public void hww(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        vy vyVar = this.vy.get(Integer.valueOf(webView.hashCode()));
        if (vyVar != null) {
            vyVar.hww(null);
        }
        webView.removeJavascriptInterface(str);
    }

    public void hww(int i10) {
        synchronized (f34391hv) {
            f34390hu = i10;
        }
    }
}
