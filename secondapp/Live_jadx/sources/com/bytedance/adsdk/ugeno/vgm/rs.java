package com.bytedance.adsdk.ugeno.vgm;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class rs extends Handler {
    private final WeakReference<hww> hww;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface hww {
        void hww(Message message);
    }

    public rs(Looper looper, hww hwwVar) {
        super(looper);
        this.hww = new WeakReference<>(hwwVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        hww hwwVar = this.hww.get();
        if (hwwVar == null || message == null) {
            return;
        }
        hwwVar.hww(message);
    }
}
