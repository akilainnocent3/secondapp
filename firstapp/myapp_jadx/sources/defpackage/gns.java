package defpackage;

import android.view.View;
import android.webkit.WebChromeClient;

/* JADX INFO: loaded from: classes4.dex */
public final class gns extends WebChromeClient {
    public final /* synthetic */ hns a;

    public gns(hns hnsVar) {
        this.a = hnsVar;
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, final WebChromeClient.CustomViewCallback customViewCallback) {
        view.getClass();
        customViewCallback.getClass();
        this.a.b.A.post(new Runnable() { // from class: fns
            @Override // java.lang.Runnable
            public final void run() {
                customViewCallback.onCustomViewHidden();
            }
        });
    }
}
