package com.bytedance.sdk.component.adexpress.hv;

import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class sd {
    private WeakReference<tq> hww;

    public sd(tq tqVar) {
        this.hww = new WeakReference<>(tqVar);
    }

    @JavascriptInterface
    public void adAnalysisData(String str) {
        WeakReference<tq> weakReference = this.hww;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.hww.get();
    }

    @JavascriptInterface
    public String adInfo() {
        WeakReference<tq> weakReference = this.hww;
        return (weakReference == null || weakReference.get() == null) ? "" : this.hww.get().adInfo();
    }

    @JavascriptInterface
    public String appInfo() {
        WeakReference<tq> weakReference = this.hww;
        return (weakReference == null || weakReference.get() == null) ? "" : this.hww.get().appInfo();
    }

    @JavascriptInterface
    public void changeVideoState(String str) {
        WeakReference<tq> weakReference = this.hww;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.hww.get().changeVideoState(str);
    }

    @JavascriptInterface
    public void clickEvent(String str) {
        WeakReference<tq> weakReference = this.hww;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.hww.get().clickEvent(str);
    }

    @JavascriptInterface
    public void dynamicTrack(String str) {
        WeakReference<tq> weakReference = this.hww;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.hww.get().dynamicTrack(str);
    }

    @JavascriptInterface
    public String getCurrentVideoState() {
        WeakReference<tq> weakReference = this.hww;
        return (weakReference == null || weakReference.get() == null) ? "" : this.hww.get().getCurrentVideoState();
    }

    @JavascriptInterface
    public String getData(String str) {
        WeakReference<tq> weakReference = this.hww;
        return (weakReference == null || weakReference.get() == null) ? "" : this.hww.get().getData(str);
    }

    @JavascriptInterface
    public String getTemplateInfo() {
        WeakReference<tq> weakReference = this.hww;
        return (weakReference == null || weakReference.get() == null) ? "" : this.hww.get().getTemplateInfo();
    }

    public void hww(tq tqVar) {
        this.hww = new WeakReference<>(tqVar);
    }

    @JavascriptInterface
    public void initRenderFinish() {
        WeakReference<tq> weakReference = this.hww;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.hww.get().initRenderFinish();
    }

    @JavascriptInterface
    public void muteVideo(String str) {
        WeakReference<tq> weakReference = this.hww;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.hww.get().muteVideo(str);
    }

    @JavascriptInterface
    public void renderDidFinish(String str) {
        WeakReference<tq> weakReference = this.hww;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.hww.get().renderDidFinish(str);
    }

    @JavascriptInterface
    public void requestPauseVideo(String str) {
        WeakReference<tq> weakReference = this.hww;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.hww.get().hww(str);
    }

    @JavascriptInterface
    public void skipVideo() {
        WeakReference<tq> weakReference = this.hww;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.hww.get().skipVideo();
    }

    @JavascriptInterface
    public void videoFrameChanged(String str) {
        WeakReference<tq> weakReference = this.hww;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.hww.get().videoFrameChanged(str);
    }
}
