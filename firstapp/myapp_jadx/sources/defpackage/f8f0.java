package defpackage;

import android.webkit.WebView;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class f8f0 implements tse {
    public final /* synthetic */ i0j0 a;
    public final /* synthetic */ h8f0 b;

    public f8f0(i0j0 i0j0Var, h8f0 h8f0Var, use useVar) {
        this.a = i0j0Var;
        this.b = h8f0Var;
    }

    @Override // defpackage.tse
    public final void dispose() {
        WebView webView = this.b.a;
        this.a.uninstallJsBridge(webView);
        try {
            zi50.a aVar = zi50.b;
            webView.destroy();
            Unit unit = Unit.a;
        } catch (Throwable unused) {
            zi50.a aVar2 = zi50.b;
        }
    }
}
