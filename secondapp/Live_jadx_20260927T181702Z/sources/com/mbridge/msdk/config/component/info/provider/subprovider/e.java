package com.mbridge.msdk.config.component.info.provider.subprovider;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static String f65317c = "UserAgentProvider";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f65318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f65319b = "";

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void a(String str);
    }

    public e(final Context context) {
        this.f65318a = "";
        try {
            a(context, new a() { // from class: com.mbridge.msdk.config.component.info.provider.subprovider.l
                @Override // com.mbridge.msdk.config.component.info.provider.subprovider.e.a
                public final void a(String str) {
                    this.f65330a.a(context, str);
                }
            });
        } catch (Throwable th2) {
            q0.b(f65317c, th2.getMessage(), th2);
            if (TextUtils.isEmpty(this.f65318a)) {
                this.f65318a = b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Context context, String str) {
        if (!TextUtils.isEmpty(str) || MBridgeConstans.DNT_GUA_ON_UI) {
            this.f65318a = str;
        } else {
            a(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Context context, a aVar) {
        String defaultUserAgent;
        try {
            defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        } catch (Throwable th2) {
            q0.b(f65317c, th2.getMessage(), th2);
            defaultUserAgent = "";
        }
        if (!TextUtils.isEmpty(defaultUserAgent)) {
            a(defaultUserAgent);
        }
        if (aVar != null) {
            aVar.a(defaultUserAgent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        a(this.f65318a);
    }

    public String c() {
        if (TextUtils.isEmpty(this.f65318a) && TextUtils.isEmpty(this.f65319b)) {
            return b();
        }
        if (TextUtils.isEmpty(this.f65318a)) {
            return TextUtils.isEmpty(this.f65319b) ? "" : this.f65319b;
        }
        return this.f65318a;
    }

    private void a(final Context context, final a aVar) {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new Runnable() { // from class: com.mbridge.msdk.config.component.info.provider.subprovider.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f65326b.a();
            }
        });
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new Runnable() { // from class: com.mbridge.msdk.config.component.info.provider.subprovider.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f65327b.b(context, aVar);
            }
        });
    }

    private void a(final Context context) {
        if (TextUtils.isEmpty(this.f65318a)) {
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new Runnable() { // from class: com.mbridge.msdk.config.component.info.provider.subprovider.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f65324b.b(context);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Context context) {
        try {
            this.f65318a = new WebView(context).getSettings().getUserAgentString();
        } catch (Throwable th2) {
            q0.b(f65317c, th2.getMessage(), th2);
        }
        if (TextUtils.isEmpty(this.f65318a)) {
            this.f65318a = b();
        } else {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new Runnable() { // from class: com.mbridge.msdk.config.component.info.provider.subprovider.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f65323b.d();
                }
            });
        }
    }

    private void a(String str) {
        Context contextD;
        if (TextUtils.isEmpty(str) || (contextD = com.mbridge.msdk.foundation.controller.c.n().d()) == null) {
            return;
        }
        com.mbridge.msdk.config.component.common.util.b.a(contextD).b("userAgent", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD == null) {
            return;
        }
        this.f65319b = com.mbridge.msdk.config.component.common.util.b.a(contextD).a("userAgent", b());
    }

    private String b() {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.MODEL;
        String str3 = Build.DISPLAY;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Mozilla/5.0 (Linux; Android ");
            sb2.append(str);
            sb2.append("; ");
            sb2.append(str2);
            sb2.append(" Build/");
            if (TextUtils.isEmpty(str3)) {
                str3 = "";
            }
            sb2.append(str3);
            sb2.append(") AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19");
            return sb2.toString();
        }
        return "Mozilla/5.0 (Linux; Android 4.0.4; Galaxy Nexus Build/IMM76B) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19";
    }
}
