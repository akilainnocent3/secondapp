package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.sporty.android.core.model.pocket.common.PayHintData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ah8 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ah8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                dh8 dh8Var = (dh8) obj2;
                dh8.a aVar = dh8.y;
                List<PayHintData> list = ((PayHintData.PayHintEntity) obj).entityList;
                if (list != null) {
                    for (PayHintData payHintData : list) {
                        if ("23".equals(payHintData.methodId)) {
                            dh8Var.m0().d.setVisibility(8);
                            dh8Var.m0().b.setVisibility(0);
                            dh8.n0(payHintData, dh8Var.m0().b, 14, "#000000");
                        }
                    }
                }
                return Unit.a;
            case 1:
                gw30 gw30Var = (gw30) obj2;
                ((View) obj).getClass();
                oxi oxiVar = gw30Var.a;
                if (oxiVar == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                oxiVar.f.setClickable(false);
                oxi oxiVar2 = gw30Var.a;
                if (oxiVar2 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                oxiVar2.f.setAlpha(0.7f);
                Intent intent = new Intent("cashoutCall");
                intent.putExtra("betIndex", 2);
                intent.putExtra("clickType", gw30Var.E);
                Context context = gw30Var.getContext();
                if (context != null) {
                    fdt.a(context).c(intent);
                }
                return Unit.a;
            default:
                String str = (String) obj2;
                Context context2 = (Context) obj;
                context2.getClass();
                WebView webView = new WebView(context2);
                webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                webView.setBackgroundColor(0);
                webView.setLayerType(2, null);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.setWebViewClient(new WebViewClient());
                str.getClass();
                webView.loadDataWithBaseURL(null, qae0.c("\n        <html>\n        <head>\n            <style>\n                body {\n                    color: white;\n                    background-color: transparent;\n                    font-size: 15px;\n                    line-height: 1.5;\n                }\n                ul {\n                    list-style-type: none;\n                    padding-left: 1em;\n                    margin: 0;\n                }\n                ul li {\n                    position: relative;\n                    padding-left: 1.5em;\n                    margin-bottom: 0.5em;\n                }\n                ul li::before {\n                    content: \"♦\";\n                    display: inline-block;\n                    width: 1em;\n                    margin-left: -0.5em;\n                    margin-right: 1.2em;\n                    font-size: 0.9em;\n                    text-shadow: 0 0 0 white;\n                    color: transparent;  \n                    position: absolute;\n                    left: 0;\n                    top: 0.1em;\n                }\n            </style>\n        </head>\n        <body>\n            " + str + "\n        </body>\n        </html>\n    "), "text/html", "UTF-8", null);
                return webView;
        }
    }
}
