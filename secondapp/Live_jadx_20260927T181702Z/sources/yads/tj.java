package yads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class tj {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ArrayDeque f155927g = new ArrayDeque();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f155928h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f155929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f155930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public rj f155931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f155932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vy f155933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f155934f;

    public tj(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new vy());
    }

    public static sj b() {
        ArrayDeque arrayDeque = f155927g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new sj();
                }
                return (sj) arrayDeque.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    public final void a(Message message) {
        sj sjVar;
        int i10 = message.what;
        sj sjVar2 = null;
        if (i10 != 0) {
            if (i10 == 1) {
                sjVar = (sj) message.obj;
                int i11 = sjVar.f155453a;
                int i12 = sjVar.f155454b;
                MediaCodec.CryptoInfo cryptoInfo = sjVar.f155456d;
                long j10 = sjVar.f155457e;
                int i13 = sjVar.f155458f;
                try {
                    synchronized (f155928h) {
                        this.f155929a.queueSecureInputBuffer(i11, i12, cryptoInfo, j10, i13);
                    }
                } catch (RuntimeException e10) {
                    androidx.lifecycle.y.a(this.f155932d, null, e10);
                }
            } else if (i10 != 2) {
                androidx.lifecycle.y.a(this.f155932d, null, new IllegalStateException(String.valueOf(message.what)));
            } else {
                this.f155933e.d();
            }
            if (sjVar2 != null) {
                a(sjVar2);
            }
        }
        sjVar = (sj) message.obj;
        try {
            this.f155929a.queueInputBuffer(sjVar.f155453a, sjVar.f155454b, sjVar.f155455c, sjVar.f155457e, sjVar.f155458f);
        } catch (RuntimeException e11) {
            androidx.lifecycle.y.a(this.f155932d, null, e11);
        }
        sjVar2 = sjVar;
        if (sjVar2 != null) {
            a(sjVar2);
        }
    }

    public tj(MediaCodec mediaCodec, HandlerThread handlerThread, vy vyVar) {
        this.f155929a = mediaCodec;
        this.f155930b = handlerThread;
        this.f155933e = vyVar;
        this.f155932d = new AtomicReference();
    }

    public final void a() {
        if (this.f155934f) {
            try {
                rj rjVar = this.f155931c;
                rjVar.getClass();
                rjVar.removeCallbacksAndMessages(null);
                vy vyVar = this.f155933e;
                synchronized (vyVar) {
                    vyVar.f157128a = false;
                }
                rj rjVar2 = this.f155931c;
                rjVar2.getClass();
                rjVar2.obtainMessage(2).sendToTarget();
                this.f155933e.a();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    public final void a(int i10, m20 m20Var, long j10) {
        RuntimeException runtimeException = (RuntimeException) this.f155932d.getAndSet(null);
        if (runtimeException == null) {
            sj sjVarB = b();
            sjVarB.f155453a = i10;
            sjVarB.f155454b = 0;
            sjVarB.f155455c = 0;
            sjVarB.f155457e = j10;
            sjVarB.f155458f = 0;
            MediaCodec.CryptoInfo cryptoInfo = sjVarB.f155456d;
            cryptoInfo.numSubSamples = m20Var.f152273f;
            int[] iArr = m20Var.f152271d;
            int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
            if (iArr != null) {
                if (iArrCopyOf != null && iArrCopyOf.length >= iArr.length) {
                    System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
                } else {
                    iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
                }
            }
            cryptoInfo.numBytesOfClearData = iArrCopyOf;
            int[] iArr2 = m20Var.f152272e;
            int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
            if (iArr2 != null) {
                if (iArrCopyOf2 != null && iArrCopyOf2.length >= iArr2.length) {
                    System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
                } else {
                    iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
                }
            }
            cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
            byte[] bArr = m20Var.f152269b;
            byte[] bArrCopyOf = cryptoInfo.key;
            if (bArr != null) {
                if (bArrCopyOf != null && bArrCopyOf.length >= bArr.length) {
                    System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
                } else {
                    bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                }
            }
            bArrCopyOf.getClass();
            cryptoInfo.key = bArrCopyOf;
            byte[] bArr2 = m20Var.f152268a;
            byte[] bArrCopyOf2 = cryptoInfo.iv;
            if (bArr2 != null) {
                if (bArrCopyOf2 != null && bArrCopyOf2.length >= bArr2.length) {
                    System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
                } else {
                    bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
                }
            }
            bArrCopyOf2.getClass();
            cryptoInfo.iv = bArrCopyOf2;
            cryptoInfo.mode = m20Var.f152270c;
            if (ib3.f150516a >= 24) {
                o5.j.a();
                cryptoInfo.setPattern(c5.g.a(m20Var.f152274g, m20Var.f152275h));
            }
            this.f155931c.obtainMessage(1, sjVarB).sendToTarget();
            return;
        }
        throw runtimeException;
    }

    public static void a(sj sjVar) {
        ArrayDeque arrayDeque = f155927g;
        synchronized (arrayDeque) {
            arrayDeque.add(sjVar);
        }
    }
}
