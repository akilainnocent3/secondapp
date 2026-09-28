package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.sportygames.sportyherov2.components.ShRoundHistoryContainer;
import com.sportygames.sportyherov2.remote.models.Coefficients;
import com.sportygames.sportyherov2.remote.models.PreviousMultiplierResponseSocket;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class n0c0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n0c0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                q1c0 q1c0Var = (q1c0) obj2;
                PreviousMultiplierResponseSocket previousMultiplierResponseSocket = (PreviousMultiplierResponseSocket) q97.a(PreviousMultiplierResponseSocket.class, (String) obj);
                w3c0 w3c0Var = (w3c0) q1c0Var.b;
                if (w3c0Var != null) {
                    ShRoundHistoryContainer shRoundHistoryContainer = w3c0Var.c0;
                    Coefficients data = previousMultiplierResponseSocket.getData();
                    data.getClass();
                    try {
                        if (shRoundHistoryContainer.a.size() > 0 && ((Coefficients) shRoundHistoryContainer.a.get(0)).getId() != data.getId()) {
                            shRoundHistoryContainer.a.add(0, data);
                            shRoundHistoryContainer.binding.d.setItemAnimator(new h());
                            qy50 qy50Var = shRoundHistoryContainer.b;
                            if (qy50Var == null) {
                                Intrinsics.n("chipListAdapter");
                                throw null;
                            }
                            qy50Var.e = true;
                            qy50Var.notifyDataSetChanged();
                        }
                    } catch (Exception unused) {
                    }
                }
                bw80 bw80Var = q1c0Var.d0;
                if (bw80Var != null) {
                    Coefficients data2 = previousMultiplierResponseSocket.getData();
                    data2.getClass();
                    try {
                        if (bw80Var.z != null && bw80Var.y.size() > 0 && bw80Var.y.get(0).getId() != data2.getId()) {
                            bw80Var.y.add(0, data2);
                            xy50 xy50Var = new xy50(bw80Var.a, bw80Var.y, bw80Var.b, bw80Var.c, bw80Var.w);
                            bw80Var.z = xy50Var;
                            RecyclerView recyclerView = bw80Var.d;
                            if (recyclerView == null) {
                                Intrinsics.n("roundHistoryList");
                                throw null;
                            }
                            recyclerView.setAdapter(xy50Var);
                        }
                    } catch (Exception unused2) {
                    }
                }
                return Unit.a;
            default:
                String str = (String) obj2;
                Context context = (Context) obj;
                context.getClass();
                WebView webView = new WebView(context);
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
