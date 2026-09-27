package com.bytedance.sdk.openadsdk.grv.tq;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.sdk.component.utils.omn;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vgm {
    private static hww hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private static HandlerThread f37206tq;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class hww extends Handler {
        public hww(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            tq tqVar = (tq) message.obj;
            if (tqVar == null) {
                return;
            }
            int iTq = tqVar.tq();
            if (iTq == 1) {
                tqVar.vgm();
            } else {
                if (iTq != 2) {
                    hv.tq(tqVar.vhb());
                    return;
                }
                tqVar.ok();
            }
            if (tqVar.rs()) {
                hv.tq(tqVar.vhb());
            } else if (tqVar.ny()) {
                hww(tqVar);
            }
        }

        public void hww(tq tqVar) {
            if (tqVar == null) {
                return;
            }
            int iIntValue = tqVar.vhb().intValue();
            if (hasMessages(iIntValue)) {
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = iIntValue;
            messageObtain.obj = tqVar;
            sendMessageDelayed(messageObtain, tqVar.hu());
        }
    }

    public static void hww() {
    }

    public static void tq(tq tqVar) {
        if (tqVar == null || hww == null) {
            return;
        }
        try {
            int iIntValue = tqVar.vhb().intValue();
            if (hww.hasMessages(iIntValue)) {
                hww.removeMessages(iIntValue);
            }
        } catch (Exception unused) {
        }
    }

    public static void hww(tq tqVar) {
        if (tqVar == null) {
            return;
        }
        tq();
        hww hwwVar = hww;
        if (hwwVar != null) {
            hwwVar.hww(tqVar);
        }
    }

    public static void tq() {
        if (hww != null) {
            return;
        }
        try {
            HandlerThread handlerThread = f37206tq;
            if (handlerThread != null && handlerThread.isAlive()) {
                return;
            }
            synchronized (vgm.class) {
                try {
                    HandlerThread handlerThread2 = f37206tq;
                    if (handlerThread2 == null || !handlerThread2.isAlive()) {
                        f37206tq = com.bytedance.sdk.component.utils.ok.hww("csj_MRC");
                        hww = new hww(f37206tq.getLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            omn.sd("MRC", th3.getMessage());
        }
    }
}
