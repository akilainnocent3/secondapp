package com.yandex.div.core.timer;

import android.os.Handler;
import android.os.Looper;
import dr.w2;
import ds.a;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class FixedRateScheduler {

    @l
    private final Handler handler = new Handler(Looper.getMainLooper());

    public final void cancel() {
        this.handler.removeCallbacksAndMessages(null);
    }

    public final void scheduleAtFixedRate(long j10, final long j11, @l final a<w2> aVar) {
        this.handler.postDelayed(new Runnable() { // from class: com.yandex.div.core.timer.FixedRateScheduler.scheduleAtFixedRate.1
            @Override // java.lang.Runnable
            public void run() {
                FixedRateScheduler.this.handler.postDelayed(this, j11);
                aVar.invoke();
            }
        }, j10);
    }
}
