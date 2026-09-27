package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;

/* JADX INFO: renamed from: com.ironsource.i5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class HandlerC4326i5 extends Handler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f62001b = "DownloadHandler";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Oc f62002a;

    public HandlerC4326i5(Looper looper) {
        super(looper);
    }

    public void a(Oc oc2) {
        if (oc2 == null) {
            throw new IllegalArgumentException();
        }
        this.f62002a = oc2;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Oc oc2 = this.f62002a;
        if (oc2 == null) {
            Logger.i(f62001b, "OnPreCacheCompletion listener is null, msg: " + message.toString());
            return;
        }
        try {
            int i10 = message.what;
            if (i10 == 1016) {
                oc2.a((C8) message.obj);
            } else {
                this.f62002a.a((C8) message.obj, new C4540u8(i10, C4336ig.a(i10)));
            }
        } catch (Throwable th2) {
            C4485r4.d().a(th2);
            Logger.i(f62001b, "handleMessage | Got exception: " + th2.getMessage());
            IronLog.INTERNAL.error(th2.toString());
        }
    }

    public void a() {
        this.f62002a = null;
    }
}
