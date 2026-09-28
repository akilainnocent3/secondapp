package defpackage;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.sporty.android.platform.features.userfeedback.TM.jbkEboCkTqmGf;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class clc extends WebChromeClient {
    public final Function0<Unit> a;

    public clc(Function0<Unit> function0) {
        function0.getClass();
        this.a = function0;
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        super.onCloseWindow(webView);
        itf0.a aVar = itf0.a;
        aVar.q("MonnifyOTPWebViewDialog");
        aVar.a(jbkEboCkTqmGf.VyOfPHgUg, new Object[0]);
        this.a.invoke();
    }
}
