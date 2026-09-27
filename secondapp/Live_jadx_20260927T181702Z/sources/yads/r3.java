package yads;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.yandex.div.core.dagger.Names;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class r3 extends WebChromeClient {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ns.o[] f154726b = {wb.a(r3.class, Names.CONTEXT, "getContext()Landroid/content/Context;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lm2 f154727a;

    public r3(Context context) {
        this.f154727a = mm2.a(context);
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i10) {
        lm2 lm2Var = this.f154727a;
        ns.o oVar = f154726b[0];
        Object obj = (Context) lm2Var.f152056a.get();
        t3 t3Var = obj instanceof t3 ? (t3) obj : null;
        if (t3Var != null) {
            t1 t1Var = (t1) t3Var;
            int i11 = i10 * 100;
            t1Var.f155666i.setProgress(i11);
            if (10000 > i11) {
                t1Var.a(0);
            } else {
                t1Var.f155665h.setText(webView.getTitle());
                t1Var.a(8);
            }
        }
    }
}
