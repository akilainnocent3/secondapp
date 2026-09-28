package defpackage;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class oxf {
    public static final /* synthetic */ int a = 0;

    public static final h8f0 a(String str, a aVar) {
        str.getClass();
        aVar.N(1208678062);
        if (StringsKt.U(str)) {
            aVar.H();
            return null;
        }
        Context context = (Context) aVar.O(AndroidCompositionLocals_androidKt.b);
        final i0j0 i0j0Var = (i0j0) aVar.O(aet.a);
        Object objY = aVar.y();
        Object obj = a.C0041a.a;
        if (objY == obj) {
            objY = xvf.i(e.a, aVar);
            aVar.r(objY);
        }
        v5b v5bVar = (v5b) objY;
        Object objY2 = aVar.y();
        if (objY2 == obj) {
            WebView webView = new WebView(context);
            webView.setLayerType(2, null);
            h8f0 h8f0Var = new h8f0(webView);
            i0j0Var.installJsBridge(context, webView, new g8f0(v5bVar, h8f0Var), new WebChromeClient());
            aVar.r(h8f0Var);
            objY2 = h8f0Var;
        }
        final h8f0 h8f0Var2 = (h8f0) objY2;
        boolean zM = aVar.M(str);
        Object objY3 = aVar.y();
        if (zM || objY3 == obj) {
            objY3 = new e8f0(h8f0Var2, str, null);
            aVar.r(objY3);
        }
        xvf.e(aVar, str, (Function2) objY3);
        WebView webView2 = h8f0Var2.a;
        boolean zA = aVar.A(i0j0Var);
        Object objY4 = aVar.y();
        if (zA || objY4 == obj) {
            objY4 = new Function1() { // from class: d8f0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    use useVar = (use) obj2;
                    useVar.getClass();
                    return new f8f0(i0j0Var, h8f0Var2, useVar);
                }
            };
            aVar.r(objY4);
        }
        xvf.c(webView2, (Function1) objY4, aVar);
        aVar.H();
        return h8f0Var2;
    }
}
