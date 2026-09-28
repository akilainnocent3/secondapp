package defpackage;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class g11 implements xiv {
    public static final ArrayDeque<b> g = new ArrayDeque<>();
    public static final Object h = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public a c;
    public final AtomicReference<RuntimeException> d;
    public final eoa e;
    public boolean f;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            g11 g11Var = g11.this;
            int i = message.what;
            b bVar = null;
            if (i == 1) {
                b bVar2 = (b) message.obj;
                try {
                    g11Var.a.queueInputBuffer(bVar2.a, 0, bVar2.b, bVar2.d, bVar2.e);
                } catch (RuntimeException e) {
                    AtomicReference<RuntimeException> atomicReference = g11Var.d;
                    while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                    }
                }
                bVar = bVar2;
            } else if (i == 2) {
                b bVar3 = (b) message.obj;
                int i2 = bVar3.a;
                MediaCodec.CryptoInfo cryptoInfo = bVar3.c;
                long j = bVar3.d;
                int i3 = bVar3.e;
                try {
                    synchronized (g11.h) {
                        try {
                            g11Var.a.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (RuntimeException e2) {
                    AtomicReference<RuntimeException> atomicReference2 = g11Var.d;
                    while (!atomicReference2.compareAndSet(null, e2) && atomicReference2.get() == null) {
                    }
                }
                bVar = bVar3;
            } else if (i == 3) {
                g11Var.e.c();
            } else if (i != 4) {
                AtomicReference<RuntimeException> atomicReference3 = g11Var.d;
                IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(i));
                while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
                }
            } else {
                try {
                    g11Var.a.setParameters((Bundle) message.obj);
                } catch (RuntimeException e3) {
                    AtomicReference<RuntimeException> atomicReference4 = g11Var.d;
                    while (!atomicReference4.compareAndSet(null, e3) && atomicReference4.get() == null) {
                    }
                }
            }
            if (bVar != null) {
                ArrayDeque<b> arrayDeque = g11.g;
                synchronized (arrayDeque) {
                    arrayDeque.add(bVar);
                }
            }
        }
    }

    public static class b {
        public int a;
        public int b;
        public final MediaCodec.CryptoInfo c = new MediaCodec.CryptoInfo();
        public long d;
        public int e;
    }

    public g11(MediaCodec mediaCodec, HandlerThread handlerThread) {
        eoa eoaVar = new eoa();
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = eoaVar;
        this.d = new AtomicReference<>();
    }

    public static b e() {
        ArrayDeque<b> arrayDeque = g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new b();
                }
                return arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.xiv
    public final void a(int i, v3c v3cVar, long j, int i2) {
        d();
        b bVarE = e();
        bVarE.a = i;
        bVarE.b = 0;
        bVarE.d = j;
        bVarE.e = i2;
        MediaCodec.CryptoInfo cryptoInfo = bVarE.c;
        cryptoInfo.numSubSamples = v3cVar.f;
        int[] iArr = v3cVar.d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = v3cVar.e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = v3cVar.b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = v3cVar.a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = v3cVar.c;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(v3cVar.g, v3cVar.h));
        a aVar = this.c;
        String str = jrh0.a;
        aVar.obtainMessage(2, bVarE).sendToTarget();
    }

    @Override // defpackage.xiv
    public final void b(Bundle bundle) {
        d();
        a aVar = this.c;
        String str = jrh0.a;
        aVar.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // defpackage.xiv
    public final void c(int i, int i2, int i3, long j) {
        d();
        b bVarE = e();
        bVarE.a = i;
        bVarE.b = i2;
        bVarE.d = j;
        bVarE.e = i3;
        a aVar = this.c;
        String str = jrh0.a;
        aVar.obtainMessage(1, bVarE).sendToTarget();
    }

    @Override // defpackage.xiv
    public final void d() {
        RuntimeException andSet = this.d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    @Override // defpackage.xiv
    public final void flush() {
        if (this.f) {
            try {
                a aVar = this.c;
                aVar.getClass();
                aVar.removeCallbacksAndMessages(null);
                eoa eoaVar = this.e;
                synchronized (eoaVar) {
                    eoaVar.b = false;
                }
                a aVar2 = this.c;
                aVar2.getClass();
                aVar2.obtainMessage(3).sendToTarget();
                synchronized (eoaVar) {
                    while (!eoaVar.b) {
                        eoaVar.a.getClass();
                        eoaVar.wait();
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                dad.a(e);
            }
        }
    }

    @Override // defpackage.xiv
    public final void shutdown() {
        if (this.f) {
            flush();
            this.b.quit();
        }
        this.f = false;
    }

    @Override // defpackage.xiv
    public final void start() {
        if (this.f) {
            return;
        }
        HandlerThread handlerThread = this.b;
        handlerThread.start();
        this.c = new a(handlerThread.getLooper());
        this.f = true;
    }
}
