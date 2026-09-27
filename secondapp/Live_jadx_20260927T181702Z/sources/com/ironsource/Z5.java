package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class Z5 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, Oc> f60417a;

    public Z5(Looper looper) {
        super(looper);
        this.f60417a = new ConcurrentHashMap<>();
    }

    private boolean a(int i10) {
        return i10 == 1016 || i10 == 1015;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            C8 c10 = (C8) message.obj;
            String path = c10.getPath();
            Oc oc2 = this.f60417a.get(path);
            if (oc2 == null) {
                return;
            }
            if (a(message.what)) {
                oc2.a(c10);
            } else {
                int i10 = message.what;
                oc2.a(c10, new C4540u8(i10, C4336ig.a(i10)));
            }
            this.f60417a.remove(path);
        } catch (Throwable th2) {
            C4485r4.d().a(th2);
            IronLog.INTERNAL.error(th2.toString());
        }
    }

    public void a(String str, Oc oc2) {
        if (str == null || oc2 == null) {
            return;
        }
        this.f60417a.put(str, oc2);
    }
}
