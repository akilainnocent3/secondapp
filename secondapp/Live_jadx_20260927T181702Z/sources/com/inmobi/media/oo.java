package com.inmobi.media;

import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class oo {
    public static boolean a(WebView view, RenderProcessGoneDetail renderProcessGoneDetail, String source) {
        kotlin.jvm.internal.m0.p(view, "view");
        kotlin.jvm.internal.m0.p(source, "source");
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        Map mapJ0 = fr.n1.j0(dr.v1.a("source", source), dr.v1.a("isCrashed", Boolean.valueOf(renderProcessGoneDetail != null ? renderProcessGoneDetail.didCrash() : false)));
        Wj wj2 = Wj.f55736a;
        Wj.b("WebViewRenderProcessGoneEvent", mapJ0, EnumC3544ak.SDK);
        view.destroy();
        return true;
    }
}
