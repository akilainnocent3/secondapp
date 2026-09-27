package sg.bigo.ads.common.utils;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes7.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f133410a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f133412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f133413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    long f133414f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    long f133415g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f133416h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f133417i = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"HandlerLeak"})
    private final Handler f133411b = new Handler() { // from class: sg.bigo.ads.common.utils.n.1
        /* JADX WARN: Code duplicated, block: B:19:0x003b A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x0003, B:6:0x0009, B:9:0x000e, B:11:0x001c, B:14:0x0026, B:16:0x002e, B:18:0x0034, B:22:0x0041, B:23:0x0047, B:19:0x003b, B:24:0x005b), top: B:28:0x0003 }] */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            long j10;
            synchronized (n.this) {
                try {
                    n nVar = n.this;
                    if (!nVar.f133416h && !nVar.f133417i) {
                        long jElapsedRealtime = nVar.f133413e - SystemClock.elapsedRealtime();
                        if (jElapsedRealtime <= 0) {
                            n nVar2 = n.this;
                            nVar2.f133417i = true;
                            nVar2.a();
                        } else {
                            n nVar3 = n.this;
                            long j11 = nVar3.f133414f;
                            if (j11 > 0) {
                                long j12 = nVar3.f133415g;
                                if (j12 > 0) {
                                    j10 = nVar3.f133412d - (j12 - j11);
                                    nVar3.f133415g = 0L;
                                } else {
                                    j10 = nVar3.f133412d;
                                }
                            } else {
                                j10 = nVar3.f133412d;
                            }
                            while (j10 < 0) {
                                j10 += n.this.f133412d;
                            }
                            n.this.a(jElapsedRealtime);
                            n.this.f133414f = SystemClock.elapsedRealtime();
                            sendMessageDelayed(obtainMessage(1), j10);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    };

    public n(long j10, long j11) {
        this.f133412d = j11;
        this.f133410a = j10;
    }

    public abstract void a();

    public abstract void a(long j10);

    public final synchronized void b() {
        this.f133416h = true;
        this.f133411b.removeMessages(1);
    }

    public final synchronized n c() {
        this.f133416h = false;
        if (this.f133410a <= 0) {
            if (!this.f133417i) {
                this.f133417i = true;
                a();
            }
            return this;
        }
        this.f133413e = SystemClock.elapsedRealtime() + this.f133410a;
        Handler handler = this.f133411b;
        handler.sendMessage(handler.obtainMessage(1));
        return this;
    }

    public final void d() {
        if (this.f133417i || this.f133416h) {
            return;
        }
        b();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f133415g = jElapsedRealtime;
        this.f133410a = this.f133413e - jElapsedRealtime;
    }

    public final boolean e() {
        return !this.f133417i && this.f133416h;
    }
}
