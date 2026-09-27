package com.bytedance.sdk.component.adexpress.hv;

import android.webkit.JavascriptInterface;
import com.bytedance.sdk.component.hww.omn;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vy {
    private WeakReference<omn> hww;

    public vy(omn omnVar) {
        this.hww = new WeakReference<>(omnVar);
    }

    public void hww(omn omnVar) {
        this.hww = new WeakReference<>(omnVar);
    }

    @JavascriptInterface
    public void invokeMethod(String str) {
        WeakReference<omn> weakReference = this.hww;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.hww.get().invokeMethod(str);
    }
}
