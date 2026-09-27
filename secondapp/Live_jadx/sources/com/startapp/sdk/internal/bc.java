package com.startapp.sdk.internal;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class bc implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dc f74595a;

    public bc(dc dcVar) {
        this.f74595a = dcVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        dc dcVar = this.f74595a;
        synchronized (dcVar) {
            dcVar.f74688d = true;
            dcVar.notifyAll();
        }
        return true;
    }
}
