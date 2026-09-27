package yads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class gd2 extends HandlerThread implements Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public rl0 f149558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f149559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Error f149560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RuntimeException f149561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public hd2 f149562f;

    public gd2() {
        super("ExoPlayer:PlaceholderSurface");
    }

    public final hd2 a(int i10) {
        boolean z10;
        start();
        Handler handler = new Handler(getLooper(), this);
        this.f149559c = handler;
        this.f149558b = new rl0(handler);
        synchronized (this) {
            z10 = false;
            this.f149559c.obtainMessage(1, i10, 0).sendToTarget();
            while (this.f149562f == null && this.f149561e == null && this.f149560d == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.f149561e;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.f149560d;
        if (error != null) {
            throw error;
        }
        hd2 hd2Var = this.f149562f;
        hd2Var.getClass();
        return hd2Var;
    }

    public final void b(int i10) {
        this.f149558b.getClass();
        this.f149558b.a(i10);
        this.f149562f = new hd2(this, this.f149558b.a(), i10 != 0);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        try {
            if (i10 != 1) {
                if (i10 != 2) {
                    return true;
                }
                try {
                    this.f149558b.getClass();
                    this.f149558b.b();
                } catch (Throwable th2) {
                    try {
                        ih1.b("PlaceholderSurface", ih1.a("Failed to release placeholder surface", th2));
                    } finally {
                        quit();
                    }
                }
                return true;
            }
            try {
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e10) {
                    ih1.b("PlaceholderSurface", ih1.a("Failed to initialize placeholder surface", e10));
                    this.f149560d = e10;
                    synchronized (this) {
                        notify();
                    }
                }
            } catch (RuntimeException e11) {
                ih1.b("PlaceholderSurface", ih1.a("Failed to initialize placeholder surface", e11));
                this.f149561e = e11;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th3) {
            synchronized (this) {
                notify();
                throw th3;
            }
        }
    }
}
