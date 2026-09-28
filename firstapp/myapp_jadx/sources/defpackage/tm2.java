package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import android.view.Window;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class tm2 extends WebChromeClient {
    public final WebView a;
    public final Window b;
    public final oxd c;
    public View d;
    public WebChromeClient.CustomViewCallback e;
    public final mpe0 f = hwr.b(new sm2());

    public tm2(WebView webView, Window window, oxd oxdVar) {
        this.a = webView;
        this.b = window;
        this.c = oxdVar;
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        return (Bitmap) this.f.getValue();
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        View view = this.d;
        Window window = this.b;
        if (view != null) {
            View decorView = window.getDecorView();
            FrameLayout frameLayout = decorView instanceof FrameLayout ? (FrameLayout) decorView : null;
            if (frameLayout != null) {
                frameLayout.removeView(view);
            }
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.e;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
        }
        this.d = null;
        this.e = null;
        this.a.setVisibility(0);
        a9j0.a(window);
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        String str;
        permissionRequest.getClass();
        String[] resources = permissionRequest.getResources();
        resources.getClass();
        int length = resources.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                str = null;
                break;
            }
            str = resources[i];
            if (Intrinsics.g(str, "android.webkit.resource.PROTECTED_MEDIA_ID")) {
                break;
            } else {
                i++;
            }
        }
        if (str != null) {
            permissionRequest.grant(new String[]{str});
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        view.getClass();
        customViewCallback.getClass();
        if (!((Boolean) this.c.invoke()).booleanValue()) {
            customViewCallback.onCustomViewHidden();
            return;
        }
        if (this.d != null) {
            customViewCallback.onCustomViewHidden();
            return;
        }
        this.d = view;
        this.e = customViewCallback;
        this.a.setVisibility(8);
        Window window = this.b;
        View decorView = window.getDecorView();
        FrameLayout frameLayout = decorView instanceof FrameLayout ? (FrameLayout) decorView : null;
        if (frameLayout != null) {
            frameLayout.addView(this.d, new FrameLayout.LayoutParams(-1, -1));
        }
        a9j0.b(window);
    }
}
