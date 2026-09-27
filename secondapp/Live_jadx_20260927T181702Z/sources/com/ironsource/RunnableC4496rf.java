package com.ironsource;

import android.os.Handler;
import android.os.Message;
import com.ironsource.sdk.utils.IronSourceStorageUtils;

/* JADX INFO: renamed from: com.ironsource.rf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
class RunnableC4496rf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f63482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4290g5 f63483b;

    public RunnableC4496rf(C4290g5 c4290g5, Handler handler) {
        this.f63483b = c4290g5;
        this.f63482a = handler;
    }

    public CallableC4219c6 a(C4290g5 c4290g5, String str, long j10) {
        return new CallableC4219c6(c4290g5, str, j10);
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        C8 c10 = new C8(this.f63483b.b().getParent(), this.f63483b.b().getName());
        Message messageA = a();
        messageA.obj = c10;
        String strA = a(c10.getParent());
        if (strA == null) {
            messageA.what = 1020;
            this.f63482a.sendMessage(messageA);
        } else {
            C4308h5 c4308h5Call = a(new C4290g5(c10, this.f63483b.e(), this.f63483b.a(), this.f63483b.c(), this.f63483b.f(), this.f63483b.d()), strA, 3L).call();
            messageA.what = c4308h5Call.b() == 200 ? 1016 : c4308h5Call.b();
            this.f63482a.sendMessage(messageA);
        }
    }

    public Message a() {
        return new Message();
    }

    public String a(String str) {
        return IronSourceStorageUtils.makeDir(str);
    }
}
