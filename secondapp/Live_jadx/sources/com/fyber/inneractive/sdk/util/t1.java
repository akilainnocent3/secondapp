package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class t1 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f47907a;

    public t1(v1 v1Var) {
        super(Looper.getMainLooper());
        this.f47907a = new WeakReference(v1Var);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        super.handleMessage(message);
        v1 v1Var = (v1) this.f47907a.get();
        if (v1Var == null || message.what != 1932593528 || v1Var.f47915d) {
            return;
        }
        v1Var.a(message.getWhen());
    }
}
