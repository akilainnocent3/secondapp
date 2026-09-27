package com.bytedance.sdk.component.ok.hww;

import android.os.Handler;
import com.bytedance.sdk.component.utils.mw;
import com.bytedance.sdk.component.utils.ok;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww {
    private final vy<tq> hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private Handler f34921tq;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.ok.hww.hww$hww, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C0328hww {
        private static final hww hww = new hww();
    }

    public Handler tq() {
        if (this.f34921tq == null) {
            synchronized (hww.class) {
                try {
                    if (this.f34921tq == null) {
                        this.f34921tq = hww("csj_io_handler");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f34921tq;
    }

    private hww() {
        this.hww = vy.hww(2);
    }

    public static hww hww() {
        return C0328hww.hww;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hww(final Handler handler, final Handler handler2) {
        if (handler.getLooper().getQueue().isIdle()) {
            handler.removeCallbacksAndMessages(null);
            handler.getLooper().quit();
        } else {
            handler2.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.ok.hww.hww.1
                @Override // java.lang.Runnable
                public void run() {
                    hww.this.hww(handler, handler2);
                }
            }, 1000L);
        }
    }

    private tq tq(mw.hww hwwVar, String str) {
        return new tq(ok.hww(str), hwwVar);
    }

    public mw hww(mw.hww hwwVar, final String str) {
        tq tqVar = (tq) this.hww.hww();
        if (tqVar != null) {
            tqVar.hww(hwwVar);
            tqVar.post(new Runnable() { // from class: com.bytedance.sdk.component.ok.hww.hww.2
                @Override // java.lang.Runnable
                public void run() {
                    Thread.currentThread().setName(str);
                }
            });
            return tqVar;
        }
        return tq(hwwVar, str);
    }

    public mw hww(String str) {
        return hww((mw.hww) null, str);
    }

    public boolean hww(mw mwVar) {
        if (!(mwVar instanceof tq)) {
            return false;
        }
        tq tqVar = (tq) mwVar;
        if (this.hww.hww(tqVar)) {
            return true;
        }
        tqVar.tq();
        return true;
    }
}
