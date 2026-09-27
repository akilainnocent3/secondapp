package com.bytedance.sdk.component;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;
import java.util.LinkedList;
import k.a0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq {

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    @a0("sLock")
    private static volatile Handler f35016tq;
    private static final Object hww = new Object();

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    @a0("sLock")
    private static final LinkedList<Runnable> f35015sd = new LinkedList<>();
    private static Object vy = new Object();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class hww extends Handler {
        public hww(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                try {
                    tq.sd();
                } catch (OutOfMemoryError unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sd() {
        LinkedList linkedList;
        synchronized (vy) {
            try {
                synchronized (hww) {
                    LinkedList<Runnable> linkedList2 = f35015sd;
                    linkedList = (LinkedList) linkedList2.clone();
                    linkedList2.clear();
                    tq().removeMessages(1);
                }
                if (linkedList.size() > 0) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static Handler tq() {
        Handler handler;
        if (f35016tq != null) {
            return f35016tq;
        }
        synchronized (hww) {
            try {
                if (f35016tq == null) {
                    com.bytedance.sdk.component.hww.InterfaceC0326hww interfaceC0326hww = com.bytedance.sdk.component.hww.hww;
                    HandlerThread handlerThreadHww = interfaceC0326hww != null ? interfaceC0326hww.hww("queued-work-looper", -2) : null;
                    if (handlerThreadHww == null) {
                        handlerThreadHww = new HandlerThread("queued-work-looper", -2);
                        handlerThreadHww.start();
                    }
                    f35016tq = new hww(handlerThreadHww.getLooper());
                }
                handler = f35016tq;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public static void hww(Runnable runnable, boolean z10) {
        try {
            Handler handlerTq = tq();
            synchronized (hww) {
                try {
                    f35015sd.add(runnable);
                    if (z10) {
                        handlerTq.sendEmptyMessageDelayed(1, 100L);
                    } else {
                        handlerTq.sendEmptyMessage(1);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (OutOfMemoryError unused) {
        }
    }
}
