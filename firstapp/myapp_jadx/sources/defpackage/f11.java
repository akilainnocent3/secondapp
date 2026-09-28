package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class f11 implements viv {
    public final MediaCodec a;
    public final i11 b;
    public final xiv c;
    public final dpt d;
    public boolean e;
    public int f = 0;

    public static final class a implements viv.b {
        public final d11 a;
        public final e11 b;

        public a(d11 d11Var, e11 e11Var) {
            this.a = d11Var;
            this.b = e11Var;
        }

        @Override // viv.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final f11 a(viv.a aVar) throws Exception {
            MediaCodec mediaCodecCreateByCodecName;
            String str = aVar.a.a;
            f11 f11Var = null;
            try {
                Trace.beginSection("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    f11 f11Var2 = new f11(mediaCodecCreateByCodecName, (HandlerThread) this.a.get(), new g11(mediaCodecCreateByCodecName, (HandlerThread) this.b.get()), aVar.f);
                    try {
                        Trace.endSection();
                        Surface surface = aVar.d;
                        f11Var2.q(aVar.b, surface, aVar.e, (surface == null && aVar.a.h && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
                        return f11Var2;
                    } catch (Exception e) {
                        e = e;
                        f11Var = f11Var2;
                        if (f11Var != null) {
                            f11Var.release();
                        } else if (mediaCodecCreateByCodecName != null) {
                            mediaCodecCreateByCodecName.release();
                        }
                        throw e;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                mediaCodecCreateByCodecName = null;
            }
        }
    }

    public f11(MediaCodec mediaCodec, HandlerThread handlerThread, xiv xivVar, dpt dptVar) {
        this.a = mediaCodec;
        this.b = new i11(handlerThread);
        this.c = xivVar;
        this.d = dptVar;
    }

    public static String p(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // defpackage.viv
    public final void a(int i, v3c v3cVar, long j, int i2) {
        this.c.a(i, v3cVar, j, i2);
    }

    @Override // defpackage.viv
    public final void b(Bundle bundle) {
        this.c.b(bundle);
    }

    @Override // defpackage.viv
    public final void c(int i, int i2, int i3, long j) {
        this.c.c(i, i2, i3, j);
    }

    @Override // defpackage.viv
    public final boolean d(ejv.c cVar) {
        i11 i11Var = this.b;
        synchronized (i11Var.a) {
            i11Var.o = cVar;
        }
        return true;
    }

    @Override // defpackage.viv
    public final MediaFormat e() {
        MediaFormat mediaFormat;
        i11 i11Var = this.b;
        synchronized (i11Var.a) {
            try {
                mediaFormat = i11Var.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // defpackage.viv
    public final void f() {
        this.a.detachOutputSurface();
    }

    @Override // defpackage.viv
    public final void flush() {
        this.c.flush();
        this.a.flush();
        final i11 i11Var = this.b;
        synchronized (i11Var.a) {
            i11Var.l++;
            Handler handler = i11Var.c;
            String str = jrh0.a;
            handler.post(new Runnable() { // from class: h11
                @Override // java.lang.Runnable
                public final void run() {
                    i11 i11Var2 = i11Var;
                    synchronized (i11Var2.a) {
                        try {
                            if (i11Var2.m) {
                                return;
                            }
                            long j = i11Var2.l - 1;
                            i11Var2.l = j;
                            if (j > 0) {
                                return;
                            }
                            if (j >= 0) {
                                i11Var2.a();
                                return;
                            }
                            IllegalStateException illegalStateException = new IllegalStateException();
                            synchronized (i11Var2.a) {
                                i11Var2.n = illegalStateException;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
        }
        this.a.start();
    }

    @Override // defpackage.viv
    public final void g(final ljv.e eVar, Handler handler) {
        this.a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener(this) { // from class: c11
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                ljv.e eVar2 = eVar;
                Handler handler2 = eVar2.a;
                if (Build.VERSION.SDK_INT < 30) {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                } else {
                    eVar2.a(j);
                }
            }
        }, handler);
    }

    @Override // defpackage.viv
    public final void h(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // defpackage.viv
    public final ByteBuffer i(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // defpackage.viv
    public final void j(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // defpackage.viv
    public final void k(int i) {
        this.a.releaseOutputBuffer(i, false);
    }

    @Override // defpackage.viv
    public final void l(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // defpackage.viv
    public final int m() {
        this.c.d();
        i11 i11Var = this.b;
        synchronized (i11Var.a) {
            try {
                IllegalStateException illegalStateException = i11Var.n;
                if (illegalStateException != null) {
                    i11Var.n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = i11Var.j;
                if (codecException != null) {
                    i11Var.j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = i11Var.k;
                if (cryptoException != null) {
                    i11Var.k = null;
                    throw cryptoException;
                }
                int i = -1;
                if (i11Var.l > 0 || i11Var.m) {
                    return -1;
                }
                jo7 jo7Var = i11Var.d;
                int i2 = jo7Var.b;
                int i3 = jo7Var.c;
                if (!(i2 == i3)) {
                    if (i2 == i3) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    i = jo7Var.a[i2];
                    jo7Var.b = (i2 + 1) & jo7Var.d;
                }
                return i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.viv
    public final int n(MediaCodec.BufferInfo bufferInfo) {
        this.c.d();
        i11 i11Var = this.b;
        synchronized (i11Var.a) {
            try {
                IllegalStateException illegalStateException = i11Var.n;
                if (illegalStateException != null) {
                    i11Var.n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = i11Var.j;
                if (codecException != null) {
                    i11Var.j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = i11Var.k;
                if (cryptoException != null) {
                    i11Var.k = null;
                    throw cryptoException;
                }
                if (i11Var.l > 0 || i11Var.m) {
                    return -1;
                }
                jo7 jo7Var = i11Var.e;
                int i = jo7Var.b;
                int i2 = jo7Var.c;
                if (i == i2) {
                    return -1;
                }
                if (i == i2) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                int i3 = jo7Var.a[i];
                jo7Var.b = jo7Var.d & (i + 1);
                if (i3 >= 0) {
                    ly0.g(i11Var.h);
                    MediaCodec.BufferInfo bufferInfoRemove = i11Var.f.remove();
                    bufferInfo.set(bufferInfoRemove.offset, bufferInfoRemove.size, bufferInfoRemove.presentationTimeUs, bufferInfoRemove.flags);
                } else if (i3 == -2) {
                    i11Var.h = i11Var.g.remove();
                }
                return i3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.viv
    public final ByteBuffer o(int i) {
        return this.a.getOutputBuffer(i);
    }

    public final void q(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        dpt dptVar;
        i11 i11Var = this.b;
        HandlerThread handlerThread = i11Var.b;
        ly0.f(i11Var.c == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = this.a;
        mediaCodec.setCallback(i11Var, handler);
        i11Var.c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        this.c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (dptVar = this.d) != null) {
            dptVar.a(mediaCodec);
        }
        this.f = 1;
    }

    @Override // defpackage.viv
    public final void release() {
        dpt dptVar;
        dpt dptVar2;
        try {
            if (this.f == 1) {
                this.c.shutdown();
                i11 i11Var = this.b;
                synchronized (i11Var.a) {
                    i11Var.m = true;
                    i11Var.b.quit();
                    i11Var.a();
                }
            }
            this.f = 2;
            if (this.e) {
                return;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && i < 33) {
                    this.a.stop();
                }
            } finally {
                if (Build.VERSION.SDK_INT >= 35 && (dptVar2 = this.d) != null) {
                    dptVar2.c(this.a);
                }
                this.a.release();
                this.e = true;
            }
        } catch (Throwable th) {
            if (!this.e) {
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30 && i2 < 33) {
                        this.a.stop();
                    }
                } finally {
                    if (Build.VERSION.SDK_INT >= 35 && (dptVar = this.d) != null) {
                        dptVar.c(this.a);
                    }
                    this.a.release();
                    this.e = true;
                }
            }
            throw th;
        }
    }
}
