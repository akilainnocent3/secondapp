package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class mw extends Handler {
    protected WeakReference<hww> hww;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface hww {
        void hww(Message message);
    }

    public mw(hww hwwVar) {
        if (hwwVar != null) {
            this.hww = new WeakReference<>(hwwVar);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        hww hwwVar;
        WeakReference<hww> weakReference = this.hww;
        if (weakReference == null || (hwwVar = weakReference.get()) == null || message == null) {
            return;
        }
        hwwVar.hww(message);
    }

    public mw(Looper looper, hww hwwVar) {
        super(looper);
        if (hwwVar != null) {
            this.hww = new WeakReference<>(hwwVar);
        }
    }
}
