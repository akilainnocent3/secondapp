package com.bytedance.sdk.component.ok.hww;

import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.mw;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq extends mw implements sd {

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final HandlerThread f34925tq;

    public tq(HandlerThread handlerThread, mw.hww hwwVar) {
        super(handlerThread.getLooper(), hwwVar);
        this.f34925tq = handlerThread;
    }

    @Override // com.bytedance.sdk.component.ok.hww.sd
    public void hww() {
        removeCallbacksAndMessages(null);
        WeakReference<mw.hww> weakReference = this.hww;
        if (weakReference != null) {
            weakReference.clear();
            this.hww = null;
        }
    }

    public void tq() {
        HandlerThread handlerThread = this.f34925tq;
        if (handlerThread != null) {
            handlerThread.quit();
        }
    }

    public void hww(mw.hww hwwVar) {
        this.hww = new WeakReference<>(hwwVar);
    }
}
