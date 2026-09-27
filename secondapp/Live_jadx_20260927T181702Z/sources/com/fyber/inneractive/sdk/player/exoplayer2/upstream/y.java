package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class y extends Handler implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f47087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f47088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f47089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f47090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IOException f47091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f47092f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile Thread f47093g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f47094h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b0 f47095i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(b0 b0Var, Looper looper, z zVar, x xVar, int i10, long j10) {
        super(looper);
        this.f47095i = b0Var;
        this.f47087a = zVar;
        this.f47088b = xVar;
        this.f47089c = i10;
        this.f47090d = j10;
    }

    public final void a(boolean z10) {
        this.f47094h = z10;
        this.f47091e = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z10) {
                sendEmptyMessage(1);
            }
        } else {
            this.f47087a.b();
            if (this.f47093g != null) {
                this.f47093g.interrupt();
            }
        }
        if (z10) {
            this.f47095i.f46940b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f47088b.a(this.f47087a, jElapsedRealtime, jElapsedRealtime - this.f47090d, true);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f47094h) {
            return;
        }
        int i10 = message.what;
        if (i10 == 0) {
            this.f47091e = null;
            b0 b0Var = this.f47095i;
            b0Var.f46939a.execute(b0Var.f46940b);
            return;
        }
        if (i10 == 4) {
            throw ((Error) message.obj);
        }
        this.f47095i.f46940b = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - this.f47090d;
        if (this.f47087a.a()) {
            this.f47088b.a(this.f47087a, jElapsedRealtime, j10, false);
            return;
        }
        int i11 = message.what;
        if (i11 == 1) {
            this.f47088b.a(this.f47087a, jElapsedRealtime, j10, false);
            return;
        }
        if (i11 == 2) {
            this.f47088b.a(this.f47087a, jElapsedRealtime, j10);
            return;
        }
        if (i11 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f47091e = iOException;
        int iA = this.f47088b.a(this.f47087a, jElapsedRealtime, j10, iOException);
        if (iA == 3) {
            this.f47095i.f46941c = this.f47091e;
            return;
        }
        if (iA != 2) {
            int i12 = iA == 1 ? 1 : this.f47092f + 1;
            this.f47092f = i12;
            long jMin = Math.min((i12 - 1) * 1000, 5000);
            b0 b0Var2 = this.f47095i;
            if (b0Var2.f46940b != null) {
                throw new IllegalStateException();
            }
            b0Var2.f46940b = this;
            if (jMin > 0) {
                sendEmptyMessageDelayed(0, jMin);
            } else {
                this.f47091e = null;
                b0Var2.f46939a.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f47093g = Thread.currentThread();
            if (!this.f47087a.a()) {
                com.fyber.inneractive.sdk.player.exoplayer2.util.w.a("load:".concat(this.f47087a.getClass().getSimpleName()));
                try {
                    this.f47087a.load();
                    com.fyber.inneractive.sdk.player.exoplayer2.util.w.a();
                } catch (Throwable th2) {
                    com.fyber.inneractive.sdk.player.exoplayer2.util.w.a();
                    throw th2;
                }
            }
            if (this.f47094h) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e10) {
            if (this.f47094h) {
                return;
            }
            obtainMessage(3, e10).sendToTarget();
        } catch (Error e11) {
            Log.e("LoadTask", "Unexpected error loading stream", e11);
            if (!this.f47094h) {
                obtainMessage(4, e11).sendToTarget();
            }
            throw e11;
        } catch (InterruptedException unused) {
            if (!this.f47087a.a()) {
                throw new IllegalStateException();
            }
            if (this.f47094h) {
                return;
            }
            sendEmptyMessage(2);
        } catch (Exception e12) {
            Log.e("LoadTask", "Unexpected exception loading stream", e12);
            if (this.f47094h) {
                return;
            }
            obtainMessage(3, new a0(e12)).sendToTarget();
        } catch (OutOfMemoryError e13) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e13);
            if (this.f47094h) {
                return;
            }
            obtainMessage(3, new a0(e13)).sendToTarget();
        }
    }
}
