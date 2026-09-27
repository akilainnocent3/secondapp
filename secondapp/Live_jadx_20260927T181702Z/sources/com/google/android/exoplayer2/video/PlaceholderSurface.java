package com.google.android.exoplayer2.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.annotation.Nullable;
import eh.b0;
import eh.h0;
import eh.r;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@t0(17)
@Deprecated
public final class PlaceholderSurface extends Surface {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f49987e = "PlaceholderSurface";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f49988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f49989g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f49990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f49991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f49992d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b extends HandlerThread implements Handler.Callback {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f49993g = 1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f49994h = 2;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public r f49995b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Handler f49996c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public Error f49997d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public RuntimeException f49998e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public PlaceholderSurface f49999f;

        public b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        public PlaceholderSurface a(int i10) {
            boolean z10;
            start();
            this.f49996c = new Handler(getLooper(), this);
            this.f49995b = new r(this.f49996c);
            synchronized (this) {
                z10 = false;
                this.f49996c.obtainMessage(1, i10, 0).sendToTarget();
                while (this.f49999f == null && this.f49998e == null && this.f49997d == null) {
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
            RuntimeException runtimeException = this.f49998e;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f49997d;
            if (error == null) {
                return (PlaceholderSurface) eh.a.g(this.f49999f);
            }
            throw error;
        }

        public final void b(int i10) throws b0.b {
            eh.a.g(this.f49995b);
            this.f49995b.h(i10);
            this.f49999f = new PlaceholderSurface(this, this.f49995b.g(), i10 != 0);
        }

        public void c() {
            eh.a.g(this.f49996c);
            this.f49996c.sendEmptyMessage(2);
        }

        public final void d() {
            eh.a.g(this.f49995b);
            this.f49995b.i();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            try {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return true;
                    }
                    try {
                        d();
                    } catch (Throwable th2) {
                        try {
                            h0.e("PlaceholderSurface", "Failed to release placeholder surface", th2);
                        } finally {
                            quit();
                        }
                    }
                    return true;
                }
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (b0.b e10) {
                    h0.e("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f49998e = new IllegalStateException(e10);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e11) {
                    h0.e("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.f49997d = e11;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e12) {
                    h0.e("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                    this.f49998e = e12;
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

    public static int a(Context context) {
        if (b0.J(context)) {
            return b0.K() ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean b(Context context) {
        try {
            if (!f49989g) {
                f49988f = a(context);
                f49989g = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f49988f != 0;
    }

    public static PlaceholderSurface c(Context context, boolean z10) {
        eh.a.i(!z10 || b(context));
        return new b().a(z10 ? f49988f : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f49991c) {
            try {
                if (!this.f49992d) {
                    this.f49991c.c();
                    this.f49992d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public PlaceholderSurface(b bVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f49991c = bVar;
        this.f49990b = z10;
    }
}
