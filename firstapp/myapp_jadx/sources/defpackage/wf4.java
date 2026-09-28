package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class wf4 implements h00, g00 {
    public final htb a;
    public final Object b = new Object();
    public CountDownLatch c;

    public wf4(htb htbVar) {
        this.a = htbVar;
    }

    @Override // defpackage.g00
    public final void a(Bundle bundle) {
        synchronized (this.b) {
            try {
                ngt ngtVar = ngt.a;
                ngtVar.c("Logging event _ae to Firebase Analytics with params " + bundle);
                this.c = new CountDownLatch(1);
                this.a.a(bundle);
                ngtVar.c("Awaiting app exception callback from Analytics...");
                try {
                    if (this.c.await(500L, TimeUnit.MILLISECONDS)) {
                        ngtVar.c("App exception callback received from Analytics listener.");
                    } else {
                        ngtVar.d("Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                    }
                } catch (InterruptedException unused) {
                    Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
                }
                this.c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.h00
    public final void b(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.c;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
