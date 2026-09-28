package defpackage;

import android.view.View;
import android.webkit.WebChromeClient;

/* JADX INFO: loaded from: classes5.dex */
public final class uq60 extends WebChromeClient {
    public final /* synthetic */ vjd0 a;

    public uq60(vjd0 vjd0Var) {
        this.a = vjd0Var;
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, final WebChromeClient.CustomViewCallback customViewCallback) {
        view.getClass();
        customViewCallback.getClass();
        super.onShowCustomView(view, customViewCallback);
        this.a.w.post(new Runnable() { // from class: tq60
            @Override // java.lang.Runnable
            public final void run() {
                customViewCallback.onCustomViewHidden();
            }
        });
    }
}
