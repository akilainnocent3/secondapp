package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class zzfzw extends Handler {
    public zzfzw() {
        Looper.getMainLooper();
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        zza(message);
    }

    @k.i
    public void zza(Message message) {
        super.dispatchMessage(message);
    }

    public zzfzw(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }
}
