package com.bytedance.sdk.component.hu.hww.tq;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.component.hu.hww.hv;
import com.bytedance.sdk.component.hu.hww.ok;
import java.util.Comparator;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;
import lk.e;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vy {
    private volatile Handler nod;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private final PriorityBlockingQueue<com.bytedance.sdk.component.hu.hww.vy.hww> f34623ny;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private volatile com.bytedance.sdk.component.hu.hww.tq.sd.sd f34624rs;
    private final Comparator<com.bytedance.sdk.component.hu.hww.vy.hww> vhb;
    public static final vy hww = new vy();
    public static final com.bytedance.sdk.component.hu.hww.tq.hww.hww vy = new com.bytedance.sdk.component.hu.hww.tq.hww.hww();

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    public static final AtomicLong f34621hv = new AtomicLong(0);

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    public static final AtomicLong f34620hu = new AtomicLong(0);
    public static final long vgm = System.currentTimeMillis();

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    public static long f34622ok = 0;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    public volatile boolean f34626tq = false;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    public volatile boolean f34625sd = false;

    private vy() {
        Comparator<com.bytedance.sdk.component.hu.hww.vy.hww> comparator = new Comparator<com.bytedance.sdk.component.hu.hww.vy.hww>() { // from class: com.bytedance.sdk.component.hu.hww.tq.vy.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
            public int compare(com.bytedance.sdk.component.hu.hww.vy.hww hwwVar, com.bytedance.sdk.component.hu.hww.vy.hww hwwVar2) {
                return vy.this.hww(hwwVar, hwwVar2);
            }
        };
        this.vhb = comparator;
        this.f34623ny = new PriorityBlockingQueue<>(8, comparator);
    }

    public void hv() {
        com.bytedance.sdk.component.hu.hww.sd.tq.hww(vy.syb(), 1);
        final com.bytedance.sdk.component.hu.hww.tq.sd.sd sdVar = this.f34624rs;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (sdVar != null) {
                sdVar.sd(2);
                return;
            }
            return;
        }
        hv hvVarWgt = ok.vgm().wgt();
        if (hvVarWgt != null) {
            Executor executorVy = hvVarWgt.vy();
            if (executorVy == null) {
                executorVy = hvVarWgt.hv();
            }
            if (executorVy != null) {
                executorVy.execute(new com.bytedance.sdk.component.hu.hww.hv.hv("flush") { // from class: com.bytedance.sdk.component.hu.hww.tq.vy.3
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.component.hu.hww.tq.sd.sd sdVar2 = sdVar;
                        if (sdVar2 != null) {
                            sdVar2.sd(2);
                        }
                    }
                });
            }
        }
    }

    public void sd() {
        if (this.f34624rs == null || !this.f34624rs.isAlive()) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f34624rs != null && this.f34624rs.isAlive()) {
                    if (this.nod != null) {
                        this.nod.removeCallbacksAndMessages(null);
                    }
                    this.f34624rs.hww(false);
                    this.f34624rs.quitSafely();
                    this.f34624rs = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void tq() {
        vy();
        hv();
    }

    public boolean vy() {
        try {
            if (this.f34624rs != null || com.bytedance.sdk.component.hu.hww.tq.tq()) {
                return false;
            }
            synchronized (this) {
                if (this.f34624rs != null) {
                    return false;
                }
                this.f34624rs = new com.bytedance.sdk.component.hu.hww.tq.sd.sd(this.f34623ny);
                this.f34624rs.start();
                return true;
            }
        } catch (Throwable th2) {
            th2.getMessage();
            return false;
        }
    }

    public PriorityBlockingQueue<com.bytedance.sdk.component.hu.hww.vy.hww> hww() {
        return this.f34623ny;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int hww(com.bytedance.sdk.component.hu.hww.vy.hww hwwVar, com.bytedance.sdk.component.hu.hww.vy.hww hwwVar2) {
        long jHww;
        long jTq;
        long jTq2;
        long jHww2;
        if (hwwVar == null) {
            return hwwVar2 == null ? 0 : -1;
        }
        if (hwwVar2 == null) {
            return 1;
        }
        if (hwwVar.hv() == hwwVar2.hv()) {
            if (hwwVar.hww() != null) {
                jHww = hwwVar.hww().hww();
                jTq = hwwVar.hww().tq();
            } else {
                jHww = 0;
                jTq = 0;
            }
            if (hwwVar2.hww() != null) {
                jHww2 = hwwVar2.hww().hww();
                jTq2 = hwwVar2.hww().tq();
            } else {
                jTq2 = 0;
                jHww2 = 0;
            }
            if (jHww == 0 || jHww2 == 0) {
                return 0;
            }
            long j10 = jHww - jHww2;
            if (Math.abs(j10) > 2147483647L) {
                return 0;
            }
            if (j10 != 0) {
                return (int) j10;
            }
            if (jTq == 0 || jTq2 == 0) {
                return 0;
            }
            return (int) (jTq - jTq2);
        }
        return hwwVar.hv() - hwwVar2.hv();
    }

    public void hww(Handler handler) {
        this.nod = handler;
    }

    public void hww(com.bytedance.sdk.component.hu.hww.vy.hww hwwVar, int i10) {
        vy();
        hv hvVarWgt = ok.vgm().wgt();
        com.bytedance.sdk.component.hu.hww.tq.sd.sd sdVar = this.f34624rs;
        if (sdVar != null) {
            hww(hvVarWgt, hwwVar);
            sdVar.hww(hwwVar, hwwVar.hv() == 4);
        }
    }

    private void hww(final hv hvVar, com.bytedance.sdk.component.hu.hww.vy.hww hwwVar) {
        if (hvVar != null) {
            try {
                if (hvVar.vgm()) {
                    final long jTq = (hwwVar == null || hwwVar.hww() == null) ? 0L : hwwVar.hww().tq();
                    if (jTq == 1) {
                        f34622ok = System.currentTimeMillis();
                    }
                    AtomicLong atomicLongEb = vy.eb();
                    com.bytedance.sdk.component.hu.hww.sd.tq.hww(atomicLongEb, 1);
                    if (atomicLongEb.get() == 200) {
                        try {
                            if (Looper.getMainLooper() == Looper.myLooper()) {
                                Executor executorVy = hvVar.vy();
                                if (executorVy == null) {
                                    executorVy = hvVar.hv();
                                }
                                if (executorVy != null) {
                                    executorVy.execute(new com.bytedance.sdk.component.hu.hww.hv.hv(e.f104689g) { // from class: com.bytedance.sdk.component.hu.hww.tq.vy.2
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            vy.this.hww(hvVar, jTq);
                                        }
                                    });
                                }
                            } else {
                                hww(hvVar, jTq);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hww(hv hvVar, long j10) {
        com.bytedance.sdk.component.hu.hww.tq.sd.sd sdVar = this.f34624rs;
        if (hvVar == null || sdVar == null) {
            return;
        }
        com.bytedance.sdk.component.hu.hww.tq.hww.hww hwwVar = vy;
        sdVar.hww(hvVar.hww(hwwVar.tq(j10)), true);
        hwwVar.zeu();
    }
}
