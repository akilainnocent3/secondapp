package yads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class uj extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f156455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f156456c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MediaFormat f156461h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MediaFormat f156462i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MediaCodec.CodecException f156463j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f156464k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f156465l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IllegalStateException f156466m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f156454a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sb1 f156457d = new sb1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sb1 f156458e = new sb1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque f156459f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f156460g = new ArrayDeque();

    public uj(HandlerThread handlerThread) {
        this.f156455b = handlerThread;
    }

    public final int a(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f156454a) {
            try {
                if (this.f156464k <= 0 && !this.f156465l) {
                    IllegalStateException illegalStateException = this.f156466m;
                    if (illegalStateException != null) {
                        this.f156466m = null;
                        throw illegalStateException;
                    }
                    MediaCodec.CodecException codecException = this.f156463j;
                    if (codecException != null) {
                        this.f156463j = null;
                        throw codecException;
                    }
                    sb1 sb1Var = this.f156458e;
                    int i10 = sb1Var.f155347c;
                    if (i10 == 0) {
                        return -1;
                    }
                    if (i10 == 0) {
                        throw new NoSuchElementException();
                    }
                    int[] iArr = sb1Var.f155348d;
                    int i11 = sb1Var.f155345a;
                    int i12 = iArr[i11];
                    sb1Var.f155345a = (i11 + 1) & sb1Var.f155349e;
                    sb1Var.f155347c = i10 - 1;
                    if (i12 >= 0) {
                        if (this.f156461h == null) {
                            throw new IllegalStateException();
                        }
                        MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f156459f.remove();
                        bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                    } else if (i12 == -2) {
                        this.f156461h = (MediaFormat) this.f156460g.remove();
                    }
                    return i12;
                }
                return -1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        synchronized (this.f156454a) {
            try {
                if (this.f156465l) {
                    return;
                }
                long j10 = this.f156464k - 1;
                this.f156464k = j10;
                if (j10 > 0) {
                    return;
                }
                if (j10 < 0) {
                    a(new IllegalStateException());
                    return;
                }
                if (!this.f156460g.isEmpty()) {
                    this.f156462i = (MediaFormat) this.f156460g.getLast();
                }
                sb1 sb1Var = this.f156457d;
                sb1Var.f155345a = 0;
                sb1Var.f155346b = -1;
                sb1Var.f155347c = 0;
                sb1 sb1Var2 = this.f156458e;
                sb1Var2.f155345a = 0;
                sb1Var2.f155346b = -1;
                sb1Var2.f155347c = 0;
                this.f156459f.clear();
                this.f156460g.clear();
                this.f156463j = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f156454a) {
            this.f156463j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f156454a) {
            this.f156457d.a(i10);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f156454a) {
            try {
                MediaFormat mediaFormat = this.f156462i;
                if (mediaFormat != null) {
                    this.f156458e.a(-2);
                    this.f156460g.add(mediaFormat);
                    this.f156462i = null;
                }
                this.f156458e.a(i10);
                this.f156459f.add(bufferInfo);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f156454a) {
            this.f156458e.a(-2);
            this.f156460g.add(mediaFormat);
            this.f156462i = null;
        }
    }

    public final void a() {
        synchronized (this.f156454a) {
            this.f156464k++;
            Handler handler = this.f156456c;
            int i10 = ib3.f150516a;
            handler.post(new Runnable() { // from class: yads.zb4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f158727b.b();
                }
            });
        }
    }

    public final void a(MediaCodec mediaCodec) {
        if (this.f156456c == null) {
            this.f156455b.start();
            Handler handler = new Handler(this.f156455b.getLooper());
            mediaCodec.setCallback(this, handler);
            this.f156456c = handler;
            return;
        }
        throw new IllegalStateException();
    }

    public final void a(IllegalStateException illegalStateException) {
        synchronized (this.f156454a) {
            this.f156466m = illegalStateException;
        }
    }
}
